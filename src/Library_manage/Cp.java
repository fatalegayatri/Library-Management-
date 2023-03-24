package Library_manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Cp {
    static Connection connection ;
    public static Connection CreateC() throws ClassNotFoundException , SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url= "jdbc:mysql://localhost:3306/Library";
        String username="root";
        String password="root";
        Connection connection = DriverManager.getConnection(url, username, password);

        return connection;
    }
}
