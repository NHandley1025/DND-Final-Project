package gui;

import java.io.IOException;

import Spells.spells;
import Weapons.weapons;
import armor.Armors;
import consumables.Potions;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tools.Tools;

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
		primaryStage.setResizable(true);

	}



	public static void main(String[] args) {
		try {
			Armors.readArmorFile();
			Potions.readPotionFile();
			spells.readSpellFile();
			Tools.readToolFile();
			weapons.readWeaponFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		launch(args);
	}
}
