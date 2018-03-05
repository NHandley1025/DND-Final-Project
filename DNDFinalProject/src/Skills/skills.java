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
	
	
	//Barbarian
	public static final Skill Rage = new Skill("Rage", "As a bonus action, you can rage. \n    The rage gives you proficiency in Strength checks and Strength saving throws.\n    When you make a melee Strength attack, you can add a rage bonus to your damage roll this increases as you level up barbarian.\n    You have resistance to bludgeoning, slashing, and piercing damage.\nRage lasts for one minute, but wil end if you are unconsious, don't attack hostile creatures, or taken damage. You can voluntarily choose to stop raging as a bonus action./n After you raged your rages per day amount, you must take a long rest to reset your counter.");
	public static final Skill UnarmoredDefense = new Skill("Unarmored Defense", "If you don't wear any armor, your AC will be 10 + Dexerity Modifer + Constitution Modifer. You can still hold a shield and have this benefit");
	public static final Skill RecklessAttack = new Skill("Reckless Attack", "You throw away any concern to defense and go all offense. You can have your first attack be a Reckless Attack, which will give you advantage to Strength weapon attack rolls, but attack rolls towards you will have advantage until your next turn");
	public static final Skill DangerSense = new Skill("Danger Sense", "You have an innate sense on when things are awry. You have an advantage with your Dexterity Saving Throws against abilities you can see. You cannot be blinded, deafened, or incompasitated to use this bonus");
	public static final Skill Frenzy = new Skill("Frenzy", "When you rage, you can go into a frenzy. While in a frenzy, you will have gain an make a single melee attack as a bonus action for each turn after your frenzied. When your rage stops, you will suffer a level of exhaustion.");
	public static final Skill ExtraAttack = new Skill("Extra Attack", "For your attack action, you can do two melee attacks instead of one.");
	public static final Skill FastMovement = new Skill("Fast Movement", "If your not wearing heavy armor, your base speed increases by 10ft");
	public static final Skill MindlessRage = new Skill("Mindless Rage", "You cannot be charmed or frightened while in rage. If you would have gained those effects while in the rage, the effects will be suspended until you leave rage");
	public static final Skill FeralInstinct = new Skill("Feral Instinct", "You instinct are so honed that you have an advantage with initiative rolls");
	public static final Skill BrutalCritical = new Skill("Brutal Critical", "You can roll an additional hit die with critical hits. This increases to 2 dice at level 13 and 3 dice at level 17");
	public static final Skill IntimidatingPresence = new Skill("Intimidating Presence", "");
	
}
