/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ADMIN
 */
public class Myconn {
    public static Connection getconnection() {
        
        Connection con;
        con = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","Vengadesh4867.");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return con;
}
}
