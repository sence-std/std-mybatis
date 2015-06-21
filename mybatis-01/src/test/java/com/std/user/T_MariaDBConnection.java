package com.std.user;

import org.junit.Assert;
import org.junit.Test;

import java.sql.*;

/**
 * Created by sence on 2015/6/21.
 */
public class T_MariaDBConnection {

    public static final String MARIADB_CONN="jdbc:mariadb://127.0.0.1:3306/std-sample";
    public static final String MARIADB_USER_NAME="root";
    public static final String MARIADB_PASSWORD="sa123";

    @Test
    public void testConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conn = DriverManager.getConnection(MARIADB_CONN,MARIADB_USER_NAME,MARIADB_PASSWORD);
        PreparedStatement pstmt = conn.prepareStatement("select count(*) from std_user su");
        ResultSet rs = pstmt.executeQuery();
        int totalRecord = 0;
        while (rs.next()){
            totalRecord =  rs.getInt(1);
        }
        Assert.assertEquals(totalRecord,1);
        Assert.assertNotNull(conn);
        //close and release
        rs.close();
        pstmt.close();
        conn.close();
    }

}
