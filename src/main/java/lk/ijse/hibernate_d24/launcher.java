package lk.ijse.hibernate_d24;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import lk.ijse.hibernate_d24.entity.Room;
import lk.ijse.hibernate_d24.entity.Student;
//import lk.ijse.hibernate_d24.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class launcher extends Application{

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(launcher.class.getResource("view/login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();

//        Student student = new Student();
//        student.setId("S001");
//        student.setName("Amindu");
//
//        Student student1 = new Student();
//        student1.setId("S002");
//        student1.setName("Sham");
//
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(student);
//        studentList.add(student1);
//
//        Room room = new Room();
//        room.setrId("R001");
//        room.setType("AC");
//
//        room.setStudents(studentList);
//        student.setRoom(room);
//        student1.setRoom(room);
//
////        User user = new User();
////        user.setId("S1");
////        user.setName("ash");
////        //user.setLaptop(laptop);
////
////        Laptop laptop = new Laptop();
////        laptop.setlId("L1");
////        laptop.setlName("hp");
////        laptop.setUser(user);
////
////        Laptop laptop1 = new Laptop();
////        laptop1.setlId("L2");
////        laptop1.setlName("dell");
////        laptop1.setUser(user);
//
//        Session session = FactoryConfiguration.getInstance().getSession();
//        Transaction transaction = session.beginTransaction();
//
//        session.persist(student);
//        session.persist(student1);
//        session.persist(room);
//
//        /*persist() is also used for update*/
//        /*sout - for select queries*/
//        //session.remove(customer);
//        transaction.commit();
//        session.close();

    }

}