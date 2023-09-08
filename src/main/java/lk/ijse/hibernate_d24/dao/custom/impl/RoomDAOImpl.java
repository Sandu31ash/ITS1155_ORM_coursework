package lk.ijse.hibernate_d24.dao.custom.impl;

import lk.ijse.hibernate_d24.dao.custom.RoomDAO;
import lk.ijse.hibernate_d24.entity.Room;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RoomDAOImpl implements RoomDAO {
    @Override
    public boolean save(Room entity) throws SQLException, ClassNotFoundException {
//        boolean isSaved = SQLUtil.execute("INSERT INTO room (room_t_id, type, key_money, qty) VALUES (?,?,?,?)", entity.getrId(), entity.getType(), entity.getKeyMoney(), entity.getQty());
//        return isSaved;
        return false;
    }

    @Override
    public boolean update(Room entity) throws SQLException, ClassNotFoundException {
//        boolean isUpdated = SQLUtil.execute("UPDATE room SET type = ?, key_money = ?, qty = ? WHERE room_t_id = ?", entity.getType(), entity.getKeyMoney(), entity.getQty(), entity.getrId());
//        return isUpdated;
        return false;
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
//        boolean isDeleted = SQLUtil.execute("DELETE FROM room WHERE room_t_id = ?", id);
//        return isDeleted;
        return false;
    }

    @Override
    public ArrayList<Room> getAll() throws SQLException, ClassNotFoundException {
//        ArrayList<Room> allRooms = new ArrayList<>();
//
//        ResultSet rst = SQLUtil.execute("SELECT * FROM room");
//
//        while (rst.next()) {
//            Room room = new Room(rst.getString("room_t_id"), rst.getString(2), rst.getString(3), rst.getInt(4));
//            allRooms.add(room);
//        }
//        return allRooms;
        return null;
    }

    @Override
    public Room search(String id) throws SQLException, ClassNotFoundException {
//        ResultSet rst = SQLUtil.execute("SELECT * FROM room WHERE room_t_id=?", id + "");
//        rst.next();
//        return new Room(id + "", rst.getString("type"), rst.getString("key_money"),rst.getInt("qty"));
        return null;
    }
}
