package Races;

import Player.Character;
import Skills.skills;

public class Elf extends Race {
	private static final long serialVersionUID = -8526674006457357127L;

	public Elf(Character character) {
		super();
		size = "Medium";
		landBaseSpeed = 30;
		setRacialModifiers();
		setRacialSkills();
		character.addLanguage("Elvish");
		character.addLanguage("Common");
		setLandBaseSpeed(30);
		name = "Elf";
	}
	
	private void setRacialModifiers() {
		// Mod[0] = strength
		// Mod[1] = dexterity
		// Mod[2] = intelligence;
		// Mod[3] = Constitution;
		// Mod[4] = Wisdom;
		// Mod[5] = Charisma;
		racialModifiers[0] = 0;
		racialModifiers[1] = 2;
		racialModifiers[2] = 0;
		racialModifiers[3] = 0;
		racialModifiers[4] = 0;
		racialModifiers[5] = 0;
	}
	
	private void setRacialSkills() {
		racialSkills.add(skills.DarkVision);
		racialSkills.add(skills.FeyAncestry);
		racialSkills.add(skills.Trance);
		racialSkills.add(skills.KeenSenses);
	}
}
