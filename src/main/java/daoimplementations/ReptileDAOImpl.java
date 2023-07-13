package daoimplementations;

import abstracts.Reptile;
import daointerface.ReptileDAO;

import java.sql.SQLException;
import java.util.List;

public class ReptileDAOImpl implements ReptileDAO {
    @Override
    public List<Reptile> all() {
        return null;
    }

    @Override
    public Reptile single(int id) throws SQLException {
        return null;
    }

    @Override
    public void insert(Reptile entry) throws SQLException {

    }

    @Override
    public void update(Reptile entry) throws SQLException {

    }

    @Override
    public void delete(Reptile entry) throws SQLException {

    }
}
