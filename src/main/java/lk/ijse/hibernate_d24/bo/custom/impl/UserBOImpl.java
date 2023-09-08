package lk.ijse.hibernate_d24.bo.custom.impl;

import lk.ijse.hibernate_d24.bo.custom.UserBO;
import lk.ijse.hibernate_d24.dao.DAOFactory;
import lk.ijse.hibernate_d24.dao.custom.UserDAO;
import lk.ijse.hibernate_d24.dto.UserDTO;
import lk.ijse.hibernate_d24.entity.Room;
import lk.ijse.hibernate_d24.entity.User;

import java.sql.SQLException;

public class UserBOImpl implements UserBO {

    UserDAO userDAO = (UserDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.USER);

    @Override
    public boolean valid(String userName, String pw) throws SQLException, ClassNotFoundException {
        return userDAO.valid(userName, pw);
    }

    @Override
    public boolean update(UserDTO dto) throws SQLException, ClassNotFoundException {
        return userDAO.update(new User(dto.getUserName(), dto.getpW(), dto.getUser()));
    }

    @Override
    public boolean save(UserDTO dto) throws SQLException, ClassNotFoundException {
        return userDAO.save(new User(dto.getUserName(), dto.getpW(), dto.getUser()));
    }
}
