package gui.Scenes.manualCharacter;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Classes.Barbarian;
import Classes.Bard;
import Classes.Class;
import Classes.Cleric;
import Classes.Druid;
import Classes.Fighter;
import Classes.Monk;
import Classes.Paladin;
import Classes.Ranger;
import Classes.Rogue;
import Classes.Sorcerer;
import Classes.Warlock;
import Classes.Wizard;
import Items.Item;
import Races.Dragonborn;
import Races.Dwarf;
import Races.Elf;
import Races.HalfElf;
import Races.HalfOrc;
import Races.Halfling;
import Races.Human;
import Races.Race;
import Races.Tiefling;
import Traits.trait;
import armor.Armors;
import consumables.Potions;
import controllers.Generator;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ManualCharacterController implements Initializable {
	
	@FXML
	private ImageView Image;
	
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
	private ComboBox<String> AlignmentComboBox;

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
	private CheckBox DeceptionCheck;

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
	private TextArea TraitDescText;

	@FXML
	private TextArea IdealsDescText;

	@FXML
	private TextArea BondsDescText;

	@FXML
	private TextArea FlawsDescText;
	
	@FXML
	private TextArea TraitNameText;

	@FXML
	private TextArea IdealsNameText;

	@FXML
	private TextArea BondsNameText;

	@FXML
	private TextArea FlawsNameText;

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
	private TextField InitiativeText;

	@FXML
	private TextField SpeedText;

	@FXML
	private TextField ArmorClassText;

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
	private TextField StrengthStatText;

	@FXML
	private TextField DexterityStatText;

	@FXML
	private TextField ConstitutionStatText;

	@FXML
	private TextField IntelligenceStatText;

	@FXML
	private TextField WisdomStatText;

	@FXML
	private TextField CharismaStatText;

	@FXML
	private TextArea TempHitPointsText;

	@FXML
	private TextField AcrobatText;

	@FXML
	private TextField AnimalText;

	@FXML
	private TextField ArcanaText;

	@FXML
	private TextField AthleticsText;

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
	private TextField StrengthText;

	@FXML
	private TextField DexterityText;

	@FXML
	private TextField ConstitutionText;

	@FXML
	private TextField IntelligenceText;
	
	@FXML
	private TextField PassiveWisdomText;

	@FXML
	private TextField CharismaText;

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
	
	private int topCount;

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
		((Node)event.getSource()).setDisable(true);
		CalculateButton.setDisable(false);
		Generator.character.setRace(setRC());
		SpeedText.setText(String.valueOf(Generator.character.getRace().getLandBaseSpeed()));
	}
	
	int bottomCount = 0;
	
	@FXML void bottomCheck(ActionEvent event) {
		CheckBox box = (CheckBox) event.getSource();
		int mod = 0;
		if (box.isSelected()) {
			bottomCount++;
			mod = 1;
		} else {
			bottomCount--;
			mod = 0;
		}

		int profBonus = Generator.character.getCharacterClass().getProficiencyBonus() * mod;
		
		if (box == AcrobaticsCheck) {
			Generator.character.setAcrobatics(Generator.character.getAcrobatics() + profBonus);
		} else if (box == AnimalCheck) {
			Generator.character.setAnimalHandling(Generator.character.getAnimalHandling() + profBonus);
		} else if (box == ArcanaCheck) {
			Generator.character.setArcana(Generator.character.getArcana() + profBonus);
		} else if (box == AthleticsCheck) {
			Generator.character.setAthletics(Generator.character.getAthletics() + profBonus);
		} else if (box == DeceptionCheck) {
			Generator.character.setDeception(Generator.character.getDeception() + profBonus);
		} else if (box == HistoryCheck) {
			Generator.character.setHistory(Generator.character.getHistory() + profBonus);
		} else if (box == InsightCheck) {
			Generator.character.setInsight(Generator.character.getInsight() + profBonus);
		} else if (box == IntimidationCheck) {
			Generator.character.setIntimidation(Generator.character.getIntimidation() + profBonus);
		} else if (box == InvestigationCheck) {
			Generator.character.setInvestigation(Generator.character.getInvestigation() + profBonus);
		} else if (box == MedicineCheck) {
			Generator.character.setMedicine(Generator.character.getMedicine() + profBonus);
		} else if (box == NatureCheck) {
			Generator.character.setNature(Generator.character.getNature() + profBonus);
		} else if (box == PerceptionCheck) {
			Generator.character.setPerception(Generator.character.getPerception() + profBonus);
		} else if (box == PerformanceCheck) {
			Generator.character.setPerformance(Generator.character.getPerformance() + profBonus);
		} else if (box == PersuasionCheck) {
			Generator.character.setPersuasion(Generator.character.getPersuasion() + profBonus);
		} else if (box == ReligionCheck) {
			Generator.character.setReligion(Generator.character.getReligion() + profBonus);			
		} else if (box == SleightCheck) {
			Generator.character.setSleightOfHand(Generator.character.getSleightOfHand() + profBonus);
		} else if (box == StealthCheck) {
			Generator.character.setStealth(Generator.character.getStealth() + profBonus);
		} else if (box == SurvivalCheck) {
			Generator.character.setSurvival(Generator.character.getSurvival() + profBonus);
		}
		
		
		if (bottomCount >= 4){
			AcrobaticsCheck.setDisable(!AcrobaticsCheck.isDisabled());
			AnimalCheck.setDisable(!AnimalCheck.isDisabled());
			ArcanaCheck.setDisable(!ArcanaCheck.isDisabled());
			AthleticsCheck.setDisable(!AthleticsCheck.isDisabled());
			DeceptionCheck.setDisable(!DeceptionCheck.isDisabled());
			HistoryCheck.setDisable(!HistoryCheck.isDisabled());
			InsightCheck.setDisable(!InsightCheck.isDisabled());
			IntimidationCheck.setDisable(!IntimidationCheck.isDisabled());
			InvestigationCheck.setDisable(!InvestigationCheck.isDisabled());
			MedicineCheck.setDisable(!MedicineCheck.isDisabled());
			NatureCheck.setDisable(!NatureCheck.isDisabled());
			PerceptionCheck.setDisable(!PerceptionCheck.isDisabled());
			PerformanceCheck.setDisable(!PerformanceCheck.isDisabled());
			PersuasionCheck.setDisable(!PersuasionCheck.isDisabled());
			ReligionCheck.setDisable(!ReligionCheck.isDisabled());
			SleightCheck.setDisable(!SleightCheck.isDisabled());
			StealthCheck.setDisable(!StealthCheck.isDisabled());
			SurvivalCheck.setDisable(!SurvivalCheck.isDisabled());
		} else {
			
			AcrobaticsCheck.setDisable(false);
			AnimalCheck.setDisable(false);
			ArcanaCheck.setDisable(false);
			AthleticsCheck.setDisable(false);
			DeceptionCheck.setDisable(false);
			HistoryCheck.setDisable(false);
			InsightCheck.setDisable(false);
			IntimidationCheck.setDisable(false);
			InvestigationCheck.setDisable(false);
			MedicineCheck.setDisable(false);
			NatureCheck.setDisable(false);
			PerceptionCheck.setDisable(false);
			PerformanceCheck.setDisable(false);
			PersuasionCheck.setDisable(false);
			ReligionCheck.setDisable(false);
			SleightCheck.setDisable(false);
			StealthCheck.setDisable(false);
			SurvivalCheck.setDisable(false);
		}
	}
	
	@FXML void topCheck(ActionEvent event) {
		CheckBox source = (CheckBox)event.getSource();
		int mod = 0;
		if (source.isSelected()) {
			topCount++;
			mod = 1;
			setSkills();
		}
		else {
			mod = -1;
			topCount--;
		}
		int profBonus = Generator.character.getCharacterClass().getProficiencyBonus() * mod;
		if(source == StrengthCheck) {
			Generator.character.setStrSaving(Generator.character.getStrSaving() + profBonus);
		}else if (source == DexterityCheck) {                                   
			Generator.character.setDexSaving(Generator.character.getDexSaving() + profBonus);
		}else if (source == ConstitutionCheck) {                                
			Generator.character.setConSaving(Generator.character.getConSaving() + profBonus);
		}else if (source == IntelligenceCheck) {     
			Generator.character.setIntSaving(Generator.character.getIntSaving() + profBonus);
		}else if (source == WisdomCheck) {                                      
			Generator.character.setWisSaving(Generator.character.getWisSaving() + profBonus);
		}else if (source == CharismaCheck) {                                    
			Generator.character.setChaSaving(Generator.character.getChaSaving() + profBonus);
		}
		setSkills();
		if(topCount >= 2) {
			StrengthCheck.setDisable(!StrengthCheck.isSelected());
			DexterityCheck.setDisable(!DexterityCheck.isSelected());
			ConstitutionCheck.setDisable(!ConstitutionCheck.isSelected());
			IntelligenceCheck.setDisable(!IntelligenceCheck.isSelected());
			WisdomCheck.setDisable(!WisdomCheck.isSelected());
			CharismaCheck.setDisable(!CharismaCheck.isSelected());
			
		}
		else {
			StrengthCheck.setDisable(false);
			DexterityCheck.setDisable(false);
			ConstitutionCheck.setDisable(false);
			IntelligenceCheck.setDisable(false);
			WisdomCheck.setDisable(false);
			CharismaCheck.setDisable(false);
		}
	}
	
	@FXML
	public void lockInButton(ActionEvent event) {
		((Node)event.getSource()).setDisable(true);
		ClassComboBox.setDisable(false);
		LvlSpinner.setDisable(true);
	}
	
	
	@FXML
	public void classSelect(ActionEvent event) {
		((Node)event.getSource()).setDisable(true);
		RaceComboBox.setDisable(false);
		Class cl = null;	
		int level = Generator.character.getLevel();
		switch (ClassComboBox.getValue()) {
		case "Barbarian":
			cl = new Barbarian(level, Generator.character);
			break;
		case "Bard":
			cl = new Bard(level, Generator.character);
		case "Cleric":
			cl = new Cleric(level, Generator.character);
			break;
		case "Druid":
			cl = new Druid(level, Generator.character);
			break;
		case "Fighter":
			cl = new Fighter(level, Generator.character);
			break;
		case "Monk":
			cl = new Monk(level, Generator.character);
			break;
		case "Paladin":
			cl = new Paladin(level, Generator.character);
			break;
		case "Ranger":
			cl = new Ranger(level, Generator.character);
		case "Rogue":
			cl = new Rogue(level, Generator.character);
			break;
		case "Sorcerer":
			cl = new Sorcerer(level, Generator.character);
			break;
		case "Warlock":
			cl = new Warlock(level, Generator.character);
			break;
		case "Wizard":
			cl = new Wizard(level, Generator.character);
			break;
		}
		Generator.character.setCharacterClass(cl);
		Generator.character.getCharacterClass().setProficiencyBonus(Generator.character.getProficiencyBonus());
		ProfBonusText.setText(String.valueOf(Generator.character.getCharacterClass().getProficiencyBonus()));
	}
	
	public void setSkills() {
		StrengthStatText.setText(String.valueOf(Generator.character.getStrength()));
		DexterityStatText.setText(String.valueOf(Generator.character.getDexterity()));
		ConstitutionStatText.setText(String.valueOf(Generator.character.getConstitution()));
		IntelligenceStatText.setText(String.valueOf(Generator.character.getIntelligence()));
		WisdomStatText.setText(String.valueOf(Generator.character.getWisdom()));
		CharismaStatText.setText(String.valueOf(Generator.character.getCharisma()));
		
		StrengthModText.setText(String.valueOf(Generator.character.getStrMod()));
		DexterityModText.setText(String.valueOf(Generator.character.getDexMod()));
		ConstitutionModText.setText(String.valueOf(Generator.character.getConMod()));
		IntelligenceModText.setText(String.valueOf(Generator.character.getIntMod()));
		WisdomModText.setText(String.valueOf(Generator.character.getWisMod()));
		CharismaModText.setText(String.valueOf(Generator.character.getChaMod()));
		
		StrengthText.setText(String.valueOf(Generator.character.getStrSaving()));
		DexterityText.setText(String.valueOf(Generator.character.getDexSaving()));
		ConstitutionText.setText(String.valueOf(Generator.character.getConSaving()));
		IntelligenceText.setText(String.valueOf(Generator.character.getIntSaving()));
		WisdomText.setText(String.valueOf(Generator.character.getWisSaving()));
		CharismaText.setText(String.valueOf(Generator.character.getChaSaving()));
		AcrobatText.setText(String.valueOf(Generator.character.getAcrobatics()));
		AnimalText.setText(String.valueOf(Generator.character.getAnimalHandling()));
		ArcanaText.setText(String.valueOf(Generator.character.getArcana()));
		AthleticsText.setText(String.valueOf(Generator.character.getAthletics()));
		DeceptionText.setText(String.valueOf(Generator.character.getDeception()));
		HistoryText.setText(String.valueOf(Generator.character.getHistory()));
		InsightText.setText(String.valueOf(Generator.character.getInsight()));
		IntimidationText.setText(String.valueOf(Generator.character.getIntimidation()));
		InvestigationText.setText(String.valueOf(Generator.character.getInvestigation()));
		MedicineText.setText(String.valueOf(Generator.character.getMedicine()));
		NatureText.setText(String.valueOf(Generator.character.getNature()));
		PerceptionText.setText(String.valueOf(Generator.character.getPerception()));
		PerformanceText.setText(String.valueOf(Generator.character.getPerformance()));
		PersuasionText.setText(String.valueOf(Generator.character.getPersuasion()));
		ReligionText.setText(String.valueOf(Generator.character.getReligion()));
		SleightText.setText(String.valueOf(Generator.character.getSleightOfHand()));
		StealthText.setText(String.valueOf(Generator.character.getStealth()));
		SurvivalText.setText(String.valueOf(Generator.character.getSurvival()));
		InitiativeText.setText(String.valueOf(Generator.character.getInitiativa()));
	}
	
	
	
	@FXML
	public void calculateButton(ActionEvent event) {
		CalculateButton.setDisable(true);
		Generator.character.setStrength();
		Generator.character.setDexterity();
		Generator.character.setConstitution();
		Generator.character.setIntelligence();
		Generator.character.setWisdom();
		Generator.character.setCharisma();
		Generator.character.setMods();
		Generator.character.setSkills();
		setSkills();
	}
	
	
	
	private Race setRC() {
		Race race = null;
		switch (RaceComboBox.getValue()) {
		case "Dragonborn":
			race = new Dragonborn(Generator.character);
			break;
		case "Dwarf":
			race = new Dwarf(Generator.character);
			break;
		case "Elf":
			race = new Elf(Generator.character);
			break;
		case "Half Elf":
			race = new HalfElf(Generator.character);
			break;
		case "Halfling":
			race = new Halfling(Generator.character);
			break;
		case "Half Orc":
			race = new HalfOrc(Generator.character);
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
		trait trt;
		
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
		Boolean isDeception = DeceptionCheck.isSelected();
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
	
	@FXML
	private ListView<String> EqList;
	
	@FXML
	private ComboBox<String> EqComboBox;
	
	@FXML
	private Button eqAddButton;
	
	@FXML
	private Button EqRemoveButton;
	
	@FXML
	private ComboBox<String> ArmorComboBox;
	
	@FXML
	private void armorSelector(ActionEvent event) {
		String armor = ArmorComboBox.getValue();
		Generator.character.setEquipArmor(Armors.getArmorHash().get(armor));
		ArmorClassText.setText(String.valueOf(Generator.character.setArmorClass()));
	}
	
	@FXML
	public void eqAddButton(ActionEvent event) {
		EqList.getItems().add(EqComboBox.getValue());
	}
	
	@FXML
	public void eqRemoveButton(ActionEvent event) {
		EqList.getItems().remove(EqList.getSelectionModel().getSelectedIndex());
	}
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ArmorComboBox.getItems().addAll(Armors.getArmorHash().keySet()); // add all armors
		ArrayList<String> items = null;
		for(String key : Potions.getPotionHash().keySet()) {
			items.add(key);
		}
		EqComboBox.getItems().addAll(); // add all selectable items
		Generator.manualGenerateChar();
		RaceComboBox.setValue("Race");
		ClassComboBox.setValue("Class");
		RaceComboBox.getItems().addAll("Dragonborn", "Dwarf", "Elf", "Half Elf", "Halfling", "Half Orc", "Human",
				"Tiefling");
		ClassComboBox.getItems().addAll("Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin",
				"Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard");
		AlignmentComboBox.getItems().addAll("Chaotic Good", "Chaotic Neutral", "Chaotic Evil", "Neutral Good", "True Neutral", "Neutral Evil", "Lawful Good", "Lawful Neutral", "Lawful Evil");
		CpText.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("[0-9]*")) {
                    CpText.setText(oldValue);
                }
            }
		});
		SpText.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("[0-9]*")) {
                	SpText.setText(oldValue);
                }
            }
		});
		GpText.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("[0-9]*")) {
                	GpText.setText(oldValue);
                }
            }
		});
		PpText.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("[0-9]*")) {
                	PpText.setText(oldValue);
                }
            }
		});
	}

}
