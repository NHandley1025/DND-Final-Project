package gui.Scenes.manualCharacter;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Races.*;
import Traits.trait;
import controllers.Generator;
import Classes.*;
import Classes.Class;
import Items.Item;
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
	private TextField CpText;

	@FXML
	private TextField SpText;


	@FXML
	private TextField GpText;

	@FXML
	private TextField PpText;

	@FXML
	private TextArea TraitText;

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
	private TextArea StrengthStatText;

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
	private Button CalculateButton;

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
	public void raceSelctor(ActionEvent event) {
		CalculateButton.setDisable(false);
		Generator.character.setRace(setRC());
	}
	
	@FXML
	public void calculateButton(ActionEvent event) {
		CalculateButton.setDisable(true);
		Generator.character.setStrength();
		Generator.character.setDexterity();
		Generator.character.setStrength();
		Generator.character.setStrength();
		Generator.character.setMods();
		StrengthStatText.setText(String.valueOf(Generator.character.getStrength()));
		DexterityStatText.setText(String.valueOf(Generator.character.getDexterity()));
		ConstitutionStatText.setText(String.valueOf(Generator.character.getConstitution()));
		IntelligenceStatText.setText(String.valueOf(Generator.character.getIntelligence()));
		WisdomStatText.setText(String.valueOf(Generator.character.getWisdom()));
		StrengthModText.setText(String.valueOf(Generator.character.getStrMod()));
		DexterityModText.setText(String.valueOf(Generator.character.getDexMod()));
		ConstitutionModText.setText(String.valueOf(Generator.character.getConMod()));
		IntelligenceModText.setText(String.valueOf(Generator.character.getIntMod()));
		WisdomModText.setText(String.valueOf(Generator.character.getWisMod()));
		
	}
	
	private Race setRC() {
		Race race = null;
		switch (RaceComboBox.getValue()) {
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
			race = new HalfOrc();
			break;
		case "Human":
			race = new Human();
			break;
		case "Tiefling":
			race = new Tiefling();
			break;
		}
		return race;
	}
	
	@FXML
	public void saveButton(ActionEvent event) {


		Class cl;
		switch (ClassComboBox.getValue()) {

		case "Barbarian":
			cl = new Barbarian();
			break;
		case "Bard":
			cl = new Bard();
		case "Cleric":
			cl = new Cleric();
			break;
		case "Druid":
			cl = new Druid();
			break;
		case "Fighter":
			cl = new Fighter();
			break;
		case "Monk":
			cl = new Fighter();
			break;
		case "Paladin":
			cl = new Paladin();
			break;
		case "Ranger":
			cl = new Ranger();
		case "Rogue":
			cl = new Rogue();
			break;
		case "Sorcerer":
			cl = new Sorcerer();
			break;
		case "Warlock":
			cl = new Warlock();
			break;
		case "Wizard":
			cl = new Wizard();
			break;
		}
		trait trt;
		String[] keys = TraitText.getText().split("\n");
		
		String[] items = EquipmentText.getText().split("\n");
		ArrayList<Item> weapons = null;
		for(String item : items) {
			String[] weapon = item.split(":");
			weapons.add(new Item(weapon[0], weapon[1], weapon[2], Integer.parseInt(weapon[3])));
		}
		String CharName = CharNameText.getText();
		String PlayerName = NameText.getText();
		Boolean isAcro = AcrobaticsCheck.isSelected();
		Boolean isAnimal = AnimalCheck.isSelected();
		Boolean isArcana = ArcanaCheck.isSelected();
		Boolean isAthletic = AthleticsCheck.isSelected();
		Boolean isDeception = DecptionCheck.isSelected();
		Boolean isHistory = HistoryCheck.isSelected();
		Boolean isInsight = InsightCheck.isSelected();
		Boolean isIntimidation = IntimidationCheck.isSelected();
		Boolean isInvestigation = InvestigationCheck.isSelected();
		Boolean isMedicine = MedicineCheck.isSelected();
		Boolean isNature = NatureCheck.isSelected();
		Boolean isPerception = PerceptionCheck.isSelected();
		Boolean isPerformance = PerformanceCheck.isSelected();
		Boolean isPersuasian = PersuasionCheck.isSelected();
		Boolean isReligion = ReligionCheck.isSelected();
		Boolean isSleight = SleightCheck.isSelected();
		Boolean isStealth = StealthCheck.isSelected();
		Boolean isSurvival = SurvivalCheck.isSelected();
		Boolean isStrength = StrengthCheck.isSelected();
		Boolean isDexterity = DexterityCheck.isSelected();
		Boolean isConstitution = ConstitutionCheck.isSelected();
		Boolean isIntelligence = IntelligenceCheck.isSelected();
		Boolean isWisdom = WisdomCheck.isSelected();
		Boolean isCharisma = CharismaCheck.isSelected();
		int cp = Integer.parseInt(CpText.getText());
		int sp = Integer.parseInt(SpText.getText());
		int gp = Integer.parseInt(GpText.getText());
		int pp = Integer.parseInt(PpText.getText());

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Generator.manualGenerateChar();
		RaceComboBox.setValue("Race");
		ClassComboBox.setValue("Class");
		RaceComboBox.getItems().addAll("Dragonborn", "Dwarf", "Elf", "Half Elf", "Halfling", "Half Orc", "Human",
				"Tiefling");
		ClassComboBox.getItems().addAll("Barbarian", "Bard", "Caster", "Cleric", "Druid", "Fighter", "Monk", "Paladin",
				"Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard");

	}

}
