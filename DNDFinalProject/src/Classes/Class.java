package Classes;

import java.io.Serializable;
import java.util.ArrayList;

import Player.Character;
import Skills.Skill;
import Skills.skills;

public class Class implements Serializable{
	private String name;

	private static final long serialVersionUID = -10422226606236608L;
	
	public Class() {}
	
	public Class(String name) {
		setName(name);
	}
	
	ArrayList<Skill> classSkills = new ArrayList<>();
	private Archetype archetype;
	private int proficiencyBonus;
	ArrayList<String> itemProficiencies = new ArrayList<>();
	
	public ArrayList<Skill> getSkillList() {
		return classSkills;
	}

	public int getProficiencyBonus() {
		return proficiencyBonus;
	}

	public void setProficiencyBonus(int proficiencyBonus) {
		this.proficiencyBonus = proficiencyBonus;
	}
	
	public void setProficiencyByLevel(int level) {
		int profBon = 2;
		if(level > 16) {
			profBon = 6;
		}else if(level > 12) {
			profBon = 5;
		}else if(level > 8) {
			profBon = 4;
		}else if(level > 4) {
			profBon = 3;
		}
		setProficiencyBonus(profBon);
	}
	
	public void improveAbilityScore(int level) {
		int multiplicity = 0;
		if(level == 19) {
			multiplicity = 4;
		}else{
			multiplicity = level/4;
		}
		for(int i=0; i<multiplicity; i++) {
			skills.AbilityScoreImprovement();
		}
	}
	
	public Archetype getArchetype() {
		return archetype;
	}
	
	protected void setArchetype(Archetype archetype) {
		this.archetype=archetype;
	}
	
	protected void addSkill(Skill...skills) {
		for(Skill s: skills) {
			if(!classSkills.contains(s)) {
				classSkills.add(s);
			}
		}
	}
	
	public int getInitialHitDie(Character character) {
		int hitDie = 0;
		if(character.getHitDice().equals("1d12")) {
			hitDie = 12;
		}
		if(character.getHitDice().equals("1d10")) {
			hitDie = 10;
		}
		if(character.getHitDice().equals("1d8")) {
			hitDie = 8;
		}
		if(character.getHitDice().equals("1d6")) {
			hitDie = 6;
		}
		return hitDie;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
