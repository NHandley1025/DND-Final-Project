package gui.Scenes.Info;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class InfoController implements Initializable {
	
	String text;
	public InfoController(String info) {
		text = info;
	}
	
	@FXML
	private TextArea area;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		area.setText(text);
	}

}
