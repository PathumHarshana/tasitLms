/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Harshana
 */
public class dbcon {
      private static Connection con;
    private static void setUpConnection()throws Exception{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6641688","sql6641688","119149KHqb");
    }
    public static void iud(String sql) throws Exception{
        if (con==null) {
            setUpConnection();
        }
        con.createStatement().executeUpdate(sql);
    }
    public static ResultSet search( String sql)throws Exception{
        if (con==null) {
            setUpConnection();
        }
        return con.createStatement().executeQuery(sql);
    }
    public static Connection getCon()throws Exception{
        if (con==null) {
            setUpConnection();
        }
        return con;
    }
}
