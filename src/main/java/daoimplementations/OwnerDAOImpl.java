package daoimplementations;

import daointerface.OwnerDAO;
import implementations.Owner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class OwnerDAOImpl implements OwnerDAO {
    List<Owner> owners;

    public OwnerDAOImpl() {
        owners = new ArrayList<Owner>();
    }
    @Override
    public List<Owner> all() {
        return owners;
    }

    @Override
    public Owner single(int id) throws SQLException {
        return null;
    }

    @Override
    public Owner get(int id) throws SQLException {
        Owner owner = new Owner(id);
        Properties props = new Properties();

        try(
                InputStream input = new FileInputStream("src/main/resources/db.properties")
        ) {
            props.load(input);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(Connection connection = DriverManager.getConnection(props.getProperty("db.url"), props)){
            //Statement statement = connection.createStatement();
            //statement.execute("SELECT * FROM USERS WHERE ID =" + id);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM USERS WHERE ID =?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                owner.setID(resultSet.getInt("id"));
            }
        }

        return owner;
    }


    @Override
    public void update(Owner entry) throws SQLException {
        owners.get(entry.getID()).setName(entry.getName());
        System.out.println("Owner with id " + entry.getID() + ", updated in the database");
    }

    @Override
    public void delete(Owner entry) throws SQLException {
        owners.remove(entry.getID());
        System.out.println("Owner with id " + entry.getID() + ", deleted in the database");
    }
}
