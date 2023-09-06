package lk.ijse.hibernate_d24.dao.custom;

import lk.ijse.hibernate_d24.dao.CrudDAO;
import lk.ijse.hibernate_d24.dao.SuperDAO;
import lk.ijse.hibernate_d24.entity.User;

import java.sql.SQLException;

public interface UserDAO extends CrudDAO<User, String> {

    boolean valid(String userName, String pw) throws SQLException, ClassNotFoundException;

}
