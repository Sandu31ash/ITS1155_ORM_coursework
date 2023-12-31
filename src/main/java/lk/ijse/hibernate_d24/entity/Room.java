package lk.ijse.hibernate_d24.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

//@Entity
public class Room {

//    @Id
    private String rId;
    private String type;
    private String keyMoney;
    private int qty;

//    @OneToMany(mappedBy = "room")
//    private List<Student> students;

//    public Room(String rId, String type, String keyMoney, int qty, List<Student> students) {
//        this.rId = rId;
//        this.type = type;
//        this.keyMoney = keyMoney;
//        this.qty = qty;
////        this.students = students;
//    }

//    public Room(List<Student> students) {
//        this.students = students;
//    }

    public Room(String rId, String type, String keyMoney, int qty) {
        this.rId = rId;
        this.type = type;
        this.keyMoney = keyMoney;
        this.qty = qty;
    }

    public Room() {

    }

//    public List<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKeyMoney() {
        return keyMoney;
    }

    public void setKeyMoney(String keyMoney) {
        this.keyMoney = keyMoney;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Room{" +
                "rId='" + rId + '\'' +
                ", type='" + type + '\'' +
                ", keyMoney='" + keyMoney + '\'' +
                ", qty=" + qty +
                '}';
    }
}
