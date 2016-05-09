package edu.cis232.semesterproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class priceTagController extends Application{
	
	@FXML
    private Button priceButton;

    @FXML
    private TextField priceBox;

    @FXML
    private Label priceLabel;
    
    @FXML
    private Label priceLabel1;

    @FXML
    void tag(){
		
		final String DB_URL = "jdbc:hsqldb:file:BooksDB/book";

	try{
			String a = "";
			String b = "";
			String upc = priceBox.getText();
			Connection conn = DriverManager.getConnection(DB_URL);

			Statement statement = conn.createStatement();
			
			ResultSet results = statement.executeQuery("SELECT * from Books_Employee WHERE UPC like '" + upc + "'");
			while (results.next()){
				a = results.getString("Title");
				b = results.getString("MSRB");
			}
			if(a.equals("")){
				upc = "Invaild UPC";
				priceLabel.setText("");
			}
			else
			{
				PriceTag tagger = new PriceTag();
				priceLabel.setText(tagger.tokenizer(a, b));
			}
			priceLabel1.setText(upc);
			
			conn.close();
		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
    }
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
	

		
	
}

