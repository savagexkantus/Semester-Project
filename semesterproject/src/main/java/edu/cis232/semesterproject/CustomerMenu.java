package edu.cis232.semesterproject;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CustomerMenu extends Application{

    @FXML
    private Button SearchButton;

    @FXML
    private Button AdultButton;

    @FXML
    private RadioButton radio1;

    @FXML
    private ToggleGroup Books;

    @FXML
    private RadioButton radio3;

    @FXML
    private RadioButton radio2;

    @FXML
    private Button SubmitButton;

    @FXML
    private ImageView MonthImage;

    @FXML
    private Button YouthButton;

    @FXML
    private ImageView backButton;

    @FXML
    void ClickAdult() {

    }

    @FXML
    void ClickSearch() {
    	
    	try{
        	 Stage stage1 = (Stage) backButton.getScene().getWindow();
             stage1.close();
        	}
             catch(Exception e)
             {
            	 
             }
    		try{
    			Stage stage = new Stage();
    			Parent parent = FXMLLoader.load(getClass().getResource("CustomerBookSearch.fxml"));
    			
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
    void ClickYouth() {

    }

    @FXML
    void ImageClicked() {

    }

    @FXML
    void SubmitButton() {
    	
  
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

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}

}