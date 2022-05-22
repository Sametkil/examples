package jdbc;

import java.sql.*;

// id 800 ile 825 arasında olan filmlerin
//title ns ile biten filmleri buldurun.
public class SelectExampleTwo {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://92.205.21.233:5432/dvdrental"
                        , "bilge_adam",
                        "1bilge_adam23");
        String sql = "select f.film_id,f.title from film f " +
                "where (f.film_id between 800 and 825) and f.title like '%ns'";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getInt("film_id")+ "-"+
                    resultSet.getString(2));
        }
        connection.close();
    }
}
