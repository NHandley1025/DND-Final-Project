package Traits;

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
}
