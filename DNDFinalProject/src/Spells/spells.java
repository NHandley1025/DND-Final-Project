package Spells;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import keys.spellKey;

public class spells {
	private static HashMap<spellKey, spell> spells = new HashMap<>();
	
	public static spell get(spellKey key) {
		if(key.isFilter()) {
			throw new IllegalArgumentException("spellKey cannot have a null parameter");
		}
		return spells.get(key);	
	}
	
	public static spell[] getSpellList(spellKey key) {
		Map<spellKey, spell> collect = spells.entrySet().stream()
				.filter(map -> map.getKey() == key)
				.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
		spell[] filteredSpells = (spell[]) collect.entrySet().toArray();
		return filteredSpells;
	}
	
	public static void readSpellFile() throws IOException, FileNotFoundException{
		String file = lib.ProgramUtil.readFile("Spells.txt");
		String[] lines = file.split("\n");
		for(int i=0; i<lines.length; i++) {
			String[] things = lines[i].split("::");
			if(things.length==4) {
				spell spell = new spell(things[0], things[3], things[1], Integer.parseInt(things[2]));
				spells.put(new spellKey(spell.spellLevel, spell.name, spell.classReq), spell);
			}
		}
	}
}
