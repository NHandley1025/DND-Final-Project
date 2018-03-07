package Classes;

import Player.Character;
import Skills.Skill;
import Skills.skills;

public class Monk extends Class{
	byte ki = 0;

	public Monk() {
		Character.setHitDice("1d8");
		setSkills(Character.getLevel());
	}
	
	public void setSkills(int level) {
		if (level > 3 && getArchetype() == null) {
			chooseArchetype();
		}
			if(level > 1) {
				ki = (byte)level;
			}
		
			switch (level) {
			case 20: addSkill(skills.perfectSelf);
			
			case 19: skills.AbilityScoreImprovement();
			
			case 18: addSkill(skills.emptyBody);
			
			case 17:
			
			case 16: skills.AbilityScoreImprovement();
			
			case 15: addSkill(skills.timelessBody);
			
			case 14: addSkill(skills.diamondSoul);
			
			case 13: addSkill(skills.toungeOfTheSunAndMoon);
			
			case 12: skills.AbilityScoreImprovement();
			
			case 11:
			
			case 10: addSkill(skills.purityOfBody);
			
			case 9:
			
			case 8: skills.AbilityScoreImprovement();
			
			case 7: addSkill(skills.evasion);
			addSkill(skills.stillnessOfMind);
			
			case 6: addSkill(skills.kiEmpoweredStrike);
			
			case 5:addSkill(skills.extraAttack);
			addSkill(skills.stunningStrike);
			
			case 4: addSkill(skills.slowFall);
			skills.AbilityScoreImprovement();
			
			case 3: addSkill(skills.deflectMissile);
			
			case 2: addSkill(skills.unArmoredMovement);
			
			case 1: addSkill(skills.UnArmoredDefense);
					addSkill(skills.martialArts);
			default: break;
			}
			
		
		}
	private void chooseArchetype() {
		
	}
}
