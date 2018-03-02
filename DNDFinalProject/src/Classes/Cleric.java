package Classes;

import Skills.Skill;
import Skills.skills;

public class Cleric extends Class {

	public Cleric() {
		super();

	}

	public void setSkills(int level) {
		if (level > 3 && getArchetype() == null) {
			chooseArchetype();
		}
		switch (level) {
		case 20:
			addSkill(skills.DivineInterventionImprovement);

		case 19:
			addSkill(skills.AbilityScoreImprovement);

		case 18:
			addSkill(skills.ChannelDivinity);

		case 17:
			addSkill(skills.DestroyUndead, skills.chooseDvineDomainFeature());

		case 16:
			addSkill(skills.AbilityScoreImprovement);

		case 15:

		case 14:
			archetypeCheck(skills.DestroyUndead);

		case 13:

		case 12:
			addSkill(skills.AbilityScoreImprovement);

		case 11:
			addSkill(skills.DestroyUndead);

		case 10:
			archetypeCheck(skills.DivineIntervention);

		case 9:

		case 8:
			addSkill(skills.AbilityScoreImprovement, skills.DestroyUndead);

		case 7:

		case 6:
			addSkill(skills.ChannelDivinity, skills.chooseDivineDomainFeature());

		case 5:
			addSkill(skills.DestroyUndead);

		case 4:
			addSkill(skills.AbilityScoreImprovement);

		case 3:

		case 2:
			addSkill(skills.ChannelDivinity, skills.chooseDivineDomainFeature());

		case 1:
			addSkill(skills.SpellCasting, skills.DivineDomain);
		default:
			break;
		}
	}

	private void addSkill(Skill... skills) {
		for (Skill skill : skills)
			if (!classSkills.contains(skill)) {
				classSkills.add(skill);
			}
	}

	private void setProficiencies() {
		
	}
	
}

// private void archetypeCheck(Skill totemWarrior, Skill beserker) {
// addSkill((getArchetype().getName() == "Path of the Totem Warrior") ?
// totemWarrior : beserker);
// }
//
// private void chooseArchetype() {
// //use menu or popup to choose archetype (currently, always set to beserker)
// Archetype archetype = new Archetype("Path of the Beserker");
// //set that archetype
// setArchetype(archetype);
// }
