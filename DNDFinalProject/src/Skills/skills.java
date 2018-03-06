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
	public static final Skill martialArts = new Skill("Martial Arts", "Your practice of matrial arts gives you mastery of combat styles that use unarmed strikes and monk weapons");
	public static final Skill ki = new Skill("Ki", "You can spend Ki points to fuel various Ki features");
	public static final Skill unArmoredMovement  = new Skill("UnArmored Movement","Your speed increases by 10 feet while you are not wearing armor or wielding a shield");
	public static final Skill deflectMissile = new Skill("Deflect Missile", "You can use your reaction to deflect or catch the missile when you are hit by a ranged weapon attack. When you do so, the damage you take from the attack is reduced by 1d10 + your dexterity modifier");
	public static final Skill slowFall = new Skill("Slow Fall", "You can use your reaction when you fall to reduce any falling damage you take by an amount equal to five times your monk level");
	public static final Skill extraAttack1 = new Skill("Extra Attack", "You can attack twice, instead of once, whenever you take the Attack action on your turn");
	public static final Skill stunningStrike = new Skill("Stunning Strike", "You can interfere with the flow of ki in an opponent's body. When you hit another creature with a melee weapon attack, you can spend spend 1 Ki point ton attempt a stunning strike. The target must suceed on a Constitution saving throw or be stunned until the end of your next turn.");
	public static final Skill kiEmpoweredStrike = new Skill("Ki-empowered Strike", "Your unarmed strikes count as magical for the purpose of overcoming resistance and immunity to nonmagical attacks and damage");
	public static final Skill stillnessOfMind = new Skill("Stillness of Mind", "You can use your action to end one effect on yourself that is causing you to be charmed or frightened");
	public static final Skill purityOfBody = new Skill("Purity of Body", "Your mastery of Ki flowing through you makes you immune to disease and poison");
	public static final Skill toungeOfTheSunAndMoon = new Skill("Tounge of the Sun and Moon", "You learn to touch the Ki of other minds so that you understand all spoken languages. Moreover, any creature that can can understand a language can understand what you say");
	public static final Skill diamondSoul = new Skill("Diamond Soul", "Your mastery of Ki grants you proficiency in all saving throws. Aditionally, whenever you make a saving throw and fail, you can spend 1 ki point to reroll it and take the second result");
	public static final Skill timelessBody = new Skill("Timeless Body", "your Ki sustains you so that you suffer none 0of the frailty of old age, and you can't be aged magically. You can still die of old age, however. In addition, you no longer need food or water");
	public static final Skill emptyBody = new Skill("Empty Body", "You can use your action to spend 4 Ki points to become invisible for one minute.");
	public static final Skill perfectSelf = new Skill("Perfect Self", "When you roll for initiative and have no Ki points remaining, you regain 4 Ki points.");
	
	//Paladin
	public static final Skill divineSence = new Skill("Divine Sence", "As an action, you can open your awareness to detect such forces. Until the end of your awareness to detect such forces. Until the end of your next turn, you know the type (celestial, fiend, or undead) of any being whose presence you sense, but not its identity (the vampire Count Strahd von Zarovich, for instance). Within the same radius, you also detect the presence of any place or object that has been consecreated or desecrated, as with the hallow spell. You can use this feature a number of times equal to 1 + your Charisma modifier. When you finish a long rest, you regain all expended uses.");
	public static final Skill layOnHands = new Skill("Lay on Hands", "Your blessed touch can heal wounds. You have a pool of Healing power that replenishes when you take a Long Rest. With that pool, you can restore a total number of hit points equal to your paladin level x 5. As an action, you can touch a creature and draw power from the pool to restore a number of hit points to that creature, up to the maximum amount remaining in your pool. Alternatively, you can expend 5 hit points from your pool of Healing to cure the target of one disease or neutralize one poison affecting it. You can cure multiple Diseases and neutralize multiple Poisons with a single use of Lay on Hands, expending hit points separately for each one. This feature has no effect on Undead and constructs.");
	public static final Skill fightingStyle = new Skill("Fighting Style", "You adopt a style of fighting as your specialty. Choose one of the following options. You can’t take a Fighting Style option more than once, even if you later get to choose again.");
	public static final Skill divineSmite = new Skill("Divine Smite", "While you are wearing armor, you gain a +1 bonus to AC.");
	public static final Skill divineHealth = new Skill("Divine Health", "when you hit a creature with a melee weapon Attack, you can expend one spell slot to deal radiant damage to the target, in addition to the weapon's damage. The extra damage is 2d8 for a 1st-level spell slot, plus 1d8 for each Spell Level higher than 1st, to a maximum of 5d8. The damage increases by 1d8 if the target is an Undead or a fiend.");
	public static final Skill sacredOath = new Skill("Sacred Oath", "When you reach 3rd level, you swear the oath that binds you as a paladin forever. Up to this time you have been in a preparatory stage, committed to the path but not yet sworn to it. Now you choose an oath, such as the Oath of Devotion.");
	//public static final Skill extraAttack1 = new Skill("Extra Attack", "you can Attack twice, instead of once, whenever you take the Attack action on Your Turn.");
	public static final Skill sacredOathFeature = new Skill("Sacred Oath Feature", "");
	public static final Skill auraOfCourage = new Skill("Aura of Courage", "Starting at 10th level, you and friendly creatures within 10 feet of you can't be Frightened while you are conscious. At 18th level, the range of this aura increases to 30 feet.");
	public static final Skill improvedDivineSmite = new Skill("", "you are so suffused with righteous might that all your melee weapon strikes carry divine power with them. Whenever you hit a creature with a melee weapon, the creature takes an extra 1d8 radiant damage. If you also use your Divine Smite with an Attack, you add this damage to the extra damage of your Divine Smite.");
	public static final Skill cleansingTouch = new Skill("Cleansing Touch", "you can use your action to end one spell on yourself or on one willing creature that you touch. You can use this feature a number of times equal to your Charisma modifier (a minimum of once). You regain expended uses when you finish a Long Rest.");
	
	//Ranger
	public static final Skill favoredEnemy = new Skill("Favored Enemy", "Beginning at 1st level, you have significant experience studying, tracking, hunting, and even talking to a certain type of enemy. Choose a type of favored enemy: Aberrations, Beasts, Celestials, constructs, dragons, elementals, fey, Fiends, Giants, Monstrosities, oozes, Plants, or Undead. Alternatively, you can select two races of humanoid (such as Gnolls and orcs) as favored enemies. You have advantage on Wisdom (Survival) checks to track your favored enemies, as well as on Intelligence Checks to recall information about them. When you gain this feature, you also learn one Language of your choice that is spoken by your favored enemies, if they speak one at all.You choose one additional favored enemy, as well as an associated Language, at 6th and 14th level. As you gain levels, your choices should reflect the types of Monsters you have encountered on your adventures.");
	public static final Skill naturalExplorer = new Skill("Natural Explorer", "You are particularly familiar with one type of natural Environment and are adept at traveling and surviving in such regions. Choose one type of favored terrain: arctic, coast, desert, forest, grassland, mountain, swamp, or The Underdark. When you make an Intelligence or Wisdom check related to your favored terrain, your proficiency bonus is doubled if you are using a skill that you're proficient in. While traveling for an hour or more in your favored terrain, you gain the following benefits: Difficult terrain doesn't slow your group's travel. \"Your group can't become lost except by magical means. Even when you are engaged in another activity while traveling (such as foraging, navigating, or tracking), you remain alert to danger. If you are traveling alone, you can move stealthily at a normal pace. When you forage, you find twice as much food as you normally would. While tracking other creatures, you also learn their exact number, their sizes, and how long ago they passed through the area.");
	//fightingStyle
	//spellCasting
	public static final Skill primevalAwareness = new Skill ("Primeval Awareness", "Beginning at 3rd level, you can use your action and expend one ranger spell slot to focus your awareness on the region around you. For 1 minute per level of the spell slot you expend, you can sense whether the following types of creatures are present within 1 mile of you (or within up to 6 miles if you are in your favored terrain): Aberrations, Celestials, dragons, elementals, fey, Fiends, and Undead. This feature doesn't reveal the creatures' location or number.");
	//extraAttack
	public static final Skill landsStride = new Skill("Lands Stride", "moving through nonmagical difficult terrain costs you no extra Movement. You can also pass through nonmagical Plants without being slowed by them and without taking damage from them if they have thorns, spines, or a similar hazard. In addition, you have advantage on saving throws against Plants that are magically created or manipulated to impede Movement, such those created by the Entangle spell.");
	public static final Skill hideInPlainSight = new Skill("Hide in plain Sight", "Starting at 10th level, you can spend 1 minute creating camouflage for yourself. You must have access to fresh mud, dirt, Plants, soot, and other naturally occurring materials with which to create your camouflage. Once you are camouflaged in this way, you can try to hide by pressing yourself up against a solid surface, such as a tree or wall, that is at least as tall and wide as you are. You gain a +10 bonus to Dexterity (Stealth) checks as long as you remain there without moving or taking actions. Once you move or take an action or a reaction, you must camouflage yourself again to gain this benefit.");
	public static final Skill vanish = new Skill("Vanish", "Starting at 14th level, you can use the Hide action as a Bonus Action on Your Turn. Also, you can't be tracked by nonmagical means, unless you choose to leave a trail.");
	public static final Skill feralSenses = new Skill("Feral Senses", "you gain preternatural senses that help you fight creatures you can't see. When you Attack a creature you can't see, your inability to see it doesn't impose disadvantage on your Attack rolls against it. You are also aware of the location of any Invisible creature within 30 feet of you, provided that the creature isn't hidden from you and you aren't Blinded or Deafened.");
	public static final Skill foeSlayer = new Skill("Foe Slayer", "you become an unparalleled hunter of your enemies. Once on each of your turns, you can add your Wisdom modifier to the Attack roll or the damage roll of an Attack you make against one of your favored enemies. You can choose to use this feature before or after the roll, but before any effects of the roll are applied.");
	
	//Rogue
	public static final Skill sneakAttack = new Skill("Sneak Attack", "");
	//public static final Skill expertise = new Skill("", "");
	public static final Skill thievesCant = new Skill("Thieves Cant", "");
	public static final Skill cunningAction = new Skill("Cunning Action", "");
	public static final Skill uncannyDodge = new Skill("Uncanny Dodge", "");
	public static final Skill evasion = new Skill("Evasion", "");
	public static final Skill reliableTalent = new Skill("Relaible Talent", "");
	public static final Skill blindSense = new Skill("Blind Sense", "");
	public static final Skill slipperyMind = new Skill("Slippery Mind", "");
	public static final Skill elusive = new Skill("Elusive", "");
	public static final Skill strokeOfLuck = new Skill("Stroke of Luck", "");

	
	//sorcerer
	public static final Skill sorcerousOrigin = new Skill("Sorcerous Origin", "");
	public static final Skill fontOfMagic = new Skill("Font of Magic", "");
	public static final Skill metaMagic = new Skill("Meta Magic", "");
	public static final Skill sorcerousRestoration = new Skill("Sourcerous Restoration", "");
	public static final Skill sorcerousOriginFeature = new Skill("Sorcerous Origin Feature", "");
	
	//warlock
	public static final Skill otherWordly = new Skill("Other Worldly", "");
	public static final Skill pactMagic = new Skill ("Pact Magic", "");
	public static final Skill pactBoon = new Skill ("Pact Boon", "");
	public static final Skill mysticArcanum = new Skill ("Mystic Arcanum", "");
	public static final Skill eldricthMaster = new Skill("Eldritch Master", "");
	
	//Druid
	public static final Skill druidic = new Skill ("Druidic", "");
	//spell casting
	public static final Skill wildShape0 = new Skill ("Wild Shape", "You can shift into any animal you have seen, so long as it has no flying or swimming speed");
	public static final Skill wildShape1 = new Skill ("Wild Shape", "You can shift into any animal you have seen, so long as it has no flying speed");
	public static final Skill wildShape2 = new Skill("Wild Shape", "You can shift into any animal you have seen!");
	public static final Skill druidCircle0 = new Skill ("Druid Circle", "");
	public static final Skill druidCircleFeature = new Skill("Druid Circle Feature", "");
	//timeless body
	public static final Skill beastSpells = new Skill("Beast Spells", "");
	public static final Skill archdruid = new Skill("Archdruid", "");
	
	//fighter
	public static final Skill secondWind = new Skill("Second Wind", "");
	public static final Skill actionSurge1 = new Skill("Action Surge", "");
	public static final Skill actionSurge2 = new Skill("Action Surge", "");
	public static final Skill indomidable1 = new Skill("Indomidable", "");
	public static final Skill indomidable2 = new Skill("Indomidable", "");
	public static final Skill indomidable3 = new Skill("Indomidable", "");
	public static final Skill extraAttack2 = new Skill("Extra Attack", "");
	public static final Skill extraAttack3 = new Skill("Extra Attack", "");

	
	
	//barbarian
	public static final Skill Rage = new Skill("Rage", "");
	public static final Skill UnArmoredDefense = new Skill ("Unarmored Defense", "");
	public static final Skill RecklessAttack = new Skill("Reckless Attack", "");
	public static final Skill DangerSense = new Skill ("Danger Sense", "");
	public static final Skill TotemWarrior1 = new Skill ("Totem Warrior", "");
	public static final Skill Frenzy = new Skill ("Frenzy", "");
	public static final Skill ExtraAttack = new Skill("Extra Attack", "");
	public static final Skill FastMovement = new Skill("Fast Movement", "");
	public static final Skill TotemWarrior2 = new Skill("Totem Warrior", "");
	public static final Skill MindlessRage = new Skill("Mindless Rage", "");
	public static final Skill FeralInstinct = new Skill("Feral Instinct", "");
	public static final Skill BrutalCritical = new Skill ("Brutal Critical", "");
	public static final Skill SpiritWalker = new Skill("Spirit Walker", "");
	public static final Skill IntimidatingPresence = new Skill ("Intimidating Presence", "");
	public static final Skill PersistantRage = new Skill ("Persistant Rage", "");
	public static final Skill TotemWarrior3 = new Skill ("Totem Warrior", "");
	public static final Skill Retaliation = new Skill ("Retaliation", "");
	public static final Skill IndomitableFight = new Skill ("Indomidable Fight", "");
	public static final Skill PrimalChampion = new Skill ("Primal Champion", "");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
