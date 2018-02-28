package apps;

import controllers.Generator;
import gui.FxController;

public class Driver {

	public static void main(String[] args) {
		Generator.run(args);
		FxController.launch(FxController.class, args);
	}
	
}
