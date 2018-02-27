package apps;

import controllers.Generator;
import gui.FxMain;

public class Driver {

	public static void main(String[] args) {
		Generator.run(args);
		FxMain.launch(FxMain.class, args);
	}
	
}
