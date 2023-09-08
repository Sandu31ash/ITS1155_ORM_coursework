package lk.ijse.hibernate_d24.dao.custom.impl;

import lk.ijse.hibernate_d24.dao.custom.StudentDAO;
import lk.ijse.hibernate_d24.entity.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAOImpl implements StudentDAO {
    @Override
    public boolean save(Student entity) throws SQLException, ClassNotFoundException {
//        boolean isSaved = SQLUtil.execute("INSERT INTO student (s_id, name, address, contact, dob, gender) VALUES (?,?,?,?,?,?)", entity.getId(), entity.getName(), entity.getAddress(), entity.getContact(), entity.getDob(), entity.getGender());
//        return isSaved;
        return false;
    }

    @Override
    public boolean update(Student entity) throws SQLException, ClassNotFoundException {
//        boolean isUpdated = SQLUtil.execute("UPDATE student SET name = ?, address = ?, contact = ?, dob = ?, gender = ? WHERE s_id = ?", entity.getName(), entity.getAddress(), entity.getContact(), entity.getDob(), entity.getGender(), entity.getId());
//        return isUpdated;
        return false;
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
//        boolean isDeleted = SQLUtil.execute("DELETE FROM student WHERE s_id = ?", id);
//        return isDeleted;
        return false;
    }

    @Override
    public ArrayList<Student> getAll() throws SQLException, ClassNotFoundException {
//        ArrayList<Student> allStu = new ArrayList<>();
//
//        ResultSet rst = SQLUtil.execute("SELECT * FROM student");
//
//        while (rst.next()) {
//            Student student = new Student(rst.getString("s_id"), rst.getString("name"), rst.getString("address"), rst.getString("contact"), rst.getString("dob"), rst.getString("gender"));
//            allStu.add(student);
//        }
//        return allStu;
        return null;
    }

    @Override
    public Student search(String id) throws SQLException, ClassNotFoundException {
//        ResultSet rst = SQLUtil.execute("SELECT * FROM student WHERE s_id=?", id + "");
//        rst.next();
//        return new Student(id + "", rst.getString("name"), rst.getString("address"), rst.getString("contact"), rst.getString("dob"), rst.getString("gender"));
        return null;
    }

}
