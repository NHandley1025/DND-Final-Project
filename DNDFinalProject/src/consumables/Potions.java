package consumables;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import consumables.Potion;

public class Potions {
private static HashMap<String, Potion> potionHash = new HashMap<>();
	
	public static HashMap<String, Potion> getPotionHash(){
		return potionHash;
	}
	
	public static void readPotionFile() throws FileNotFoundException, IOException {
		String file = lib.ProgramUtil.readFile("Potions.txt");
		String [] lines = file.split("\n");
		for(int i = 0; i < lines.length; i++) {
			String [] words = lines[i].split("::");
			Potion potion = new Potion(words[0], Integer.parseInt(words[1]), words[2]);
			potionHash.put(words[0], potion);
		}
	}
}
