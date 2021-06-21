package Flooro;

import mysql.hostel.hostel;

import java.sql.*;
import java.util.ArrayList;

public class RoomDB {
    private static String url = "jdbc:mysql://localhost:3306/mydbtest";
    private static String username = "root";
    private static String password = "A@rtzu123";

    public static ArrayList<Room> select() {

        ArrayList<Room> rooms = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM room");
                while(resultSet.next()){
                    int id = resultSet.getInt(1);
                    int number_room = resultSet.getInt(2);
                    int floor = resultSet.getInt(3);
                    Room room = new Room(id,number_room,floor);
                    rooms.add(room);
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return rooms;
    }
    public static Room selectOfStudents(int id) {

        Room room = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                String sql = "SELECT * FROM room WHERE id = ?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setInt(1, id);

                    ResultSet resultSet = preparedStatement.executeQuery();
                    if(resultSet.next()){
                        int Id = resultSet.getInt(1);
                        int number_room = resultSet.getInt(2);
                        int floor = resultSet.getInt(3);

                        room = new Room(Id,number_room,floor);
                    }
                }
            }
        }
        catch(Exception ex){
            System.out.println("Не вывел в конструкторе правильно");
        }
        return room;
    }
    public static int insert(Room room) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                String sql = "INSERT INTO room (room, floor) Values ( ?, ?);";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){

                    preparedStatement.setInt(1,room.getNumber_room());
                    preparedStatement.setInt(2,room.getFloor());

                    return  preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println("");
        }
        return 0;
    }

    public static int update(Room room) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                String sql = "UPDATE room SET  room =?, floor = ?  WHERE id = ?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setInt(1,room.getNumber_room());
                    preparedStatement.setInt(2,room.getFloor());
                    preparedStatement.setInt(3,room.getId());
                    return  preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println("Не удалось обновить");
        }
        return 0;
    }
    public static int delete(int id) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                String sql = "DELETE FROM room WHERE id = ?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setInt(1, id);

                    return  preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println("Не удалось удалить");
        }
        return 0;
    }
}