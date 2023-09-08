package lk.ijse.hibernate_d24.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.hibernate_d24.bo.BOFactory;
import lk.ijse.hibernate_d24.bo.custom.ReservationBO;
import lk.ijse.hibernate_d24.bo.custom.StudentBO;
import lk.ijse.hibernate_d24.dto.ReservationDTO;
import lk.ijse.hibernate_d24.dto.StudentDTO;
import lk.ijse.hibernate_d24.view.tdm.ReservationTM;
import lk.ijse.hibernate_d24.view.tdm.StudentTM;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

public class CurrentStuFormController implements Initializable {

    @FXML
    private Button btnBack;

    @FXML
    private TableColumn<?, ?> colAdd;

    @FXML
    private TableColumn<?, ?> colCon;

    @FXML
    private TableColumn<?, ?> colDOB;

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colGen;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colRId;

    @FXML
    private TableColumn<?, ?> colRTId;

    @FXML
    private TableColumn<?, ?> colSId;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private TableColumn<?, ?> colKey;

    @FXML
    private TableView<StudentTM> tbStudent;

    @FXML
    private TableView<ReservationTM> tbRes;

    StudentBO studentBO = (StudentBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.STUDENT);
    ReservationBO reservationBO = (ReservationBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.RESERVATION);


    @Override
    public void initialize(java.net.URL url, ResourceBundle resourceBundle) {
        setCellValueFactory();
        setCellValueFactory1();
        getAll();
        getAllRes();
    }

    void setCellValueFactory() {
        colSId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAdd.setCellValueFactory(new PropertyValueFactory<>("address"));
        colCon.setCellValueFactory(new PropertyValueFactory<>("contact"));
        colDOB.setCellValueFactory(new PropertyValueFactory<>("dob"));
        colGen.setCellValueFactory(new PropertyValueFactory<>("gender"));

    }

    void setCellValueFactory1(){
        colRId.setCellValueFactory(new PropertyValueFactory<>("resId"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));
//        colRTId.setCellValueFactory(new PropertyValueFactory<>("sId"));
        colRTId.setCellValueFactory(new PropertyValueFactory<>("rTId"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        colKey.setCellValueFactory(new PropertyValueFactory<>("key_money"));
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

    private void getAll(){
        try {
            ObservableList<StudentTM> obList = FXCollections.observableArrayList();
            List<StudentDTO> stuList = studentBO.getAllStudent();

            for(StudentDTO studentDTO : stuList) {
                obList.add(new StudentTM(
                        studentDTO.getId(),
                        studentDTO.getName(),
                        studentDTO.getAddress(),
                        studentDTO.getContact(),
                        studentDTO.getDob(),
                        studentDTO.getGender()
                ));
            }
            tbStudent.setItems(obList);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR, "Query error!").show();
        }
    }

    private void getAllRes(){
        try {
            ObservableList<ReservationTM> obList = FXCollections.observableArrayList();
            List<ReservationDTO> resList = reservationBO.getAllRes();

            for(ReservationDTO reservationDTO : resList) {
                obList.add(new ReservationTM(
                        reservationDTO.getResId(),
                        reservationDTO.getDate(),
                        reservationDTO.getrTId(),
                        reservationDTO.getStatus(),
                        reservationDTO.getKeyMoney()
                ));
            }
            tbRes.setItems(obList);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR, "Query error!").show();
        }
    }

}
