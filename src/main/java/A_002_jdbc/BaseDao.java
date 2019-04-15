package A_002_jdbc;

import java.sql.*;

public class BaseDao {

    protected Connection connection;
    protected PreparedStatement ps;
    protected ResultSet result;

    private static final String DRIVER_CLASS = "com.mysql.cj.A_002_jdbc.Driver";
    private static final String URL = "A_002_jdbc:mysql://localhost:3306/demo_001";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public void close(Connection connection, PreparedStatement ps, ResultSet result) {
        try {
            if (result != null)
                result.close();
            if (ps != null)
                ps.close();
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
