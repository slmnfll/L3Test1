package org.example.core.impls;

import org.example.core.IRepositories;

import java.sql.*;

public abstract class RepositoriesImpl<T> implements IRepositories<T> {
    protected Connection connection;
    protected Statement statement;
    protected ResultSet resultSet;
    public void openConnection() {
        if (connection == null || statement == null) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/L3Test1", "root", "root");
                statement = connection.createStatement();
            } catch (SQLException e) {
                System.out.println("[Connection error!]");
            }
        }
    }
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) connection.close();
        } catch (SQLException e) {
            System.out.println("[Error closing connection!]");
        }
    }
    public int executeUpdate(String sql) {
        try {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("[Database operation failed!]");
        }
        return 1;
    }

    public void executeQuery(String sql) {
        try {
            resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("[Database operation failed!]");
        }
    }
}
