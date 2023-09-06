package lk.ijse.hibernate_d24.dao.custom.impl;

import lk.ijse.hibernate_d24.dao.custom.StudentDAO;
import lk.ijse.hibernate_d24.entity.Student;

import java.sql.SQLException;

public class StudentDAOImpl implements StudentDAO {
    @Override
    public boolean save(Student dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(Student dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }
}
