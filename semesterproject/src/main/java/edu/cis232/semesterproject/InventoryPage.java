package edu.cis232.semesterproject;

import java.awt.Rectangle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class InventoryPage {

    @FXML
    private Rectangle Rectangleback;

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
    private Label Author;

    @FXML
    private Label UPC;

    @FXML
    private Label SKU;

    @FXML
    private Label RetailSold;

    @FXML
    private Label PriceB;

    @FXML
    private Label Genre;

    @FXML
    private Label Location;

    @FXML
    private Label Quantity;

    @FXML
    void CheckButton() {

    }

    @FXML
    void ClickEmployee() {

    }

    @FXML
    void ImageCleared() {

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
}
