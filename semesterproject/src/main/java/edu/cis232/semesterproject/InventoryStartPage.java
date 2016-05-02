package edu.cis232.semesterproject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class InventoryStartPage {
	

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

}

