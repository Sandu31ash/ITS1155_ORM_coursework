module lk.ijse.hibernate_d24 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    opens lk.ijse.hibernate_d24 to javafx.fxml;
    exports lk.ijse.hibernate_d24;
    exports lk.ijse.hibernate_d24.controller;
    opens lk.ijse.hibernate_d24.controller to javafx.fxml;
}