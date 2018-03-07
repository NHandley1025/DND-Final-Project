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
	public static final Skill foeSlayer = new Skill("Foe Slayer", "");
	
	//Rogue
	public static final Skill sneakAttack = new Skill("Sneak Attack", "you know how to strike subtly and exploit a foe's distraction. Once per turn, you can deal an extra 1d6 damage to one creature you hit with an Attack if you have advantage on the Attack roll. The Attack must use a Finesse or a ranged weapon. You don't need advantage on the Attack roll if another enemy of the target is within 5 feet of it, that enemy isn't Incapacitated, and you don't have disadvantage on the Attack roll. The amount of the extra damage increases as you gain levels in this class, as shown in the Sneak Attack column of the Rogue table.");
	//public static final Skill expertise = new Skill("", "");
	public static final Skill thievesCant = new Skill("Thieves Cant", "During your rogue Training you learned thieves' cant, a secret mix of dialect, jargon, and code that allows you to hide messages in seemingly normal conversation. Only another creature that knows thieves' cant understands such messages. It takes four times longer to convey such a Message than it does to speak the same idea plainly. In addition, you understand a set of secret signs and symbols used to convey short, simple messages, such as whether an area is dangerous or the territory of a thieves' guild, whether loot is nearby, or whether the people in an area are easy marks or will provide a safe house for thieves on the run.\r\n");
	public static final Skill cunningAction = new Skill("Cunning Action", "your quick thinking and agility allow you to move and act quickly. You can take a Bonus Action on each of your turns in Combat. This action can be used only to take the Dash, Disengage, or Hide action.");
	public static final Skill uncannyDodge = new Skill("Uncanny Dodge", "When an attacker that you can see hits you with an Attack, you can use your reaction to halve the attack's damage against you.");
	public static final Skill evasion = new Skill("Evasion", "You can nimbly dodge out of the way of certain area effects, such as a red dragon's fiery breath or an Ice Storm spell. When you are subjected to an effect that allows you to make a Dexterity saving throw to take only half damage, you instead take no damage if you succeed on the saving throw, and only half damage if you fail.");
	public static final Skill reliableTalent = new Skill("Reliable Talent", "you have refined your chosen skills until they approach perfection. Whenever you make an ability check that lets you add your proficiency bonus, you can treat a d20 roll of 9 or lower as a 10.");
	public static final Skill blindSense = new Skill("Blind Sense", "If you are able to hear, you are aware of the location of any hidden or Invisible creature within 10 feet of you.");
	public static final Skill slipperyMind = new Skill("Slippery Mind", "You have acquired greater mental Strength. You gain proficiency in Wisdom saving throws.");
	public static final Skill elusive = new Skill("Elusive", "You are so evasive that attackers rarely gain the upper hand against you. No Attack roll has advantage against you while you aren't Incapacitated.");
	public static final Skill strokeOfLuck = new Skill("Stroke of Luck", "you have an uncanny knack for succeeding when you need to. If your Attack misses a target within range, you can turn the miss into a hit. Alternatively, if you fail an ability check, you can treat the d20 roll as a 20.Once you use this feature, you can't use it again until you finish a short or Long Rest.");

	
	//sorcerer
	public static final Skill sorcerousOrigin = new Skill("Sorcerous Origin", "Choose a sorcerous origin, which describes the source of your innate magical power, such as Draconic Bloodline. Your choice grants you features when you choose it at 1st level and again at 6th, 14th, and 18th level.");
	public static final Skill fontOfMagic = new Skill("Font of Magic", "You tap into a deep wellspring of magic within yourself. This wellspring is represented by sorcery points, which allow you to create a variety of magical effects.");
	public static final Skill metaMagic = new Skill("Meta Magic", "you gain the ability to twist your Spells to suit your needs. You gain two of the following Metamagic options of your choice. You gain another one at 10th and 17th level. You can use only one Metamagic option on a spell when you cast it, unless otherwise noted.");
	public static final Skill sorcerousRestoration = new Skill("Sourcerous Restoration", "You regain 4 expended sorcery points whenever you finish a Short Rest.");
	
	//warlock
	public static final Skill otherWordly = new Skill("Other Worldly", " you have struck a bargain with an otherworldly being of your choice, such as the Fiend. Your choice grants you features at 1st level and again at 6th, 10th, and 14th level.");
	public static final Skill pactMagic = new Skill ("Pact Magic", "Your arcane research and the magic bestowed on you by your patron have given you facility with Spells.");
	public static final Skill pactBoon = new Skill ("Pact Boon", "Your otherworldly patron bestows a gift upon you for your loyal service. You gain one of the following features of your choice.");
	public static final Skill mysticArcanum = new Skill ("Mystic Arcanum", " your patron bestows upon you a magical secret called an arcanum. Choose one 6th-level spell from the warlock spell list as this arcanum. You can cast your arcanum spell once without expending a spell slot. You must finish a ");
	public static final Skill eldricthMaster = new Skill("Eldritch Master", "You can draw on your inner reserve of mystical power while entreating your patron to regain expended Spell Slots. You can spend 1 minute entreating your patron for aid to regain all your expended Spell Slots from your Pact Magic feature. Once you regain Spell Slots with this feature, you must finish a Long Rest before you can do so again.");
	
	//Druid
	public static final Skill druidic = new Skill ("Druidic", "You know Druidic, the secret Language of druids. You can speak the Language and use it to leave hidden messages. You and others who know this Language automatically spot such a Message. Others spot the message's presence with a successful DC 15 Wisdom (Perception) check but can't decipher it without magic.");
	//spell casting
	public static final Skill wildShape0 = new Skill ("Wild Shape", "You can shift into any animal you have seen, so long as it has no flying or swimming speed");
	public static final Skill wildShape1 = new Skill ("Wild Shape", "You can shift into any animal you have seen, so long as it has no flying speed");
	public static final Skill wildShape2 = new Skill("Wild Shape", "You can shift into any animal you have seen!");
	public static final Skill druidCircle0 = new Skill ("Druid Circle", "you choose to Identify with a circle of druids, such as the Circle of the Land. Your choice grants you features at 2nd level and again at 6th, 10th, and 14th level.");
	//timeless body
	public static final Skill beastSpells = new Skill("Beast Spells", "you can cast many of your druid Spells in any shape you assume using Wild Shape. You can perform the somatic and verbal Components of a druid spell while in a beast shape, but you aren't able to provide material Components.");
	public static final Skill archdruid = new Skill("Archdruid", "you can use your Wild Shape an unlimited number of times. Additionally, you can ignore the verbal and somatic Components of your druid Spells, as well as any material Components that lack a cost and aren't consumed by a spell. You gain this benefit in both your normal shape and your beast shape from Wild Shape.");
	
	//fighter
	public static final Skill secondWind = new Skill("Second Wind", "You have a limited well of stamina that you can draw on to protect yourself from harm. On Your Turn, you can use a Bonus Action to regain hit points equal to 1d10 + your fighter level. Once you use this feature, you must finish a short or Long Rest before you can use it again.");
	public static final Skill actionSurge1 = new Skill("Action Surge", "You can push yourself beyond your normal limits for a moment. On Your Turn, you can take one additional action on top of your regular action and a possible Bonus Action. Once you use this feature, you must finish a short or Long Rest before you can use it again.");
	public static final Skill actionSurge2 = new Skill("Action Surge", "You can push yourself beyond your normal limits for a moment. You can use it twice before a rest, but only once on the same turn.");
	public static final Skill indomidable1 = new Skill("Indomidable", "you can reroll a saving throw that you fail. If you do so, you must use the new roll, and you can't use this feature again until you finish a Long Rest.");
	public static final Skill indomidable2 = new Skill("Indomidable", "you can reroll a saving throw that you fail. You can use this twice between long rests");
	public static final Skill indomidable3 = new Skill("Indomidable", "you can reroll a saving throw that you fail. You can use this three times between long rests");
	public static final Skill extraAttack2 = new Skill("Extra Attack", "You can Attack twice, instead of once, whenever you take the Attack action on Your Turn.");
	public static final Skill extraAttack3 = new Skill("Extra Attack", "You can attack three times instead of once, whenever you take the Attack action on Your Turn.");

	
	
	//barbarian
	public static final Skill Rage = new Skill("Rage", "In battle, you fight with primal ferocity. On Your Turn, you can enter a rage as a Bonus Action.\r\n" + 
			"\r\n" + 
			"While raging, you gain the following benefits if you aren't wearing heavy armor:\r\n" + 
			"\r\n" + 
			"• You have advantage on Strength Checks and Strength saving throws.\r\n" + 
			"\r\n" + 
			"• When you make a melee weapon Attack using Strength, you gain a +2 bonus to the damage roll. This bonus increases as you level.\r\n" + 
			"\r\n" + 
			"• You have Resistance to bludgeoning, piercing, and slashing damage.\r\n" + 
			"\r\n" + 
			"If you are able to cast Spells, you can't cast them or concentrate on them while raging.\r\n" + 
			"\r\n" + 
			"Your rage lasts for 1 minute. It ends early if you are knocked Unconscious or if Your Turn ends and you haven't attacked a hostile creature since your last turn or taken damage since then. You can also end your rage on Your Turn as a Bonus Action.\r\n" + 
			"\r\n" + 
			"Once you have raged the maximum number of times for your barbarian level, you must finish a Long Rest before you can rage again. You may rage 2 times at 1st level, 3 at 3rd, 4 at 6th, 5 at 12th, and 6 at 17th.");
	public static final Skill UnArmoredDefense = new Skill ("Unarmored Defense", "While you are not wearing any armor, your Armor Class equals 10 + your Dexterity modifier + your Constitution modifier. You can use a Shield and still gain this benefit.");
	public static final Skill RecklessAttack = new Skill("Reckless Attack", "you can throw aside all concern for defense to Attack with fierce desperation. When you make your first Attack on Your Turn, you can decide to Attack recklessly. Doing so gives you advantage on melee weapon Attack rolls using Strength during this turn, but Attack rolls against you have advantage until your next turn.");
	public static final Skill DangerSense = new Skill ("Danger Sense", "you gain an uncanny sense of when things nearby aren't as they should be, giving you an edge when you dodge away from danger. You have advantage on Dexterity saving throws against effects that you can see, such as traps and Spells. To gain this benefit, you can't be Blinded, Deafened, or Incapacitated.");
	public static final Skill TotemWarrior1 = new Skill ("Totem Warrior", "");

	public static final Skill Frenzy = new Skill ("Frenzy", "You can go into a frenzy when you rage. If you do so, for the Duration of your rage you can make a single melee weapon Attack as a Bonus Action on each of your turns after this one. When your rage ends, you suffer one level of Exhaustion (as described in Conditions).");
	public static final Skill ExtraAttack = new Skill("Extra Attack", "You can Attack twice, instead of once, whenever you take the Attack action on Your Turn.");
	public static final Skill FastMovement = new Skill("Fast Movement", "Your speed increases by 10 feet while you aren't wearing Heavy Armor.");

	public static final Skill TotemWarrior2 = new Skill("Totem Warrior", "");
	public static final Skill MindlessRage = new Skill("Mindless Rage", "You can’t be Charmed or Frightened while raging. If you are Charmed or Frightened when you enter your rage, the effect is suspended for the Duration of the rage.");
	public static final Skill FeralInstinct = new Skill("Feral Instinct", "Your instincts are so honed that you have advantage on initiative rolls.\r\n" + 
			"\r\n" + 
			"Additionally, if you are surprised at the beginning of Combat and aren't Incapacitated, you can act normally on your first turn, but only if you enter your rage before doing anything else on that turn.");
	public static final Skill BrutalCritical = new Skill ("Brutal Critical", "you can roll one additional weapon damage die when determining the extra damage for a critical hit with a melee Attack.\r\n" + 
			"\r\n" + 
			"This increases to two additional dice at 13th level and three additional dice at 17th level.");
	public static final Skill SpiritWalker = new Skill("Spirit Walker", "");
	public static final Skill IntimidatingPresence = new Skill ("Intimidating Presence", "");
	public static final Skill PersistantRage = new Skill ("Persistant Rage", "you can use your action to frighten someone with your menacing presence. When you do so, choose one creature that you can see within 30 feet of you. If the creature can see or hear you, it must succeed on a Wisdom saving throw (DC equal to 8 + your proficiency bonus + your Charisma modifier) or be Frightened of you until the end of your next turn. On subsequent turns, you can use your action to extend the Duration of this effect on the Frightened creature until the end of your next turn. This effect ends if the creature ends its turn out of line of sight or more than 60 feet away from you.\r\n" + 
			"If the creature succeeds on its saving throw, you can’t use this feature on that creature again for 24 hours.");
	public static final Skill TotemWarrior3 = new Skill ("Totem Warrior", "");
	public static final Skill Retaliation = new Skill ("Retaliation", "when you take damage from a creature that is within 5 feet of you, you can use your reaction to make a melee weapon Attack against that creature.");
	public static final Skill IndomitableFight = new Skill ("Indomidable Fight", "");
	public static final Skill PrimalChampion = new Skill ("Primal Champion", "you embody the power of the wilds. Your Strength and Constitution scores increase by 4. Your maximum for those scores is now 24.");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
