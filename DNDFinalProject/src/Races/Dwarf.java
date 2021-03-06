package Races;

import Player.Character;
import Skills.skills;

public class Dwarf extends Race {
	private static final long serialVersionUID = -1300343157365156986L;

	public Dwarf(Character character) {
		super();
		size = "Medium";
		landBaseSpeed = 25;
		setRacialSkills();
		setRacialModifiers();
		character.addLanguage("Dwarven");
		character.addLanguage("Common");
		setLandBaseSpeed(25);
		name = "Dwarf";
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
