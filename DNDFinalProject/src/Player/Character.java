package Player;

import java.util.ArrayList;

import Items.*;
import Races.*;
import Spells.*;
import Traits.*;
import Weapons.*;
import armor.*;
import javafx.beans.property.SimpleObjectProperty;

public class Character {

	public static int[] raceMods = new int[6];
	
	public Character() {
		setMods();
	}
	
	public void setMods() {
		baseMods[0] = (Strength-10)/2;
		baseMods[1] = (Dexterity-10)/2;
		baseMods[2] = (Intelligence-10)/2;
		baseMods[3] = (Constitution-10)/2;
		baseMods[4] = (Wisdom-10)/2;
		baseMods[5] = (Charisma-10)/2;
		raceMods = race.getRacialModifiers();
		strMod = baseMods[0] += raceMods[0];
		dexMod = baseMods[1] += raceMods[1];
		intMod = baseMods[2] += raceMods[2];
		conMod = baseMods[3] += raceMods[3];
		wisMod = baseMods[4] += raceMods[4];
		chaMod = baseMods[5] += raceMods[5];
	}
	
	private Race race;
	public int level;
	private Class characterClass;
	private trait traits;
	private ArrayList<spell> spellList = new ArrayList<>();
	private ArrayList<Item> equipment = new ArrayList<>();
	private SimpleObjectProperty<weapon> equippedWeapon = new SimpleObjectProperty<>();
	private SimpleObjectProperty<Armor> equipArmor = new SimpleObjectProperty<>();
	private String charactername;
	private String playerName;
	private int Strength;
	private int strMod;
	private int Dexterity;
	private int dexMod;
	private int Intelligence;
	private int intMod;
	private int Constitution;
	private int conMod;
	private int Wisdom;
	private int wisMod;
	private int Charisma;
	private int chaMod;
	// Mod[0] = strength
	// Mod[1] = dexterity
	// Mod[2] = intelligence;
	// Mod[3] = Constitution;
	// Mod[4] = Wisdom;
	// Mod[5] = Charisma;
	private int Acrobatics = dexMod;
	private int AnimalHandling = wisMod;
	private int Arcana = intMod;
	private int Athletics = strMod;
	private int Deception = chaMod;
	private int History = intMod;
	private int Insight = wisMod;
	private int Intimidation = chaMod;
	private int Investigation = intMod;
	private int Medicine = wisMod;
	private int Nature = intMod;
	private int Perception = wisMod;
	private int Persuasion = chaMod;
	private int Religion = intMod;
	private int SleightOfHand = dexMod;
	private int Stealth = dexMod;
	private int Survival = wisMod;
	private int[] baseMods = new int[6];
	private int copperPieces;
	private int silverPieces;
	private int goldPieces;
	private int platPieces;

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public Class getCharacterClass() {
		return characterClass;
	}

	public void setCharacterClass(Class characterClass) {
		this.characterClass = characterClass;
	}

	public trait getTraits() {
		return traits;
	}

	public void setTraits(trait traits) {
		this.traits = traits;
	}

	public ArrayList<spell> getSpellList() {
		return spellList;
	}

	public void setSpellList(ArrayList<spell> spellList) {
		this.spellList = spellList;
	}

	public ArrayList<Item> getEquipment() {
		return equipment;
	}

	public void setEquipment(ArrayList<Item> equipment) {
		this.equipment = equipment;
	}

	public SimpleObjectProperty<weapon> getEquippedWeapon() {
		return equippedWeapon;
	}

	public void setEquippedWeapon(SimpleObjectProperty<weapon> equippedWeapon) {
		this.equippedWeapon = equippedWeapon;
	}

	public SimpleObjectProperty<Armor> getEquipArmor() {
		return equipArmor;
	}

	public void setEquipArmor(SimpleObjectProperty<Armor> equipArmor) {
		this.equipArmor = equipArmor;
	}

	public String getCharactername() {
		return charactername;
	}

	public void setCharactername(String charactername) {
		this.charactername = charactername;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getStrength() {
		return Strength;
	}

	public void setStrength(int strength) {
		Strength = strength;
	}

	public int getStrMod() {
		return strMod;
	}

	public void setStrMod(int strMod) {
		this.strMod = strMod;
	}

	public int getDexterity() {
		return Dexterity;
	}

	public void setDexterity(int dexterity) {
		Dexterity = dexterity;
	}

	public int getDexMod() {
		return dexMod;
	}

	public void setDexMod(int dexMod) {
		this.dexMod = dexMod;
	}

	public int getIntelligence() {
		return Intelligence;
	}

	public void setIntelligence(int intelligence) {
		Intelligence = intelligence;
	}

	public int getIntMod() {
		return intMod;
	}

	public void setIntMod(int intMod) {
		this.intMod = intMod;
	}

	public int getConstitution() {
		return Constitution;
	}

	public void setConstitution(int constitution) {
		Constitution = constitution;
	}

	public int getConMod() {
		return conMod;
	}

	public void setConMod(int conMod) {
		this.conMod = conMod;
	}

	public int getWisdom() {
		return Wisdom;
	}

	public void setWisdom(int wisdom) {
		Wisdom = wisdom;
	}

	public int getWisMod() {
		return wisMod;
	}

	public void setWisMod(int wisMod) {
		this.wisMod = wisMod;
	}

	public int getCharisma() {
		return Charisma;
	}

	public void setCharisma(int charisma) {
		Charisma = charisma;
	}

	public int getChaMod() {
		return chaMod;
	}

	public void setChaMod(int chaMod) {
		this.chaMod = chaMod;
	}

	public int getAcrobatics() {
		return Acrobatics;
	}

	public void setAcrobatics(int acrobatics) {
		Acrobatics = acrobatics;
	}

	public int getAnimalHandling() {
		return AnimalHandling;
	}

	public void setAnimalHandling(int animalHandling) {
		AnimalHandling = animalHandling;
	}

	public int getArcana() {
		return Arcana;
	}

	public void setArcana(int arcana) {
		Arcana = arcana;
	}

	public int getAthletics() {
		return Athletics;
	}

	public void setAthletics(int athletics) {
		Athletics = athletics;
	}

	public int getDeception() {
		return Deception;
	}

	public void setDeception(int deception) {
		Deception = deception;
	}

	public int getHistory() {
		return History;
	}

	public void setHistory(int history) {
		History = history;
	}

	public int getInsight() {
		return Insight;
	}

	public void setInsight(int insight) {
		Insight = insight;
	}

	public int getIntimidation() {
		return Intimidation;
	}

	public void setIntimidation(int intimidation) {
		Intimidation = intimidation;
	}

	public int getInvestigation() {
		return Investigation;
	}

	public void setInvestigation(int investigation) {
		Investigation = investigation;
	}

	public int getMedicine() {
		return Medicine;
	}

	public void setMedicine(int medicine) {
		Medicine = medicine;
	}

	public int getNature() {
		return Nature;
	}

	public void setNature(int nature) {
		Nature = nature;
	}

	public int getPerception() {
		return Perception;
	}

	public void setPerception(int perception) {
		Perception = perception;
	}

	public int getPersuasion() {
		return Persuasion;
	}

	public void setPersuasion(int persuasion) {
		Persuasion = persuasion;
	}

	public int getReligion() {
		return Religion;
	}

	public void setReligion(int religion) {
		Religion = religion;
	}

	public int getSleightOfHand() {
		return SleightOfHand;
	}

	public void setSleightOfHand(int sleightOfHand) {
		SleightOfHand = sleightOfHand;
	}

	public int getStealth() {
		return Stealth;
	}

	public void setStealth(int stealth) {
		Stealth = stealth;
	}

	public int getSurvival() {
		return Survival;
	}

	public void setSurvival(int survival) {
		Survival = survival;
	}

	public int[] getBaseMods() {
		return baseMods;
	}

	public void setBaseMods(int[] baseMods) {
		this.baseMods = baseMods;
	}

	public int getCopperPieces() {
		return copperPieces;
	}

	public void setCopperPieces(int copperPieces) {
		this.copperPieces = copperPieces;
	}

	public int getSilverPieces() {
		return silverPieces;
	}

	public void setSilverPieces(int silverPieces) {
		this.silverPieces = silverPieces;
	}

	public int getGoldPieces() {
		return goldPieces;
	}

	public void setGoldPieces(int goldPieces) {
		this.goldPieces = goldPieces;
	}

	public int getPlatPieces() {
		return platPieces;
	}

	public void setPlatPieces(int platPieces) {
		this.platPieces = platPieces;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}
	
	public void levelUp() {
		level++;
	}
}
