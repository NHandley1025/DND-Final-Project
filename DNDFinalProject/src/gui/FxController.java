package gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxController extends Application {

	public static Stage stage;

	@Override
	public void start(Stage primaryStage) {
		stage = primaryStage;
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("scenes/main/Main.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("scenes/main/mainstyle.css").toExternalForm());

		primaryStage.setTitle("DnD Character Generator");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
