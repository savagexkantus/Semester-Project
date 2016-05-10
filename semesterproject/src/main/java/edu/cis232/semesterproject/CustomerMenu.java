package edu.cis232.semesterproject;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CustomerMenu extends Application{
	
	ChildrensBook gatordad = new ChildrensBook("Gator Dad", "5", "200", "Brian Lies", "5.47", "5.99", "Children", 3, 6);
    ChildrensBook redfoxes = new ChildrensBook("Red Foxes", "7", "270", "Megan Borgert", ".75", "1.99", "Children", 2, 8);
    
    AdultBook thelastmile = new AdultBook("The Last Mile", "4", "220", "David Baldacci", "6.70", "17.50", "Fiction", 1, false);
    AdultBook falloflight = new AdultBook("Fall of Light", "3", "221", "Steven Erikson", "14.00", "19.99", "Fiction", 5, true);
    AdultBook wildelake = new AdultBook("Wilde Lake", "2", "241", "Laura Lippman", "15.60", "22.99", "Non Fiction", 2, false);
    AdultBook cityoflostsouls = new AdultBook("City of Lost Souls", "1", "111", "Cassandra Claire", "15.20", "20.99", "Fiction", 3, true);
   
	
	@FXML
    private Button SearchButton;

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
    private ImageView backButton;

    @FXML
    private Label gatorDad;

    @FXML
    private Label lastMile;

    @FXML
    private Label citySouls;

    @FXML
    private Label redFoxes;

    @FXML
    private Label wildLake;

    @FXML
    private Label fallofLight;

    @FXML
    private Label gatorLabel;

    @FXML
    private Label lastLabel;

    @FXML
    private Label cityLabel;

    @FXML
    private Label foxLabel;

    @FXML
    private Label wildLabel;

    @FXML
    private Label fallofLabel;
    
    @FXML
    private Label yes;

    @FXML
    private Label no;

    @FXML
    private Label no2;

    
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
    	
    	if(radio1.isSelected())
    	{
    		yes.setVisible(true);
    		no.setVisible(false);
    		no2.setVisible(false);
    	}
    	else if(radio2.isSelected())
    	{
    		yes.setVisible(false);
    		no.setVisible(true);
    		no2.setVisible(false);
    	}
    	else if(radio3.isSelected())
    	{
    		yes.setVisible(false);
    		no2.setVisible(true);
    		no.setVisible(false);
    	}
    	else{
    		yes.setVisible(false);
        	no.setVisible(false);
        	no2.setVisible(false);
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
    void fallclick() {
    	fallofLabel.setText(falloflight.getGenre());
    }

    @FXML
    void foxclick() {
    	foxLabel.setText(redfoxes.getGenre());
    }

    @FXML
    void lastclick() {
    	lastLabel.setText(thelastmile.getGenre());
    }
    
    @FXML
    void cityclick() {
    	cityLabel.setText(cityoflostsouls.getGenre());
    }
    
    @FXML
    void Gatorclick() {
    	gatorLabel.setText(gatordad.getGenre());
    }
    
    @FXML
    void wildclick() {
    	wildLabel.setText(wildelake.getGenre());
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}

}