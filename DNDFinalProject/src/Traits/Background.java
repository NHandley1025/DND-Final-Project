package Traits;

import java.io.Serializable;

import Skills.Skill;

public class Background implements Serializable{
	private static final long serialVersionUID = -3091885494490061580L;
	private Bond bond;
	private Personality personalityTraits;
	private Ideal ideals;
	private Flaw flaws;
	private String name;
	private Skill feature;
	
	public Background(String name, Skill feature) {
		setName(name);
		setFeature(feature);
	}


	public Skill getFeature() {
		return feature;
	}

	protected void setFeature(Skill feature) {
		this.feature = feature;
	}

	public void setName(String name) {
		this.name = name;
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
