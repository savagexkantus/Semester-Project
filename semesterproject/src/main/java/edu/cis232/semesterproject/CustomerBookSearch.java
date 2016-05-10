package edu.cis232.semesterproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CustomerBookSearch {
	
	@FXML
    private Button SearchButton;

    @FXML
    private TextField textBoxSearch;

    @FXML
    private ImageView MonthImage;

    @FXML
    private ImageView backButton;

    @FXML
    private Label bookTitle;

    @FXML
    private Label authorTitle;

    @FXML
    private Label priceTitle;

    @FXML
    private Label genreTitle;

    @FXML
    private Label quantityGenre;

    @FXML
    private Label labelErrror;

    @FXML
    void ClickSearch() {
    	
    	try{
    		bookTitle.setText("");
    		authorTitle.setText("");
    		priceTitle.setText("");
    		quantityGenre.setText("");
    		final String DB_URL = "jdbc:hsqldb:file:BooksDB/book";
    		
    		Connection conn = DriverManager.getConnection(DB_URL);

    		Statement statement = conn.createStatement();
    		
    		ResultSet results;
    			results = statement
    					.executeQuery("SELECT * FROM Books_Customer WHERE Title LIKE '" + textBoxSearch.getText() + "';");
    		
    		while (results.next()) {
    			bookTitle.setText(results.getString("Title").trim());
    			authorTitle.setText(results.getString(2).trim());
    			priceTitle.setText(results.getString(3));
    			quantityGenre.setText(results.getString(4));
    			
    		
    	}
    	}catch(Exception e)
    	{
    	
		}

    }

    @FXML
    void clickBack() {
    	try{
        	 Stage stage1 = (Stage) backButton.getScene().getWindow();
             stage1.close();
        	}
             catch(Exception e)
             {
            	 
             }
    		try{
    			Stage stage = new Stage();
    			Parent parent = FXMLLoader.load(getClass().getResource("MenuCustomer.fxml"));
    			
    			Scene scene = new Scene(parent);
    			
    			stage.setTitle("Customer Menu");
    			stage.setScene(scene);
    			
    			stage.show();
    			
    		}
    		catch(Exception e)
    		{
    			
    		}

    }

}
