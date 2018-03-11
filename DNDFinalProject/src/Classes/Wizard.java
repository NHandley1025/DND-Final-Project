package Classes;

import Player.Character;
import Skills.skills;

public class Wizard extends Class{

	private static String ArcaneTradition;
	
	public Wizard(int level) {
		super();
		setSkills(level);
		setProficiencies();
		Character.setHitDice("1d6");
	}

	public void setSkills(int level) {
		switch (level) {
		case 20:addSkill(skills.SignatureSpell);
			setProficiencyBonus(6);
		case 19:
			skills.AbilityScoreImprovement();
			setProficiencyBonus(6);
		case 18:addSkill(skills.SpellMastery);
			setProficiencyBonus(6);
		case 17:
			skills.chooseDivineDomainFeature();
			setProficiencyBonus(6);
		case 16:
			skills.AbilityScoreImprovement();
			setProficiencyBonus(5);
		case 15:
			setProficiencyBonus(5);
		case 14:
			//Arcane Tradition Feature
			setProficiencyBonus(5);
		case 13:
			setProficiencyBonus(5);
		case 12:
			skills.AbilityScoreImprovement();
			setProficiencyBonus(4);
		case 11:
			setProficiencyBonus(4);
		case 10:
			//Arcane Tradition Feature
			setProficiencyBonus(4);
		case 9:
			setProficiencyBonus(4);
		case 8:
			skills.AbilityScoreImprovement();
			setProficiencyBonus(3);
		case 7:
			setProficiencyBonus(3);
		case 6:
			//Arcane Tradition Feature
			skills.chooseDivineDomainFeature();
			setProficiencyBonus(3);
		case 5:
			setProficiencyBonus(3);
		case 4:
			skills.AbilityScoreImprovement();
			setProficiencyBonus(2);
		case 3:
			setProficiencyBonus(2);
		case 2:
			//Arcane Tradition
			skills.chooseDivineDomainFeature();
			setProficiencyBonus(2);
		case 1:
			addSkill(skills.SpellCasting, skills.ArcaneRecovery);
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
	
	public static void setArcaneTradition(String tradition){
		ArcaneTradition = tradition;
	}
	
}
