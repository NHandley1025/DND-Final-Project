package Races;

import Skills.skills;

public class Human extends Race {

	public Human() {	
		super();
		landBaseSpeed = 30;
		size = "Medium";
	}
	
	private void setRacialModifiers() {
		
		Strength++;
		Dexterity++;
		Constitution++;
		Intelligence++;
		Wisdom++;
		Charisma++;
	}
}
