package daointerface;

import abstracts.Reptile;

import java.sql.SQLException;
import java.util.List;

public interface ReptileDAO {
    List<Reptile> all();
    Reptile single(int id) throws SQLException;

    void insert(Reptile entry) throws SQLException;
    void update(Reptile entry) throws SQLException;
    void delete(Reptile entry) throws SQLException;
}
