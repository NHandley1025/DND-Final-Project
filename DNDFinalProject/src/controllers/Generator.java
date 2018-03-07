package controllers;

import java.util.ArrayList;
import java.util.Random;

import Player.Character;
import Races.*;
import Traits.Backgrounds;
import Traits.trait;
import Weapons.weapons;
import armor.Armors;
import consumables.Potions;
import Classes.*;
import Classes.Class;
import Items.Item;
import keys.TraitKey;
import tools.Tools;

public class Generator {
	public static Character character;

	public static void manualGenerateChar() {
		String[] background = new String[4];
		character = new Character(null, 0, null, background, null, null, null, false, false, false, false, false,
				false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
				false, false, false, 0, 0, 0, 0);
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
		Character randomChar = new Character(genRandRace(), randomLevel, genRandClass(), background,
				genRandEquipment(), randName, playerName, randBoolean(), randBoolean(), randBoolean(), randBoolean(),
				randBoolean(), randBoolean(), randBoolean(), randBoolean(), randBoolean(), randBoolean(), randBoolean(),
				randBoolean(), randBoolean(), randBoolean(), randBoolean(), randBoolean(), randBoolean(), randBoolean(),
				randBoolean(), randBoolean(), randBoolean(), randBoolean(), randBoolean(), randCopper, randSilver,
				randGold, randPlat);
		randomChar.setMods();
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

	private static Race genRandRace() {
		Race race = new Race();
		Random rand = new Random();
		int randomRace = rand.nextInt(8) + 1;
		switch (randomRace) {
		case 1:
			race = new Dragonborn();
			break;
		case 2:
			race = new Dwarf();
			break;
		case 3:
			race = new Elf();
			break;
		case 4:
			race = new HalfElf();
			break;
		case 5:
			race = new Halfling();
			break;
		case 6:
			race = new HalfOrc();
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

	private static Class genRandClass() {
		Random rand = new Random();
		int randomClass = rand.nextInt(12) + 1;
		Class randClass = new Class();
		switch (randomClass) {
		case 1:
			randClass = new Barbarian();
			break;
		case 2:
			randClass = new Bard();
			break;
		case 3:
			randClass = new Cleric();
			break;
		case 4:
			randClass = new Druid();
			break;
		case 5:
			randClass = new Fighter();
			break;
		case 6:
			randClass = new Monk();
			break;
		case 7:
			randClass = new Paladin();
			break;
		case 8:
			randClass = new Ranger();
			break;
		case 9:
			randClass = new Rogue();
			break;
		case 10:
			randClass = new Sorcerer();
			break;
		case 11:
			randClass = new Warlock();
			break;
		case 12:
			randClass = new Wizard();
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

		equipment.add(Armors.getArmorHash().get(armorList[randomArmor]));

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

	public static trait genRandTrait() {
		Random rand = new Random();
		int traitListSize = Backgrounds.getTraitHash().keySet().size();
		int randomTrait = rand.nextInt(traitListSize);
		TraitKey[] traitList = new TraitKey[traitListSize];
		for (TraitKey key : Backgrounds.getTraitHash().keySet()) {
			for (int x = 0; x > traitListSize; x++) {
				traitList[x] = key;
			}
		}
		trait randomTraits = Backgrounds.get(traitList[randomTrait]);
		return randomTraits;
	}
}
