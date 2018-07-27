import Database.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainDatabaseEngine {
    public static void main(String[] args) {
        Connection connection = new Connection();
        java.sql.Connection databaseConnection = connection.getDatabaseConnection();
        String sqlQuery = "";

        try {
            Statement statement = databaseConnection.createStatement();
            ResultSet rs = statement.executeQuery(sqlQuery);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
