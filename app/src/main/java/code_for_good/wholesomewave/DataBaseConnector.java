package code_for_good.wholesomewave;

/**
 * Created by Kevin on 11/4/17.
 */

import java.sql.*;

public class DataBaseConnector {
    private static DataBaseConnector instance = new DataBaseConnector();

    public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/testing"; //Re-edit when server is complete
    public static final String USERNAME = "testUserName";
    public static final String PASSWORD = "askldfj";



}
