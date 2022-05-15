package jdbc;

import java.sql.*;

public class JdbcExampleOne {
    public static void main(String[] args) throws SQLException {
        Connection connection =
                DriverManager.getConnection
                        ("jdbc:postgresql://92.205.21.233:5432/dvdrental"
                                , "bilge_adam",
                                "1bilge_adam23");
        Statement statement = connection.createStatement();
        PreparedStatement preparedStatement
                = connection.prepareStatement
                ("select address_id,city_id,district" +
                        ",address from address");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1)
                    + " " + resultSet.getInt(2)
                    + " " + resultSet.getString(3) +
                    ", " + resultSet.getString(4));
        }
        connection.close();
    }
}
