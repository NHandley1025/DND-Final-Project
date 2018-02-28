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
	private int Dexerity;
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
	public int[] raceMods = new int[6];
	private int[] totalMods = new int[6];
	private int copperPieces;
	private int silverPieces;
	private int goldPieces;
	private int platPieces;
	
	public int getLevel() {
		return level;
	}
	
	public void levelUp() {
		level++;
	}
}
