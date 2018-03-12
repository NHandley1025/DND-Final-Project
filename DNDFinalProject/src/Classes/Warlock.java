package Classes;

import Player.Character;
import Skills.skills;

public class Warlock extends Class{
	private static final long serialVersionUID = 579163838474117722L;

	public Warlock() {
		super("Warlock");
	}
	
	public Warlock(Character character) {
		super("Warlock");
		character.setHitDice("1d8");
		setSkills(character.getLevel());
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
