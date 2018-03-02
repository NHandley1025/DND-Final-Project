package Classes;

import Skills.Skill;
import Skills.skills;
import Player.Character;

public class Cleric extends Class {

	public Cleric() {
		super();

	}

	public void setSkills(int level) {
		if (level > 3 && getArchetype() == null) {
			chooseArchetype();
		}
		switch (level) {
		case 20:addSkill(skills.DivineInterventionImprovement);
			setProficiencyBonus(6);
		case 19:addSkill(skills.AbilityScoreImprovement);
			setProficiencyBonus(6);
		case 18:addSkill(skills.ChannelDivinity);
			setProficiencyBonus(6);
		case 17:addSkill(skills.DestroyUndead, skills.chooseDvineDomainFeature());
			setProficiencyBonus(6);
		case 16:addSkill(skills.AbilityScoreImprovement);
			setProficiencyBonus(5);
		case 15:
			setProficiencyBonus(5);
		case 14:addSkill(skills.DestroyUndead);
			setProficiencyBonus(5);
		case 13:
			setProficiencyBonus(5);
		case 12:addSkill(skills.AbilityScoreImprovement);
			setProficiencyBonus(4);
		case 11:addSkill(skills.DestroyUndead);
			setProficiencyBonus(4);
		case 10:addSkill(skills.DivineIntervention);
			setProficiencyBonus(4);
		case 9:
			setProficiencyBonus(4);
		case 8:
			addSkill(skills.AbilityScoreImprovement, skills.DestroyUndead);
			setProficiencyBonus(3);
		case 7:
			setProficiencyBonus(3);
		case 6:
			addSkill(skills.ChannelDivinity, skills.chooseDivineDomainFeature());
			setProficiencyBonus(3);
		case 5:
			addSkill(skills.DestroyUndead);
			setProficiencyBonus(3);
		case 4:
			addSkill(skills.AbilityScoreImprovement);
			setProficiencyBonus(2);
		case 3:
			setProficiencyBonus(2);
		case 2:
			addSkill(skills.ChannelDivinity, skills.chooseDivineDomainFeature());
			setProficiencyBonus(2);
		case 1:
			addSkill(skills.SpellCasting, skills.DivineDomain);
			setProficiencyBonus(2);
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
		Character.addProficiency("Light Armor");
		Character.addProficiency("Medium Armor");
		Character.addProficiency("Shields");
		Character.addProficiency("Simple Weapons");
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
