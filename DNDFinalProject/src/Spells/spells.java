package Spells;

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
	
	public static void load() {
		
	}
}
