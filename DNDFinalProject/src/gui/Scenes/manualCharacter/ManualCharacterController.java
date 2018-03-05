package gui.Scenes.manualCharacter;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Separator;

public class ManualCharacterController implements Initializable {

	@FXML
	ChoiceBox ClassChoiceBox;
	@FXML
	ChoiceBox RaceChoiceBox;

	@FXML
	public void exitButton(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	public void genCharButton(ActionEvent event) {

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		RaceChoiceBox.setItems(FXCollections.observableArrayList("Dragonborn", "Dwarf", "Elf", "Half Elf", "Halfling",
				"Half Orc", "Human", "Tiefling"));
		ClassChoiceBox.setItems(FXCollections.observableArrayList("Archetype", "Barbarian", "Bard", "Caster", "Class",
				"Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"));
	}

}
