package edu.cis232.semesterproject;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EmployeeMenuPage extends Application {

    @FXML
    private Button InventoryButton;

    @FXML
    private Button PriceButton;

    @FXML
    void ClickInventory() {
    	try{
       	 Stage stage1 = (Stage) InventoryButton.getScene().getWindow();
            stage1.close();
       	}
            catch(Exception e)
            {
           	 System.out.print("Error loading GUI");
            }
   		try{
   			Stage stage = new Stage();
   			Parent parent = FXMLLoader.load(getClass().getResource("SemesterProject.fxml"));
   			
   			Scene scene = new Scene(parent);
   			
   			stage.setTitle("Inventory Page");
   			stage.setScene(scene);
   			
   			stage.show();
   			
   		}
   		catch(Exception e)
   		{
   			System.out.print("Error loading GUI");
   		}

    }

    @FXML
    void ClickPrice() {

    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}
}