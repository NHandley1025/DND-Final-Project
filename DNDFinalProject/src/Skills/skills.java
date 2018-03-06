package Skills;

public class skills {
	
	
	public static final Skill DarkVision = new Skill("DarkVision", "You can see in dim light within 60 feet of you as if it were bright light, and in Darkness as if it were dim light. You can't discern color in Darkness, only shades of gray.");
	public static final Skill spellcasting = new Skill("Spell Casting", "");                
	               
	               
	//Half-Orc     
	public static final Skill Menacing = new Skill("Menacing", "You gain proficiency in the Intimidation skill");
	public static final Skill RelentlessEndurance = new Skill("Relentless Endurance", "When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can't use this featrue again until you finish a Long Rest.");
	public static final Skill SavageAttacks = new Skill("Savage Attacks", "When you score a critical hit with a melee weapon attack, you can roll one of the weapon's damage dice one additional time and add it to the extra damage of the critical hit.");
                   
	               
	               
	//Dwarf        
	public static final Skill DwarvenResilience = new Skill("Dwarven Resilience", "You have advantage on saving throws against poison, and you have resistance against poison damage.");
	public static final Skill DwarvenCombatTraining = new Skill("Dwarven Combat Training", "You have proficiency with the battleaxe, handaxe, and warhammer.");
	public static final Skill ToolProficiency = new Skill("Tool Proficiency", "You gain proficiency with the artisan's tools of your choice: smith's tools, brewer's supplies, or mason's tools");
	public static final Skill Stonecunning = new Skill ("Stonecunning", "Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficienct in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus");
	              
	
	
	
	//Elf         
	public static final Skill KeenSenses = new Skill("Keen Senses", "You have proficiency in the Perception skill");
	public static final Skill FeyAncestry = new Skill("Fey Ancestry", "You eave advantages on saving throws against being charmed, and magic can't put you to sleep");
	public static final Skill Trance = new Skill("Trance", "Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is “trance.”) While meditating, you can dream after a fashion; such dreams are actually mental exercises that have become reflexive through years of practice. After Resting in this way, you gain the same benefit that a human does from 8 hours of sleep.");
	
	
	
	//Halfling
	public static final Skill Lucky = new Skill("Lucky", "When you roll a 1 on the d20 for an Attack roll, ability check, or saving throw, you can reroll the die and must use the new roll.");
	public static final Skill Brave = new Skill("Brave", "You have advantage on saving throws against being Frightened.");
	public static final Skill HalflingNimbleness = new Skill("Halfling Nimbleness", "You have advantage on saving throws against being Frightened.");
	              
	              
	              
	              
	//Dragonborn  
	//Do we allow final the user to choose their ancestry?
	public static final Skill DraconicAncestry = new Skill("Draconic Ancestry", "You have draconic ancestry. Choose one type of dragon from the Draconic Ancestry table. Your breath weapon and damage Resistance are determined by the dragon type, as shown in the table.");
	public static final Skill BreathWeapon = new Skill("Breath Weapon", "You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation.");
	public static final Skill DamageResistance = new Skill("Damage Resistance", "You have Resistance to the damage type associated with your draconic ancestry.");
	              
	              
	              
	//Gnome       
	public static final Skill GnomeCunning = new Skill("Gnome Cunning", "You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic.");
	              
	              
	//Half-Elf    
	public static final Skill FeyAnncestry = new Skill("Fey Anncestry", "You have advantage on saving throws against being Charmed, and magic can’t put you to sleep.");
	public static final Skill SkillVersatality = new Skill("Skill Versatility", "You gain proficiency in two skills of your choice.");
	
	
	
	
	//Tiefling
	public static final Skill HellishResistance = new Skill("Hellish Resistance", "You have Resistance to fire damage.");
	public static final Skill InfernalLegacy = new Skill("Infernal Legacy", "You know the Thaumaturgy cantrip. When you reach 3rd level, you can cast the Hellish Rebuke spell as a 2nd-level spell once with this trait and regain the ability to do so when you finish a Long Rest. When you reach 5th level, you can cast the Darkness spell once with this trait and regain the ability to do so when you finish a Long Rest. Charisma is your spellcasting ability for these Spells");


	
	//bard
	public static final Skill superiorInspiration = new Skill("Superior Inspiration", "");
	public static final Skill bardicInspiration = new Skill("Bardic Inspiration", "");
	public static final Skill magicalSecrets = new Skill("Magical Secrets", "");
	public static final Skill songOfRest = new Skill("Song of Rest", "");
	public static final Skill bardCollegeFeature = new Skill("Bard College Feature", "");
	public static final Skill counterCharm = new Skill("Counter Charm", "");
	public static final Skill fontOfInspiration = new Skill("Font of Inspiration", "");
	public static final Skill jackOfAllTrades = new Skill("Jack of All Trades", "");
	public static final Skill expertise = new Skill("Expertise", "");
	public static final Skill bardCollege = new Skill("Bard College", "");

	
	//Cleric
	public static final Skill SpellCasting = new Skill("SpellCasting", "You can cast spells!");
	public static final Skill DivineDomain = new Skill("Divine Domain", "");
	public static final Skill ChannelDivinity = new Skill("Channel Divinity", "");
	public static final Skill DivineIntervention = new Skill("Divine Domain", "");
	public static final Skill DestroyUndeadCR0 = new Skill("Destroy Undead", "You can destroy undead with a CR of 1/2 or less!");
	public static final Skill DestroyUndeadCR1 = new Skill("Destroy Undead", "You can destroy undead with a CR of 1/2 or less!");
	public static final Skill DestroyUndeadCR2 = new Skill("Destroy Undead", "You can destroy undead with a CR of 1/2 or less!");
	public static final Skill DestroyUndeadCR3 = new Skill("Destroy Undead", "You can destroy undead with a CR of 1/2 or less!");
	public static final Skill DestroyUndeadCR4 = new Skill("Destroy Undead", "You can destroy undead with a CR of 1/2 or less!");
	public static final Skill DivineInterventionImprovement = new Skill("Divine Intervention", "");
	public static void chooseDivineDomainFeature() {
		
	}
	
	// All classes
	
	public static void AbilityScoreImprovement() {
		
	}
	
	//Monk
	public static final Skill unarmoredDefense = new Skill("Unarmored Defense", "");
	public static final Skill martialArts = new Skill("Martial Arts", "");
	public static final Skill ki = new Skill("Martial Arts", "");
	public static final Skill monasticTradition = new Skill("Monastic Tradition", "");
	public static final Skill deflectMissile = new Skill("Deflect Missile", "");
	public static final Skill slowFall = new Skill("Slow Fall", "");
	public static final Skill extraAttack = new Skill("Extra Attack", "");
	public static final Skill stillnessOfMind = new Skill("Stillness of Mind", "");
	public static final Skill purityOfBody = new Skill("Purity of Body", "");
	public static final Skill toungeOfTheSunAndMoon = new Skill("Tounge of the Sun and Moon", "");
	public static final Skill diamondSoul = new Skill("Diamond Soul", "");
	public static final Skill timelessBody = new Skill("Timeless Body", "");
	public static final Skill emptyBody = new Skill("Empty Body", "");
	public static final Skill perfectSelf = new Skill("Perfect Self", "");
	
	//Paladin
	public static final Skill divineSence = new Skill("Divine Sense", "As an action you can open your senses to strong evil. Until the end of your next turn you know the location of any Celestial, fiend, or undead within 60 feet of you that is not behind total cover.");
	public static final Skill layOnHands = new Skill("Lay on Hands", "As an action you can touch a creature and restore a total number of hit points equal to your paladin level x 5");
	public static final Skill fightingStyle = new Skill("", "");
	public static final Skill spellCasting = new Skill("", "");
	public static final Skill divineSmite = new Skill("", "");
	public static final Skill divineHealth = new Skill("", "");
	public static final Skill sacredOath = new Skill("", "");
	public static final Skill extraAttack1 = new Skill("", "");
	public static final Skill sacredOathFeature = new Skill("", "");
	public static final Skill auraOfCourage = new Skill("", "");
	public static final Skill improvedDivineSmite = new Skill("", "");
	public static final Skill cleansingTouch = new Skill("", "");
	
	//Ranger
	public static final Skill favoredEnemy = new Skill("", "");
	public static final Skill naturalExplorer = new Skill("", "");
	//fightingStyle
	//spellCasting
	public static final Skill primevalAwareness = new Skill ("", "");
	//extraAttack
	public static final Skill landsStride = new Skill("", "");
	public static final Skill hideInPlainSight = new Skill("", "");
	public static final Skill vanish = new Skill("", "");
	public static final Skill feralSenses = new Skill("", "");
	public static final Skill foeSlayer = new Skill("", "");
	
	//Rogue
	public static final Skill sneakAttack = new Skill("", "");
	//public static final Skill expertise = new Skill("", "");
	public static final Skill thievesCant = new Skill("", "");
	public static final Skill cunningAction = new Skill("", "");
	public static final Skill uncannyDodge = new Skill("", "");
	public static final Skill evasion = new Skill("", "");
	public static final Skill reliableTalent = new Skill("", "");
	public static final Skill blindSense = new Skill("", "");
	public static final Skill slipperyMind = new Skill("", "");
	public static final Skill elusive = new Skill("", "");
	public static final Skill strokeOfLuck = new Skill("", "");
	
	//sorcerer
	public static final Skill sorcerousOrigin = new Skill("", "");
	public static final Skill fontOfMagic = new Skill("", "");
	public static final Skill metaMagic = new Skill("", "");
	public static final Skill sorcerousRestoration = new Skill("", "");
	public static final Skill sorcerousOriginFeature = new Skill("", "");
	
	//warlock
	public static final Skill otherWordly = new Skill("", "");
	public static final Skill pactMagic = new Skill ("", "");
	public static final Skill pactBoon = new Skill ("", "");
	public static final Skill mysticArcanum = new Skill ("", "");
	public static final Skill eldricthMaster = new Skill("", "");
	
	//Druid
	public static final Skill druidic = new Skill ("", "");
	//spell casting
	public static final Skill wildShape0 = new Skill ("", "");
	public static final Skill druidCircle0 = new Skill ("", "");
	public static final Skill wildShape1 = new Skill ("", "");
	public static final Skill druidCircleFeature = new Skill("", "");
	//timeless body
	public static final Skill beastSpells = new Skill("", "");
	public static final Skill archdruid = new Skill("", "");
	
	//fighter
	//Fighting Style
	public static final Skill secondWind = new Skill("", "");
	//Action surge
	//Extra attack
	//Indomitable
	
	
	//barbarian
	public static final Skill Rage = new Skill("", "");
	public static final Skill UnArmoredDefense = new Skill ("", "");
	public static final Skill RecklessAttack = new Skill("", "");
	public static final Skill DangerSense = new Skill ("", "");
	public static final Skill TotemWarrior1 = new Skill ("", "");
	public static final Skill Frenzy = new Skill ("", "");
	public static final Skill ExtraAttack = new Skill("", "");
	public static final Skill FastMovement = new Skill("", "");
	public static final Skill TotemWarrior2 = new Skill("", "");
	public static final Skill MindlessRage = new Skill("", "");
	public static final Skill FeralInstinct = new Skill("", "");
	public static final Skill BrutalCritical = new Skill ("", "");
	public static final Skill SpiritWalker = new Skill("", "");
	public static final Skill IntimidatingPresence = new Skill ("", "");
	public static final Skill PersistantRage = new Skill ("", "");
	public static final Skill TotemWarrior3 = new Skill ("", "");
	public static final Skill Retaliation = new Skill ("", "");
	public static final Skill IndomitableFight = new Skill ("", "");
	public static final Skill PrimalChampion = new Skill ("", "");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
