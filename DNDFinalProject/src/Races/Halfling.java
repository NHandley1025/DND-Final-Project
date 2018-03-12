package Races;

import Player.Character;
import Skills.skills;

public class Halfling extends Race {
	private static final long serialVersionUID = -3102078293902923838L;
	public Halfling(Character character) {
		super();
		landBaseSpeed = 25;
		size = "Small";
		setRacialModifiers();
		setRacialSkills();
		character.addLanguage("Halfling");
		character.addLanguage("Common");
		setLandBaseSpeed(25);
		name = "Halfling";
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
		racialSkills.add(skills.HalflingNimbleness);
		racialSkills.add(skills.Brave);
		racialSkills.add(skills.Lucky);
	}
}
