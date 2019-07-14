package lesson2.database;

import java.sql.*;

public class MainDB {
    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) throws SQLException {
        try {
            connection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        ResultSet resultSet = statement.executeQuery("SELECT * FROM employees;");

//        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
//
//        for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
//            System.out.println(resultSetMetaData.getColumnName(i) + " " + resultSetMetaData.getColumnType(i));
//
//        }

//        while (resultSet.next()){
//            System.out.println(resultSet.getInt(1) + " " + resultSet.getString("name"));
//        }
//        statement.executeUpdate("UPDATE employees SET salary = 5 where id = 4");
//        statement.executeUpdate("DELETE FROM employees where id = 4");
//        statement.executeUpdate("DROP TABLE IF EXISTS employees");
        statement.executeUpdate("CREATE TABLE employees (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, position TEXT, salary INTEGER);");
    }

    public static void connection() throws ClassNotFoundException, SQLException {
            Class.forName("org.sqlite.JDBC");

            connection = DriverManager.getConnection("jdbc:sqlite:EmployeesDB.db");
            statement = connection.createStatement();
    }

    public static void disconect() throws SQLException {
            connection.close();
    }
}
