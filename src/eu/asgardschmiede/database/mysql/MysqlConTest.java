package eu.asgardschmiede.database.mysql;

import java.sql.*;

//Alles in Einem -> Spagetti-Code
public class MysqlConTest {

    private final String HOST = "localhost";
    private final int PORT = 3306;
    private final String USER ="root";
    private final String PASSWORD = "";
    private final String DB_NAME = "testdb";

    public static void main(String[] args) {
        new MysqlConTest().run();
        
    }

    private void run() {

        try(Connection dbh= createConnection(); Statement stmt = dbh.createStatement()){
            final String SQL = "SELECT * FROM immobilien";

            ResultSet results = stmt.executeQuery(SQL);

            while(results.next()){
                System.out.println(results.getLong("id"));
                System.out.println(results.getString("titel"));
                System.out.println(results.getString("beschreibung"));
                System.out.println(results.getInt("groesse"));
                System.out.println(results.getDouble("preis"));
                System.out.println();
            }
        }
        catch(SQLException e){
            System.out.println("Problem beim Verbinden mit der DB: " + e.getMessage());
        }
    }

    private Connection createConnection () throws SQLException {
        final String URL = "jdbc:mysql://"+ HOST + ":" + PORT + "/" + DB_NAME;

        return DriverManager.getConnection(URL,USER, PASSWORD);
    }
}
