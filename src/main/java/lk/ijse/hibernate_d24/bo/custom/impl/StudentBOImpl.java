package lk.ijse.hibernate_d24.bo.custom.impl;

import lk.ijse.hibernate_d24.bo.custom.StudentBO;
import lk.ijse.hibernate_d24.dao.DAOFactory;
import lk.ijse.hibernate_d24.dao.custom.RoomDAO;
import lk.ijse.hibernate_d24.dao.custom.StudentDAO;
import lk.ijse.hibernate_d24.dto.RoomDTO;
import lk.ijse.hibernate_d24.dto.StudentDTO;
import lk.ijse.hibernate_d24.entity.Room;
import lk.ijse.hibernate_d24.entity.Student;

import java.sql.SQLException;
import java.util.ArrayList;

public class StudentBOImpl implements StudentBO {

    StudentDAO studentDAO = (StudentDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.STUDENT);

    @Override
    public boolean save(StudentDTO dto) throws SQLException, ClassNotFoundException {
        return studentDAO.save(new Student(dto.getId(), dto.getName(), dto.getAddress(), dto.getContact(), dto.getDob(), dto.getGender()));
    }

    @Override
    public boolean update(StudentDTO dto) throws SQLException, ClassNotFoundException {
        return studentDAO.update(new Student(dto.getId(), dto.getName(), dto.getAddress(), dto.getContact(), dto.getDob(), dto.getGender()));
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return studentDAO.delete(id);
    }

    @Override
    public StudentDTO search(String id) throws SQLException, ClassNotFoundException {
        Student s = studentDAO.search(id);
        StudentDTO studentDTO = new StudentDTO(s.getId(), s.getName(), s.getAddress(), s.getContact(), s.getDob(), s.getGender());
        return studentDTO;
    }

    @Override
    public ArrayList<StudentDTO> getAllStudent() throws SQLException, ClassNotFoundException {
        ArrayList<StudentDTO> allStu= new ArrayList<>();
        ArrayList<Student> all = studentDAO.getAll();
        for (Student s : all) {
            allStu.add(new StudentDTO(s.getId(), s.getName(), s.getAddress(), s.getContact(), s.getDob(), s.getGender()));
        }
        return allStu;
    }
}
