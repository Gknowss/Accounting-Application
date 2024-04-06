package application;

// Section of code for database



// Section of code for frontend

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.Button; 
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("/application/GradeAAccounting.fxml"));
			Scene scene = new Scene(root,900,900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		
	}
	
	// Section of code for backend 	
	
	public static void main(String[] args) {
		launch(args);
	}
}


// --module-path "C:\Users\geeco\Downloads\openjfx-22_windows-x64_bin-sdk\javafx-sdk-22\lib" --add-modules javafx.controls,javafx.fxml


/*

		stage.setWidth(600);
		stage.setHeight(600);
		stage.setResizable(false);
		//stage.setX(50);
		//stage.setY(50);
		stage.setFullScreen(true);
		stage.setFullScreenExitHint("Press q to exit fullscreen");
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		Image icon = new Image("Logo.PNG");
		stage.getIcons().add(icon);
		stage.setTitle("Grade A Accounting");
		Text text = new Text();
		text.setText("Grade A Accounting");
		text.setX(250);
		text.setY(250);
		text.setFont(Font.font("Verdana", 50));
		text.setFill(Color.RED);
		
		Button b = new Button("button");
		StackPane r = new StackPane(); 
		r.getChildren().add(b); 
		
		stage.setWidth(600);
		stage.setHeight(600);
		Group root = new Group();
		Scene scene = new Scene(r,200,200);
		
		root.getChildren().add(text);

 */


