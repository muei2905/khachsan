package modelFrondend;



public class Model_Room {
    private String name;
    private String roomname;
    private String status;
    private String date;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public Model_Room(String name, String roomname, String status, String date) {
        this.name = name;
        this.roomname = roomname;
        this.status = status;
        this.date = date;
    }
    public Model_Room(){
    }
}
