package lk.ijse.hibernate_d24.bo.custom;

import lk.ijse.hibernate_d24.bo.SuperBO;
import lk.ijse.hibernate_d24.dto.RoomDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface RoomBO extends SuperBO {

    ArrayList<RoomDTO> getAllRooms() throws SQLException, ClassNotFoundException;

}
