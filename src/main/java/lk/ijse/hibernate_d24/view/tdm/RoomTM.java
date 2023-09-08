package lk.ijse.hibernate_d24.view.tdm;

public class RoomTM implements Comparable<RoomTM>{

    private String rId;
    private String type;
    private String keyMoney;
    private int qty;

    public RoomTM(String rId, String type, String keyMoney, int qty) {
        this.rId = rId;
        this.type = type;
        this.keyMoney = keyMoney;
        this.qty = qty;
    }

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKeyMoney() {
        return keyMoney;
    }

    public void setKeyMoney(String keyMoney) {
        this.keyMoney = keyMoney;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "RoomTM{" +
                "rId='" + rId + '\'' +
                ", type='" + type + '\'' +
                ", keyMoney='" + keyMoney + '\'' +
                ", qty=" + qty +
                '}';
    }

    @Override
    public int compareTo(RoomTM r) {
        return rId.compareTo(r.getrId());
    }
}
