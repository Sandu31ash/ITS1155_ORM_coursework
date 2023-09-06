package lk.ijse.hibernate_d24.bo.custom.impl;

import lk.ijse.hibernate_d24.bo.custom.RoomBO;
import lk.ijse.hibernate_d24.dao.DAOFactory;
import lk.ijse.hibernate_d24.dao.custom.RoomDAO;
import lk.ijse.hibernate_d24.dto.RoomDTO;
import lk.ijse.hibernate_d24.entity.Room;

import java.sql.SQLException;
import java.util.ArrayList;

public class RoomBOImpl implements RoomBO {

    RoomDAO roomDAO = (RoomDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.ROOM);

    @Override
    public ArrayList<RoomDTO> getAllRooms() throws SQLException, ClassNotFoundException {
        ArrayList<RoomDTO> allRooms= new ArrayList<>();
        ArrayList<Room> all = roomDAO.getAll();
        for (Room r : all) {
            allRooms.add(new RoomDTO(r.getrId(), r.getType(), r.getKeyMoney(), r.getQty()));
        }
        return allRooms;
    }
}
