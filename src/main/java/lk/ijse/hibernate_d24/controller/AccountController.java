package lk.ijse.hibernate_d24.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AccountController {

    @FXML
    private TextField txtUserName;

    @FXML
    private PasswordField txtPw;

    @FXML
    private Button btnUpdate;

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.CONFIRMATION, "Account is successfully updated").show();
    }

    public void btnPWOnAction(ActionEvent actionEvent) {

    }

    public void txtUserNameOnAction(ActionEvent actionEvent) {
        txtPw.requestFocus();
    }

    public void txtPwOnAction(ActionEvent actionEvent) {
        btnUpdate.requestFocus();
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
