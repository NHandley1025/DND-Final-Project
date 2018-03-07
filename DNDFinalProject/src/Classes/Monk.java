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
		
			switch (level) {
			case 1: addSkill(skills.UnArmoredDefense);
					addSkill(skills.martialArts);
					
			case 2: addSkill(skills.unArmoredMovement);
					ki = 2;
				
			case 3: addSkill(skills.deflectMissile);
					ki = 3;
				
			case 4: addSkill(skills.slowFall);
					skills.AbilityScoreImprovement();
					ki = 4;
				
			case 5:addSkill(skills.extraAttack);
					addSkill(skills.stunningStrike);
					ki = 5;
				
			case 6: addSkill(skills.kiEmpoweredStrike);
					ki = 6;
				
			case 7: addSkill(skills.evasion);
					addSkill(skills.stillnessOfMind);
					ki = 7;
				
			case 8: skills.AbilityScoreImprovement();
					ki = 8;
				
			case 9: ki = 9;;
				
			case 10: addSkill(skills.purityOfBody);
					 ki = 10;
				
			case 11: ki = 11;
				
			case 12: skills.AbilityScoreImprovement();
					 ki = 12;
				
			case 13: addSkill(skills.toungeOfTheSunAndMoon);
					 ki = 13;
				
			case 14: addSkill(skills.diamondSoul);
					 ki = 14;
				
			case 15: addSkill(skills.timelessBody);
					 ki = 15;
				
			case 16: skills.AbilityScoreImprovement();
					 ki = 16;
				
			case 17: ki = 17;
				
			case 18: addSkill(skills.emptyBody);
					 ki = 18;
				
			case 19: skills.AbilityScoreImprovement();
					 ki = 19;
				
			case 20: addSkill(skills.perfectSelf);
					 ki = 20;
			}
		
		}
		
		
	private void addSkill(Skill... skills) {
		for(Skill skill : skills)
			if(!classSkills.contains(skill)) {
				classSkills.add(skill);
			}
		}
	private void chooseArchetype() {
		
	}
	
}
