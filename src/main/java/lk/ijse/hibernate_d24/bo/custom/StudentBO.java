package lk.ijse.hibernate_d24.bo.custom;

import lk.ijse.hibernate_d24.bo.SuperBO;
import lk.ijse.hibernate_d24.dto.RoomDTO;
import lk.ijse.hibernate_d24.dto.StudentDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentBO extends SuperBO {
    boolean save(StudentDTO dto) throws SQLException, ClassNotFoundException;

    boolean update(StudentDTO dto) throws SQLException, ClassNotFoundException;

    boolean delete(String id) throws SQLException, ClassNotFoundException;

    StudentDTO search(String id) throws SQLException, ClassNotFoundException;

    ArrayList<StudentDTO> getAllStudent() throws SQLException, ClassNotFoundException;
}
