package Classes;

import Player.Character;
import Skills.skills;

public class Rogue extends Class{

	public Rogue(int level) {
		Character.setHitDice("1d8");
		setProficiencies();
	}
	//needs fixing
	public void setSkills(int level) {
		super.setProficiencyByLevel(level);
		super.improveAbilityScore(level);
		switch(level) {
		case 20:
		case 19:
		case 18:addSkill(skills.feralSenses);
		case 17:
		case 16:
		case 15://archetype feature
		case 14:addSkill(skills.vanish); //favoredEnemy improvement
		case 13:
		case 12:
		case 11://archetype feature
		case 10:addSkill(skills.hideInPlainSight); // naturalExplorer improvement
		case 9:
		case 8:addSkill(skills.landsStride);
		case 7://archetype feature
		case 6://favoredEnemy/naturalExplorer improvements
		case 5:addSkill(skills.uncannyDodge);
		case 4:
		case 3://choose archetype
		case 2:addSkill(skills.cunningAction);
		case 1:addSkill(skills.expertise, skills.sneakAttack, skills.thievesCant);
		default: break;
		}
	}
	
	private void setProficiencies() {
		Character.addProficiency("Light Armor");
		Character.addProficiency("Hand Crossbows");
		Character.addProficiency("Longswords");
		Character.addProficiency("Simple Weapons");
		Character.addProficiency("Rapiers");
		Character.addProficiency("Shortswords");
	}
	
	
	
}
