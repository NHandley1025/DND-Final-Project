package Races;

import Skills.skills;

import java.io.Serializable;

import Player.*;
import Player.Character;

public class Dragonborn extends Race{

	private static final long serialVersionUID = 1L;

	public Dragonborn(Character character) {
		super();
		size = "Medium";
		landBaseSpeed = 30;
		setRacialModifiers();
		setRacialSkills();
		character.addLanguage("Dragonborn");
		character.addLanguage("Common");
		setLandBaseSpeed(30);
	}
	
	private void setRacialModifiers() {
		// Mod[0] = strength
		// Mod[1] = dexterity
		// Mod[2] = intelligence;
		// Mod[3] = Constitution;
		// Mod[4] = Wisdom;
		// Mod[5] = Charisma;
		racialModifiers[0] = 1;
		racialModifiers[1] = 0;
		racialModifiers[2] = 0;
		racialModifiers[3] = 0;
		racialModifiers[4] = 0;
		racialModifiers[5] = 1;
	}
	
	private void setRacialSkills() {
		racialSkills.add(skills.DraconicAncestry);
		racialSkills.add(skills.BreathWeapon);
		racialSkills.add(skills.DamageResistance);
	}
	
}
