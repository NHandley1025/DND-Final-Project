package Classes;

import Player.Character;
import Skills.skills;

public class Sorcerer extends Class{
	private static final long serialVersionUID = -8260577810407023006L;

	public Sorcerer(Character character) {
		character.setHitDice("1d6");
		setProficiencies(character);
		setSkills(character.getLevel());
		setName("Sorcerer");
	}
	
	public void setSkills(int level) {
		super.setProficiencyByLevel(level);
		super.improveAbilityScore(level);
		chooseArchetype();
		switch(level) {
		case 20:addSkill(skills.sorcerousRestoration);
		case 19:
		case 18:addSkill(skills.draconicPresence);
		case 17:
		case 16:
		case 15:
		case 14:addSkill(skills.dragonWings);
		case 13:
		case 12:
		case 11:
		case 10:
		case 9:
		case 8:
		case 7:
		case 6:addSkill(skills.draconicResiliance);
		case 5:
		case 4:
		case 3:addSkill(skills.metaMagic);
		case 2:addSkill(skills.fontOfMagic);
		case 1:addSkill(skills.SpellCasting);
		default: break;
		}
	}
	
	private void setProficiencies(Character character) {
		character.addProficiency("Daggers");
		character.addProficiency("Slings");
		character.addProficiency("Quarterstaffs");
		character.addProficiency("Light Crossbows");
	}
	
	private void chooseArchetype() {
		//ask what draconic bloodline does your sorcery come from
		//returns a String, would probably display from a dropdown option list
		String bloodline = "Red";
		Archetype a = null;
		switch(bloodline) {
		case "Red": a = Archetypes.red;
		break;
		case "Blue": a = Archetypes.blue;
		break;
		case "Black": a = Archetypes.black;
		break;
		case "Brass": a = Archetypes.brass;
		break;
		case "Bronze": a = Archetypes.bronze;
		break;
		case "Silver": a = Archetypes.silver;
		break;
		case "Gold": a = Archetypes.gold;
		break;
		case "Green": a = Archetypes.green;
		break;
		case "Copper": a = Archetypes.copper;
		break;
		case "White": a = Archetypes.white;
		break;
		}
		setArchetype(a);
	}
	
}
