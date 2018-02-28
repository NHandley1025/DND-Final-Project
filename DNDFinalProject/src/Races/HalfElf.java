package Races;

import Skills.skills;

public class HalfElf extends Race {

	public HalfElf() {
		size = "Medium";
		landBaseSpeed = 30;
	}
	
	private void setRacialModifiers() {
		Charisma += 2;
		//Need to allow user to choose 2 other stats to modify
	}
	private void setRacialSkills() {
		racialSkills.add(skills.DarkVision);
		racialSkills.add(skills.FeyAncestry);
		racialSkills.add(skills.SkillVersatality);
	}
}
