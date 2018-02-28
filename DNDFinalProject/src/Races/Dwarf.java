package Races;

import Skills.skills;

public class Dwarf extends Race {
	public Dwarf() {
		super();
		size = "Medium";
		landBaseSpeed = 25;
		}
	
	private void setRacialSkills() {
		racialSkills.add(skills.DarkVision);
		racialSkills.add(skills.DwarvenResilience);
		racialSkills.add(skills.DwarvenCombatTraining);
		racialSkills.add(skills.ToolProficiency);
		racialSkills.add(skills.Stonecunning);
	}
	
	private void setRacialModifiers() {
		Constitution += 2;
	}
}
