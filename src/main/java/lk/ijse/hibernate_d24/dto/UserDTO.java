package lk.ijse.hibernate_d24.dto;

public class UserDTO {

    private String userName;
    private String pW;
    private String user;

    public UserDTO(String userName, String pW, String user) {
        this.userName = userName;
        this.pW = pW;
        this.user = user;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setpW(String pW) {
        this.pW = pW;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userName='" + userName + '\'' +
                ", pW='" + pW + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
