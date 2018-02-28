package Races;

import Player.Character;
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
		// Mod[0] = strength
		// Mod[1] = dexterity
		// Mod[2] = intelligence;
		// Mod[3] = Constitution;
		// Mod[4] = Wisdom;
		// Mod[5] = Charisma;
		racialModifiers[0] = 0;
		racialModifiers[1] = 0;
		racialModifiers[2] = 0;
		racialModifiers[3] = 2;
		racialModifiers[4] = 0;
		racialModifiers[5] = 0;
	}
}
