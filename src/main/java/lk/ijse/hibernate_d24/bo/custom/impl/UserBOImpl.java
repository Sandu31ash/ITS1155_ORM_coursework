package lk.ijse.hibernate_d24.bo.custom.impl;

import lk.ijse.hibernate_d24.bo.custom.UserBO;
import lk.ijse.hibernate_d24.dao.DAOFactory;
import lk.ijse.hibernate_d24.dao.custom.UserDAO;

import java.sql.SQLException;

public class UserBOImpl implements UserBO {

    UserDAO userDAO = (UserDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.USER);

    @Override
    public boolean valid(String userName, String pw) throws SQLException, ClassNotFoundException {
        return userDAO.valid(userName, pw);
    }
}
