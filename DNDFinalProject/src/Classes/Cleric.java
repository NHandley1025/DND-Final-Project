package Classes;

import Player.Character;
import Skills.skills;

public class Cleric extends Class {

	public Cleric(int Level, Character character) {
		super();
		setSkills(Level);
		setProficiencies(character);
		character.setHitDice("1d8");

	}

	public void setSkills(int level) {
		improveAbilityScore(level);
		setProficiencyByLevel(level);
		switch (level) {
		case 20:addSkill(skills.DivineInterventionImprovement);
		case 19:
		case 18:addSkill(skills.ChannelDivinity);
		case 17:addSkill(skills.DestroyUndeadCR4);
			skills.chooseDivineDomainFeature();

		case 16:
		case 15:
		case 14:addSkill(skills.DestroyUndeadCR3);
		case 13:
		case 12:
		case 11:addSkill(skills.DestroyUndeadCR2);
		case 10:addSkill(skills.DivineIntervention);
		case 9:
		case 8:
			addSkill(skills.DestroyUndeadCR1);
			skills.AbilityScoreImprovement();
		case 7:
		case 6:
			addSkill(skills.ChannelDivinity);
			skills.chooseDivineDomainFeature();
		case 5:
			addSkill(skills.DestroyUndeadCR0);
		case 4:
		case 3:
		case 2:
			addSkill(skills.ChannelDivinity);
		case 1:
			addSkill(skills.SpellCasting, skills.DivineDomain);
		default:
			break;
		}
	}

	private void setProficiencies(Character character) {
		character.addProficiency("Light Armor");
		character.addProficiency("Medium Armor");
		character.addProficiency("Shields");
		character.addProficiency("Simple Weapons");
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
