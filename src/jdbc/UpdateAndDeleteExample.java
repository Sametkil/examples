package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateAndDeleteExample {
    private static final String TABLE_NAME="burak_duman";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://92.205.21.233:5432/dvdrental"
                , "bilge_adam",
                "1bilge_adam23"
        );
        update(connection);
        delete(connection);
    }

    public static void update(Connection connection) throws SQLException {
        String updateSql="update "+TABLE_NAME+" set name ='AAA'" +
                "where id=11";
        PreparedStatement updatePS= connection.prepareStatement(updateSql);
        updatePS.executeUpdate();
        System.out.println("Guncelleme islemi tamamlandi.");
    }

    public static  void delete(Connection connection) throws SQLException {
        String deleteSql="delete from "+TABLE_NAME+
                " where id>11";
        PreparedStatement deletePs = connection.prepareStatement(deleteSql);
        deletePs.executeUpdate();
        System.out.println("Silme islemi tamamlandi.");
    }
}
