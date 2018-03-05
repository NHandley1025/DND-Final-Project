package Classes;

import Skills.Skill;
import Skills.skills;

public class Monk extends Class{

	public void setSkills(int level) {
		if (level > 3 && getArchetype() == null) {
			chooseArchetype();
		}
		
			switch (level) {
			case 1: addSkill(skills.UnArmoredDefense);
					addSkill(skills.martialArts);
			case 2: addSkill(skills.)
				
			case 3:
				
			case 4:
				
			case 5:
				
			case 6:
				
			case 7:
				
			case 8:
				
			case 9:
				
			case 10:
				
			case 11:
				
			case 12:
				
			case 13:
				
			case 14:
				
			case 15:
				
			case 16:
				
			case 17:
				
			case 18:
				
			case 19:
				
			case 20:
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
