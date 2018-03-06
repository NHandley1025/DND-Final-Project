package Classes;

import Player.Character;
import Skills.Skill;
import Skills.skills;

public class Fighter extends Class{
	
	public Fighter() {
		setSkills(Character.getLevel());
	}
	
	public void setSkills(int level) {
		if (level > 3 && getArchetype() == null) {
			chooseArchetype();
		}
		
		switch (level) {
		case 1: addSkill(skills.fightingStyle, skills.secondWind);
		
		case 2: addSkill(skills.actionSurge1);
		
		case 3: ;
		
		case 4: skills.AbilityScoreImprovement();
		
		case 5: addSkill(skills.extraAttack1);
		
		case 6: skills.AbilityScoreImprovement();
		
		case 7: ;
		
		case 8: skills.AbilityScoreImprovement();
		
		case 9: addSkill(skills.indomidable1);
		
		case 10: ;
		
		case 11: addSkill(skills.extraAttack2);
		
		case 12: skills.AbilityScoreImprovement();
		
		case 13: addSkill(skills.indomidable2);
		
		case 14: skills.AbilityScoreImprovement();
		
		case 15: ;
		
		case 16: skills.AbilityScoreImprovement();
		
		case 17: addSkill(skills.actionSurge2, skills.indomidable3);
		
		case 18: ;
		
		case 19: skills.AbilityScoreImprovement();;
		
		case 20: addSkill(skills.extraAttack3);
		
		}
		}
		
		
	private void chooseArchetype() {
			
		}
		


	private void addSkill(Skill... skills) {
		for(Skill skill : skills) {
			if(!classSkills.contains(skill)) {
				classSkills.add(skill);
			}
		}
	}

}
