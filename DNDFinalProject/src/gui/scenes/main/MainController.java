package gui.Scenes.Main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class MainController implements Initializable{

	@FXML
	public void test(ActionEvent event) {
		System.out.println("IT WORKED");
//		try {
//			FxMain.stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Scene1.fxml"))));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		
	}

}
