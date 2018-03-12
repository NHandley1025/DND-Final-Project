package gui.Scenes.Choice;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import controllers.Generator;
import gui.Scenes.characterDisplay.CharacterDisplayController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChoiceController implements Initializable{
	
	@FXML
	public void RandomButton(ActionEvent event) {
		System.out.println("Ive been CLICKED!!");
		Parent root = null;
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/Scenes/CharacterDisplay/CharacterDisplay.fxml"));
			loader.setController(new CharacterDisplayController(Generator.generateRandomChar()));
			root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	public void ManualButton(ActionEvent event) {
		System.out.println("Ive been CLICKED!!");
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("/gui/Scenes/ManualCharacter/ManualCharacter.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void LoadButton(ActionEvent event) {
		
		Player.Character character = null;
		System.out.println("Ive been CLICKED!!");
		Parent root = null;
		try {
			FXMLLoader loader = FXMLLoader.load(getClass().getResource("/gui/Scenes/Choice/Choice.fxml"));
			loader.setController(new CharacterDisplayController(character));
			root = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}
