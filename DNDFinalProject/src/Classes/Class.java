package Classes;

import java.util.ArrayList;

import Skills.Skill;

public class Class {

	ArrayList<Skill> classSkills = new ArrayList<>();
	private Archetype archetype;
	private int proficiencyBonus;
	pArrayList<String> itemProficiencies = new ArrayList<>();
	
	public Skill getSkill(Skill skill) {
		return skill;
	}

	public int getProficiencyBonus() {
		return proficiencyBonus;
	}

	public void setProficiencyBonus(int proficiencyBonus) {
		this.proficiencyBonus = proficiencyBonus;
	}
	
	public Archetype getArchetype() {
		return archetype;
	}
	
	protected void setArchetype(Archetype archetype) {
		this.archetype=archetype;
	}
	
}
