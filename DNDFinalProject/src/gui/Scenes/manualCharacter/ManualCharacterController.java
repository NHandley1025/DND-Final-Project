package gui.Scenes.manualCharacter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Races.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ManualCharacterController implements Initializable {
	@FXML
	private Spinner<Integer> LvlSpinner;

	@FXML
	private ComboBox<String> ClassComboBox;

	@FXML
	private TextField BackgroundTxt;

	@FXML
	private TextField NameText;

	@FXML
	private ComboBox<String> RaceComboBox;

	@FXML
	private TextField AllignmentText;

	@FXML
	private TextField XpText;

	@FXML
	private CheckBox StrengthCheck;

	@FXML
	private CheckBox DexterityCheck;

	@FXML
	private CheckBox ConstitutionCheck;

	@FXML
	private CheckBox IntelligenceCheck;

	@FXML
	private CheckBox WisdomCheck;

	@FXML
	private CheckBox CharismaCheck;

	@FXML
	private CheckBox AcrobaticsCheck;

	@FXML
	private CheckBox AnimalCheck;

	@FXML
	private CheckBox ArcanaCheck;

	@FXML
	private CheckBox AthleticsCheck;

	@FXML
	private CheckBox DecptionCheck;

	@FXML
	private CheckBox HistoryCheck;

	@FXML
	private CheckBox InsightCheck;

	@FXML
	private CheckBox IntimidationCheck;

	@FXML
	private CheckBox InvestigationCheck;

	@FXML
	private CheckBox MedicineCheck;

	@FXML
	private CheckBox NatureCheck;

	@FXML
	private CheckBox PerceptionCheck;

	@FXML
	private CheckBox PerformanceCheck;

	@FXML
	private CheckBox PersuasionCheck;

	@FXML
	private CheckBox ReligionCheck;

	@FXML
	private CheckBox SleightCheck;

	@FXML
	private CheckBox StealthCheck;

	@FXML
	private CheckBox SurvivalCheck;

	@FXML
	private TextField CharNameText;

	@FXML
	private TextArea FeaturesText;

	@FXML
	private TextField InspirationText;

	@FXML
	private TextField ProfBonusText;

	@FXML
	private TextField StrengthModText;

	@FXML
	private TextField DexterityModText;

	@FXML
	private TextField ConstitutionModText;

	@FXML
	private TextField IntelligenceModText;

	@FXML
	private TextField WisdomModText;

	@FXML
	private TextField CharismaModText;

	@FXML
	private TextField WisdomText;

	@FXML
	private TextArea ProfText;

	@FXML
	private TextArea EquipmentText;

	@FXML
	private TextField EqCpText;

	@FXML
	private TextField EqSpText;

	@FXML
	private TextField EqEpText;

	@FXML
	private TextField EqGpText;

	@FXML
	private TextField EqPpText;

	@FXML
	private TextArea PersonalityText;

	@FXML
	private TextArea IdealsText;

	@FXML
	private TextArea BondsText;

	@FXML
	private TextArea FlawsText;

	@FXML
	private TextArea CurrentHitPointsText;

	@FXML
	private TextField HitPointMaxText;

	@FXML
	private TextArea HitDiceText;

	@FXML
	private TextField HitDiceTotalText;

	@FXML
	private CheckBox SucCheck1;

	@FXML
	private CheckBox SucCheck2;

	@FXML
	private CheckBox SucCheck3;

	@FXML
	private CheckBox FailCheck1;

	@FXML
	private CheckBox FailCheck2;

	@FXML
	private CheckBox FailCheck3;

	@FXML
	private TextArea InitiativeText;

	@FXML
	private TextArea SpeedText;

	@FXML
	private TextArea ArmorClassText;

	@FXML
	private TextField AttNameText1;

	@FXML
	private TextField AttType1;

	@FXML
	private TextField AttBonus1;

	@FXML
	private TextField AttNameText2;

	@FXML
	private TextField AttType2;

	@FXML
	private TextField AttBonus2;

	@FXML
	private TextField AttNameText3;

	@FXML
	private TextField AttType3;

	@FXML
	private TextField AttBonus3;

	@FXML
	private TextField AttNameText4;

	@FXML
	private TextField AttType4;

	@FXML
	private TextField AttBonus4;

	@FXML
	private TextField AttNameText5;

	@FXML
	private TextField AttType5;

	@FXML
	private TextField AttBonus5;

	@FXML
	private TextField AttNameText6;

	@FXML
	private TextField AttType6;

	@FXML
	private TextField AttBonus6;

	@FXML
	private TextField AttNameText7;

	@FXML
	private TextField AttType7;

	@FXML
	private TextField AttBonus7;

	@FXML
	private TextField AttNameText8;

	@FXML
	private TextField AttType8;

	@FXML
	private TextField AttBonus8;

	@FXML
	private TextField AttNameText9;

	@FXML
	private TextField AttType9;

	@FXML
	private TextField AttBonus9;

	@FXML
	private TextArea StengthStatText;

	@FXML
	private TextArea DexterityStatText;

	@FXML
	private TextArea ConstitutionStatText;

	@FXML
	private TextArea IntelligenceStatText;

	@FXML
	private TextArea WisdomStatText;

	@FXML
	private TextArea CharismaStatText;

	@FXML
	private TextArea TempHitPointsText;

	@FXML
	private TextField AcrobatText;

	@FXML
	private TextField AnimalText;

	@FXML
	private TextField ArcanaText;

	@FXML
	private TextField AtheticsText;

	@FXML
	private TextField DeceptionText;

	@FXML
	private TextField HistoryText;

	@FXML
	private TextField InsightText;

	@FXML
	private TextField IntimidationText;

	@FXML
	private TextField InvestigationText;

	@FXML
	private TextField MedicineText;

	@FXML
	private TextField NatureText;

	@FXML
	private TextField PerceptionText;

	@FXML
	private TextField PerformanceText;

	@FXML
	private TextField PersuasionText;

	@FXML
	private TextField ReligionText;

	@FXML
	private TextField SleightText;

	@FXML
	private TextField StealthText;

	@FXML
	private TextField SurvivalText;

	@FXML
	private TextField AcrobatText1;

	@FXML
	private TextField AnimalText1;

	@FXML
	private TextField ArcanaText1;

	@FXML
	private TextField AtheticsText1;

	@FXML
	private TextField DeceptionText1;

	@FXML
	private TextField HistoryText1;

	@FXML
	private Button SaveButton;

	@FXML
	private Button BackButton;

	@FXML
	private Button ExitButton;

	@FXML
	public void exitButton(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	public void goBackButton(ActionEvent event) throws IOException {
		System.out.println("Ive been CLICKED!!");
		Parent root = null;
		root = FXMLLoader.load(getClass().getResource("/gui/Scenes/Main/Main.fxml"));
		Scene scene = new Scene(root);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void saveButton(ActionEvent event) {
		Race race;
		switch(RaceComboBox.getValue()) {
		case "Dragonborn":
			race = new Dragonborn();
			break;
		case "Dwarf":
			race = new Dwarf();
			break;
		case "Elf":
			race = new Elf();
			break;
		case "Half Elf":
			race = new HalfElf();
			break;
		case "Halfling":
			race = new Halfling();
			break;
		case "Half Orc":
			break;
		case "Human":
			break;
		case "Tiefling":
			break;
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		RaceComboBox.setValue("Race");
		ClassComboBox.setValue("Class");
		RaceComboBox.getItems().addAll("Dragonborn", "Dwarf", "Elf", "Half Elf", "Halfling", "Half Orc", "Human", "Tiefling");
		ClassComboBox.getItems().addAll("Archetype", "Barbarian", "Bard", "Caster", "Clerk", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard");

	}

}
