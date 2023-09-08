package lk.ijse.hibernate_d24.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private String user;
    private String pW;
    private String userName;

    public User(String userName, String pW, String user) {
        this.userName = userName;
        this.pW = pW;
        this.user = user;
    }

    public User() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getpW() {
        return pW;
    }

    public void setpW(String pW) {
        this.pW = pW;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", pW='" + pW + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
