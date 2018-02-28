package Races;

import Skills.skills;

public class Tiefling extends Race {

	public Tiefling() {
		super();
		landBaseSpeed = 30;
		size = "Medium";
	}
	
	private void setRacialModifiers() {
		Intelligence ++;
		Charisma += 2;
	}
	
	private void setRacialSkills() {
		racialSkills.add(skills.DarkVision);
		racialSkills.add(skills.HellishResistance);
		racialSkills.add(skills.InfernalLegacy);
	}
}
