package Races;

import Skills.skills;

public class Human extends Race {

	public Human() {	
		super();
		landBaseSpeed = 30;
		size = "Medium";
		setRacialModifiers();
		setLandBaseSpeed(30);
	}
	
	private void setRacialModifiers() {
		// Mod[0] = strength
		// Mod[1] = dexterity
		// Mod[2] = intelligence;
		// Mod[3] = Constitution;
		// Mod[4] = Wisdom;
		// Mod[5] = Charisma;
		racialModifiers[0] = 1;
		racialModifiers[1] = 1;
		racialModifiers[2] = 1;
		racialModifiers[3] = 1;
		racialModifiers[4] = 1;
		racialModifiers[5] = 1;
	}
}
