package Weapons;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import Weapons.weapon;


public class weapons {
	private static HashMap<String, weapon> weaponHash = new HashMap<>();
	
	public HashMap<String, weapon> getweaponHash(){
		return weaponHash;
	}
	
	public static void readWeaponFile() throws FileNotFoundException, IOException {
		String file = lib.ProgramUtil.readFile("C:\\Users\\Andy\\Documents\\GitHub\\DND-Final-Project\\Weapons.txt");
		String [] lines = file.split("\n");
		for(int i = 0; i < lines.length; i++) {
			String [] words = lines[i].split("::");
			weapon Weapon = new weapon(words[0], words[1], words[2], words[3], Integer.parseInt(words[4]), words[5]);
			weaponHash.put(words[0], Weapon);
		}
	}
	
}