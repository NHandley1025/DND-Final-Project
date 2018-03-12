package gui.Scenes.manualCharacter;

import java.io.File;
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
import Skills.Skill;
import Spells.spells;
import Weapons.weapons;
import armor.Armors;
import consumables.Potions;
import controllers.Generator;
import gui.Scenes.Info.InfoController;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import keys.spellKey;
import tools.Tools;

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
	private ListView<Skill> TraitsList;

	@FXML
	public void raceSelctor(ActionEvent event) {
		((Node) event.getSource()).setDisable(true);
		CalculateButton.setDisable(false);
		Generator.character.setRace(setRC());
		SpeedText.setText(String.valueOf(Generator.character.getRace().getLandBaseSpeed()));
		for (Skill skill : Generator.character.getRace().getRacialSkills()) {
			TraitsList.getItems().add(skill);
		}
	}

	int bottomCount = 0;

	@FXML
	void bottomCheck(ActionEvent event) {
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
		setSkills();

		if (bottomCount >= 4) {
			AcrobaticsCheck.setDisable(!AcrobaticsCheck.isSelected());
			AnimalCheck.setDisable(!AnimalCheck.isSelected());
			ArcanaCheck.setDisable(!ArcanaCheck.isSelected());
			AthleticsCheck.setDisable(!AthleticsCheck.isSelected());
			DeceptionCheck.setDisable(!DeceptionCheck.isSelected());
			HistoryCheck.setDisable(!HistoryCheck.isSelected());
			InsightCheck.setDisable(!InsightCheck.isSelected());
			IntimidationCheck.setDisable(!IntimidationCheck.isSelected());
			InvestigationCheck.setDisable(!InvestigationCheck.isSelected());
			MedicineCheck.setDisable(!MedicineCheck.isSelected());
			NatureCheck.setDisable(!NatureCheck.isSelected());
			PerceptionCheck.setDisable(!PerceptionCheck.isSelected());
			PerformanceCheck.setDisable(!PerformanceCheck.isSelected());
			PersuasionCheck.setDisable(!PersuasionCheck.isSelected());
			ReligionCheck.setDisable(!ReligionCheck.isSelected());
			SleightCheck.setDisable(!SleightCheck.isSelected());
			StealthCheck.setDisable(!StealthCheck.isSelected());
			SurvivalCheck.setDisable(!SurvivalCheck.isSelected());
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

	@FXML
	void topCheck(ActionEvent event) {
		CheckBox source = (CheckBox) event.getSource();
		int mod = 0;
		if (source.isSelected()) {
			topCount++;
			mod = 1;
			setSkills();
		} else {
			mod = -1;
			topCount--;
		}
		int profBonus = Generator.character.getCharacterClass().getProficiencyBonus() * mod;
		if (source == StrengthCheck) {
			Generator.character.setStrSaving(Generator.character.getStrSaving() + profBonus);
			Generator.character.setAthletics(Generator.character.getAthletics() + profBonus);
		} else if (source == DexterityCheck) {
			Generator.character.setDexSaving(Generator.character.getDexSaving() + profBonus);
			Generator.character.setAcrobatics(Generator.character.getAcrobatics() + profBonus);
			Generator.character.setStealth(Generator.character.getStealth() + profBonus);
		} else if (source == ConstitutionCheck) {
			Generator.character.setConSaving(Generator.character.getConSaving() + profBonus);
		} else if (source == IntelligenceCheck) {
			Generator.character.setIntSaving(Generator.character.getIntSaving() + profBonus);
			Generator.character.setArcana(Generator.character.getArcana() + profBonus);
			Generator.character.setHistory(Generator.character.getHistory() + profBonus);
			Generator.character.setInvestigation(Generator.character.getInvestigation() + profBonus);
			Generator.character.setNature(Generator.character.getNature() + profBonus);
			Generator.character.setReligion(Generator.character.getReligion() + profBonus);
		} else if (source == WisdomCheck) {
			Generator.character.setWisSaving(Generator.character.getWisSaving() + profBonus);
			Generator.character.setAnimalHandling(Generator.character.getAnimalHandling() + profBonus);
			Generator.character.setInsight(Generator.character.getInsight() + profBonus);
			Generator.character.setMedicine(Generator.character.getMedicine() + profBonus);
			Generator.character.setPerception(Generator.character.getPerception() + profBonus);
			Generator.character.setSurvival(Generator.character.getSurvival() + profBonus);
		} else if (source == CharismaCheck) {
			Generator.character.setChaSaving(Generator.character.getChaSaving() + profBonus);
			Generator.character.setDeception(Generator.character.getDeception() + profBonus);
			Generator.character.setIntimidation(Generator.character.getIntimidation() + profBonus);
			Generator.character.setPerformance(Generator.character.getPerformance() + profBonus);
			Generator.character.setPersuasion(Generator.character.getPersuasion() + profBonus);

		}
		setSkills();
		if (topCount >= 2) {
			StrengthCheck.setDisable(!StrengthCheck.isSelected());
			DexterityCheck.setDisable(!DexterityCheck.isSelected());
			ConstitutionCheck.setDisable(!ConstitutionCheck.isSelected());
			IntelligenceCheck.setDisable(!IntelligenceCheck.isSelected());
			WisdomCheck.setDisable(!WisdomCheck.isSelected());
			CharismaCheck.setDisable(!CharismaCheck.isSelected());

		} else {
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
		((Node) event.getSource()).setDisable(true);
		ClassComboBox.setDisable(false);
		LvlSpinner.setDisable(true);
		Generator.character.setLevel(LvlSpinner.getValue());
	}

	@FXML
	public void classSelect(ActionEvent event) {
		((Node) event.getSource()).setDisable(true);
		RaceComboBox.setDisable(false);
		Class cl = null;
		int level = Generator.character.getLevel();
		switch (ClassComboBox.getValue()) {
		case "Barbarian":
			cl = new Barbarian(Generator.character);
			break;
		case "Bard":
			cl = new Bard(Generator.character);
		case "Cleric":
			cl = new Cleric(Generator.character);
			break;
		case "Druid":
			cl = new Druid( Generator.character);
			break;
		case "Fighter":
			cl = new Fighter( Generator.character);
			break;
		case "Monk":
			cl = new Monk(Generator.character);
			break;
		case "Paladin":
			cl = new Paladin(Generator.character);
			break;
		case "Ranger":
			cl = new Ranger(Generator.character);
		case "Rogue":
			cl = new Rogue(Generator.character);
			break;
		case "Sorcerer":
			cl = new Sorcerer(Generator.character);
			break;
		case "Warlock":
			cl = new Warlock(Generator.character);
			break;
		case "Wizard":
			cl = new Wizard(Generator.character);
			break;
		}
		Generator.character.setCharacterClass(cl);
		Generator.character.getCharacterClass().setProficiencyByLevel(Generator.character.getLevel());
		Generator.character.setProficiencyBonus();
		ProfBonusText.setText(String.valueOf(Generator.character.getCharacterClass().getProficiencyBonus()));
		for (Skill skill : Generator.character.getCharacterClass().getSkillList()) {
			TraitsList.getItems().add(skill);
		}
		HitDiceTotalText.setText(Generator.character.getHitDice());
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

	public void PopUp(String text) {
		try {
			System.out.println("Ive been CLICKED!!");
			Parent root = null;
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/Scenes/Info/Info.fxml"));
			loader.setController(new InfoController(text));
			root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		StrengthCheck.setDisable(false);
		DexterityCheck.setDisable(false);
		ConstitutionCheck.setDisable(false);
		IntelligenceCheck.setDisable(false);
		WisdomCheck.setDisable(false);
		CharismaCheck.setDisable(false);
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
	private TextArea LangText;

	@FXML
	public void saveButton(ActionEvent event) {
		ArrayList<Item> equipment = new ArrayList<>();
		for (String item : EqList.getItems()) {
			if (weapons.getWeaponHash().containsKey(item)) {
				equipment.add(weapons.getWeaponHash().get(item));
			} else if (Potions.getPotionHash().containsKey(item)) {
				equipment.add(Potions.getPotionHash().get(item));
			} else if (Tools.getToolHash().containsKey(item)) {
				equipment.add(Tools.getToolHash().get(item));
			}
		}
		Generator.character.setEquipment(equipment);
		ArrayList<String> proficiencies = new ArrayList<>();
		for (String line : ProfText.getText().split("\n")) {
			proficiencies.add(line);
		}
		ArrayList<String> languages = new ArrayList<>();

		for (String line : LangText.getText().split("\n")) {
			languages.add(line);
		}
		Generator.character.setProficiencies(proficiencies);
		Generator.character.setLanguages(languages);
		Generator.character
				.setEquipArmor(Armors.getArmorHash().get(ArmorComboBox.getSelectionModel().getSelectedItem()));
		Generator.character.setCopperPieces(Integer.parseInt(CpText.getText()));
		Generator.character.setSilverPieces(Integer.parseInt(SpText.getText()));
		Generator.character.setGoldPieces(Integer.parseInt(GpText.getText()));
		Generator.character.setPlatPieces(Integer.parseInt(PpText.getText()));
		for(String spel : SpellComboBox.getItems()) {
			Generator.character.spells.add(spells.get(new spellKey(0, spel, "")));
		}
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Save File");
		File file = fileChooser.showOpenDialog(((Node) event.getSource()).getScene().getWindow());
		Generator.safeCharacter(Generator.character, file);

	}

	@FXML
	private ComboBox<String> BackgroundComboBox;

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
		for (String key : weapons.getWeaponHash().keySet()) {
			if (key.equals(EqComboBox.getValue())) {
				String item = weapons.getWeaponHash().get(key).getName();
				item += "    " + weapons.getWeaponHash().get(key).getDamage() + "/"
						+ weapons.getWeaponHash().get(key).getDamageType();
				AttacksList.getItems().add(item);
			}
		}
	}

	@FXML
	public void eqRemoveButton(ActionEvent event) {
		EqList.getItems().remove(EqList.getSelectionModel().getSelectedIndex());
		for (String key : weapons.getWeaponHash().keySet()) {
			if (key.equals(EqComboBox.getValue())) {
				String item = weapons.getWeaponHash().get(key).getName();
				item += "    " + weapons.getWeaponHash().get(key).getDamage() + "/"
						+ weapons.getWeaponHash().get(key).getDamageType();

				AttacksList.getItems().remove(item);
			}
		}
	}

	@FXML
	private ListView<String> SpellList;

	@FXML
	private ComboBox<String> SpellComboBox;

	@FXML
	private Button SpellAddButton;

	@FXML
	private Button SpellRemoveButton;

	@FXML
	private ListView<String> AttacksList;

	@FXML
	public void SpellAddButton(ActionEvent event) {
		SpellList.getItems().add(SpellComboBox.getValue());
	}

	@FXML
	public void SpellRemoveButton(ActionEvent event) {
		SpellList.getItems().remove(SpellList.getSelectionModel().getSelectedIndex());
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ArmorComboBox.getItems().addAll(Armors.getArmorHash().keySet()); // add all armors
		EqComboBox.getItems().addAll(Potions.getPotionHash().keySet());
		ArrayList<String> spels = new ArrayList<String>();
		for (spellKey key : spells.getSpellHashmap().keySet()) {
			spels.add(key.getName());
		}
		SpellComboBox.getItems().addAll(spels);
		EqComboBox.getItems().addAll(weapons.getWeaponHash().keySet());
		EqComboBox.getItems().addAll(Tools.getToolHash().keySet());
		Generator.manualGenerateChar();
		RaceComboBox.setValue("Race");
		ClassComboBox.setValue("Class");
		BackgroundComboBox.getItems().addAll("Acolyte", "Charlatan", "Criminal", "Entertainer", "Folk Hero",
				"Guild Artisian", "Hermit", "Noble", "Outlander", "Sage", "Sailor", "Soldier", "Urchin");
		RaceComboBox.getItems().addAll("Dragonborn", "Dwarf", "Elf", "Half Elf", "Halfling", "Half Orc", "Human",
				"Tiefling");
		ClassComboBox.getItems().addAll("Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger",
				"Rogue", "Sorcerer", "Warlock", "Wizard");
		AlignmentComboBox.getItems().addAll("Chaotic Good", "Chaotic Neutral", "Chaotic Evil", "Neutral Good",
				"True Neutral", "Neutral Evil", "Lawful Good", "Lawful Neutral", "Lawful Evil");
		SpellList.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if (event.getButton() == MouseButton.PRIMARY && event.getClickCount() == 2) {
					spellKey spl = new spellKey(0,
							((ListView<String>) event.getSource()).getSelectionModel().getSelectedItem(), "");
					PopUp(spells.get(spl).toString());
				}
			}
		});
		EqList.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if (event.getButton() == MouseButton.PRIMARY && event.getClickCount() == 2) {
					String name = ((ListView<String>) event.getSource()).getSelectionModel().getSelectedItem();
					if (weapons.getWeaponHash().containsKey(name)) {
						PopUp(weapons.getWeaponHash().get(name).toString());
					} else if (Potions.getPotionHash().containsKey(name)) {
						PopUp(Potions.getPotionHash().get(name).toString());
					} else if (Tools.getToolHash().containsKey(name)) {
						PopUp(Tools.getToolHash().get(name).toString());
					}
				}
			}
		});
		TraitsList.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if (event.getButton() == MouseButton.PRIMARY && event.getClickCount() == 2) {
					Skill skill = ((ListView<Skill>) event.getSource()).getSelectionModel().getSelectedItem();
					PopUp(skill.getDescription());
				}
			}
		});
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
