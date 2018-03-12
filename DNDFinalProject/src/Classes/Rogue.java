package Classes;

import Player.Character;
import Skills.skills;

public class Rogue extends Class{
	private static final long serialVersionUID = -7107871969965788474L;

	public Rogue() {
		super("Rogue");
	}
	
	public Rogue(Character character) {
		super("Rogue");
		character.setHitDice("1d8");
		setSkills(character.getLevel());
		setProficiencies(character);
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
	
	private void setProficiencies(Character character) {
		character.addProficiency("Light Armor");
		character.addProficiency("Hand Crossbows");
		character.addProficiency("Longswords");
		character.addProficiency("Simple Weapons");
		character.addProficiency("Rapiers");
		character.addProficiency("Shortswords");
	}
	
	
	
}
