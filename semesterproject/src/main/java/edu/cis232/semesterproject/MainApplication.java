package edu.cis232.semesterproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {

	public static void main(String[] args) {
			launch(args);
		}

		@Override
		public void start(Stage stage) throws Exception {
			Parent parent = FXMLLoader.load(getClass().getResource("Inventory.fxml"));
			
			Scene scene = new Scene(parent);
			
			stage.setTitle("Inventory");
			stage.setScene(scene);
			
			stage.show();
			
			
		}
		
		


}
