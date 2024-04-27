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
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class UserController implements Initializable {

	@FXML
	private Label userLabel;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	public void GetUser(String user) {
		
		userLabel.setText(user);
		
	}
	
	// Method to return to the main menu window
	// Use this on a button everywhere except main and login screen
	public void MainWin(ActionEvent event) {
		
		try {
			((Node)event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/User.fxml").openStream());
			Scene scene = new Scene(root,900,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			
		}
		
	}
	
	// Method to control button press for Sign Out
	public void SignOut(ActionEvent event) {
		
		try {
			((Node)event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/GAA.fxml").openStream());
			Scene scene = new Scene(root,900,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			
		}
		
	}
	
// Functions below made to switch from window to window
	
	public DBModel Model = new DBModel();
	
	// Method to control button for Invoices
	public void InvoiceWindow(ActionEvent event) {
		
		try {
			((Node)event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/InvoiceBox.fxml").openStream());
			Scene scene = new Scene(root,900,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			
		}
		
	}
	
	// Method to control button for Inventory
		public void InventoryWindow(ActionEvent event) {
			
			try {
				((Node)event.getSource()).getScene().getWindow().hide();
				Stage stage = new Stage();
				FXMLLoader loader = new FXMLLoader();
				Pane root = loader.load(getClass().getResource("/application/InventoryBox.fxml").openStream());
				Scene scene = new Scene(root,900,600);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				stage.setScene(scene);
				stage.show();
			} catch (Exception e) {
				
			}
			
		}
		
		// Method to control button for Products
		public void ProductWindow(ActionEvent event) {
			
			try {
				((Node)event.getSource()).getScene().getWindow().hide();
				Stage stage = new Stage();
				FXMLLoader loader = new FXMLLoader();
				Pane root = loader.load(getClass().getResource("/application/ProductsBox.fxml").openStream());
				Scene scene = new Scene(root,900,600);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				stage.setScene(scene);
				stage.show();
			} catch (Exception e) {
				
			}
			
		}
		
		// Method to control button for Invoices
		public void CustomerWindow(ActionEvent event) {
			
			try {
				((Node)event.getSource()).getScene().getWindow().hide();
				Stage stage = new Stage();
				FXMLLoader loader = new FXMLLoader();
				Pane root = loader.load(getClass().getResource("/application/CustomerBox.fxml").openStream());
				Scene scene = new Scene(root,900,600);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				stage.setScene(scene);
				stage.show();
			} catch (Exception e) {
				
			}
			
		}
		
		// Method to control button for Invoices
		public void SalesOrderWindow(ActionEvent event) {
			
			try {
				((Node)event.getSource()).getScene().getWindow().hide();
				Stage stage = new Stage();
				FXMLLoader loader = new FXMLLoader();
				Pane root = loader.load(getClass().getResource("/application/SalesOrderBox.fxml").openStream());
				Scene scene = new Scene(root,900,600);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				stage.setScene(scene);
				stage.show();
			} catch (Exception e) {
				
			}
			
		}
		
		public void InvoiceAddWindow(ActionEvent event) {
			
			try {
				((Node)event.getSource()).getScene().getWindow().hide();
				Stage stage = new Stage();
				FXMLLoader loader = new FXMLLoader();
				Pane root = loader.load(getClass().getResource("/application/InvoiceBoxAdd.fxml").openStream());
				Scene scene = new Scene(root,900,600);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				stage.setScene(scene);
				stage.show();
			} catch (Exception e) {
				
			}
			
		}
	
// Functions below made for individual scene functions with Database
		
	@FXML
	private Label InvoiceStat;
	@FXML
	private TextField txtDi;
	@FXML
	private TextField txtId;
	@FXML
	private TextField txtDate;
	@FXML
	private TextField txtItems;
	@FXML
	private TextField txtAmt;
	
	public void EditInvoice (ActionEvent event) {
		
		try {
			if (Model.isInvoiceMake(Integer.parseInt(txtDi.getText()) ,Integer.parseInt(txtId.getText()), txtDate.getText(), txtItems.getText(), Float.parseFloat(txtAmt.getText()))) {
				InvoiceStat.setText("Created");
			} else {
				InvoiceStat.setText("Error");
			}
		} catch (SQLException e) {
			InvoiceStat.setText("External Error");
			e.printStackTrace();
		}
		
	}

}
