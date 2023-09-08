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
import lk.ijse.hibernate_d24.bo.custom.RoomBO;
import lk.ijse.hibernate_d24.dto.RoomDTO;
import lk.ijse.hibernate_d24.view.tdm.RoomTM;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

public class CurrentRoomFormController implements Initializable {

    RoomBO roomBO = (RoomBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.ROOM);

    @FXML
    private Button btnBack;

    @FXML
    private TableColumn<?, ?> colKey;

    @FXML
    private TableColumn<?, ?> colQty;

    @FXML
    private TableColumn<?, ?> colRoomTId;

    @FXML
    private TableColumn<?, ?> colType;

    @FXML
    private TableView<RoomTM> tbRooms;

    @Override
    public void initialize(java.net.URL url, ResourceBundle resourceBundle) {
        setCellValueFactory();
        getAll();
    }

    void setCellValueFactory() {
        colRoomTId.setCellValueFactory(new PropertyValueFactory<>("rId"));
        colType.setCellValueFactory(new PropertyValueFactory<>("type"));
        colKey.setCellValueFactory(new PropertyValueFactory<>("keyMoney"));
        colQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
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
            ObservableList<RoomTM> obList = FXCollections.observableArrayList();
            //List<Employee> empList = EmployeeModel.getAll();
            List<RoomDTO> roomList = roomBO.getAllRooms();

            for(RoomDTO roomDTO : roomList) {
                obList.add(new RoomTM(
                        roomDTO.getrId(),
                        roomDTO.getType(),
                        roomDTO.getKeyMoney(),
                        roomDTO.getQty()
                ));
            }
            tbRooms.setItems(obList);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR, "Query error!").show();
        }
    }
}
