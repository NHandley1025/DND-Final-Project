package Player;

import java.util.ArrayList;

import Dice.die;
import Items.*;
import Races.*;
import Spells.*;
import Traits.*;
import Weapons.*;
import armor.*;
import Classes.Class;
import javafx.beans.property.SimpleObjectProperty;

public class Character {

	public static int[] raceMods = new int[6];

	public Character(Race race, int level, Class characterClass, trait traits,
			ArrayList<Item> equipment, String charactername, String playerName, boolean isProAcrobatics,
			boolean isProAnimalHandling, boolean isProArcana, boolean isProAthletics, boolean isProDeception,
			boolean isProHistory, boolean isProInsight, boolean isProIntimidation, boolean isProInvestigation,
			boolean isProMedicine, boolean isProNature, boolean isProPerception, boolean isProPersuasion,
			boolean isProReligion, boolean isProSleightOfHand, boolean isProStealth, boolean isProSurvival,
			boolean isProStr, boolean isProDex, boolean isProInt, boolean isProCon, boolean isProWis, boolean isProCha,
			int copperPieces, int silverPieces, int goldPieces, int platPieces) {
		super();
		setRace(race);
		setLevel(level);
		setCharacterClass(characterClass);
		setStrength();
		setDexterity();
		setIntelligence();
		setConstitution();
		setWisdom();
		setCharisma();
		setMods();
		setTraits(traits);
		setEquipment(equipment);
		setEquipArmor(equipArmor);
		setCharacterName(charactername);
		setPlayerName(playerName);
		this.isProAcrobatics = isProAcrobatics;
		this.isProAnimalHandling = isProAnimalHandling;
		this.isProArcana = isProArcana;
		this.isProAthletics = isProAthletics;
		this.isProDeception = isProDeception;
		this.isProHistory = isProHistory;
		this.isProInsight = isProInsight;
		this.isProIntimidation = isProIntimidation;
		this.isProInvestigation = isProInvestigation;
		this.isProMedicine = isProMedicine;
		this.isProNature = isProNature;
		this.isProPerception = isProPerception;
		this.isProPersuasion = isProPersuasion;
		this.isProReligion = isProReligion;
		this.isProSleightOfHand = isProSleightOfHand;
		this.isProStealth = isProStealth;
		this.isProSurvival = isProSurvival;
		this.copperPieces = copperPieces;
		this.silverPieces = silverPieces;
		this.goldPieces = goldPieces;
		this.platPieces = platPieces;
		if(isProAcrobatics) {
			Acrobatics += proficiencyBonus;
		}
		if(isProAnimalHandling) {
			AnimalHandling += proficiencyBonus;
		}
		if(isProArcana) {
			Arcana += proficiencyBonus;
		}
		if(isProAthletics) {
			Athletics += proficiencyBonus;
		}
		if(isProDeception) {
			Deception += proficiencyBonus;
		}
		if(isProHistory) {
			History += proficiencyBonus;
		}
		if(isProInsight) {
			Insight += proficiencyBonus;
		}
		if(isProIntimidation) {
			Intimidation += proficiencyBonus;
		}
		if(isProInvestigation) {
			Investigation += proficiencyBonus;
		}
		if(isProMedicine) {
			Medicine += proficiencyBonus;
		}
		if(isProNature) {
			Nature += proficiencyBonus;
		}
		if(isProPerception) {
			Perception += proficiencyBonus;
		}
		if(isProPerformance) {
			Performance += proficiencyBonus;
		}
		if(isProPersuasion) {
			Persuasion += proficiencyBonus;
		}
		if(isProReligion) {
			Religion += proficiencyBonus;
		}
		if(isProSleightOfHand) {
			SleightOfHand += proficiencyBonus;
		}
		if(isProStealth) {
			Stealth += proficiencyBonus;
		}
		if(isProSurvival) {
			Survival += proficiencyBonus;
		}
		if(isProStr) {
			strSaving += proficiencyBonus;
		}
		if(isProDex) {
			dexSaving += proficiencyBonus;
		}
		if(isProInt) {
			intSaving += proficiencyBonus;
		}
		if(isProCon) {
			conSaving += proficiencyBonus;
		}
		if(isProWis) {
			wisSaving += proficiencyBonus;
		}
		if(isProCha) {
			chaSaving += proficiencyBonus;
		}
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
	
	private static Race race;
	public static int level;
	private Class characterClass;
	private trait traits;
	private ArrayList<Item> equipment = new ArrayList<>();
	private static ArrayList<String> proficiencies = new ArrayList<>();
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
	private boolean isProAcrobatics = false;
	private int AnimalHandling = wisMod;
	private boolean isProAnimalHandling = false;
	private int Arcana = intMod;
	private boolean isProArcana = false;
	private int Athletics = strMod;
	private boolean isProAthletics = false;
	private int Deception = chaMod;
	private boolean isProDeception = false;
	private int History = intMod;
	private boolean isProHistory = false;
	private int Insight = wisMod;
	private boolean isProInsight = false;
	private int Intimidation = chaMod;
	private boolean isProIntimidation = false;
	private int Investigation = intMod;
	private boolean isProInvestigation = false;
	private int Medicine = wisMod;
	private boolean isProMedicine = false;
	private int Nature = intMod;
	private boolean isProNature = false;
	private int Perception = wisMod;
	private boolean isProPerception = false;
	private int Performance = chaMod;
	private boolean isProPerformance = false;
	private int Persuasion = chaMod;
	private boolean isProPersuasion = false;
	private int Religion = intMod;
	private boolean isProReligion = false;
	private int SleightOfHand = dexMod;
	private boolean isProSleightOfHand = false;
	private int Stealth = dexMod;
	private boolean isProStealth = false;
	private int Survival = wisMod;
	private boolean isProSurvival = false;
	private int strSaving = strMod;
	private boolean isProStr;
	private int dexSaving = dexMod;
	private boolean isProDex;
	private int intSaving = intMod;
	private boolean isProInt;
	private int conSaving = conMod;
	private boolean isProCon;
	private int wisSaving = wisMod;
	private boolean isProWis;
	private int chaSaving = chaMod;
	private boolean isProCha;
	private int[] baseMods = new int[6];
	private int copperPieces;
	private int silverPieces;
	private int goldPieces;
	private int platPieces;
	private int proficiencyBonus;
	private int Initiative = dexMod;
	
	public int getInitiativa() {
		return Initiative;
	}

	public static Race getRace() {
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

	public ArrayList<Item> getEquipment() {
		return equipment;
	}

	public void setEquipment(ArrayList<Item> equipment) {
		this.equipment = equipment;
	}

	public SimpleObjectProperty<Armor> getEquipArmor() {
		return equipArmor;
	}

	public void setEquipArmor(SimpleObjectProperty<Armor> equipArmor) {
		this.equipArmor = equipArmor;
	}

	public String getCharacterName() {
		return charactername;
	}

	public void setCharacterName(String charactername) {
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

	public void setStrength() {
		Strength = rollStats();
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

	public void setDexterity() {
		Dexterity = rollStats();
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

	public void setIntelligence() {
		Intelligence = rollStats();
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

	public void setConstitution() {
		Constitution = rollStats();
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

	public void setWisdom() {
		Wisdom = rollStats();
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

	public void setCharisma() {
		Charisma = rollStats();
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

	public static int getLevel() {
		return level;
	}
	
	public void levelUp() {
		level++;
	}

	public boolean isProAcrobatics() {
		return isProAcrobatics;
	}

	public void setProAcrobatics(boolean isProAcrobatics) {
		this.isProAcrobatics = isProAcrobatics;
	}

	public boolean isProAnimalHandling() {
		return isProAnimalHandling;
	}

	public void setProAnimalHandling(boolean isProAnimalHandling) {
		this.isProAnimalHandling = isProAnimalHandling;
	}

	public boolean isProArcana() {
		return isProArcana;
	}

	public void setProArcana(boolean isProArcana) {
		this.isProArcana = isProArcana;
	}

	public boolean isProAthletics() {
		return isProAthletics;
	}

	public void setProAthletics(boolean isProAthletics) {
		this.isProAthletics = isProAthletics;
	}

	public boolean isProDeception() {
		return isProDeception;
	}

	public void setProDeception(boolean isProDeception) {
		this.isProDeception = isProDeception;
	}

	public boolean isProHistory() {
		return isProHistory;
	}

	public void setProHistory(boolean isProHistory) {
		this.isProHistory = isProHistory;
	}

	public boolean isProInsight() {
		return isProInsight;
	}

	public void setProInsight(boolean isProInsight) {
		this.isProInsight = isProInsight;
	}

	public boolean isProIntimidation() {
		return isProIntimidation;
	}

	public void setProIntimidation(boolean isProIntimidation) {
		this.isProIntimidation = isProIntimidation;
	}

	public boolean isProInvestigation() {
		return isProInvestigation;
	}

	public void setProInvestigation(boolean isProInvestigation) {
		this.isProInvestigation = isProInvestigation;
	}

	public boolean isProMedicine() {
		return isProMedicine;
	}

	public void setProMedicine(boolean isProMedicine) {
		this.isProMedicine = isProMedicine;
	}

	public boolean isProNature() {
		return isProNature;
	}

	public void setProNature(boolean isProNature) {
		this.isProNature = isProNature;
	}

	public boolean isProPerception() {
		return isProPerception;
	}

	public void setProPerception(boolean isProPerception) {
		this.isProPerception = isProPerception;
	}

	public boolean isProPersuasion() {
		return isProPersuasion;
	}

	public void setProPersuasion(boolean isProPersuasion) {
		this.isProPersuasion = isProPersuasion;
	}

	public boolean isProReligion() {
		return isProReligion;
	}

	public void setProReligion(boolean isProReligion) {
		this.isProReligion = isProReligion;
	}

	public boolean isProSleightOfHand() {
		return isProSleightOfHand;
	}

	public void setProSleightOfHand(boolean isProSleightOfHand) {
		this.isProSleightOfHand = isProSleightOfHand;
	}

	public boolean isProStealth() {
		return isProStealth;
	}

	public void setProStealth(boolean isProStealth) {
		this.isProStealth = isProStealth;
	}

	public boolean isProSurvival() {
		return isProSurvival;
	}

	public void setProSurvival(boolean isProSurvival) {
		this.isProSurvival = isProSurvival;
	}
	
	public int rollStats() {
		int roll1 = die.roll();
		int roll2 = die.roll();
		int roll3 = die.roll();
		int roll4 = die.roll();
		int dieSum = roll1 + roll2 + roll3 + roll4;
		if(roll1 > roll2) {
			if(roll1 > roll3) {
				if(roll1 > roll4) {
					dieSum -= roll1;
				}
			}
		}else if(roll2 > roll1) {
			if(roll2 > roll3) {
				if(roll2 < roll4) {
					dieSum -= roll2;
				}
			}
		}else if(roll3 > roll1) {
			if(roll3 > roll2) {
				if(roll3 < roll4) {
					dieSum -= roll3;
				}
			}
		}else if(roll4 > roll1) {
			if(roll4 > roll2) {
				if(roll4 < roll3) {
					dieSum -= roll4;
				}
			}
		}
		return dieSum;
	}

	public int getProficiencyBonus() {
		return proficiencyBonus;
	}

	public void setProficiencyBonus(int proficiencyBonus) {
		this.proficiencyBonus = proficiencyBonus;
	}
	
	public static void addProficiency(String prof) {
		proficiencies.add(prof);
	}
	
}
