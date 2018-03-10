package Classes;

import Player.Character;
import Skills.skills;

public class Druid extends Class{

	public Druid(int level) {
		Character.setHitDice("1d8");
		setProficiencies();
		setSkills(Character.getLevel());
	}
	
	public void setSkills(int level) {
		super.setProficiencyByLevel(level);
		super.improveAbilityScore(level);
		switch(level) {
		case 20:addSkill(skills.archdruid);
		case 19:
		case 18:addSkill(skills.timelessBody, skills.beastSpells);
		case 17:
		case 16:
		case 15:
		case 14:addSkill(skills.druidCircle3);
		case 13:
		case 12:
		case 11:
		case 10:addSkill(skills.druidCircle2);
		case 9:
		case 8:addSkill(skills.wildShape2);
		case 7:
		case 6:addSkill(skills.druidCircle1);
		case 5:
		case 4:addSkill(skills.wildShape1);
		case 3:
		case 2:addSkill(skills.wildShape0, skills.druidCircle0);
		case 1:addSkill(skills.druidic, skills.SpellCasting);
		default: break;
		}
	}
	
	private void setProficiencies() {
		String[] weapons = {"Clubs", "Daggers", "Darts", "Javelins", 
				"Maces", "Quarterstaffs", "Scimitars", "Sickles", "Slings", "Spears"};
		Character.addProficiency("Light Armor(Cannot be made of metal)");
		Character.addProficiency("Medium Armor(Cannot be made of metal)");
		Character.addProficiency("Shields(Cannot be made of metal)");
		for(String weapon: weapons) {
			Character.addProficiency(weapon);
		}
	}
	
}
