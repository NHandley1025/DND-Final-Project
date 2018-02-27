package Classes;

import java.util.HashMap;

import Skills.Skill;

public class Class {

	HashMap<String, Skill> skills = new HashMap<>();
	Skill[] classSkills = new Skill[0];
	private Archetype archetype;
	private int proficiencyBonus;
	
	public Skill getSkill(Skill skill) {
		return skill;
	}
	
}
