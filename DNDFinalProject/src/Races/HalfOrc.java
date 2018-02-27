package Races;

import Skills.skills;

public class HalfOrc extends Race {

	public HalfOrc() {
		super();
		size = "Medium";
		landBaseSpeed = 30;
		setRacialSkills();
		setRacialModifiers();
	}
	
	private void setRacialSkills() {
		racialSkills.add(skills.DarkVision);
		racialSkills.add(skills.RelentlessEndurance);
		racialSkills.add(skills.SavageAttacks);
		racialSkills.add(skills.Menacing);
	}
	
	private void setRacialModifiers() {
		Strength += 2;
		Constituion += 1;
		
	}
	
}
