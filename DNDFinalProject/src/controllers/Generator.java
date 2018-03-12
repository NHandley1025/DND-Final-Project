package controllers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.rmi.CORBA.Util;

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
import Player.Character;
import Races.Dragonborn;
import Races.Dwarf;
import Races.Elf;
import Races.HalfElf;
import Races.HalfOrc;
import Races.Halfling;
import Races.Human;
import Races.Race;
import Races.Tiefling;
import Weapons.weapons;
import armor.Armor;
import armor.Armors;
import consumables.Potions;
import tools.Tools;

public class Generator {
	public static Character character;
	
	public static Character randomChar;

	public static void manualGenerateChar() {
		String[] background = new String[4];
		character = new Character( 0, background, null, null, null, false, false, false, false, false,
				false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
				false, false, false, 0, 0, 0, 0);
	}
	
	public static void safeCharacter(Character character, File file) {
		//safe character to file
		try {
			util.Utilities.serializeObject(file.getAbsolutePath(), character);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Character generateRandomChar() {
		Random rand = new Random();
		int randCopper = rand.nextInt(101);
		int randSilver = rand.nextInt(101);
		int randGold = rand.nextInt(101);
		int randPlat = rand.nextInt(101);
		int randomLevel = rand.nextInt(20) + 1;
		int randTraits = rand.nextInt();
		String randName = "???";
		String playerName = "???";
		String[] background = new String[4];
		int randMoney = rand.nextInt(101);
		randomChar = new Character(randomLevel, background,
				genRandEquipment(), randName, playerName, randBoolean(), randBoolean(), randBoolean(), randBoolean(),
				randBoolean(), randBoolean(), randBoolean(), randBoolean(), randBoolean(), randBoolean(), randBoolean(),
				randBoolean(), randBoolean(), randBoolean(), randBoolean(), randBoolean(), randBoolean(), randBoolean(),
				randBoolean(), randBoolean(), randBoolean(), randBoolean(), randBoolean(), randBoolean(), randCopper, randSilver,
				randGold, randPlat);
		randomChar.setRace(genRandRace(randomChar));
		randomChar.setCharacterClass(genRandClass(randomChar.getLevel(), randomChar));
		randomChar.setMods();
		
		if(randomChar.level >= 2 && randomChar.getCharacterClass().equals(Wizard.class)) {
			int tradition = rand.nextInt(8)+1;
			switch(tradition) {
			case 1:
				Wizard.setArcaneTradition("Abjuration");
				break;
			case 2:
				Wizard.setArcaneTradition("Conjuration");
				break;
			case 3:
				Wizard.setArcaneTradition("Divination");
				break;
			case 4:
				Wizard.setArcaneTradition("Enchantment");
				break;
			case 5:
				Wizard.setArcaneTradition("Evocation");
				break;
			case 6:
				Wizard.setArcaneTradition("Illusion");
				break;
			case 7:
				Wizard.setArcaneTradition("Necromany");
				break;
			case 8:
				Wizard.setArcaneTradition("Transmutation");
				break;
			}
		}
		return randomChar;
	}

	public static boolean randBoolean() {
		Random rand = new Random();
		int randBool = rand.nextInt(2) + 1;
		boolean bool;
		if (randBool == 1) {
			bool = true;
		} else {
			bool = false;
		}
		return bool;
	}

	private static Race genRandRace(Character character) {
		Race race = new Race();
		Random rand = new Random();
		int randomRace = rand.nextInt(8) + 1;
		switch (randomRace) {
		case 1:
			race = new Dragonborn(character);
			break;
		case 2:
			race = new Dwarf(character);
			break;
		case 3:
			race = new Elf(character);
			break;
		case 4:
			race = new HalfElf(character);
			break;
		case 5:
			race = new Halfling(character);
			break;
		case 6:
			race = new HalfOrc(character);
			break;
		case 7:
			race = new Human();
			break;
		case 8:
			race = new Tiefling();
			break;
		}
		return race;
	}

	private static Class genRandClass(int level, Character character) {
		Random rand = new Random();
		int randomClass = rand.nextInt(12) + 1;
		Class randClass = new Class();
		switch (randomClass) {
		case 1:
			randClass = new Barbarian(character);
			break;
		case 2:
			randClass = new Bard(character);
			break;
		case 3:
			randClass = new Cleric(character);
			break;
		case 4:
			randClass = new Druid(character);
			break;
		case 5:
			randClass = new Fighter(character);
			break;
		case 6:
			randClass = new Monk(character);
			break;
		case 7:
			randClass = new Paladin(character);
			break;
		case 8:
			randClass = new Ranger(character);
			break;
		case 9:
			randClass = new Rogue(character);
			break;
		case 10:
			randClass = new Sorcerer(character);
			break;
		case 11:
			randClass = new Warlock(character);
			break;
		case 12:
			randClass = new Wizard(character);
			break;
		}
		return randClass;
	}

	public static ArrayList<Item> genRandEquipment() {
		ArrayList<Item> equipment = new ArrayList<>();
		Random rand = new Random();

		// choose random weapon to add to equipment

		int weaponHashSize = weapons.getWeaponHash().keySet().size();
		int randomWeapon = rand.nextInt(weaponHashSize);
		String[] weaponList = new String[weaponHashSize];
		for (String key : weapons.getWeaponHash().keySet()) {
			for (int x = 0; x > weaponHashSize; x++) {
				weaponList[x] = key;
			}
		}
		equipment.add(weapons.getWeaponHash().get(weaponList[randomWeapon]));

		// choose random Armor to add to equipment

		int armorHashSize = Armors.getArmorHash().keySet().size();
		int randomArmor = rand.nextInt(armorHashSize);
		String[] armorList = new String[armorHashSize];
		for (String key : Armors.getArmorHash().keySet()) {
			for (int x = 0; x > armorHashSize; x++) {
				armorList[x] = key;
			}
		}

		Armor armor = (Armors.getArmorHash().get(armorList[randomArmor]));
		equipment.add(armor);

		// choose random consumables to add to equipment

		int consumeHashSize = Potions.getPotionHash().keySet().size();
		int randomConsume = rand.nextInt(consumeHashSize);
		String[] consumeList = new String[consumeHashSize];
		for (String key : Potions.getPotionHash().keySet()) {
			for (int x = 0; x > consumeHashSize; x++) {
				consumeList[x] = key;
			}
		}

		equipment.add(Potions.getPotionHash().get(consumeList[randomConsume]));

		// choose random tools to add to equipment

		int toolHashSize = Tools.getToolHash().keySet().size();
		int randomTools = rand.nextInt(toolHashSize);
		String[] toolsList = new String[toolHashSize];
		for (String key : Tools.getToolHash().keySet()) {
			for (int x = 0; x > toolHashSize; x++) {
				toolsList[x] = key;
			}
		}

		equipment.add(Tools.getToolHash().get(toolsList[randomTools]));

		return equipment;
	}

//	public static trait genRandTrait() {
//		Random rand = new Random();
//		int traitListSize = Backgrounds.getBackgroundHash().keySet().size();
//		int randomTrait = rand.nextInt(traitListSize);
//		String[] traitList = new String[traitListSize];
//		for (String key : Backgrounds.getBackgroundHash().keySet()) {
//			for (int x = 0; x > traitListSize; x++) {
//				traitList[x] = key;
//			}
//		}
//		trait randomTraits = Backgrounds.get(traitList[randomTrait]);
//		return randomTraits;
//	}
}
