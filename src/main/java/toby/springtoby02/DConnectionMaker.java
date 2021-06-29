package toby.springtoby02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {
    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.oracle.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:oracle://localhost/springbook", "spring", "book");
        return c;
    }
}
