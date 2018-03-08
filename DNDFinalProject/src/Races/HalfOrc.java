package Races;

import Player.Character;
import Skills.skills;

public class HalfOrc extends Race {

	public HalfOrc() {
		super();
		size = "Medium";
		landBaseSpeed = 30;
		setRacialSkills();
		setRacialModifiers();
		Character.addLanguage("Orcish");
		Character.addLanguage("Common");
	}
	
	private void setRacialSkills() {
		racialSkills.add(skills.DarkVision);
		racialSkills.add(skills.RelentlessEndurance);
		racialSkills.add(skills.SavageAttacks);
		racialSkills.add(skills.Menacing);
	}
	
	private void setRacialModifiers() {
		// Mod[0] = strength
		// Mod[1] = dexterity
		// Mod[2] = intelligence;
		// Mod[3] = Constitution;
		// Mod[4] = Wisdom;
		// Mod[5] = Charisma;
		racialModifiers[0] = 2;
		racialModifiers[1] = 0;
		racialModifiers[2] = 0;
		racialModifiers[3] = 1;
		racialModifiers[4] = 0;
		racialModifiers[5] = 0;
	}
	
}
