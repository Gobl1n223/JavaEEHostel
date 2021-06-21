package mysql.hostel;

import java.sql.*;
import java.util.ArrayList;

public class hostelDB {
    private static String url = "jdbc:mysql://localhost:3306/mydbtest";
    private static String username = "root";
    private static String password = "A@rtzu123";

    public static ArrayList<hostel> select() {

        ArrayList<hostel> hostels = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM hostel");
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String name = resultSet.getString(2);
                    String surname = resultSet.getString(3);
                    String groupa = resultSet.getString(4);
                    int number = resultSet.getInt(5);
                    int number_room = resultSet.getInt(6);
                    hostel hostel = new hostel(id, name, surname, groupa, number, number_room);
                    hostels.add(hostel);
                }
            }
        }
     catch (Exception ex) {
        System.out.println(ex);
    }
            return hostels;
    }

    public static ArrayList<hostel> selectOfStudents111(int number_room) {

        hostel hostel = null;
        ArrayList<hostel> hostelz = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                String sql = "SELECT * FROM mydbtest.hostel where number_room = ?;";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setInt(1, number_room);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    while (resultSet.next()){
                        hostel hostel11 = new hostel();
                        hostel11.setId(resultSet.getInt("id"));
                        hostel11.setName(resultSet.getString("name"));
                        hostel11.setSurname(resultSet.getString("surname"));
                        hostel11.setGroupa(resultSet.getString("groupa"));
                        hostel11.setNumber(resultSet.getInt("number"));
                        hostel11.setNumber_room(resultSet.getInt("number_room"));

                        hostelz.add(hostel11);
                    }
                }
            }
        }
        catch(Exception ex){
            System.out.println("Не вывел в конструкторе правильно");
        }
        return hostelz;
    }
    public static hostel selectOfStudents(int id) {

        hostel hostel = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

            String sql = "SELECT * FROM hostel WHERE id = ?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setInt(1, id);

                    ResultSet resultSet = preparedStatement.executeQuery();
                    if(resultSet.next()){
                        int Id = resultSet.getInt(1);
                        String name = resultSet.getString(2);
                        String surname = resultSet.getString(3);
                        String groupa = resultSet.getString(4);
                        int number = resultSet.getInt(5);
                        int number_room = resultSet.getInt(6);

                        hostel = new hostel(Id, name, surname,groupa,number,number_room);
                    }
                }
            }
        }
        catch(Exception ex){
            System.out.println("Не вывел в конструкторе правильно");
        }
        return hostel;
    }
    public static int insert(hostel hostel) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                String sql = "INSERT INTO hostel ( name, surname, groupa , number, number_room) VALUES ( ?, ?,?,?,?);";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setString(1, hostel.getName());
                    preparedStatement.setString(2, hostel.getSurname());
                    preparedStatement.setString(3,hostel.getGroupa());
                    preparedStatement.setInt(4,hostel.getNumber());
                    preparedStatement.setInt(5,hostel.getNumber_room());

                    return  preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println("");
        }
        return 0;
    }

    public static int update(hostel hostel) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                String sql = "UPDATE hostel SET  name = ?, surname = ?, groupa = ?,number = ? ,number_room = ? WHERE id = ?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){

                    preparedStatement.setString(1, hostel.getName());
                    preparedStatement.setString(2, hostel.getSurname());
                    preparedStatement.setString(3,hostel.getGroupa());
                    preparedStatement.setInt(4,hostel.getNumber());
                    preparedStatement.setInt(5,hostel.getNumber_room());
                    preparedStatement.setInt(6,hostel.getId());
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

                String sql = "DELETE FROM hostel WHERE id = ?";
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
