package lk.ijse.hibernate_d24.dao;

import lk.ijse.hibernate_d24.dao.custom.impl.*;

public class DAOFactory {


    private static DAOFactory daoFactory;

    private DAOFactory() {

    }

    public static DAOFactory getDaoFactory() {
        return (daoFactory == null) ? daoFactory = new DAOFactory() : daoFactory;
    }

    public SuperDAO getDAO(DAOTypes types) {
        switch (types) {
//            case STUDENT:
//                return new StudentDAOImpl();
//            case ROOM:
//                return new RoomDAOImpl();
            case QUERY_DAO:
                return new QueryDAOImpl();
            case USER:
                return new UserDAOImpl();
            default:
                return null;

        }
    }

    public enum DAOTypes {
        STUDENT , ROOM , USER , QUERY_DAO
    }

}
