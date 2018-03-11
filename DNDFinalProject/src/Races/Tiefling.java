package Races;

import Skills.skills;

public class Tiefling extends Race {

	public Tiefling() {
		super();
		landBaseSpeed = 30;
		size = "Medium";
		setRacialModifiers();
		setRacialSkills();
		setLandBaseSpeed(30);
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
		racialModifiers[2] = 1;
		racialModifiers[3] = 0;
		racialModifiers[4] = 0;
		racialModifiers[5] = 2;
	}
	
	private void setRacialSkills() {
		racialSkills.add(skills.DarkVision);
		racialSkills.add(skills.HellishResistance);
		racialSkills.add(skills.InfernalLegacy);
	}
}
