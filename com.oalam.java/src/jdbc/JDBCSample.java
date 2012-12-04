/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.*;

/**
 *
 * @author HumanBooster
 */
public class JDBCSample {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        String jdbc = "jdbc:mysql://localhost:3306/haricotaimable";
        String user = "root";
        String pwd = "formation";


        // chargement du driver mysql
        Class.forName("com.mysql.jdbc.Driver");
        
        // recuperation une connection jdbc
        Connection conn = DriverManager.getConnection(jdbc, user, pwd);
        
        // creation d'un statement
        Statement stmt = conn.createStatement();

        
        
        String sql = "SELECT * FROM product";
        ResultSet rs=stmt.executeQuery(sql);
        
        while(rs.next()){
            String product = rs.getString("product");
            System.out.println("product = " + product);
            
        }
        
        
        // liberation des ressources
        stmt.close();
        conn.close();

    }
}
