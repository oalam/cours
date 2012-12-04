/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.*;

/**
 *
 * @author tom
 */
public class JoinTest {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
	queryJavaDb();
querySakila();
    }

    private static void querySakila() throws SQLException, ClassNotFoundException {
	System.out.println("sakila");
	String sql = "select title from film, language "
		+ "where language.language_id= film.language_id "
		+ "and language.name = 'English'";
	
	Class.forName("com.mysql.jdbc.Driver");

	Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/sakila",
		"root",
		"formation");

	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery(sql);

	while (rs.next()) {
	   
	    String s = rs.getString("title");
	    System.out.println("s = " + s);
	}
    }

    private static void queryJavaDb() throws SQLException, ClassNotFoundException {
	
	System.out.println("derby");
	
	String sql = "select * from customer";
	
	Class.forName("org.apache.derby.jdbc.ClientDriver");

	Connection con = DriverManager.getConnection(
		"jdbc:derby://localhost:1527/sample",
		"app",
		"app");

	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery(sql);

	while (rs.next()) {
	   
	    String s = rs.getString("name");
	    System.out.println("s = " + s);
	}
    }
}
