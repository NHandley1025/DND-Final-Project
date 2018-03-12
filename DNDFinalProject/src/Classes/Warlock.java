package Classes;

import Player.Character;
import Skills.skills;

public class Warlock extends Class{

	public Warlock(int level, Character character) {
		character.setHitDice("1d8");
		setSkills(level);
		setProficiencies(character);
	}
	
	public void setSkills(int level) {
		super.setProficiencyByLevel(level);
		super.improveAbilityScore(level);
		chooseArchetype();
		switch(level) {
		case 20:addSkill(skills.eldrichMaster);
		case 19:
		case 18:
		case 17:addSkill(skills.mysticArcanumLv9);
		case 16:
		case 15:addSkill(skills.mysticArcanumLv8);
		case 14:addSkill(skills.hurlThroughHell);
		case 13:addSkill(skills.mysticArcanumLv7);
		case 12:
		case 11:addSkill(skills.mysticArcanumLv6);
		case 10:addSkill(skills.fiendishResiliance);
		case 9:
		case 8:
		case 7:
		case 6:addSkill(skills.darkLuck);
		case 5:
		case 4:
		case 3:addSkill(skills.pactBoon);
		case 2:addSkill(skills.eldrichInvocations);
		case 1:addSkill(skills.pactMagic, skills.otherWordly, skills.darkBlessing);
		default: break;
		}
	}

	private void chooseArchetype() {
		
	}
	
	private void setProficiencies(Character character) {
		character.addProficiency("Light Armor");
		character.addProficiency("Simple Weapons");
	}
	
}
