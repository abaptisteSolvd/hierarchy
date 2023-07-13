package daoimplementations;

import abstracts.Mammal;
import daointerface.MammalDAO;

import java.util.List;
import java.sql.SQLException;

public class MammalDAOImpl implements MammalDAO {
    @Override
    public List<Mammal> all() {
        return null;
    }

    @Override
    public Mammal single(int id) throws SQLException{
        return null;
    }

    @Override
    public void insert(Mammal entry) throws SQLException{

    }

    @Override
    public void update(Mammal entry) throws SQLException {

    }

    @Override
    public void delete(Mammal entry) throws SQLException {

    }
}
