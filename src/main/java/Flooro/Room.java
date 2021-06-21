package Flooro;

public class Room {
    private int id;
    private int number_room;
    private int floor;

    public Room(int id) {
        this.id = id;
    }

    public Room(int id, int number_room, int floor) {
        this.id = id;
        this.number_room = number_room;
        this.floor = floor;
    }

    public Room(int room, int floor) {
        this.number_room = number_room;
        this.floor = floor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber_room() {
        return number_room;
    }

    public void setNumber_room(int number_room) {
        this.number_room = number_room;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
