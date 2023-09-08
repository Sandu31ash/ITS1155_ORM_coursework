package lk.ijse.hibernate_d24.bo.custom;

import lk.ijse.hibernate_d24.bo.SuperBO;
import lk.ijse.hibernate_d24.dto.UserDTO;

import java.sql.SQLException;

public interface UserBO extends SuperBO {

    boolean valid(String userName, String pw) throws SQLException, ClassNotFoundException;

    boolean update(UserDTO dto) throws SQLException, ClassNotFoundException;

    boolean save(UserDTO dto) throws SQLException, ClassNotFoundException;

}
