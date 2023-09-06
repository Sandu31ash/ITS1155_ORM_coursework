package lk.ijse.hibernate_d24.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentManageFormController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnUpdate;

    @FXML
    private TextField txtAdd;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtDate;

    @FXML
    private TextField txtDob;

    @FXML
    private TextField txtGender;

    @FXML
    private TextField txtKey;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtRId;

    @FXML
    private TextField txtRTId;

    @FXML
    private TextField txtSId;

    @FXML
    private TextField txtStatus;

    public void txtKeyOnAction(ActionEvent actionEvent) {

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

    public void txtSIdOnAction(ActionEvent actionEvent) {
        String SId = txtSId.getText();
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {

    }

    public void btnSaveOnAction(ActionEvent actionEvent) {
        String SId = txtSId.getText();
        String name = txtName.getText();
        String address = txtAdd.getText();
        String contact = txtContact.getText();
        String dob = txtDob.getText();
        String gender = txtGender.getText();
        String rId = txtRId.getText();
        String date = txtDate.getText();
        String rTId = txtRTId.getText();
        String status = txtStatus.getText();
        String kMoney = txtKey.getText();


    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        String SId = txtSId.getText();
        String name = txtName.getText();
        String address = txtAdd.getText();
        String contact = txtContact.getText();
        String dob = txtDob.getText();
        String gender = txtGender.getText();
        String rId = txtRId.getText();
        String date = txtDate.getText();
        String rTId = txtRTId.getText();
        String status = txtStatus.getText();
        String kMoney = txtKey.getText();
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
