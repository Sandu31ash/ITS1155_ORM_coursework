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
import lk.ijse.hibernate_d24.bo.custom.RoomBO;
import lk.ijse.hibernate_d24.dto.RoomDTO;
import lk.ijse.hibernate_d24.entity.Room;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

public class RoomManageFormController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnUpdate;

    @FXML
    private TextField txtKey;

    @FXML
    private TextField txtQty;

    @FXML
    private TextField txtRTId;

    @FXML
    private TextField txtType;

    RoomBO roomBO = (RoomBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.ROOM);

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/lk/ijse/hibernate_d24/view/dashboard-view.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        //Stage stage = (Stage) pane.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Dashboard");
        stage.centerOnScreen();
    }

    public void btnSaveOnAction(ActionEvent actionEvent) {

        String rTID = txtRTId.getText();
        String type = txtType.getText();
        String keyMoney = txtKey.getText();
        int qty = Integer.parseInt(txtQty.getText());

        if (txtRTId.getText().matches("^RM-\\d{4}$")) {
            try {

                boolean isSaved = roomBO.save(new RoomDTO(rTID, type, keyMoney, qty));

//
//        Room room = new Room();
//        room.setrId(rTID);
//        room.setType(type);
//        room.setKeyMoney(keyMoney);
//        room.setQty(qty);
//
//        Student student1 = new Student();
//        student1.setId("S002");
//        student1.setName("Sham");
//
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(student);
//        studentList.add(student1);
//
//        Room room = new Room();
//        room.setrId("R001");
//        room.setType("AC");
//
//        room.setStudents(studentList);
//        student.setRoom(room);
//        student1.setRoom(room);
//
//
//        Session session = FactoryConfiguration.getInstance().getSession();
//        Transaction transaction = session.beginTransaction();
//
//        session.persist(student);
//        session.persist(student1);
//        session.persist(room);
//
//        /*persist() is also used for update*/
//        /*sout - for select queries*/
//        //session.remove(customer);
//        transaction.commit();
//        session.close();


                if (isSaved ) {
//                    getAll();
                    new Alert(Alert.AlertType.CONFIRMATION, "Room added!").show();
                }
            } catch (SQLException | ClassNotFoundException e) {
                new Alert(Alert.AlertType.ERROR, "Error! Try Again").show();
            }

        }else{
            new Alert(Alert.AlertType.ERROR, "Invalid room type ID!\nTry Again").show();
        }
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);
        Optional<ButtonType> result = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure to delete? :)", yes,no).showAndWait();
        if(result.orElse(no)==yes) {

            String id = txtRTId.getText();

            boolean isDeleted = roomBO.delete(id);

            if (isDeleted) {
//                getAllEmployee();
                new Alert(Alert.AlertType.CONFIRMATION, "Deleted!").show();
            }
        }
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        String rTID = txtRTId.getText();
        String type = txtType.getText();
        String keyMoney = txtKey.getText();
        int qty = Integer.parseInt(txtQty.getText());

        if (txtRTId.getText().matches("^RM-\\d{4}$")) {
            try {

                boolean isUpdated = roomBO.update(new RoomDTO(rTID, type, keyMoney, qty));

                if (isUpdated) {
//                    getAll();
                    new Alert(Alert.AlertType.CONFIRMATION, "Room details successfully updated!").show();
                }
            } catch (SQLException | ClassNotFoundException e) {
                new Alert(Alert.AlertType.ERROR, "Error! Try Again").show();
            }

        }else{
            new Alert(Alert.AlertType.ERROR, "Invalid room type ID!\nTry Again").show();
        }
    }

    public void txtRTIdOnAction(ActionEvent actionEvent) {

        String rtId = txtRTId.getText();
        if(!rtId.isEmpty()){
            RoomDTO roomDTO = null;
            try{
                roomDTO = roomBO.search(rtId);
            }catch (SQLException | ClassNotFoundException e){
                new Alert(Alert.AlertType.ERROR, "Something went wrong :"+e).show();
            }
            if (roomDTO != null){
                txtRTId.setText(roomDTO.getrId());
                txtType.setText(roomDTO.getType());
                txtKey.setText(roomDTO.getKeyMoney());
                txtQty.setText(String.valueOf(roomDTO.getQty()));

                txtType.requestFocus();
            }else{
                new Alert(Alert.AlertType.INFORMATION, "This room type id isn't exist").show();
                txtType.requestFocus();
            }
        }
    }

    public void txtTypeOnAction(ActionEvent actionEvent) {
        txtKey.requestFocus();
    }

    public void txtKeyOnAction(ActionEvent actionEvent) {
        txtQty.requestFocus();
    }

    public void txtQtyOnAction(ActionEvent actionEvent) {

    }

    public void btnResetOnAction(ActionEvent actionEvent) {
        txtRTId.setText("");
        txtType.setText("");
        txtKey.setText("");
        txtQty.setText("");
    }
}
