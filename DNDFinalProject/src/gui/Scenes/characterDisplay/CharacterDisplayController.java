package gui.Scenes.characterDisplay;

import java.net.URL;
import java.util.ResourceBundle;

import Items.Item;
import Player.Character;
import Skills.Skill;
import Spells.spell;
import Weapons.weapons;
import controllers.Generator;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class CharacterDisplayController implements Initializable {

	@FXML
	private TextField PassiveWisdomText;

	@FXML
	private ImageView Image;

	@FXML
	private Spinner<Integer> LvlSpinner;

	@FXML
	private TextField NameText;

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
	private TextArea ProfText;

	@FXML
	private TextField CpText;

	@FXML
	private TextField SpText;

	@FXML
	private TextField GpText;

	@FXML
	private TextField PpText;

	@FXML
	private TextArea IdealsDescText;

	@FXML
	private TextArea BondsDescText;

	@FXML
	private TextArea FlawsDescText;

	@FXML
	private TextField HitPointMaxText;

	@FXML
	private TextField HitDiceTotalText;

	@FXML
	private TextField InitiativeText;

	@FXML
	private TextField SpeedText;

	@FXML
	private TextField ArmorClassText;

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
	private TextField WisdomText;

	@FXML
	private TextField CharismaText;

	@FXML
	private Button SaveButton;

	@FXML
	private Button BackButton;

	@FXML
	private ComboBox<String> RaceComboBox;

	@FXML
	private Button ExitButton;

	@FXML
	private ComboBox<String> ClassComboBox;

	@FXML
	private TextArea TraitDescText;

	@FXML
	private Button CalculateButton;

	@FXML
	private Button LockButton;

	@FXML
	private ComboBox<String> BackgroundComboBox;

	@FXML
	private ComboBox<String> AlignmentComboBox;

	@FXML
	private TextArea TraitNameText;

	@FXML
	private TextArea IdealsNameText;

	@FXML
	private TextArea BondsNameText;

	@FXML
	private TextArea FlawsNameText;

	@FXML
	private ListView<String> EqList;

	@FXML
	private ListView<String> SpellList;

	@FXML
	private ListView<String> AttacksList;

	@FXML
	private ListView<Skill> TraitsList;

	@FXML
	private TextArea LangText;
	
	private Character character;

	public CharacterDisplayController(Character character) {
		this.character = character;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		setSkills(character);

	}

	public void setSkills(Character character) {
//		StrengthStatText.setText(String.valueOf(character.getStrength()));
//		DexterityStatText.setText(String.valueOf(character.getDexterity()));
//		ConstitutionStatText.setText(String.valueOf(character.getConstitution()));
//		IntelligenceStatText.setText(String.valueOf(character.getIntelligence()));
//		WisdomStatText.setText(String.valueOf(character.getWisdom()));
//		CharismaStatText.setText(String.valueOf(character.getCharisma()));

		StrengthModText.setText(String.valueOf(character.getStrMod()));
		DexterityModText.setText(String.valueOf(character.getDexMod()));
		ConstitutionModText.setText(String.valueOf(character.getConMod()));
		IntelligenceModText.setText(String.valueOf(character.getIntMod()));
		WisdomModText.setText(String.valueOf(character.getWisMod()));
		CharismaModText.setText(String.valueOf(character.getChaMod()));

		StrengthText.setText(String.valueOf(character.getStrSaving()));
		DexterityText.setText(String.valueOf(character.getDexSaving()));
		ConstitutionText.setText(String.valueOf(character.getConSaving()));
		IntelligenceText.setText(String.valueOf(character.getIntSaving()));
		WisdomText.setText(String.valueOf(character.getWisSaving()));
		CharismaText.setText(String.valueOf(character.getChaSaving()));
		AcrobatText.setText(String.valueOf(character.getAcrobatics()));
		AnimalText.setText(String.valueOf(character.getAnimalHandling()));
		ArcanaText.setText(String.valueOf(character.getArcana()));
		AthleticsText.setText(String.valueOf(character.getAthletics()));
		DeceptionText.setText(String.valueOf(character.getDeception()));
		HistoryText.setText(String.valueOf(character.getHistory()));
		InsightText.setText(String.valueOf(character.getInsight()));
		IntimidationText.setText(String.valueOf(character.getIntimidation()));
		InvestigationText.setText(String.valueOf(character.getInvestigation()));
		MedicineText.setText(String.valueOf(character.getMedicine()));
		NatureText.setText(String.valueOf(character.getNature()));
		PerceptionText.setText(String.valueOf(character.getPerception()));
		PerformanceText.setText(String.valueOf(character.getPerformance()));
		PersuasionText.setText(String.valueOf(character.getPersuasion()));
		ReligionText.setText(String.valueOf(character.getReligion()));
		SleightText.setText(String.valueOf(character.getSleightOfHand()));
		StealthText.setText(String.valueOf(character.getStealth()));
		SurvivalText.setText(String.valueOf(character.getSurvival()));
		InitiativeText.setText(String.valueOf(character.getInitiativa()));
//		HitDiceTotalText.setText(Generator.character.getHitDice());
//		ProfBonusText.setText(String.valueOf(Generator.character.getCharacterClass().getProficiencyBonus()));
//		for (Skill skill : Generator.character.getCharacterClass().getSkillList()) {
//			TraitsList.getItems().add(skill);
//		}
//		for (Skill skill : Generator.character.getRace().getRacialSkills()) {
//			TraitsList.getItems().add(skill);
//		}
		StrengthCheck.setSelected(character.isProStr());
		IntelligenceCheck.setSelected(character.isProInt());
		DexterityCheck.setDisable(character.isProDex());
		ConstitutionCheck.setDisable(character.isProCon());
		WisdomCheck.setDisable(character.isProWis());
		CharismaCheck.setDisable(character.isProCha());

		AcrobaticsCheck.setSelected(character.isProAcrobatics());
		AnimalCheck.setSelected(character.isProAnimalHandling());
		ArcanaCheck.setSelected(character.isProArcana());
		AthleticsCheck.setSelected(character.isProAthletics());
		DeceptionCheck.setSelected(character.isProDeception());
		HistoryCheck.setSelected(character.isProHistory());
		InsightCheck.setSelected(character.isProInsight());
		IntimidationCheck.setSelected(character.isProIntimidation());
		InvestigationCheck.setSelected(character.isProInvestigation());
		MedicineCheck.setSelected(character.isProMedicine());
		NatureCheck.setSelected(character.isProNature());
		PerceptionCheck.setSelected(character.isProPerception());
		PerformanceCheck.setSelected(character.isProPerformance());
		PersuasionCheck.setSelected(character.isProPersuasion());
		ReligionCheck.setSelected(character.isProReligion());
		SleightCheck.setSelected(character.isProSleightOfHand());
		StealthCheck.setSelected(character.isProStealth());
		SurvivalCheck.setSelected(character.isProSurvival());

//		RaceComboBox.setValue(character.getRace());
		ClassComboBox.setValue(character.getCharacterClass().getName());
		AlignmentComboBox.setValue(character.Alignment);
		BackgroundComboBox.setValue(character.Background);

//		for (Item item : character.getEquipment()) {
//			EqList.getItems().add(item.getName());
//			if (weapons.getWeaponHash().containsKey(item.getName())) {
//				String LI = item.getName() + "    " + weapons.getWeaponHash().get(item.getName()).getDamage() + "/"
//						+ weapons.getWeaponHash().get(item.getName()).getDamageType();
//				AttacksList.getItems().add(LI);
//			}
//		}
		for (spell spel : character.spells) {
			SpellList.getItems().add(spel.name);
		}
	}

}
