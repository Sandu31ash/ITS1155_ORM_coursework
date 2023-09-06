package lk.ijse.hibernate_d24.dao.custom.impl;

import lk.ijse.hibernate_d24.dao.SQLUtil;
import lk.ijse.hibernate_d24.dao.custom.UserDAO;
import lk.ijse.hibernate_d24.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAOImpl implements UserDAO {
    @Override
    public boolean valid(String userName, String pw) throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT * FROM user WHERE username = ? AND pw = ?" , userName, pw);

        if(rst.next()) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean save(User dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(User entity) throws SQLException, ClassNotFoundException {
        boolean isUpdated = SQLUtil.execute("UPDATE user SET username = ?, pw = ? WHERE username = ?", entity.getUserName(), entity.getpW(), entity.getUser());
        return isUpdated;
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public ArrayList<User> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

}
