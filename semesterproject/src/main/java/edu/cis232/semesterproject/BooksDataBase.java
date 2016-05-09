package edu.cis232.semesterproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class BooksDataBase {
	
	public static void main(String[] args) throws Exception
    {

    			final String DB_URL = "jdbc:hsqldb:file:BooksDB/book";

    			try {

    				Connection conn = DriverManager.getConnection(DB_URL);

    				dropTables(conn);

    				buildBooksCustomerTable(conn);
    				
    				buildBooksEmployeeTable(conn);

    				conn.close();
    			} catch (Exception ex) {
    				System.out.println("ERROR: " + ex.getMessage());
    			}
    		}

    		public static void dropTables(Connection conn) {
    			System.out.println("Checking for existing tables.");

    			try {
    				Statement stmt = conn.createStatement();
    				;

    				try {
    					
    					stmt.execute("DROP TABLE Books_Customer");
    					stmt.execute("DROP TABLE Books_Employee");
    					System.out.println("Personnel table dropped.");
    				} catch (SQLException ex) {
    					// No need to report an error.
    					// The table simply did not exist.
    				}
    			} catch (SQLException ex) {
    				System.out.println("ERROR: " + ex.getMessage());
    				ex.printStackTrace();
    			}
    		}

    		public static void buildBooksCustomerTable(Connection conn) {
    			try {

    				Statement stmt = conn.createStatement();

    				// Title, Author, Retail Price, Quantity .
    				stmt.execute(
    						"CREATE TABLE Books_Customer" + "( Title CHAR(40) NOT NULL PRIMARY KEY, " + "  Author CHAR(30)," + "  MSRB CHAR(5)," + "  Quantity INT)");

    				
    				stmt.executeUpdate("INSERT INTO Books_Customer VALUES" + "('The Last Mile'," + "'David Baldacci'," + "'17.50',"+ "'3')");

    				stmt.executeUpdate("INSERT INTO Books_Customer VALUES" + "('Fall of Light'," + "'Steven Erikson'," + "'19.99',"+ "'0')");

    				stmt.executeUpdate("INSERT INTO Books_Customer VALUES" + "('The Bazaar of Bad Dreams'," + "'Stephen King'," + "'9.50',"+ "'5')");
    				
    				stmt.executeUpdate("INSERT INTO Books_Customer VALUES" + "('Gator Dad'," + "'Brian Lies'," + "'5.99',"+ "'5')");
    				
    				stmt.executeUpdate("INSERT INTO Books_Customer VALUES" + "('Red Foxes'," + "'Megan Borgert'," + "'1.99'," + "'2')");
    				
    				stmt.executeUpdate("INSERT INTO Books_Customer VALUES" + "('Wilde Lake'," + "'Laura Lippman'," + "'19.99'," + "'3')");
    				
    				stmt.executeUpdate("INSERT INTO Books_Customer VALUES" + "('Thomas Jefferson and the Tripoli Pirates'," + "'Brian Kilmeade'," + "'22.99'," + "'2')");
    				
    				stmt.executeUpdate("INSERT INTO Books_Customer VALUES" + "('The Isle of the Lost'," + "'Melissa De La Cruz'," + "'14.99'," + "'1')");
    				
    				stmt.executeUpdate("INSERT INTO Books_Customer VALUES" + "('City of Lost Souls'," + "'Cassandra Claire'," + "'20.99'," + "'3')");

    				stmt.executeUpdate("INSERT INTO Books_Customer VALUES" + "('Dinosaurs Before Dark'," + "'Mary Pope Osborn'," + "'10.99'," + "'5')");
    				
    				stmt.executeUpdate("INSERT INTO Books_Customer VALUES" + "('Thomas and Friends'," + "'Thomas Tankengine'," + "'5.99'," + "'0')");
    				
    				stmt.executeUpdate("INSERT INTO Books_Customer VALUES" + "('The Lost Key'," + "'Catherine Coulter'," + "'18.99'," + "'6')");
    				
    				stmt.executeUpdate("INSERT INTO Books_Customer VALUES" + "('Star Wars: Lost Stars'," + "'Claudia Gray'," + "'17.99'," + "'2')");

    				stmt.executeUpdate("INSERT INTO Books_Customer VALUES" + "('Animal Farm'," + "'George Orwell'," + "'19.99'," + "'10')");


    				System.out.println("Books Customer Created table created.");
    			} catch (SQLException ex) {
    				System.out.println("ERROR: " + ex.getMessage());
    			}
    		}
    		
    		public static void buildBooksEmployeeTable(Connection conn) {
    			try {

    				Statement stmt = conn.createStatement();

    				// Title, Author, UPC, SKU, Retail Price, Price bought, genre, Quantity  .
    				stmt.execute(
    						"CREATE TABLE Books_Employee" + "( Title CHAR(40) NOT NULL PRIMARY KEY, " + "  Author CHAR(30)," + "  UPC CHAR(13)," + "  Sku CHAR(6)," + "  MSRB CHAR(5)," + "  PB CHAR(5)," + "  Genre CHAR(15),"+ "  Quantity INT)");

    				
    				stmt.executeUpdate("INSERT INTO Books_Employee VALUES" + "('The Last Mile'," + "'David Baldacci'," + "'019287543251'," + "'128764'," + "'17.50'," + "'12.50'," + "'Adult'," + "'3')");

    				stmt.executeUpdate("INSERT INTO Books_Employee VALUES" + "('Fall of Light'," + "'Steven Erikson'," + "'902861428765'," + "'129071'," + "'19.99'," + "'14.00'," + "'Adult'," + "'0')");

    				stmt.executeUpdate("INSERT INTO Books_Employee VALUES" + "('The Bazaar of Bad Dreams'," + "'Stephen King'," + "'029387776354'," + "'765499'," + "'9.50'," + "'8.50'," + "'Adult'," + "'5')");
    				
    				stmt.executeUpdate("INSERT INTO Books_Employee VALUES" + "('Gator Dad'," + "'Brian Lies'," + "'902856858765'," + "'123031'," + "'5.99'," + "'3.25'," + "'Children<6'," + "'5')");
    				
    				stmt.executeUpdate("INSERT INTO Books_Employee VALUES" + "('Red Foxes'," + "'Megan Borgert'," + "'301861428765'," + "'129000'," + "'1.99'," + "'0.75'," + "'Children<8'," + "'2')");
    				
    				stmt.executeUpdate("INSERT INTO Books_Employee VALUES" + "('Wilde Lake'," + "'Laura Lippman'," + "'904287286165'," + "'071129'," + "'19.99'," + "'12.00'," + "'Adult'," + "'3')");
    				
    				stmt.executeUpdate("INSERT INTO Books_Employee VALUES" + "('Thomas Jefferson and the Tripoli Pirates'," + "'Brian Kilmeade'," + "'902861444445'," + "'144441'," + "'22.99'," + "'15.60'," + "'Adult'," + "'2')");
    				
    				stmt.executeUpdate("INSERT INTO Books_Employee VALUES" + "('The Isle of the Lost'," + "'Melissa De La Cruz'," + "'901234528765'," + "'128751'," + "'14.99'," + "'10.00'," + "'Adult'," + "'1')");
    				
    				stmt.executeUpdate("INSERT INTO Books_Employee VALUES" + "('City of Lost Souls'," + "'Cassandra Claire'," + "'902106428765'," + "'863251'," + "'20.99'," + "'15.20'," + "'Adult'," + "'3')");

    				stmt.executeUpdate("INSERT INTO Books_Employee VALUES" + "('Dinosaurs Before Dark'," + "'Mary Pope Osborn'," + "'902861334765'," + "'120085'," + "'10.99'," + "'5.00'," + "'Children>6'," + "'5')");
    				
    				stmt.executeUpdate("INSERT INTO Books_Employee VALUES" + "('Thomas and Friends'," + "'Thomas Tankengine'," + "'902861436865'," + "'105671'," + "'5.99'," + "'3.20'," + "'Children<2'," + "'0')");
    				
    				stmt.executeUpdate("INSERT INTO Books_Employee VALUES" + "('The Lost Key'," + "'Catherine Coulter'," + "'999999999999'," + "'11111'," + "'18.99'," + "'14.00'," + "'Adult'," + "'6')");
    				
    				stmt.executeUpdate("INSERT INTO Books_Employee VALUES" + "('Star Wars: Lost Stars'," + "'Claudia Gray'," + "'902684182765'," + "'210917'," + "'17.99'," + "'14.00'," + "'Adult'," + "'2')");

    				stmt.executeUpdate("INSERT INTO Books_Employee VALUES" + "('Animal Farm'," + "'George Orwell'," + "'029684182765'," + "'021917'," + "'19.99'," + "'12.00'," + "'Adult'," + "'10')");

    				System.out.println("Book Employee table created.");
    			} catch (SQLException ex) {
    				System.out.println("ERROR: " + ex.getMessage());
    			}
    		}

}
