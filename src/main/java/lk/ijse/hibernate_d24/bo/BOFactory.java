package lk.ijse.hibernate_d24.bo;

import lk.ijse.hibernate_d24.bo.custom.impl.*;

public class BOFactory {

    private static BOFactory boFactory;

    private BOFactory(){

    }

    public static BOFactory getBOFactory(){
        return (boFactory == null) ? boFactory = new BOFactory() : boFactory;
    }

    public SuperBO getBO(BOTypes boTypes){
        switch (boTypes) {
            case STUDENT:
                return new StudentBOImpl();
            case ROOM:
                return new RoomBOImpl();
            case RESERVATION:
                return new ReservationBOImpl();
            case USER:
                  return new UserBOImpl();
            default:
                return null;
        }
    }

    public enum BOTypes{
        STUDENT , ROOM , RESERVATION , USER
    }

}
