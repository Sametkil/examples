package jdbc;

import java.sql.*;
import java.util.Scanner;

public class SelectExample {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen id giriniz:");
        int minId = scanner.nextInt();
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://92.205.21.233:5432/dvdrental"
                , "bilge_adam",
                "1bilge_adam23"
        );

        PreparedStatement preparedStatement = connection.prepareStatement(
                "select f.film_id,f.title,l.name " +
                        "from film f inner join language l " +
                        "on l.language_id=f.language_id where film_id>?"
        );
        preparedStatement.setInt(1,minId);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getInt("film_id") + " - "+
                    resultSet.getString("title") + " - " +
                    resultSet.getString("name"));
        }
    }
}
