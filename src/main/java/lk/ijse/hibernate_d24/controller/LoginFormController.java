package lk.ijse.hibernate_d24.controller;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.hibernate_d24.bo.BOFactory;
import lk.ijse.hibernate_d24.bo.custom.UserBO;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Base64;
import java.util.ResourceBundle;

public class LoginFormController implements Initializable {

    UserBO userBO = (UserBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.USER);

    @FXML
    private Button btnLogin;

    @FXML
    private Label lblPw;

    @FXML
    private ToggleButton toggleBtn;

    @FXML
    private PasswordField txtPw;

    @FXML
    private TextField txtUser;

    public static String user;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblPw.setVisible(false);
    }

//    public void btnRegCOnAction(ActionEvent actionEvent) throws IOException {
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("register-view.fxml"));
//        Parent root = loader.load();
//
//        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("register-view.fxml"));
//        Scene scene = new Scene(anchorPane);
//        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
//        //Stage stage = (Stage) pane.getScene().getWindow();
//        stage.setScene(scene);
//        stage.setTitle("Register");
//        stage.centerOnScreen();
//    }

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException, SQLException, ClassNotFoundException {

         user = txtUser.getText();

         String userName = txtUser.getText();
         String pW = txtPw.getText();

        boolean isValid = userBO.valid(userName, pW);

//        if(isValid) {

            AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/lk/ijse/hibernate_d24/view/dashboard-view.fxml"));
            Scene scene = new Scene(anchorPane);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            //Stage stage = (Stage) pane.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Dashboard");
            stage.centerOnScreen();

//        }else{
//            new Alert(Alert.AlertType.ERROR, "Login Failed!\nInvalid Username or Password").show();
//        }

    }

    public void btnPwOnAction(ActionEvent actionEvent) {

    }

    public void txtUserOnAction(ActionEvent actionEvent) {
        txtPw.requestFocus();
    }

    public void txtPwOnAction(ActionEvent actionEvent) {
        btnLogin.requestFocus();
    }

    public void toggleBtnOnAction(ActionEvent actionEvent) {
        if (toggleBtn.isSelected()){
            lblPw.setVisible(true);
            lblPw.textProperty().bind(Bindings.concat(txtPw.getText()));
        }else {
            lblPw.setVisible(false);
        }
    }

    public void txtPwKeyTyped(KeyEvent keyEvent) {
        lblPw.textProperty().bind(Bindings.concat(txtPw.getText()));
    }

}
