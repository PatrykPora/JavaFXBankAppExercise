package pl.pepe.bankapp.database;

import java.sql.*;

public class DatabaseDriver {

    private Connection connection;

    public DatabaseDriver() {
        try {
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection("jdbc:sqlite:porobank.db");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public ResultSet getClientData(String pAddress, String password) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            statement = this.connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Clients WHERE PayeeAddress = '" + pAddress + "' AND Password = '" + password + "'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }


}
