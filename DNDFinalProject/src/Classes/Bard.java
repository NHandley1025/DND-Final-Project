package Classes;

import Player.Character;
import Skills.Skill;
import Skills.skills;

public class Bard extends Class {

	public Bard() {
		setSkills(Character.getLevel());
		Character.setHitDice("1d12");
	}
	
	public void setSkills(int level) {
		if (level > 3 && getArchetype() == null) {
			chooseArchetype();
		}
		switch (level) {
		case 1:
			addSkill(skills.SpellCasting);
			addSkill(skills.bardicInspiration);

		case 2:
			addSkill(skills.jackOfAllTrades);
			addSkill(skills.songOfRest);

		case 3:
			addSkill(skills.bardCollege);
			addSkill(skills.expertise);

		case 4: // ability score improvement

		case 5:
			addSkill(skills.bardicInspiration);
			addSkill(skills.fontOfInspiration);

		case 6:
			addSkill(skills.bardCollegeFeature);
			addSkill(skills.counterCharm);

		case 7:
			;

		case 8: // ability score improvement;

		case 9:
			addSkill(skills.songOfRest);

		case 10:
			addSkill(skills.bardicInspiration);
			addSkill(skills.magicalSecrets);
			addSkill(skills.expertise);

		case 11:
			;

		case 12: // ability score improvement

		case 13:
			addSkill(skills.songOfRest);

		case 14:
			addSkill(skills.magicalSecrets);
			addSkill(skills.bardCollegeFeature);

		case 15:
			addSkill(skills.bardicInspiration);

		case 16: // ability score improvement

		case 17:
			addSkill(skills.songOfRest);

		case 18:
			addSkill(skills.magicalSecrets);

		case 19: // ability score improvement

		case 20:
			addSkill(skills.superiorInspiration);
		}

	}

	private void addSkill(Skill... skills) {
		for (Skill skill : skills)
			if (!classSkills.contains(skill)) {
				classSkills.add(skill);
			}
	}

	private void chooseArchetype() {

	}
}
