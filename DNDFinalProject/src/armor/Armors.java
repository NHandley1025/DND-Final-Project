package armor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class Armors {
	private static HashMap<String, Armor> armorHash = new HashMap<>();
	
	public static HashMap<String, Armor> getArmorHash(){
		return armorHash;
	}
	private static void readArmorFile() throws FileNotFoundException, IOException{
		String file = lib.ProgramUtil.readFile("Armor.txt");
		String[] lines = file.split("\n");
		for(int i = 0; i < lines.length; i++) {
			String [] words = lines[i].split("::");
			Armor armor = new Armor(words[0],words[1], Integer.parseInt(words[2]), Integer.parseInt(words[3]), words[4].equals("Disadvantage"), Integer.parseInt(words[5]), Integer.valueOf(words[6]), words[7]);
          armorHash.put(words[0], armor);
		}
	}
}
