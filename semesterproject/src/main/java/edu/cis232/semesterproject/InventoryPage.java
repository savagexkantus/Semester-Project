package edu.cis232.semesterproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class InventoryPage extends Application {
	//Employee inventory page
	
    @FXML
    private Button priceTag;

 
    @FXML
    private TextField textboxSearch;

    @FXML
    private Button buttonEmployee;

    @FXML
    private ImageView checkImage;

    @FXML
    private ImageView clearImage;

    @FXML
    private ImageView backbutton;

    @FXML
    private Label ProductName;

    @FXML
    private Label ProductNameLabel;

    @FXML
    private Label AuthorLabel;

    @FXML
    private Label Author;

    @FXML
    private Label UPCLabel;

    @FXML
    private Label UPC;

    @FXML
    private Label SKULabel;

    @FXML
    private Label SKU;

    @FXML
    private Label RetailSoldLabel;

    @FXML
    private Label RetailSold;

    @FXML
    private Label PriceBoughtLabel;

    @FXML
    private Label PriceB;

    @FXML
    private Label GenreLabel;

    @FXML
    private Label Genre;

    @FXML
    private Label QuantityLabel;

    @FXML
    private Label Quantity;

    @FXML
    void CheckButton() {
    	
    	try{
    		Quantity.setText("");
    		Genre.setText("");
    		PriceB.setText("");
    		RetailSold.setText("");
    		SKU.setText("");
    		UPC.setText("");
    		Author.setText("");
    		ProductName.setText("");
    		
    		final String DB_URL = "jdbc:hsqldb:file:BooksDB/book";
    		
    		Connection conn = DriverManager.getConnection(DB_URL);

    		Statement statement = conn.createStatement();
    		
    		ResultSet results = statement
					.executeQuery("SELECT * FROM Books_Employee WHERE UPC LIKE '" + textboxSearch.getText() + "';");
			
			while (results.next()) {
				ProductName.setText(results.getString("Title"));
				Author.setText(results.getString(2));
				UPC.setText(results.getString(3));
				SKU.setText(results.getString(4));
				RetailSold.setText(results.getString(5));
				PriceB.setText(results.getString(6));
				Genre.setText(results.getString(7));
				Quantity.setText(results.getString(8));
				
				if(ProductName.getText().equals(""))
				{
		    		QuantityLabel.setVisible(false);
		    		GenreLabel.setVisible(false);
		    		PriceBoughtLabel.setVisible(false);
		    		RetailSoldLabel.setVisible(false);
		    		SKULabel.setVisible(false);
		    		UPCLabel.setVisible(false);
		    		AuthorLabel.setVisible(false);
		    		ProductNameLabel.setVisible(false);
				}
				else
				{
					Quantity.setVisible(true);
		    		QuantityLabel.setVisible(true);
		    		Genre.setVisible(true);
		    		GenreLabel.setVisible(true);
		    		PriceB.setVisible(true);
		    		PriceBoughtLabel.setVisible(true);
		    		RetailSold.setVisible(true);
		    		RetailSoldLabel.setVisible(true);
		    		SKULabel.setVisible(true);
		    		SKU.setVisible(true);
		    		UPC.setVisible(true);
		    		UPCLabel.setVisible(true);
		    		Author.setVisible(true);
		    		AuthorLabel.setVisible(true);
		    		ProductName.setVisible(true);
		    		ProductNameLabel.setVisible(true);
				}
			}
    	}
    	catch(Exception e)
    	{
    		System.out.println("Didn't work bruh");
    	}

    }

    @FXML
    void ClickEmployee() {

    }

    @FXML
    void ImageCleared() {
    	
    	textboxSearch.setText("");

    }


    @FXML
    void goBack() {
    	try{
         	 Stage stage1 = (Stage) backbutton.getScene().getWindow();
              stage1.close();
         	}
              catch(Exception e)
              {
             	 
              }
     		try{
     			Stage stage = new Stage();
     			Parent parent = FXMLLoader.load(getClass().getResource("Inventory.fxml"));
     			
     			Scene scene = new Scene(parent);
     			
     			stage.setTitle("Main Menu");
     			stage.setScene(scene);
     			
     			stage.show();
     			
     		}
     		catch(Exception e)
     		{
     			
     		}
     		

    }
    @FXML
    void PriceTagClicked() throws Exception {
    		try{
    			Stage stage = new Stage();
    			Parent parent = FXMLLoader.load(getClass().getResource("Pricetag.fxml"));
    			
    			Scene scene = new Scene(parent);
    			
    			stage.setTitle("Price Tag Maker");
    			stage.setScene(scene);
    			
    			stage.show();
    			
    		}
    		catch(Exception e)
    		{
    			System.out.println(e);
    		}
    }

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
