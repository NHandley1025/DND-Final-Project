package Races;

import Skills.skills;

public class Elf extends Race {

	public Elf() {
		super();
		size = "Medium";
		landBaseSpeed = 30;
		
	}
	
	private void setRacialModifiers() {
		Dexterity +=2;
	}
	
	private void setRacialSkills() {
		racialSkills.add(skills.DarkVision);
		racialSkills.add(skills.FeyAncestry);
		racialSkills.add(skills.Trance);
		racialSkills.add(skills.KeenSenses);
	}
}
