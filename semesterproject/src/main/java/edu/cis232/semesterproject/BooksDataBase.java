package edu.cis232.semesterproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BooksDataBase {
	
	public static void main( String[] args ) throws Exception
    {
		
    			final String DB_URL = "jdbc:hsqldb:file:BooksDB/Book";

    			try {

    				Connection conn = DriverManager.getConnection(DB_URL);

    				dropTables(conn);

    				buildBooksCustomerTable(conn);
    				
    				buildBooksEmployeeTable(conn);

    				conn.close();
    			} catch (Exception ex) {
    				//System.out.println("ERROR: " + ex.getMessage());
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
    						"CREATE TABLE Books_Customer" + "( Title CHAR(30) NOT NULL PRIMARY KEY, " + "  Author CHAR(30)," + "  MSRB DOUBLE," + "  Quantity INT)");

    				
    				stmt.executeUpdate("INSERT INTO Books_Customer VALUES" + "('The Last Mile'," + "'David Baldacci'," + "'17.50',"+ "'3')");

    				stmt.executeUpdate("INSERT INTO Books_Customer VALUES" + "('Fall of Light'," + "'Steven Erikson'," + "'19.99',"+ "'0')");

    				stmt.executeUpdate("INSERT INTO Books_Customer VALUES" + "('The Bazaar of Bad Dreams'," + "'Stephen King'," + "'9.50',"+ "'5')");
    				

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
    						"CREATE TABLE Books_Employee" + "( Title CHAR(30) NOT NULL PRIMARY KEY, " + "  Author CHAR(30)," + "  UPC CHAR(12)," + "  Sku CHAR(6)," + "  MSRB Double," + "  PB Double," + "  Genre CHAR(15),"+ "  Quantity INT)");

    				
    				stmt.executeUpdate("INSERT INTO Books_Customer VALUES" + "('The Last Mile'," + "'David Baldacci'," + "'019287543251'," + "'128764'," + "'17.50'," + "'12.50'," + "'Adult'," + "'3')");

    				stmt.executeUpdate("INSERT INTO Books_Customer VALUES" + "('Fall of Light'," + "'Steven Erikson'," + "'902861428765'," + "'129071'," + "'19.99'," + "'14.00'," + "'Adult'," + "'0')");

    				stmt.executeUpdate("INSERT INTO Books_Customer VALUES" + "('The Bazaar of Bad Dreams'," + "'Stephen King'," + "'029387776354'," + "'765499'," + "'9.50'," + "'8.50'," + "'Adult'," + "'5')");


    				System.out.println("Book Employee table created.");
    			} catch (SQLException ex) {
    				System.out.println("ERROR: " + ex.getMessage());
    			}
    		}

}
