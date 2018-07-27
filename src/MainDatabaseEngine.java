import Database.Connection;
import Database.DatabaseFunctions;

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
            //statement.executeUpdate(DatabaseFunctions.createUserAccount("Assad","Assad"));
            ResultSet rs = statement.executeQuery(DatabaseFunctions.listItems());

            while (rs.next())
                System.out.println("Name: " + rs.getString(1) + " Type: " + rs.getString(2) + " Price: " + rs.getString(3) + " Quantity: " + rs.getString(4));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
