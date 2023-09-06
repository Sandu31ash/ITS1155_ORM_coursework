package lk.ijse.hibernate_d24.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import lk.ijse.hibernate_d24.launcher;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardFormController implements Initializable {

    @FXML
    private Button btnAcc;

    @FXML
    private Button btnAcco;

    @FXML
    private Button btnCurrStu;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnManageRoom;

    @FXML
    private Button btnManageStu;

    @FXML
    private Label lblUser;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblUser.setText(LoginFormController.user);
        //getImage(LoginFormController.user);
    }

    public void btnLogoutOnAction(ActionEvent actionEvent) throws IOException {

//        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("view/login-view.fxml"));
//        Scene scene = new Scene(anchorPane);
//        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
//        //Stage stage = (Stage) pane.getScene().getWindow();
//        stage.setScene(scene);
//        stage.setTitle("Register");
//        stage.centerOnScreen();

        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/lk/ijse/hibernate_d24/view/login-view.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        //Stage stage = (Stage) pane.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.centerOnScreen();

    }

    public void btnAccOnAction(ActionEvent actionEvent) throws IOException {

        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/lk/ijse/hibernate_d24/view/account-view.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        //Stage stage = (Stage) pane.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Account");
        stage.centerOnScreen();

//        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/lk/ijse/hibernate_d24/view/account-view.fxml"));
//        Scene scene = new Scene(anchorPane);
////        Stage oldStage = (Stage) pane.getScene().getWindow();
//        Stage oldStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
//        Stage newStage = new Stage();
//        newStage.setScene(scene);
//        newStage.setTitle("Account");
//        newStage.initModality(Modality.APPLICATION_MODAL);
//        newStage.initOwner(oldStage);
//        newStage.setWidth(600);
//        newStage.setHeight(400);
//        newStage.initStyle(StageStyle.UTILITY);
//        anchorPane.setDisable(true);
//        newStage.show();
    }

    public void btnCurrStuOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/lk/ijse/hibernate_d24/view/current_stu_view.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        //Stage stage = (Stage) pane.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.centerOnScreen();
    }

    public void btnAccoOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/lk/ijse/hibernate_d24/view/current_room_view.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        //Stage stage = (Stage) pane.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.centerOnScreen();
    }

    public void btnManageStuOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/lk/ijse/hibernate_d24/view/manage_stu_view.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        //Stage stage = (Stage) pane.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.centerOnScreen();
    }

    public void btnManageRoomOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/lk/ijse/hibernate_d24/view/manage_room_view.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        //Stage stage = (Stage) pane.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.centerOnScreen();
    }
}
