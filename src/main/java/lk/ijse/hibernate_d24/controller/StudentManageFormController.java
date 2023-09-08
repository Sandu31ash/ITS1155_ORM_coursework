package lk.ijse.hibernate_d24.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.hibernate_d24.bo.BOFactory;
import lk.ijse.hibernate_d24.bo.custom.ReservationBO;
import lk.ijse.hibernate_d24.bo.custom.RoomBO;
import lk.ijse.hibernate_d24.bo.custom.StudentBO;
import lk.ijse.hibernate_d24.dto.ReservationDTO;
import lk.ijse.hibernate_d24.dto.RoomDTO;
import lk.ijse.hibernate_d24.dto.StudentDTO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

public class StudentManageFormController {

    StudentBO studentBO = (StudentBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.STUDENT);
    ReservationBO reservationBO = (ReservationBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.RESERVATION);

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
        txtKey.requestFocus();
    }

    public void txtRTIdOnAction(ActionEvent actionEvent) {
        txtStatus.requestFocus();
    }

    public void txtDateOnAction(ActionEvent actionEvent) {
        txtRTId.requestFocus();
    }

    public void txtRIdOnAction(ActionEvent actionEvent) {
        txtDate.requestFocus();
    }


    public void txtGenderOnAction(ActionEvent actionEvent) {
        txtRId.requestFocus();
    }

    public void txtDobOnAction(ActionEvent actionEvent) {
        txtGender.requestFocus();
    }

    public void txtContactOnAction(ActionEvent actionEvent) {
        txtDob.requestFocus();
    }

    public void txtAddOnAction(ActionEvent actionEvent) {
        txtContact.requestFocus();
    }

    public void txtNameOnAction(ActionEvent actionEvent) {
        txtAdd.requestFocus();
    }

    public void btnSaveOnAction(ActionEvent actionEvent) {
        String sId = txtSId.getText();
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

        if (!txtSId.getText().equals("")) {
            try {

                boolean isSaved = studentBO.save(new StudentDTO(sId, name, address, contact, dob, gender));

                boolean isSaved1 = reservationBO.save(new ReservationDTO(rId, date, sId, rTId, status, kMoney));

                if (isSaved) {
//                    getAll();
//                    new Alert(Alert.AlertType.CONFIRMATION, "Student added!").show();
                    if(isSaved1){
                        new Alert(Alert.AlertType.CONFIRMATION, "Reservation successfully done!").show();
                    }
                }

            } catch (SQLException | ClassNotFoundException e) {
                new Alert(Alert.AlertType.ERROR, "Error! Try Again").show();
            }

        }else{
            new Alert(Alert.AlertType.ERROR, "Invalid student ID!\nTry Again").show();
        }
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        String sId = txtSId.getText();
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

        if (!txtSId.getText().equals("")) {
            try {

                boolean isUpdated = studentBO.update(new StudentDTO(sId, name, address, contact, dob, gender));

                boolean isUpdated1 = reservationBO.update(new ReservationDTO(rId, date, sId, rTId, status, kMoney));

                if (isUpdated && isUpdated1) {
//                    getAll();
                    new Alert(Alert.AlertType.CONFIRMATION, "Student & Reservation details are successfully updated!").show();
                }

            } catch (SQLException | ClassNotFoundException e) {
                new Alert(Alert.AlertType.ERROR, "Error! Try Again").show();
            }

        }else{
            new Alert(Alert.AlertType.ERROR, "Invalid student ID!\nTry Again").show();
        }
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);
        Optional<ButtonType> result = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure to delete? :)", yes,no).showAndWait();
        if(result.orElse(no)==yes) {

            //boolean isDeleted = RecipeModel.isDeleted(txtRecipeCode.getText());
            //boolean isDeleted1 = RecipeModel.isDeleted1(txtRecipeCode.getText());

            String sId = txtSId.getText();

            boolean isDeleted = reservationBO.delete(sId);

            boolean isDeleted1 = studentBO.delete(sId);

            if (isDeleted && isDeleted1) {
//                getAllRecipe();
//                getAllRecipeIngD();
                new Alert(Alert.AlertType.CONFIRMATION, "Deleted!").show();
            }
        }
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

    public void btnResetOnAction(ActionEvent actionEvent) {
        txtSId.setText("");
        txtName.setText("");
        txtGender.setText("");
        txtContact.setText("");
        txtAdd.setText("");
        txtDob.setText("");

        txtRId.setText("");
        txtDate.setText("");
        txtRTId.setText("");
        txtStatus.setText("");
        txtKey.setText("");
    }

    public void txtSIdOnAction(ActionEvent actionEvent) {
        String sId = txtSId.getText();

        getStudentDetails(sId);
        getReservationDetails(sId);

    }

    public void getStudentDetails(String sId){
        if(!sId.isEmpty()){
            StudentDTO studentDTO = null;
            try{
                studentDTO = studentBO.search(sId);
            }catch (SQLException | ClassNotFoundException e){
//                new Alert(Alert.AlertType.ERROR, "Something went wrong :"+e).show();

            }
            if (studentDTO != null){
                txtSId.setText(studentDTO.getId());
                txtName.setText(studentDTO.getName());
                txtAdd.setText(studentDTO.getAddress());
                txtContact.setText(studentDTO.getContact());
                txtDob.setText(studentDTO.getDob());
                txtGender.setText(studentDTO.getGender());

                txtName.requestFocus();
            }else{
//                new Alert(Alert.AlertType.INFORMATION, "This student id isn't exist").show();
                txtName.requestFocus();
            }
        }
    }

    public void getReservationDetails(String sId){
        if(!sId.isEmpty()){
            ReservationDTO reservationDTO = null;
            try{
                reservationDTO = reservationBO.search(sId);
            }catch (SQLException | ClassNotFoundException e){
//                new Alert(Alert.AlertType.ERROR, "Something went wrong :"+e).show();
            }
            if (reservationDTO != null){
                txtRId.setText(reservationDTO.getResId());
                txtDate.setText(reservationDTO.getDate());
                txtRTId.setText(reservationDTO.getrTId());
                txtStatus.setText(reservationDTO.getStatus());
                txtKey.setText(reservationDTO.getKeyMoney());

                txtName.requestFocus();
            }else{
//                new Alert(Alert.AlertType.INFORMATION, "This reservation id isn't exist").show();
                txtName.requestFocus();
            }
        }
    }

}
