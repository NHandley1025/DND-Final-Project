package Traits;

import java.io.IOException;
import java.util.HashMap;

import Skills.Skill;

public class Backgrounds {
	private static HashMap<String, Background> backgrounds = new HashMap<>();
	
	public static Background get(String key) {
		return backgrounds.get(key);
	}
	
	public static HashMap<String, Background> getBackgroundHash() {
		return backgrounds;
	}
	
	public static void load() {
		try {
			String file = lib.ProgramUtil.readFile("Backgrounds.txt");
			String[] lines = file.split("\n");
			for(int i=0; i<lines.length; i++) {
				String[] things = lines[i].split("::");
				if(things.length==3) {
					Background b = new Background(things[0], new Skill(things[1], things[2]));
					backgrounds.put(b.getName(), b);
				}
			}
			
		} catch (IOException e) {
			//Popup saying loading failed
		}
	}
}
