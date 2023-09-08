package lk.ijse.hibernate_d24.bo.custom;

import lk.ijse.hibernate_d24.bo.SuperBO;
import lk.ijse.hibernate_d24.dto.RoomDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface RoomBO extends SuperBO {

    boolean save(RoomDTO dto) throws SQLException, ClassNotFoundException;

    boolean update(RoomDTO dto) throws SQLException, ClassNotFoundException;

    boolean delete(String rTId) throws SQLException, ClassNotFoundException;

    RoomDTO search(String id) throws SQLException, ClassNotFoundException;

    ArrayList<RoomDTO> getAllRooms() throws SQLException, ClassNotFoundException;

}
