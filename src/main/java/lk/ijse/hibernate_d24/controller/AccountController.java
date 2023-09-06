package lk.ijse.hibernate_d24.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.hibernate_d24.bo.BOFactory;
import lk.ijse.hibernate_d24.bo.custom.UserBO;
import lk.ijse.hibernate_d24.dto.UserDTO;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class AccountController implements Initializable {

    UserBO userBO = (UserBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.USER);

    @FXML
    private Button btnBack;

    @FXML
    private Button btnPw;

    @FXML
    private Button btnUpdate;

    @FXML
    private PasswordField txtPw;

    @FXML
    private TextField txtUserName;

    @FXML
    private Label lblUser;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblUser.setText(LoginFormController.user);
        //getImage(LoginFormController.user);
    }


    public void btnUpdateOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {

        String userName = txtUserName.getText();
        String pW = txtPw.getText();
        String user = lblUser.getText();

        if (txtUserName.getText() == null || txtUserName.getText().isEmpty()) {
//            lblUser.setText("Username or Password cannot be empty  !");
            new Alert(Alert.AlertType.ERROR, "Username or Password cannot be empty!").show();
            txtUserName.requestFocus();
        }else if (txtPw.getText() == null || txtPw.getText().isEmpty()) {
//            lblPw.setText("Username or Password cannot be empty  !");
            new Alert(Alert.AlertType.ERROR, "Username or Password cannot be empty!").show();
        } else if (txtPw.getText().matches("^(?=.*\\d)(?=.*[a-zA-Z])(?=.*\\W).{8,}$")) {
            //boolean isCreated = UserModel.isCreated(userName, pW, id, jobRole);

            boolean isUpdated = userBO.update(new UserDTO(userName, pW, user));

            if (isUpdated) {
//                getAllUser();
                new Alert(Alert.AlertType.CONFIRMATION, "Account successfully updated!").show();
                lblUser.setText(userName);
            }
            //new Alert(Alert.AlertType.ERROR, "Invalid Password!\nTry Again").show();
        }else {
//            lblPw.setText("Invalid Password!\nTry Again");
            new Alert(Alert.AlertType.ERROR, "Invalid Password!\nTry Again").show();
        }
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
