package Classes;

import Player.Character;
import Skills.skills;

public class Monk extends Class{
	byte ki = 0;

	public Monk(int Level) {
		Character.setHitDice("1d8");
<<<<<<< HEAD
		setSkills(Level);
=======
		setSkills(Character.getLevel());
		setProficiencies();
>>>>>>> bead429a34458cae0295c3874ac4bdb7e184d943
	}
	
	public void setSkills(int level) {
		if (level > 3 && getArchetype() == null) {
			chooseArchetype();
		}
			if(level > 1) {
				ki = (byte)level;
			}
			super.setProficiencyByLevel(level);
			super.improveAbilityScore(level);
			switch (level) {
			case 20: addSkill(skills.perfectSelf);
			
			case 19:
			
			case 18: addSkill(skills.emptyBody);
			
			case 17:
			
			case 16:
			
			case 15: addSkill(skills.timelessBody);
			
			case 14: addSkill(skills.diamondSoul);
			
			case 13: addSkill(skills.toungeOfTheSunAndMoon);
			
			case 12:
			
			case 11:
			
			case 10: addSkill(skills.purityOfBody);
			
			case 9:
			
			case 8:
			
			case 7: addSkill(skills.evasion);
			addSkill(skills.stillnessOfMind);
			
			case 6: addSkill(skills.kiEmpoweredStrike);
			
			case 5:addSkill(skills.ExtraAttack);
			addSkill(skills.stunningStrike);
			
			case 4: addSkill(skills.slowFall);
			
			case 3: addSkill(skills.deflectMissile);
			
			case 2: addSkill(skills.unArmoredMovement, skills.ki);
			
			case 1: addSkill(skills.UnArmoredDefense, skills.martialArts);
			default: break;
			}
			
		
		}
	private void chooseArchetype() {
		
	}
	
	private void setProficiencies() {
		Character.addProficiency("Short Sword");
		Character.addProficiency("Simple Weapons");
	}
}
