package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class GradeAAccountingController implements Initializable{

	public LoginModel loginModel = new LoginModel();
	
	@FXML
	private Label isConnected;
	
	public void initialize(URL location, ResourceBundle resources) {
		if (loginModel.isConnected()) {
			isConnected.setText("Connected");
		} else {
			isConnected.setText("Not Connected");
		}
	}
	
}


// "C:\Users\geeco\AppData\Local\SceneBuilder"