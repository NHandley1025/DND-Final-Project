package Skills;

public class skills {
	
	
	public static final Skill DarkVision = new Skill("DarkVision", "You can see in dim light within 60 feet of you as if it were bright light, and in Darkness as if it were dim light. You can't discern color in Darkness, only shades of gray.");
	               
	               
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
	public static final Skill superiorInspiration = new Skill("Superior Inspiration", "when you roll initiative and have no uses of Bardic Inspiration left, you regain one use.\r\n" + 
			"");
	public static final Skill bardicInspiration = new Skill("Bardic Inspiration", "You can inspire others through stirring words or music. To do so, you use a Bonus Action on Your Turn to choose one creature other than yourself within 60 feet of you who can hear you. That creature gains one Bardic Inspiration die, a d6.\r\n" + 
			"\r\n" + 
			"Once within the next 10 minutes, the creature can roll the die and add the number rolled to one ability check, Attack roll, or saving throw it makes. The creature can wait until after it rolls the d20 before deciding to use the Bardic Inspiration die, but must decide before the DM says whether the roll succeeds or fails. Once the Bardic Inspiration die is rolled, it is lost. A creature can have only one Bardic Inspiration die at a time.\r\n" + 
			"\r\n" + 
			"You can use this feature a number of times equal to your Charisma modifier (a minimum of once). You regain any expended uses when you finish a Long Rest.\r\n" + 
			"\r\n" + 
			"Your Bardic Inspiration die changes when you reach certain levels in this class. The die becomes a d8 at 5th level, a d10 at 10th level, and a d12 at 15th level.\r\n" + 
			"");
	
	public static final Skill magicalSecrets = new Skill("Magical Secrets", "You have plundered magical knowledge from a wide spectrum of disciplines. Choose two Spells from any class, including this one. A spell you choose must be of a level you can cast, as shown on the Bard table, or a cantrip.\r\n" + 
			"\r\n" + 
			"The chosen Spells count as bard Spells for you and are included in the number in the Spells Known column of the Bard table.\r\n" + 
			"\r\n" + 
			"You learn two additional Spells from any class at 14th level and again at 18th level.\r\n" + 
			"");
	public static final Skill songOfRest = new Skill("Song of Rest", "you can use soothing music or oration to help revitalize your wounded allies during a Short Rest. If you or any friendly creatures who can hear your performance regain hit points by spending Hit Dice at the end of the Short Rest, each of those creatures regains an extra 1d6 hit points.\r\n" + 
			"\r\n" + 
			"The extra hit points increase when you reach certain levels in this class: to 1d8 at 9th level, to 1d10 at 13th level, and to 1d12 at 17th level.");
	public static final Skill counterCharm = new Skill("Counter Charm", "you gain the ability to use musical notes or words of power to disrupt mind-influencing effects. As an action, you can start a performance that lasts until the end of your next turn. During that time, you and any friendly creatures within 30 feet of you have advantage on saving throws against being Frightened or Charmed. A creature must be able to hear you to gain this benefit. The performance ends early if you are Incapacitated or silenced or if you voluntarily end it (no action required).");
	public static final Skill fontOfInspiration = new Skill("Font of Inspiration", "you regain all of your expended uses of Bardic Inspiration when you finish a short or Long Rest.");
	public static final Skill jackOfAllTrades = new Skill("Jack of All Trades", "You can add half your proficiency bonus, rounded down, to any ability check you make that doesn't already include your proficiency bonus.");
	public static final Skill expertise = new Skill("Expertise", "Choose two of your skill proficiencies. Your proficiency bonus is doubled for any ability check you make that uses either of the chosen proficiencies. You'll choose 2 more at 10th level.");
	public static final Skill 

	
	//Cleric
	public static final Skill SpellCasting = new Skill("SpellCasting", "You can cast spells!");
	public static final Skill DivineDomain = new Skill("Divine Domain", "");
	public static final Skill ChannelDivinity = new Skill("Channel Divinity", "you gain the ability to channel divine energy directly from your deity, using that energy to fuel magical effects. You start with two such effects: Turn Undead and an effect determined by your domain. Some domains grant you additional effects as you advance in levels, as noted in the domain description.\r\n" + 
			"\r\n" + 
			"When you use your Channel Divinity, you choose which effect to create. You must then finish a short or Long Rest to use your Channel Divinity again.\r\n" + 
			"\r\n" + 
			"Some Channel Divinity effects require saving throws. When you use such an effect from this class, the DC equals your cleric spell save DC.\r\n" + 
			"\r\n" + 
			"Beginning at 6th level, you can use your Channel Divinity twice between rests, and beginning at 18th level, you can use it three times between rests. When you finish a short or Long Rest, you regain your expended uses.\r\n" + 
			"");
	public static final Skill DivineIntervention = new Skill("Divine Intervention", "you can call on your deity to intervene on your behalf when your need is great.\r\n" + 
			"\r\n" + 
			"Imploring your deity's aid requires you to use your action. Describe the assistance you seek, and roll percentile dice. If you roll a number equal to or lower than your cleric level, your deity intervenes. The DM chooses the nature of the intervention; the effect of any cleric spell or cleric domain spell would be appropriate. If your deity intervenes, you can't use this feature again for 7 days. Otherwise, you can use it again after you finish a Long Rest.\r\n" + 
			"");
	public static final Skill DestroyUndeadCR0 = new Skill("Destroy Undead", "You can destroy undead with a CR of 1/2 or less!");
	public static final Skill DestroyUndeadCR1 = new Skill("Destroy Undead", "You can destroy undead with a CR of 1 or less!");
	public static final Skill DestroyUndeadCR2 = new Skill("Destroy Undead", "You can destroy undead with a CR of 2 or less!");
	public static final Skill DestroyUndeadCR3 = new Skill("Destroy Undead", "You can destroy undead with a CR of 3 or less!");
	public static final Skill DestroyUndeadCR4 = new Skill("Destroy Undead", "You can destroy undead with a CR of 4 or less!");
	public static final Skill DivineInterventionImprovement = new Skill("Divine Intervention", "Your call for intervention succeeds automatically, no roll required");

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
	public static final Skill divineSense = new Skill("Divine Sense", "As an action, you can open your awareness to detect such forces. Until the end of your awareness to detect such forces. Until the end of your next turn, you know the type (celestial, fiend, or undead) of any being whose presence you sense, but not its identity (the vampire Count Strahd von Zarovich, for instance). Within the same radius, you also detect the presence of any place or object that has been consecreated or desecrated, as with the hallow spell. You can use this feature a number of times equal to 1 + your Charisma modifier. When you finish a long rest, you regain all expended uses.");
	public static final Skill layOnHands = new Skill("Lay on Hands", "Your blessed touch can heal wounds. You have a pool of Healing power that replenishes when you take a Long Rest. With that pool, you can restore a total number of hit points equal to your paladin level x 5. As an action, you can touch a creature and draw power from the pool to restore a number of hit points to that creature, up to the maximum amount remaining in your pool. Alternatively, you can expend 5 hit points from your pool of Healing to cure the target of one disease or neutralize one poison affecting it. You can cure multiple Diseases and neutralize multiple Poisons with a single use of Lay on Hands, expending hit points separately for each one. This feature has no effect on Undead and constructs.");
	public static final Skill fightingStyle = new Skill("Fighting Style", "You adopt a style of fighting as your specialty. Choose one of the following options. You can’t take a Fighting Style option more than once, even if you later get to choose again.");
	public static final Skill divineSmite = new Skill("Divine Smite", "While you are wearing armor, you gain a +1 bonus to AC.");
	public static final Skill divineHealth = new Skill("Divine Health", "When you hit a creature with a melee weapon Attack, you can expend one spell slot to deal radiant damage to the target, in addition to the weapon's damage. The extra damage is 2d8 for a 1st-level spell slot, plus 1d8 for each Spell Level higher than 1st, to a maximum of 5d8. The damage increases by 1d8 if the target is an Undead or a fiend.");
	public static final Skill sacredOath = new Skill("Sacred Oath", "You swear the oath that binds you as a paladin forever. Up to this time you have been in a preparatory stage, committed to the path but not yet sworn to it. You have chosen the Oath of Devotion.");
	public static final Skill auraOfProtection = new Skill("Aura of Protection", "Whenever you or a friendly creature within 10 feet of you must make a saving throw, the creature gains a bonus to the saving throw equal to your Charisma modifier (with a minimum bonus of +1). You must be conscious to grant this bonus. At 18th level, the range of this aura increases to 30 feet.");
	public static final Skill sacredOathFeature = new Skill("Sacred Oath Feature", "");
	public static final Skill auraOfCourage = new Skill("Aura of Courage", "You and friendly creatures within 10 feet of you can't be Frightened while you are conscious. At 18th level, the range of this aura increases to 30 feet.");
	public static final Skill improvedDivineSmite = new Skill("", "You are so suffused with righteous might that all your melee weapon strikes carry divine power with them. Whenever you hit a creature with a melee weapon, the creature takes an extra 1d8 radiant damage. If you also use your Divine Smite with an Attack, you add this damage to the extra damage of your Divine Smite.");
	public static final Skill cleansingTouch = new Skill("Cleansing Touch", "You can use your action to end one spell on yourself or on one willing creature that you touch. You can use this feature a number of times equal to your Charisma modifier (a minimum of once). You regain expended uses when you finish a Long Rest.");
	public static final Skill channelDivinity = new Skill("Channel Divinity", "Your oath allows you to channel divine energy to fuel magical effects. Each Channel Divinity option provided by your oath explains how to use it.\r\nWhen you use your Channel Divinity, you choose which option to use. You must then finish a short or long rest to use your Channel Divinity again.\r\nSome Channel Divinity effects require saving throws. When you use such an effect from this class, the DC equals your paladin spell save DC.");
	public static final Skill cDSacredWeapon = new Skill("Channel Divinity:Sacred Weapon", "As an action, you can imbue one weapon that you are holding with positive energy, using your Channel Divinity. For 1 minute, you add your Charisma modifier to attack rolls made with that weapon (with a minimum bonus of +1). The weapon also emits bright light in a 20-foot radius and dim light 20 feet beyond that. If the weapon is not already magical, it becomes magical for the duration.\r\nYou can end this effect on your turn as part of any other action. If you are no longer holding or carrying this weapon, or if you fall unconscious, this effect ends.");
	public static final Skill cDTurnTheUnholy = new Skill("Channel Divinity:Turn the Unholy", "As an action, you present your holy symbol and speak a prayer censuring fiends and undead, using your Channel Divinity. Each fiend or undead that can see or hear you within 30 feet of you must make a Wisdom saving throw. If the creature fails its saving throw, it is turned for 1 minute or until it takes damage.\r\nA turned creature must spend its turns trying to move as far away from you as it can, and it can’t willingly move to a space within 30 feet of you. It also can’t take reactions. For its action, it can use only the Dash action or try to escape from an effect that prevents it from moving. If there’s nowhere to move, the creature can use the Dodge action.");
	public static final Skill auraOfDevotion = new Skill("Aura of Devotion", "You and friendly creatures within 10 feet of you can’t be charmed while you are conscious.At 18th level, the range of this aura increases to 30 feet.");
	public static final Skill purityOfSpirit = new Skill("Purity of Spirit", "You are always under the effects of a protection from evil and good spell");
	public static final Skill holyNimbus = new Skill("Holy Nimbus", "As an action, you can emanate an aura of sunlight. For 1 minute, bright light shines from you in a 30-foot radius, and dim light shines 30 feet beyond that.\r\nWhenever an enemy creature starts its turn in the bright light, the creature takes 10 radiant damage.\r\nIn addition, for the duration, you have advantage on saving throws against spells cast by fiends or undead.\r\nOnce you use this feature, you can’t use it again until you finish a long rest.");
	
	//Ranger
	public static final Skill favoredEnemy = new Skill("Favored Enemy", "You have significant experience studying, tracking, hunting, and even talking to a certain type of enemy. Choose a type of favored enemy: Aberrations, Beasts, Celestials, constructs, dragons, elementals, fey, Fiends, Giants, Monstrosities, oozes, Plants, or Undead. Alternatively, you can select two races of humanoid (such as Gnolls and orcs) as favored enemies. You have advantage on Wisdom (Survival) checks to track your favored enemies, as well as on Intelligence Checks to recall information about them. When you gain this feature, you also learn one Language of your choice that is spoken by your favored enemies, if they speak one at all.You choose one additional favored enemy, as well as an associated Language, at 6th and 14th level. As you gain levels, your choices should reflect the types of Monsters you have encountered on your adventures.");
	public static final Skill naturalExplorer = new Skill("Natural Explorer", "You are particularly familiar with one type of natural Environment and are adept at traveling and surviving in such regions. Choose one type of favored terrain: arctic, coast, desert, forest, grassland, mountain, swamp, or The Underdark. When you make an Intelligence or Wisdom check related to your favored terrain, your proficiency bonus is doubled if you are using a skill that you're proficient in. While traveling for an hour or more in your favored terrain, you gain the following benefits: Difficult terrain doesn't slow your group's travel. \"Your group can't become lost except by magical means. Even when you are engaged in another activity while traveling (such as foraging, navigating, or tracking), you remain alert to danger. If you are traveling alone, you can move stealthily at a normal pace. When you forage, you find twice as much food as you normally would. While tracking other creatures, you also learn their exact number, their sizes, and how long ago they passed through the area.");
	//fightingStyle
	//spellCasting
	public static final Skill primevalAwareness = new Skill ("Primeval Awareness", "You can use your action and expend one ranger spell slot to focus your awareness on the region around you. For 1 minute per level of the spell slot you expend, you can sense whether the following types of creatures are present within 1 mile of you (or within up to 6 miles if you are in your favored terrain): Aberrations, Celestials, dragons, elementals, fey, Fiends, and Undead. This feature doesn't reveal the creatures' location or number.");
	//extraAttack
	public static final Skill landsStride = new Skill("Lands Stride", "Moving through nonmagical difficult terrain costs you no extra Movement. You can also pass through nonmagical Plants without being slowed by them and without taking damage from them if they have thorns, spines, or a similar hazard. In addition, you have advantage on saving throws against Plants that are magically created or manipulated to impede Movement, such those created by the Entangle spell.");
	public static final Skill hideInPlainSight = new Skill("Hide in plain Sight", "You can spend 1 minute creating camouflage for yourself. You must have access to fresh mud, dirt, Plants, soot, and other naturally occurring materials with which to create your camouflage. Once you are camouflaged in this way, you can try to hide by pressing yourself up against a solid surface, such as a tree or wall, that is at least as tall and wide as you are. You gain a +10 bonus to Dexterity (Stealth) checks as long as you remain there without moving or taking actions. Once you move or take an action or a reaction, you must camouflage yourself again to gain this benefit.");
	public static final Skill vanish = new Skill("Vanish", "You can use the Hide action as a Bonus Action on Your Turn. Also, you can't be tracked by nonmagical means, unless you choose to leave a trail.");
	public static final Skill feralSenses = new Skill("Feral Senses", "You gain preternatural senses that help you fight creatures you can't see. When you Attack a creature you can't see, your inability to see it doesn't impose disadvantage on your Attack rolls against it. You are also aware of the location of any Invisible creature within 30 feet of you, provided that the creature isn't hidden from you and you aren't Blinded or Deafened.");
	public static final Skill foeSlayer = new Skill("Foe Slayer", "You become an unparalleled hunter of your enemies. Once on each of your turns, you can add your Wisdom modifier to the Attack roll or the damage roll of an Attack you make against one of your favored enemies. You can choose to use this feature before or after the roll, but before any effects of the roll are applied.");
	
	//Rogue
	public static final Skill sneakAttack = new Skill("Sneak Attack", "You know how to strike subtly and exploit a foe's distraction. Once per turn, you can deal an extra 1d6 damage to one creature you hit with an Attack if you have advantage on the Attack roll. The Attack must use a Finesse or a ranged weapon. You don't need advantage on the Attack roll if another enemy of the target is within 5 feet of it, that enemy isn't Incapacitated, and you don't have disadvantage on the Attack roll. The amount of the extra damage increases as you gain levels in this class, as shown in the Sneak Attack column of the Rogue table.");
	//public static final Skill expertise = new Skill("", "");
	public static final Skill thievesCant = new Skill("Thieves Cant", "During your rogue Training you learned thieves' cant, a secret mix of dialect, jargon, and code that allows you to hide messages in seemingly normal conversation. Only another creature that knows thieves' cant understands such messages. It takes four times longer to convey such a Message than it does to speak the same idea plainly. In addition, you understand a set of secret signs and symbols used to convey short, simple messages, such as whether an area is dangerous or the territory of a thieves' guild, whether loot is nearby, or whether the people in an area are easy marks or will provide a safe house for thieves on the run.\r\n");
	public static final Skill cunningAction = new Skill("Cunning Action", "Your quick thinking and agility allow you to move and act quickly. You can take a Bonus Action on each of your turns in Combat. This action can be used only to take the Dash, Disengage, or Hide action.");
	public static final Skill uncannyDodge = new Skill("Uncanny Dodge", "When an attacker that you can see hits you with an Attack, you can use your reaction to halve the attack's damage against you.");
	public static final Skill evasion = new Skill("Evasion", "You can nimbly dodge out of the way of certain area effects, such as a red dragon's fiery breath or an Ice Storm spell. When you are subjected to an effect that allows you to make a Dexterity saving throw to take only half damage, you instead take no damage if you succeed on the saving throw, and only half damage if you fail.");
	public static final Skill reliableTalent = new Skill("Reliable Talent", "You have refined your chosen skills until they approach perfection. Whenever you make an ability check that lets you add your proficiency bonus, you can treat a d20 roll of 9 or lower as a 10.");
	public static final Skill blindSense = new Skill("Blind Sense", "If you are able to hear, you are aware of the location of any hidden or Invisible creature within 10 feet of you.");
	public static final Skill slipperyMind = new Skill("Slippery Mind", "You have acquired greater mental Strength. You gain proficiency in Wisdom saving throws.");
	public static final Skill elusive = new Skill("Elusive", "You are so evasive that attackers rarely gain the upper hand against you. No Attack roll has advantage against you while you aren't Incapacitated.");
	public static final Skill strokeOfLuck = new Skill("Stroke of Luck", "You have an uncanny knack for succeeding when you need to. If your Attack misses a target within range, you can turn the miss into a hit. Alternatively, if you fail an ability check, you can treat the d20 roll as a 20.Once you use this feature, you can't use it again until you finish a short or Long Rest.");

	
	//sorcerer
	public static final Skill sorcerousOrigin = new Skill("Sorcerous Origin", "Choose a sorcerous origin, which describes the source of your innate magical power. Your choice grants you features when you choose it at 1st level and again at 6th, 14th, and 18th level.");
	public static final Skill fontOfMagic = new Skill("Font of Magic", "You tap into a deep wellspring of magic within yourself. This wellspring is represented by sorcery points, which allow you to create a variety of magical effects.");
	public static final Skill metaMagic = new Skill("Meta Magic", "You have the ability to twist your Spells to suit your needs. You gain two of the following Metamagic options of your choice. You gain another one at 10th and 17th level. You can use only one Metamagic option on a spell when you cast it, unless otherwise noted.");
	public static final Skill sorcerousRestoration = new Skill("Sourcerous Restoration", "You regain 4 expended sorcery points whenever you finish a Short Rest.");
	public static final Skill draconicResiliance = new Skill("Draconic Resiliance", "As magic flows through your body, it causes physical traits of your dragon ancestors to emerge. At 1st level, your hit point maximum increases by 1 and increases by 1 again whenever you gain a level in this class. Additionally, parts of your skin are covered by a thin sheen of dragon-like scales. When you aren’t wearing armor, your AC equals 13 + your Dexterity modifier.");
	public static final Skill elementalAffinity = new Skill("Elemental Affinity", "When you cast a spell that deals damage of the type associated with your draconic ancestry, which is indicated with the damage type within the parentheses of your origin, you can add your Charisma modifier to one damage roll of that spell. At the same time, you can spend 1 sorcery point to gain resistance to that damage type for 1 hour.");
	public static final Skill dragonWings = new Skill("Dragon Wings", "You have the ability to sprout a pair of dragon wings from your back, gaining a flying speed equal to your current speed. You can create these wings as a bonus action on your turn. They last until you dismiss them as a bonus action on your turn./nYou can’t manifest your wings while wearing armor unless the armor is made to accommodate them, and clothing not made to accommodate your wings might be destroyed when you manifest them.");
	public static final Skill draconicPresence = new Skill("Draconic Presence", "You can channel the dread presence of your dragon ancestor, causing those around you to become awestruck or frightened. As an action, you can spend 5 sorcery points to draw on this power and exude an aura of awe or fear (your choice) to a distance of 60 feet. For 1 minute or until you lose your concentration (as if you were casting a concentration spell), each hostile creature that starts its turn in this aura must succeed on a Wisdom saving throw or be charmed (if you chose awe) or frightened (if you chose fear) until the aura ends. A creature that succeeds on this saving throw is immune to your aura for 24 hours.");
	
	//warlock
	public static final Skill otherWordly = new Skill("Other Worldly", "You have struck a bargain with a Fiend. Your choice grants you features at 1st level and again at 6th, 10th, and 14th level.");
	public static final Skill pactMagic = new Skill ("Pact Magic", "Your arcane research and the magic bestowed on you by your patron have given you facility with Spells.");
	/*needs choice-->*/ public static final Skill pactBoon = new Skill ("Pact Boon", "Your otherworldly patron bestows a gift upon you for your loyal service. You gain one of the following features of your choice.");
	public static final Skill mysticArcanumLv6 = new Skill ("Mystic Arcanum(Level 6)", "Your patron bestows upon you a magical secret called an arcanum. Choose one 6th-level spell from the warlock spell list as this arcanum. You can cast your arcanum spell once without expending a spell slot. You must finish a long rest before you can do so again");
	public static final Skill mysticArcanumLv7 = new Skill ("Mystic Arcanum(Level 7)", "Your patron bestows upon you a magical secret called an arcanum. Choose one 7th-level spell from the warlock spell list as this arcanum. You can cast your arcanum spell once without expending a spell slot. You must finish a long rest before you can do so again");
	public static final Skill mysticArcanumLv8 = new Skill ("Mystic Arcanum(Level 8)", "Your patron bestows upon you a magical secret called an arcanum. Choose one 8th-level spell from the warlock spell list as this arcanum. You can cast your arcanum spell once without expending a spell slot. You must finish a long rest before you can do so again");
	public static final Skill mysticArcanumLv9 = new Skill ("Mystic Arcanum(Level 9)", "Your patron bestows upon you a magical secret called an arcanum. Choose one 9th-level spell from the warlock spell list as this arcanum. You can cast your arcanum spell once without expending a spell slot. You must finish a long rest before you can do so again");
	public static final Skill eldrichInvocations = new Skill("Eldrich Invocations", "In your study of occult lore, you have unearthed eldritch invocations, fragments of forbidden knowledge that imbue you with an abiding magical ability. At 2nd level, you gain two eldritch invocations of your choice. Your invocation options are detailed at the end of the class description. When you gain certain warlock levels, you gain additional invocations of your choice, as shown in the Invocations Known column of the Warlock table. Additionally, when you gain a level in this class, you can choose one of the invocations you know and replace it with another invocation that you could learn at that level.");
	public static final Skill eldrichMaster = new Skill("Eldritch Master", "You can draw on your inner reserve of mystical power while entreating your patron to regain expended Spell Slots. You can spend 1 minute entreating your patron for aid to regain all your expended Spell Slots from your Pact Magic feature. Once you regain Spell Slots with this feature, you must finish a Long Rest before you can do so again.");
	public static final Skill darkBlessing = new Skill("Dark One's Blessing", "When you reduce a hostile creature to 0 hit points, you gain temporary hit points equal to your Charisma modifier + your warlock level (minimum of 1).");
	public static final Skill darkLuck = new Skill("Dark One's Own Luck", "You can call on your patron to alter fate in your favor. When you make an ability check or a saving throw, you can use this feature to add a d10 to your roll. You can do so after seeing the initial roll but before any of the roll’s effects occur.\r\nOnce you use this feature, you can’t use it again until you finish a short or long rest.");
	public static final Skill fiendishResiliance = new Skill("Fiendish Resiliance", "You can choose one damage type when you finish a short or long rest. You gain resistance to that damage type until you choose a different one with this feature. Damage from magical weapons or silver weapons ignores this resistance.");
	public static final Skill hurlThroughHell = new Skill("Hurl Through Hell", "When you hit a creature with an attack, you can use this feature to instantly transport the target through the lower planes. The creature disappears and hurtles through a nightmare landscape.At the end of your next turn, the target returns to the space it previously occupied, or the nearest unoccupied space. If the target is not a fiend, it takes 10d10 psychic damage as it reels from its horrific experience.\r\nOnce you use this feature, you can’t use it again until you finish a long rest.");
	
	//Druid
	public static final Skill druidic = new Skill ("Druidic", "You know Druidic, the secret Language of druids. You can speak the Language and use it to leave hidden messages. You and others who know this Language automatically spot such a Message. Others spot the message's presence with a successful DC 15 Wisdom (Perception) check but can't decipher it without magic.");
	//spell casting
	public static final Skill wildShape0 = new Skill ("Wild Shape", "You can shift into any animal you have seen, so long as it has no flying or swimming speed");
	public static final Skill wildShape1 = new Skill ("Wild Shape", "You can shift into any animal you have seen, so long as it has no flying speed");
	public static final Skill wildShape2 = new Skill("Wild Shape", "You can shift into any animal you have seen!");
	public static final Skill druidCircle = new Skill ("Druid Circle", "You choose to Identify with the Circle of the Land. Your choice grants you features at 2nd level and again at 6th, 10th, and 14th level.");
	public static final Skill bonusCantrip = new Skill("Bonus Cantrip", "You learn one additional druid cantrip of your choice");
	public static final Skill naturalRecovery = new Skill("Natural Recovery", "You can regain some of your magical energy by sitting in meditation and communing with nature. During a short rest, you choose expended spell slots to recover. The spell slots can have a combined level that is equal to or less than half your druid level (rounded up), and none of the slots can be 6th level or higher. You can’t use this feature again until you finish a long rest.\r\nFor example, when you are a 4th-level druid, you can recover up to two levels worth of spell slots. You can recover either a 2nd-level slot or two 1st-level slots.");
	//timeless body
	//landsStride
	public static final Skill natureWard = new Skill("Nature's Ward", " You can’t be Charmed or Frightened by elementals or fey, and you are immune to poison and disease.");
	public static final Skill natureSanctuary = new Skill("Nature's Sanctuary", "Creatures of the natural world sense your connection to nature and become hesitant to attack you. When a beast or plant creature attacks you, that creature must make a Wisdom saving throw against your druid spell save DC. On a failed save, the creature must choose a different target, or the attack automatically misses. On a successful save, the creature is immune to this effect for 24 hours. The creature is aware of this effect before it makes its attack against you.");
	public static final Skill beastSpells = new Skill("Beast Spells", "You can cast many of your druid Spells in any shape you assume using Wild Shape. You can perform the somatic and verbal Components of a druid spell while in a beast shape, but you aren't able to provide material Components.");
	public static final Skill archdruid = new Skill("Archdruid", "You can use your Wild Shape an unlimited number of times. Additionally, you can ignore the verbal and somatic Components of your druid Spells, as well as any material Components that lack a cost and aren't consumed by a spell. You gain this benefit in both your normal shape and your beast shape from Wild Shape.");
	
	//fighter
	public static final Skill secondWind = new Skill("Second Wind", "You have a limited well of stamina that you can draw on to protect yourself from harm. On Your Turn, you can use a Bonus Action to regain hit points equal to 1d10 + your fighter level. Once you use this feature, you must finish a short or Long Rest before you can use it again.");
	public static final Skill actionSurge1 = new Skill("Action Surge", "You can push yourself beyond your normal limits for a moment. On Your Turn, you can take one additional action on top of your regular action and a possible Bonus Action. Once you use this feature, you must finish a short or Long Rest before you can use it again.");
	public static final Skill actionSurge2 = new Skill("Action Surge", "You can push yourself beyond your normal limits for a moment. You can use it twice before a rest, but only once on the same turn.");
	public static final Skill indomidable1 = new Skill("Indomidable", "You can reroll a saving throw that you fail. If you do so, you must use the new roll, and you can't use this feature again until you finish a Long Rest.");
	public static final Skill indomidable2 = new Skill("Indomidable", "You can reroll a saving throw that you fail. You can use this twice between long rests");
	public static final Skill indomidable3 = new Skill("Indomidable", "You can reroll a saving throw that you fail. You can use this three times between long rests");
	public static final Skill extraAttack2 = new Skill("Extra Attack", "You can Attack twice, instead of once, whenever you take the Attack action on Your Turn.");
	public static final Skill extraAttack3 = new Skill("Extra Attack", "You can attack three times instead of once, whenever you take the Attack action on Your Turn.");

	//wizard
	public static final Skill arcaneRecovery = new Skill("Arcane Recovery", "You have learned to regain some of your magical energy by studying your spellbook. Once per day when you finish a short rest, you can choose expended spell slots to recover. The spell slots can have a combined level that is equal to or less than half your wizard level (rounded up), and none of the slots can be 6th level or higher.\r\nFor example, if you’re a 4th-level wizard, you can recover up to two levels worth of spell slots. You can recover either a 2nd-level spell slot or two 1st-level spell slots.");
	public static final Skill evocationSavant = new Skill("Evocation Savant", "The gold and time you must spend to copy an evocation spell into your spellbook is halved");
	public static final Skill sculptSpells = new Skill("Sculpt Spells", "You can create pockets of relative safety within the effects of your evocation spells. When you cast an evocation spell that affects other creatures that you can see, you can choose a number of them equal to 1 + the spell’s level. The chosen creatures automatically succeed on their saving throws against the spell, and they take no damage if they would normally take half damage on a successful save");
	public static final Skill spellMastery = new Skill("Spell Mastery", "You have achieved such mastery over certain spells that you can cast them at will. Choose a 1st-level wizard spell and a 2nd-level wizard spell that are in your spellbook. You can cast those spells at their lowest level without expending a spell slot when you have them prepared. If you want to cast either spell at a higher level, you must expend a spell slot as normal.\r\nBy spending 8 hours in study, you can exchange one or both of the spells you chose for different spells of the same levels.");
	public static final Skill signatureSpells = new Skill("Signature Spells", "You gain mastery over two powerful spells and can cast them with little effort. Choose two 3rd-level wizard spells in your spellbook as your signature spells. You always have these spells prepared, they don’t count against the number of spells you have prepared, and you can cast each of them once at 3rd level without expending a spell slot. When you do so, you can’t do so again until you finish a short or long rest.\r\nIf you want to cast either spell at a higher level, you must expend a spell slot as normal.");
	public static final Skill potentCantrip = new Skill("Potent Cantrip", "Your damaging cantrips affect even creatures that avoid the brunt of the effect (creatures that can use a saving throw to avoid damage). When a creature succeeds on a saving throw against your cantrip, the creature takes half the cantrip’s damage (if any) but suffers no additional effect from the cantrip");
	public static final Skill empoweredEvocation = new Skill("Empowered Evocation", "You can add your Intelligence modifier to one damage roll of any wizard evocation spell you cast.");
	public static final Skill overchannel = new Skill("Overchannel", "you can increase the power of your simpler spells. When you cast a wizard spell of 1st through 5th level that deals damage, you can deal maximum damage with that spell.\r\nThe first time you do so, you suffer no adverse effect. If you use this feature again before you finish a long rest, you take 2d12 necrotic damage for each level of the spell, immediately after you cast it. Each time you use this feature again before finishing a long rest, the necrotic damage per spell level increases by 1d12. This damage ignores resistance and immunity.");
	
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
