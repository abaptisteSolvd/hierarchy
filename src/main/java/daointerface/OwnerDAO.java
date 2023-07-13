package daointerface;

import implementations.Owner;

import java.sql.SQLException;
import java.util.List;

public interface OwnerDAO {
    List<Owner> all();
    Owner single(int id) throws SQLException;

    Owner get(int id) throws SQLException;
    void update(Owner entry) throws SQLException;
    void delete(Owner entry) throws SQLException;
}
