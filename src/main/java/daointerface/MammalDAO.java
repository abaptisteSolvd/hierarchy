package daointerface;

import abstracts.Mammal;

import java.sql.SQLException;
import java.util.List;

public interface MammalDAO {
    List<Mammal> all();
    Mammal single(int id) throws SQLException;

    void insert(Mammal entry) throws SQLException;
    void update(Mammal entry) throws SQLException;
    void delete(Mammal entry) throws SQLException;
}
