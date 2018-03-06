package gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxController extends Application {

	
	

	@Override
	public void start(Stage primaryStage) {
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("Scenes/Main/Main.fxml"));
		} catch (IOException e) {

			e.printStackTrace();
		}
		primaryStage.setTitle("DnD Character Generator");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
		primaryStage.setResizable(false);

	}



	public static void main(String[] args) {
		launch(args);
	}
}
