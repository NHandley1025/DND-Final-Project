package Classes;

import Player.Character;
import Skills.skills;

public class Paladin extends Class{
	
	public Paladin() {
		Character.setHitDice("1d10");
		setProficiencies();
	}
	
	public void setSkills(int level){
		super.setProficiencyByLevel(level);
		super.improveAbilityScore(level);
		switch(level) {
		case 20: //sacred oath feature
		case 19: skills.AbilityScoreImprovement();
		case 18: //aura improvements
		case 17:
		case 16:skills.AbilityScoreImprovement();
		case 15://sacred oath feature
		case 14:addSkill(skills.cleansingTouch);
		case 13:
		case 12:skills.AbilityScoreImprovement();
		case 11:addSkill(skills.improvedDivineSmite);
		case 10:addSkill(skills.auraOfCourage);
		case 9:
		case 8:skills.AbilityScoreImprovement();
		case 7://sacred oath feature
		case 6:addSkill(skills.auraOfProtection);
		case 5:addSkill(skills.ExtraAttack);
		case 4:skills.AbilityScoreImprovement();
		case 3:addSkill(skills.divineHealth, skills.sacredOath);
		case 2:addSkill(skills.SpellCasting, skills.divineSmite);
		addSkill(skills.fightingStyle);
		case 1:addSkill(skills.divineSense, skills.layOnHands);
		default: break;
		}
	}
	
	private void setProficiencies() {
		Character.addProficiency("All Armor");
		Character.addProficiency("Shields");
		Character.addProficiency("Simple Weapons");
		Character.addProficiency("Martial Weapons");
	}

}
