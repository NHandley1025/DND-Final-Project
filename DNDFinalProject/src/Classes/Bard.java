package Classes;

import Player.Character;
import Skills.Skill;
import Skills.skills;

public class Bard extends Class {

	public Bard() {
		setSkills(Character.getLevel());
		Character.setHitDice("1d8");
	}
	
	public void setSkills(int level) {
		if (level > 3 && getArchetype() == null) {
			chooseArchetype();
		}
		switch (level) {
		case 20: addSkill(skills.superiorInspiration);
		
		case 19: skills.AbilityScoreImprovement();
			
		case 18: addSkill(skills.magicalSecrets);
		
		case 17: addSkill(skills.songOfRest);
		
		case 16: skills.AbilityScoreImprovement();
			
		case 15: addSkill(skills.bardicInspiration);
		
		case 14: addSkill(skills.magicalSecrets);
				 addSkill(skills.bardCollegeFeature);
		
		case 13: addSkill(skills.songOfRest);
		
		case 12: skills.AbilityScoreImprovement();
			
		case 11: ;
		
		case 10: addSkill(skills.bardicInspiration);
		 addSkill(skills.magicalSecrets);
		 addSkill(skills.expertise);
		 
		case 9: addSkill(skills.songOfRest);
		 
		case 8: skills.AbilityScoreImprovement();
			
		case 7: ;
		
		case 6: addSkill(skills.bardCollegeFeature);
		addSkill(skills.counterCharm);
		
		case 5: addSkill(skills.bardicInspiration);
		addSkill(skills.fontOfInspiration);
		
		case 4: skills.AbilityScoreImprovement();
			
		case 3: addSkill(skills.bardCollege);
		addSkill(skills.expertise);
		
		case 2: addSkill(skills.jackOfAllTrades);
		addSkill(skills.songOfRest);
		
		case 1: addSkill(skills.SpellCasting);
		addSkill(skills.bardicInspiration);
		}

	}

	private void chooseArchetype() {

	}
}
