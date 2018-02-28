package Races;

import Skills.skills;

public class Halfling extends Race {

	public Halfling() {
		super();
		landBaseSpeed = 25;
		size = "Small";
	}
	
	private void setRacialModifiers() {
		Dexterity += 2;
	}
	private void setRacialSkills() {
		racialSkills.add(skills.HalflingNimbleness);
		racialSkills.add(skills.Brave);
		racialSkills.add(skills.Lucky);
	}
}
