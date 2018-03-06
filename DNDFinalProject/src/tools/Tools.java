package tools;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class Tools {
private static HashMap<String, Tool> toolHash = new HashMap<>();
	
	public static HashMap<String, Tool> getToolHash(){
		return toolHash;
	}

	public static void readToolFile() throws FileNotFoundException, IOException {
		String file = lib.ProgramUtil.readFile("Tools.txt");
		String[] lines = file.split("\n");
		for(int i = 0; i < lines.length; i++) {
			String [] words = lines[i].split("::");
			Tool tool = new Tool(words[0],words[1]);
			toolHash.put(words[0], tool);
		}	
	}
}
