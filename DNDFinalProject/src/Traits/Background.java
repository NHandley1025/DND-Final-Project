package Traits;

import keys.TraitKey;

public class Background {
	private Bond bond;
	private Personality personalityTraits;
	private Ideal ideals;
	private Flaw flaws;
	private String name;
	
	public Background(String name) {
		setName(name);
	}
	
	public void setName(String name) {
		if(Backgrounds.getHash().containsKey(new TraitKey(name, null))) {
			this.name = name;
		}else {
			this.name = "The Chosen One";
		}
	}

	public Bond getBond() {
		return bond;
	}

	public void setBond(Bond bond) {
		this.bond = bond;
	}

	public Personality getPersonalityTraits() {
		return personalityTraits;
	}

	public void setPersonalityTraits(Personality personalityTraits) {
		this.personalityTraits = personalityTraits;
	}

	public Ideal getIdeals() {
		return ideals;
	}

	public void setIdeals(Ideal ideals) {
		this.ideals = ideals;
	}

	public Flaw getFlaws() {
		return flaws;
	}

	public void setFlaws(Flaw flaws) {
		this.flaws = flaws;
	}

	public String getName() {
		return name;
	}
	
	
}
