package Classes;

import Player.Character;
import Skills.skills;

public class Ranger extends Class {
	private static final long serialVersionUID = 55557765231767598L;

	public Ranger() {
		super("Ranger");
	}
	
	public Ranger(Character character) {
		super("Ranger");
		character.setHitDice("1d10");
		setProficiencies(character);
		setSkills(character.getLevel());
	}

	public void setSkills(int level) {
		super.setProficiencyByLevel(level);
		super.improveAbilityScore(level);
		switch(level) {
		case 20:addSkill(skills.foeSlayer);
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
		case 5:addSkill(skills.ExtraAttack);
		case 4:
		case 3:addSkill(skills.primevalAwareness); //choose archetype
		case 2:addSkill(skills.fightingStyle, skills.SpellCasting);
		case 1:addSkill(skills.favoredEnemy, skills.naturalExplorer);
		default: break;
		}
	}
	
	private void setProficiencies(Character character) {
		character.addProficiency("Light Armor");
		character.addProficiency("Medium Armor");
		character.addProficiency("Shields");
		character.addProficiency("Simple Weapons");
		character.addProficiency("Martial Weapons");
	}
}
