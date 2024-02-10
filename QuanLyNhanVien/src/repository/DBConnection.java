package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cuongnguyenba
 */
public class DBConnection {

    public static final String HOSTNAME = "CUONGNGUYENBA\\CUONGSQL";
    public static final String PORT = "1433";
    public static final String DBNAME = "FINALASS_FPOLY_NET_JAVA_SM22_BL2";
    public static final String USERNAME = "sa";
    public static final String PASSWORD = "cuong";

    public static Connection getConnection() {
        String url = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + ";" + "databaseName=" + DBNAME;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
