package Classes;

import Skills.Skill;
import Skills.skills;
import Player.Character;

public class Cleric extends Class {

	public Cleric(int Level) {
		super();
		setSkills(Level);
		setProficiencies();
		Character.setHitDice("1d8");

	}

	public void setSkills(int level) {
		switch (level) {
		case 20:addSkill(skills.DivineInterventionImprovement);
			setProficiencyBonus(6);
		case 19:
			skills.AbilityScoreImprovement();
			setProficiencyBonus(6);
		case 18:addSkill(skills.ChannelDivinity);
			setProficiencyBonus(6);
		case 17:addSkill(skills.DestroyUndeadCR4);
			skills.chooseDivineDomainFeature();
			setProficiencyBonus(6);
		case 16:
			skills.AbilityScoreImprovement();
			setProficiencyBonus(5);
		case 15:
			setProficiencyBonus(5);
		case 14:addSkill(skills.DestroyUndeadCR3);
			setProficiencyBonus(5);
		case 13:
			setProficiencyBonus(5);
		case 12:
			skills.AbilityScoreImprovement();
			setProficiencyBonus(4);
		case 11:addSkill(skills.DestroyUndeadCR2);
			setProficiencyBonus(4);
		case 10:addSkill(skills.DivineIntervention);
			setProficiencyBonus(4);
		case 9:
			setProficiencyBonus(4);
		case 8:
			addSkill(skills.DestroyUndeadCR1);
			skills.AbilityScoreImprovement();
			setProficiencyBonus(3);
		case 7:
			setProficiencyBonus(3);
		case 6:
			addSkill(skills.ChannelDivinity);
			skills.chooseDivineDomainFeature();
			setProficiencyBonus(3);
		case 5:
			addSkill(skills.DestroyUndeadCR0);
			setProficiencyBonus(3);
		case 4:
			skills.AbilityScoreImprovement();
			setProficiencyBonus(2);
		case 3:
			setProficiencyBonus(2);
		case 2:
			addSkill(skills.ChannelDivinity);
			skills.chooseDivineDomainFeature();
			setProficiencyBonus(2);
		case 1:
			addSkill(skills.SpellCasting, skills.DivineDomain);
			setProficiencyBonus(2);
		default:
			break;
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
