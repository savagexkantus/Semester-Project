package edu.cis232.semesterproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class priceTagController {
	private static Label priceLabel;
	private static Button priceButton;
	private static TextField priceBox;
	
	void tag(){
		
		final String DB_URL = "jdbc:hsqldb:file:BooksDB/book";

		try {
			String a = "";
			String b = "";
			String upc = priceBox.getAccessibleText();
			Connection conn = DriverManager.getConnection(DB_URL);

			Statement statement = conn.createStatement();
			
			ResultSet results = statement.executeQuery("SELECT * from Books_Employee WHERE UPC like '" + upc + "'");
			while (results.next()){
				a = results.getString("Title");
				b = results.getString("MSRB");
			}
			
			PriceTag tagger = new PriceTag();
			priceLabel.setText(tagger.tokenizer(a, b, upc));
			
			conn.close();
		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
	}
		
	
}

