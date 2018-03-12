package Classes;

import Player.Character;
import Skills.skills;

public class Bard extends Class {
	private static final long serialVersionUID = -6469303127065022138L;

	public Bard(int Level, Character character) {
		setSkills(Level);
		chooseArchetype();
		setProficiencies(character);
	}
	
	public void setSkills(int level) {
		if (level > 3 && getArchetype() == null) {
			chooseArchetype();
		}
		super.setProficiencyByLevel(level);
		super.improveAbilityScore(level);
		switch (level) {
		case 20: addSkill(skills.superiorInspiration);
		
		case 19: 
			
		case 18: addSkill(skills.magicalSecrets);
		
		case 17: addSkill(skills.songOfRest);
		
		case 16: 
			
		case 15: addSkill(skills.bardicInspiration);
		
		case 14: addSkill(skills.magicalSecrets);
				 addSkill(skills.peerlessSkill);
		
		case 13: addSkill(skills.songOfRest);
		
		case 12: 
			
		case 11: ;
		
		case 10: addSkill(skills.bardicInspiration);
		 addSkill(skills.magicalSecrets);
		 addSkill(skills.expertise);
		 
		case 9: addSkill(skills.songOfRest);
		 
		case 8: 
			
		case 7:
		
		case 6: addSkill(skills.additionalMagicSecrets, skills.counterCharm);
		
		case 5: addSkill(skills.bardicInspiration);
		addSkill(skills.fontOfInspiration);
		
		case 4: 
			
		case 3:addSkill(skills.expertise);
		
		case 2: addSkill(skills.jackOfAllTrades, skills.bonusProficiencies, skills.songOfRest, skills.cuttingWords);
		
		case 1: addSkill(skills.SpellCasting);
		addSkill(skills.bardicInspiration);
		}

	}

	private void chooseArchetype() {
		setArchetype(Archetypes.CollegeOfLore);
	}
	
	private void setProficiencies(Character character) {
		character.addProficiency("Light Armor");
		character.addProficiency("Hand Crossbows");
		character.addProficiency("Longswords");
		character.addProficiency("Simple Weapons");
		character.addProficiency("Rapiers");
		character.addProficiency("Shortswords");
	}
}
