package edu.cis232.semesterproject;

import java.util.concurrent.TimeoutException;
import edu.cis232.semesterproject.*;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;

public class InventoryStartPage extends Application {
	//First Page on load plus REQ 8 and 12
	

    @FXML
    private Button CustomerButton;
    
    @FXML
    private Label IncorrectPassword;

    @FXML
    private PasswordField textboxPassword;

    @FXML
    private Button buttonEmployee;
    
    @FXML
    private Button checkButton;
    

    @FXML
    void ClickCustomer() {
    	try{
       	 Stage stage1 = (Stage) CustomerButton.getScene().getWindow();
            stage1.close();
            IncorrectPassword.setText("**Incorrect Password");
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

    @FXML
    void ClickEmployee() throws Exception {
    	try{
    	 Stage stage1 = (Stage) buttonEmployee.getScene().getWindow();
         stage1.close();
    	}
         catch(Exception e)
         {
        	 
         }
		
			Stage stage = new Stage();
			Parent parent = FXMLLoader.load(getClass().getResource("SemesterProject.fxml"));
			
			Scene scene = new Scene(parent);
			
			stage.setTitle("Employee Menu");
			stage.setScene(scene);
			
			stage.show();
	}

    
    @FXML
    void ClickCheck() {
    	try {
			PasswordCheckerClass.checker(textboxPassword.getText().toLowerCase().trim());
			{
				IncorrectPassword.setVisible(false);
				buttonEmployee.setVisible(true);
				textboxPassword.setText("");
			}
			
		} catch (IllegalPasswordException e) {
			IncorrectPassword.setVisible(true);
			buttonEmployee.setVisible(false);
			textboxPassword.setText("");
			System.out.println("Your password sucks");
		}

    }

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}



