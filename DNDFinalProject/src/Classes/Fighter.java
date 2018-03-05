package Classes;

import Player.Character;
import Skills.Skill;

public class Fighter extends Class{
	
	public monk() {
		setSkills(Character.getLevel());
	}
	
	public void setSkills(int level) {
		if (level > 3 && getArchetype() == null) {
			chooseArchetype();
		}
		
		switch (level) {
		case 1: ;
		
		case 2: ;
		
		case 3: ;
		
		case 4: ;
		
		case 5: ;
		
		case 6: ;
		
		case 7: ;
		
		case 8: ;
		
		case 9: ;
		
		case 10:;
		
		case 11:;
		
		case 12:;
		
		case 13:;
		
		case 14:;
		
		case 15:;
		
		case 16:;
		
		case 17:;
		
		case 18:;
		
		case 19:;
		
		case 20:;
		
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
