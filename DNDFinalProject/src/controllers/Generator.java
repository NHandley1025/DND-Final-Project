package controllers;

import java.util.Random;

import Player.Character;
import Races.*;
import Classes.*;
import Classes.Class;
import gui.FxController;

public class Generator {

	public static void run(String[] args) {
		FxController.launch(args);
	}

	public Character generateRandomChar() {
		Random rand = new Random();
		int randomLevel = rand.nextInt(20)+1;
		int randTraits = rand.nextInt();
		int randEquipment = rand.nextInt();
		String randName = "???";
		String playerName = "???";
		int randMoney = rand.nextInt(101);
		Character randomChar = new Character(genRandRace(), randomLevel, );
		return null;
	}

	public boolean randBoolean() {
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

	private Race genRandRace() {
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
	
	private Class genRandClass() {
		Random rand = new Random();
		int randomClass = rand.nextInt(12)+1;
		Class randClass = new Class();
		switch(randomClass) {
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
			randClass = new Fighters();
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
	
}
