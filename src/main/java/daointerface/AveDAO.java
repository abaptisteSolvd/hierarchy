package daointerface;

import abstracts.Ave;

import java.sql.SQLException;
import java.util.List;

public interface AveDAO {
    List<Ave> all();
    Ave single(int id) throws SQLException;

    void insert(Ave entry) throws SQLException;
    void update(Ave entry) throws SQLException;
    void delete(Ave entry) throws SQLException;
}
