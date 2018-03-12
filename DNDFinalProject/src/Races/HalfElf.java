package Races;

import Player.Character;
import Skills.skills;

public class HalfElf extends Race {
	private static final long serialVersionUID = 1167227436506103703L;
	public HalfElf(Character character) {
		size = "Medium";
		landBaseSpeed = 30;
		setRacialModifiers();
		setRacialSkills();
		character.addLanguage("Elvish");
		character.addLanguage("Common");
		setLandBaseSpeed(30);
		name = "Half Elf";
	}
	
	private void setRacialModifiers() {
		// Mod[0] = strength
		// Mod[1] = dexterity
		// Mod[2] = intelligence;
		// Mod[3] = Constitution;
		// Mod[4] = Wisdom;
		// Mod[5] = Charisma;
		racialModifiers[0] = 0;
		racialModifiers[1] = 0;
		racialModifiers[2] = 0;
		racialModifiers[3] = 0;
		racialModifiers[4] = 0;
		racialModifiers[5] = 2;
		//Need to allow user to choose 2 other stats to modify
	}
	private void setRacialSkills() {
		racialSkills.add(skills.DarkVision);
		racialSkills.add(skills.FeyAncestry);
		racialSkills.add(skills.SkillVersatality);
	}
}
