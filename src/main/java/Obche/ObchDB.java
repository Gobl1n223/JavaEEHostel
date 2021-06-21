package Obche;

import java.sql.*;
import java.util.ArrayList;

public class ObchDB {
    private static String url = "jdbc:mysql://localhost:3306/mydbtest";
    private static String username = "root";
    private static String password = "A@rtzu123";

    public static ArrayList<Obch> select() {

        ArrayList<Obch> obchs = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM obch");
                while(resultSet.next()){
                    int id = resultSet.getInt(1);
                    int number1 = resultSet.getInt(2);
                    String address = resultSet.getString(3);
                    Obch obch = new Obch(id, number1, address);
                    obchs.add(obch);
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return obchs;
    }
    public static Obch selectOfStudents(int id) {

        Obch obch = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                String sql = "SELECT * FROM obch WHERE id = ?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setInt(1, id);

                    ResultSet resultSet = preparedStatement.executeQuery();
                    if(resultSet.next()){
                        int Id = resultSet.getInt(1);
                        int number1 = resultSet.getInt(2);
                        String address = resultSet.getString(3);


                        obch = new Obch(Id,number1, address);
                    }
                }
            }
        }
        catch(Exception ex){
            System.out.println("Не вывел в конструкторе правильно");
        }
        return obch;
    }
    public static int insert(Obch obch) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                String sql = "INSERT INTO obch ( number1, address) VALUES ( ?, ?)";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setInt(1,obch.getNumber1());
                    preparedStatement.setString(2,obch.getAddress());


                    return  preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println("");
        }
        return 0;
    }

    public static int update(Obch obch) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                String sql = "UPDATE obch SET  number1 = ? ,address = ? WHERE id = ?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){


                    preparedStatement.setInt(1,obch.getNumber1());
                    preparedStatement.setString(2,obch.getAddress());
                    preparedStatement.setInt(3,obch.getId());
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

                String sql = "DELETE FROM obch WHERE id = ?";
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

