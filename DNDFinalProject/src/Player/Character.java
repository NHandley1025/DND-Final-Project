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
	private int Dexerity;
	private int Intelligence;
	private int Constitution;
	private int Wisdom;
	private int Charisma;
	// Mod[0] = strength
	// Mod[1] = dexterity
	// Mod[2] = intelligence;
	// Mod[3] = Constitution;
	// Mod[4] = Wisdom;
	// Mod[5] = Charisma;
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
