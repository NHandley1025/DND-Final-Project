package Classes;

import Player.Character;
import Skills.skills;

public class Wizard extends Class{
	
	public Wizard(int level) {
		super();
		setSkills(level);
		setProficiencies();
		Character.setHitDice("1d6");
		//currently there is only one official archetype or archane tradition for wizard, so it's always set to the School of Evocation
		if(level >= 2) {
			setArchetype(Archetypes.evocation);
		}
	}

	public void setSkills(int level) {
		setProficiencyByLevel(level);
		improveAbilityScore(level);
		switch (level) {
		case 20:addSkill(skills.signatureSpells);
		case 19:
		case 18:addSkill(skills.spellMastery);
		case 17:
		case 16:
		case 15:
		case 14:
			addSkill(skills.overchannel);
		case 13:
		case 12:
		case 11:
		case 10:
			addSkill(skills.empoweredEvocation);
		case 9:
		case 8:
		case 7:
		case 6:
			addSkill(skills.potentCantrip);
		case 5:
		case 4:
		case 3:
		case 2:
			addSkill(skills.evocationSavant, skills.sculptSpells);
		case 1:
			addSkill(skills.SpellCasting, skills.arcaneRecovery);
		default:
			break;
		}
	}

	private void setProficiencies() {
		Character.addProficiency("Daggers");
		Character.addProficiency("Darts");
		Character.addProficiency("Quarterstaffs");
		Character.addProficiency("Light Crossbows");
	}
	
}
