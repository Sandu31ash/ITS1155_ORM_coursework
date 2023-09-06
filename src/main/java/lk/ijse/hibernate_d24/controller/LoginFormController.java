package lk.ijse.hibernate_d24.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.hibernate_d24.bo.BOFactory;
import lk.ijse.hibernate_d24.bo.custom.UserBO;

import java.io.IOException;
import java.sql.SQLException;

public class LoginFormController {

    UserBO userBO = (UserBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.USER);

    @FXML
    private AnchorPane pane;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnPw;

    @FXML
    private PasswordField txtPw;

    @FXML
    private TextField txtUser;

    public static String user;

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

    }

    public void txtPwOnAction(ActionEvent actionEvent) {

    }
}
