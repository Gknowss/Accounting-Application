package application;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GradeAAccountingController implements Initializable{

	public LoginModel loginModel = new LoginModel();
	
	@FXML
	private Label isConnected;
	
	@FXML
	private TextField txtUsername;
	
	@FXML
	private TextField txtPassword;
	
	public void initialize(URL location, ResourceBundle resources) {
		if (loginModel.isConnected()) {
			isConnected.setText("Connected");
		} else {
			isConnected.setText("Not Connected");
		}
	}
	
	public void Login (ActionEvent event) {
		try {
			if (loginModel.isLogin(txtUsername.getText(), txtPassword.getText())) {
				isConnected.setText("Welcome to Grade A Accounting");
				((Node)event.getSource()).getScene().getWindow().hide();
				Stage stage = new Stage();
				FXMLLoader loader = new FXMLLoader();
				Pane root = loader.load(getClass().getResource("/application/User.fxml").openStream());
				UserController userController = (UserController)loader.getController();
				userController.GetUser(txtUsername.getText());
				Scene scene = new Scene(root,900,600);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				stage.setScene(scene);
				stage.show();
			} else {
				isConnected.setText("Incorrect Username or Password");
			}
		} catch (SQLException e) {
			isConnected.setText("Incorrect username or password");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


// "C:\Users\geeco\AppData\Local\SceneBuilder"