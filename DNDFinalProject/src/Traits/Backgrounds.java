package Traits;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import keys.TraitKey;

public class Backgrounds {
	static HashMap<TraitKey, trait> traits = new HashMap<>();
	
	public static trait get(TraitKey key) {
		if(!key.isFilter()) {
			throw new IllegalArgumentException("Key cannot have any null fields");
		}
		return traits.get(key);
	}
	
	public static <T extends trait> T[] getTraitList(TraitKey key, String simpleClassName) {
		Map<TraitKey, trait> collect = traits.entrySet().stream()
				.filter(traits -> traits.getKey() == key)
				.filter(traits -> traits.getValue().getClass().getSimpleName().equals(simpleClassName))
				.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
		T[] filteredTraits = null;
		filteredTraits = collect.values().toArray(filteredTraits);
		return filteredTraits;
	}
	
	public static HashMap<TraitKey, trait> getTraitHash() {
		return traits;
	}
	
	public static void load() {
		loadFile("Bonds.txt", new Bond(null, null));
		loadFile("Flaws.txt", new Flaw(null, null));
		loadFile("Ideals.txt", new Ideal(null, null));
		loadFile("Personality.txt", new Personality(null, null));
	}
	
	public static <T extends trait> void loadFile(String filePath, T type) {
		try {
			String file = lib.ProgramUtil.readFile(filePath);
			String[] lines = file.split("\n");
			for(String line: lines) {
				String[] parts = line.split("::");
				trait t = new trait(parts[1], parts[2]);
				T item = (T)t;
				traits.put(new TraitKey(parts[0], parts[1]), item);
			}
		}catch(FileNotFoundException fnfe) {
			
		}catch(IOException ioe) {
			
		}
	}
	
}
