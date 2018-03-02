package Classes;

import Skills.Skill;
import Skills.skills;


public class Barbarian extends Class{
	
	byte ragesPerDay = 2;
	byte rageDamage = 2;
	
	public Barbarian() {
		setSkills(Character.getLevel());
	}
	
	public void setSkills(int level) {
		if(level > 3 && getArchetype() == null) {
			chooseArchetype();
		}
		switch(level) {
		case 20:addSkill(skills.PrimalChampion);
		ragesPerDay = 0;
			
		case 19:addSkill(skills.AbilityScoreImprovement);
			
		case 18:addSkill(skills.IndomitableFight);
		
		case 17:ragesPerDay = 6;
			
		case 16:addSkill(skills.AbilityScoreImprovement);
		rageDamage = 4;
		
		case 15:addSkill(skills.PersistantRage);
		
		case 14:archetypeCheck(skills.TotemWarrior3, skills.Retaliation);
		case 13:
			
		case 12:addSkill(skills.AbilityScoreImprovement);
		ragesPerDay = 5;
		
		case 11:addSkill(skills.PersistantRage);
		
		case 10:archetypeCheck(skills.SpiritWalker, skills.IntimidatingPresence);
		
		case 9:addSkill(skills.BrutalCritical);
		rageDamage = 3;
		
		case 8:addSkill(skills.AbilityScoreImprovement);
		
		case 7:addSkill(skills.FeralInstinct);
		
		case 6:archetypeCheck(skills.TotemWarrior2, skills.MindlessRage);
		ragesPerDay = 4;
		
		case 5:addSkill(skills.ExtraAttack, skills.FastMovement);
		
		case 4:addSkill(skills.AbilityScoreImprovement);
		
		case 3:archetypeCheck(skills.TotemWarrior1, skills.Frenzy);
		ragesPerDay = 3;
			
		case 2:addSkill(skills.RecklessAttack, skills.DangerSense);
		
		case 1:addSkill(skills.Rage, skills.UnarmoredDefense);
		default: break;
		}
	}
	
	private void addSkill(Skill... skills) {
		for(Skill skill : skills)
			if(!classSkills.contains(skill)) {
				classSkills.add(skill);
			}
		}
	}

	private void archetypeCheck(Skill totemWarrior, Skill beserker) {
		addSkill((getArchetype().getName() == "Path of the Totem Warrior") ? totemWarrior : beserker);
	}
	
	private void chooseArchetype() {
		//use menu or popup to choose archetype (currently, always set to beserker)
		Archetype archetype = new Archetype("Path of the Beserker");
		//set that archetype
		setArchetype(archetype);
	}
	
	public String getRagesPerDay() {
		String stringRage = (ragesPerDay == 0) ? "unlimited" : String.valueOf(ragesPerDay);
		return stringRage;
	}
}
