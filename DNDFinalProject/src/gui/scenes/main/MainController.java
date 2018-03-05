package gui.Scenes.Main;

import java.net.URL;
import java.util.ResourceBundle;

import gui.FxController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class MainController implements Initializable{

	
	@FXML
	public void exitButton(ActionEvent event) {
		System.exit(0);
	}
	
	@FXML
	public void genCharButton(ActionEvent event) {
		FxController main = new FxController();
		main.switchScene("Scenes.manualCharacter.fxml");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		
	}

}
