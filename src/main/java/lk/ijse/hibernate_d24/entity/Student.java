package lk.ijse.hibernate_d24.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

//@Entity
public class Student {

//    @Id
    private String id;
    private String name;
    private String address;
    private String contact;
    private String dob;
    private String gender;

//    @ManyToOne
//    private Room room;


    public Student(String id, String name, String address, String contact, String dob, String gender) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.dob = dob;
        this.gender = gender;
    }

    public Student() {

    }

//    public Room getRoom() {
//        return room;
//    }
//
//    public void setRoom(Room room) {
//        this.room = room;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
