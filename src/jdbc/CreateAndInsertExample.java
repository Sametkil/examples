package jdbc;

import java.sql.*;

// kendi adına bir tablo create etsin
// id int, name varchar, surname varchar
// 3 data insert edilecek.
// yazdırın
public class CreateAndInsertExample {

    private static final String TABLE_NAME="burak_duman";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://92.205.21.233:5432/dvdrental"
                , "bilge_adam",
                "1bilge_adam23"
        );
        if(checkTable(connection)){
            System.out.println("Tablo var.");
        }else {
            PreparedStatement createPS = connection.prepareStatement("" +
                    "create table "+ TABLE_NAME +" (id integer,name varchar" +
                    ",surname varchar);");
            createPS.executeUpdate();
            System.out.println("Tablo olusturuldu.");
        }
        PreparedStatement insertPs = connection.prepareStatement(
                "insert into "+TABLE_NAME+" (id,name,surname) " +
                        "values(10,'aaa','bbb')," +
                        "(11,'ead','bbasdb')," +
                        "(12,'azxcaa','zxcxzc');"
        );
        insertPs.executeUpdate();
        System.out.println("Insert islemi tamamlandi.");
    }

    public static boolean checkTable(Connection connection) throws SQLException {
        DatabaseMetaData databaseMetaData = connection.getMetaData();
        ResultSet resultSet = databaseMetaData
                .getTables(null, null,
                        TABLE_NAME, new String[] {"TABLE"});

        while (resultSet.next()) {
            String name = resultSet.getString("TABLE_NAME");
            if(name.equals(TABLE_NAME)){
                return true;
            }
        }
        return false;
    }
}
