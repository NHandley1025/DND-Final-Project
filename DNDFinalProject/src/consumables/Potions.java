package consumables;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import consumables.Potion;

public class Potions {
private static HashMap<String, Potion> potionHash = new HashMap<>();
	
	public HashMap<String, Potion> getpotionHash(){
		return potionHash;
	}
	
	public static void readPotionFile() throws FileNotFoundException, IOException {
		String file = lib.ProgramUtil.readFile("C:\\Users\\Andy\\Documents\\GitHub\\DND-Final-Project\\Potions.txt");
		String [] lines = file.split("\n");
		for(int i = 0; i < lines.length; i++) {
			String [] words = lines[i].split("::");
			
			
			//add value to potions
		}
	}
}
