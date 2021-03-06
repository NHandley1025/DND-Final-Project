package Classes;

import Player.Character;
import Skills.skills;

public class Fighter extends Class {
	private static final long serialVersionUID = -4158395232989788734L;

	public Fighter() {
		super("Fighter");
	}
	
	public Fighter(Character character) {
		super("Fighter");
		setSkills(character.getLevel());
		setProficiencies(character);
		character.setHitDice("1d10");
	}

	public void setSkills(int level) {
		if (level > 3 && getArchetype() == null) {
			chooseArchetype();
		}

		switch (level) {
		case 20:
			addSkill(skills.extraAttack3);
		case 19:
			skills.AbilityScoreImprovement();
			;
		case 18:
			;
		case 17:
			addSkill(skills.actionSurge2, skills.indomidable3);
		case 16:
			skills.AbilityScoreImprovement();
		case 15:
			;
		case 14:
			skills.AbilityScoreImprovement();
		case 13:
			addSkill(skills.indomidable2);
		case 12:
			skills.AbilityScoreImprovement();
		case 11:
			addSkill(skills.extraAttack2);
		case 10:
			;
		case 9:
			addSkill(skills.indomidable1);
		case 8:
			skills.AbilityScoreImprovement();
		case 7:
			;
		case 6:
			skills.AbilityScoreImprovement();
		case 5:
			addSkill(skills.extraAttack1);
		case 4:
			skills.AbilityScoreImprovement();
		case 3:
			;
		case 2:
			addSkill(skills.actionSurge1);
		case 1:
			addSkill(skills.fightingStyle, skills.secondWind);

		}
	}

	private void chooseArchetype() {

	}
	
	private void setProficiencies(Character character) {
		character.addProficiency("All Armor");
		character.addProficiency("Shields");
		character.addProficiency("Simple Weapons");
		character.addProficiency("Martial Weapons");
	}

}
