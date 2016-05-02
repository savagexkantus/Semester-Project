package edu.cis232.semesterproject;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class InventoryStartPage extends Application {
	

    @FXML
    private Button CustomerButton;
    
    @FXML
    private Label IncorrectPassword;

    @FXML
    private TextField textboxPassword;

    @FXML
    private Button buttonEmployee;
    
    @FXML
    private Button checkButton;

    @FXML
    void ClickCustomer() {

    }

    @FXML
    void ClickEmployee() {
    	try{
    	 Stage stage1 = (Stage) buttonEmployee.getScene().getWindow();
         stage1.close();
    	}
         catch(Exception e)
         {
        	 
         }
		try{
			Stage stage = new Stage();
			Parent parent = FXMLLoader.load(getClass().getResource("MenuEmployee.fxml"));
			
			Scene scene = new Scene(parent);
			
			stage.setTitle("Employee Menu");
			stage.setScene(scene);
			
			stage.show();
			
		}
		catch(Exception e)
		{
			
		}
		
		
	}

    
    @FXML
    void ClickCheck() {
    	if(textboxPassword.getText().toLowerCase().trim().equals("semester"))
    	{
    		IncorrectPassword.setVisible(false);
    		buttonEmployee.setVisible(true);
    		textboxPassword.setText("");
    	}
    	else if(textboxPassword.getText().trim().length() < 1)
    	{
    		buttonEmployee.setVisible(false);
    		textboxPassword.setText("");
    	}
    	else
    	{
    		IncorrectPassword.setVisible(true);
    		buttonEmployee.setVisible(false);
    		textboxPassword.setText("");
    	}

    }

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

}

