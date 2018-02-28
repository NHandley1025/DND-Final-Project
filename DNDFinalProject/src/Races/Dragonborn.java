package Races;

import Skills.skills;

public class Dragonborn extends Race{

	public Dragonborn() {
		super();
		size = "Medium";
		landBaseSpeed = 30;
	}
	
	private void setRacialModifiers() {
		Strength += 2;
		Charisma += 1;
	}
	
	private void setRacialSkills() {
		racialSkills.add(skills.DraconicAncestry);
		racialSkills.add(skills.BreathWeapon);
		racialSkills.add(skills.DamageResistance);
	}
}
