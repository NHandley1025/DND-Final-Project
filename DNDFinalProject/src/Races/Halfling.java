package Races;

import Skills.skills;

public class Halfling extends Race {

	public Halfling() {
		super();
		landBaseSpeed = 25;
		size = "Small";
		setRacialModifiers();
		setRacialSkills();
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
