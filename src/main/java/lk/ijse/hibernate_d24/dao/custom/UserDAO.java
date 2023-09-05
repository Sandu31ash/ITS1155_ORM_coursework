package lk.ijse.hibernate_d24.dao.custom;

import lk.ijse.hibernate_d24.dao.SuperDAO;

import java.sql.SQLException;

public interface UserDAO extends SuperDAO {

    boolean valid(String userName, String pw) throws SQLException, ClassNotFoundException;

}
