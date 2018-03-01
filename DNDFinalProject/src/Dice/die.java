package Dice;

import java.util.Random;

public class die {

	static Random rand = new Random();
	
	public static int roll() {
		int dieRoll = rand.nextInt(6)+1;
		return dieRoll;
	}
	
}
