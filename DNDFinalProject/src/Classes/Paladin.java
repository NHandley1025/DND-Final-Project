package Classes;

import Player.Character;
import Skills.skills;

public class Paladin extends Class{
	
	private static final long serialVersionUID = 2133468970242828383L;

	public Paladin() {
		super("Paladin");
	}
	
	public Paladin(Character character) {
		super("Paladin");
		character.setHitDice("1d10");
		setProficiencies(character);
		setSkills(character.getLevel());
	}
	
	public void setSkills(int level){
		super.setProficiencyByLevel(level);
		super.improveAbilityScore(level);
		switch(level) {
		case 20:addSkill(skills.holyNimbus);
		case 19: 
		case 18: //aura improvements
		case 17:
		case 16:
		case 15:addSkill(skills.purityOfSpirit);
		case 14:addSkill(skills.cleansingTouch);
		case 13:
		case 12:
		case 11:addSkill(skills.improvedDivineSmite);
		case 10:addSkill(skills.auraOfCourage);
		case 9:
		case 8:
		case 7:addSkill(skills.auraOfDevotion);
		case 6:addSkill(skills.auraOfProtection);
		case 5:addSkill(skills.ExtraAttack);
		case 4:
		case 3:addSkill(skills.divineHealth, skills.sacredOath, skills.channelDivinity, skills.cDSacredWeapon, skills.cDTurnTheUnholy);
		case 2:addSkill(skills.SpellCasting, skills.divineSmite);
		addSkill(skills.fightingStyle);
		case 1:addSkill(skills.divineSense, skills.layOnHands);
		default: break;
		}
	}
	
	private void setProficiencies(Character character) {
		character.addProficiency("All Armor");
		character.addProficiency("Shields");
		character.addProficiency("Simple Weapons");
		character.addProficiency("Martial Weapons");
	}

}
