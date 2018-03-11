package Classes;

import Player.Character;
import Skills.skills;

public class Rogue extends Class{

	public Rogue(int level) {
		Character.setHitDice("1d8");
		setSkills(Character.getLevel());
		setProficiencies();
	}
	//needs fixing
	public void setSkills(int level) {
		super.setProficiencyByLevel(level);
		super.improveAbilityScore(level);
		switch(level) {
		case 20:addSkill(skills.strokeOfLuck);
		case 19:
		case 18:addSkill(skills.elusive);
		case 17://archetype feature
		case 16:
		case 15:addSkill(skills.slipperyMind);
		case 14:addSkill(skills.blindSense);
		case 13://archetype feature
		case 12:
		case 11:addSkill(skills.reliableTalent);
		case 10:skills.AbilityScoreImprovement(); //rogue gets an additional one
		case 9://archetype feature
		case 8:
		case 7:addSkill(skills.evasion);
		case 6:addSkill(skills.expertise);
		case 5:addSkill(skills.uncannyDodge);
		case 4:
		case 3://choose archetype
		case 2:addSkill(skills.cunningAction);
		case 1:addSkill(skills.expertise, skills.sneakAttack, skills.thievesCant);
		default: break;
		}
	}
	
	private void setProficiencies() {
		Character.addProficiency("Light Armor");
		Character.addProficiency("Hand Crossbows");
		Character.addProficiency("Longswords");
		Character.addProficiency("Simple Weapons");
		Character.addProficiency("Rapiers");
		Character.addProficiency("Shortswords");
	}
	
	
	
}
