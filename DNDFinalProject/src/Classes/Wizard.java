package Classes;

import Player.Character;
import Skills.skills;

public class Wizard extends Class{

	private static String ArcaneTradition;
	
	public Wizard() {
		super();
		setSkills(Character.getLevel());
		setProficiencies();
		Character.setHitDice("1d6");
	}

	public void setSkills(int level) {
		setProficiencyByLevel(level);
		improveAbilityScore(level);
		switch (level) {
		case 20:addSkill(skills.SignatureSpell);
		case 19:
		case 18:addSkill(skills.SpellMastery);
		case 17:
			skills.chooseDivineDomainFeature();
		case 16:
		case 15:
		case 14:
			//Arcane Tradition Feature
		case 13:
		case 12:
			skills.AbilityScoreImprovement();
		case 11:
		case 10:
			//Arcane Tradition Feature
		case 9:
		case 8:
		case 7:
		case 6:
			//Arcane Tradition Feature
			skills.chooseDivineDomainFeature();
		case 5:
		case 4:
		case 3:
		case 2:
			//Arcane Tradition
			skills.chooseDivineDomainFeature();
		case 1:
			addSkill(skills.SpellCasting, skills.ArcaneRecovery);
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
	
	public static void setArcaneTradition(String tradition){
		ArcaneTradition = tradition;
	}
	
}
