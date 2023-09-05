package lk.ijse.hibernate_d24.dao.custom.impl;

import lk.ijse.hibernate_d24.dao.SQLUtil;
import lk.ijse.hibernate_d24.dao.custom.UserDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAOImpl implements UserDAO {
    @Override
    public boolean valid(String userName, String pw) throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT * FROM user WHERE user_name = ? AND password = ? AND (job_role = ? OR job_role = ?)", userName,pw,"Head Chef", "Sous Chef");

        if(rst.next()) {
            return true;
        }else {
            return false;
        }
    }
}
