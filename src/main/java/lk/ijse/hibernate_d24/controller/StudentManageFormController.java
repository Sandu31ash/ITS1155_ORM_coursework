package lk.ijse.hibernate_d24.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentManageFormController {
    public void txtSIdOnAction(ActionEvent actionEvent) {

    }

    public void txtStatusOnAction(ActionEvent actionEvent) {

    }

    public void txtRTIdOnAction(ActionEvent actionEvent) {

    }

    public void txtDateOnAction(ActionEvent actionEvent) {

    }

    public void txtRIdOnAction(ActionEvent actionEvent) {

    }


    public void txtGenderOnAction(ActionEvent actionEvent) {

    }

    public void txtDobOnAction(ActionEvent actionEvent) {

    }

    public void txtContactOnAction(ActionEvent actionEvent) {

    }

    public void txtAddOnAction(ActionEvent actionEvent) {

    }

    public void txtNameOnAction(ActionEvent actionEvent) {

    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {

    }

    public void btnSaveOnAction(ActionEvent actionEvent) {

    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {

    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/lk/ijse/hibernate_d24/view/dashboard-view.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        //Stage stage = (Stage) pane.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Dashboard");
        stage.centerOnScreen();
    }
}
