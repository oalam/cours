/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adminl
 */
public class JdbcSample {

    public static void main(String[] args) {
        try {
            // chargement du driver jdbc pour MySQl
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcSample.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try (Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/haricot",
                        "root",
                        "formation")) {
            String sql = "select * from category";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String tmp = rs.getString("name");
                System.out.println("cat (" + id + ") " + tmp);
            }

        } catch (SQLException  ex) {
            Logger.getLogger(JdbcSample.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
