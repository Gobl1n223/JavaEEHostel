package mysql.hostel;

import java.io.Serializable;

public class hostel implements Serializable{
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String surname;
    private String groupa;
    private int number_room;

    public hostel(String name, String surname, String groupa, int number_room, int floor, String address, int number) {
        this.name = name;
        this.surname = surname;
        this.groupa = groupa;
        this.number_room = number_room;
        this.floor = floor;
        this.address = address;
        this.number = number;
    }

    public hostel(int id, String name, String surname, String groupa, int number_room, int floor, String address, int number) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.groupa = groupa;
        this.number_room = number_room;
        this.floor = floor;
        this.address = address;
        this.number = number;
    }

    public hostel(String name, String surname, String groupa, int number, int floor) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.groupa = groupa;
        this.number = number;
        this.address = address;
        this.floor = floor;
        this.number_room = number_room;


    }

    public hostel(String name, String surname, String groupa, int number, String address, int floor, int number_room) {
        this.name = name;
        this.surname = surname;
        this.groupa = groupa;
        this.number = number;
        this.address = address;
        this.floor = floor;
        this.number_room = number_room;
    }

    public hostel(int id, String name, String surname, String groupa, int number, int number_room) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.groupa = groupa;
        this.number = number;
        this.number_room = number_room;
    }

    public hostel(int id, String name, String surname, String groupa, int number, String address, int floor, int number_room) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.groupa = groupa;
        this.number = number;
        this.address = address;
        this.floor = floor;
        this.number_room = number_room;
    }

    public hostel() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroupa() {
        return groupa;
    }

    public void setGroupa(String groupa) {
        this.groupa = groupa;
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

    private int floor;
    private String address;
    private int number;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

