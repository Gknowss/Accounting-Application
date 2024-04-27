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
import javafx.scene.control.TextFormatter;
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
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/User.fxml").openStream());
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	// Method to control button press for Sign Out
	public void SignOut(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/GAA.fxml").openStream());
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	public DBModel Model = new DBModel();

	// Method to control button for Invoices
	public void InvoiceWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/InvoiceBox.fxml").openStream());
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

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

	public void EditInvoice(ActionEvent event) {

		try {
			if (Model.isInvoice(Integer.parseInt(txtDi.getText()), Integer.parseInt(txtId.getText()), txtDate.getText(),
					txtItems.getText(), Double.parseDouble(txtAmt.getText()))) {
				InvoiceStat.setText("Created");
			} else {
				InvoiceStat.setText("Error");
			}
		} catch (SQLException e) {
			InvoiceStat.setText("External Error");
			e.printStackTrace();
		}

	}

	// Method to control button for Customers
	public void CustomerWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/CustomerBox.fxml").openStream());
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	@FXML
	private Label CustomerStat;
	@FXML
	private TextField txtCustomerId;
	@FXML
	private TextField txtName;
	@FXML
	private TextField txtEmail;
	@FXML
	private TextField txtPhone;

	public void AddCustomer(ActionEvent event) {

		try {
			if (Model.isCustomer(Integer.parseInt(txtCustomerId.getText()), txtName.getText(), txtEmail.getText(),
					Double.parseDouble(txtPhone.getText()))) {
				CustomerStat.setText("Created");
			} else {
				CustomerStat.setText("Error");
			}
		} catch (SQLException e) {
			CustomerStat.setText("External Error");
			e.printStackTrace();
		}

	}

	// Method to control button for Inventory
	public void InventoryWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/InventoryBox.fxml").openStream());
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	@FXML
	private Label InventoryStat;
	@FXML
	private TextField txtInventoryId;
	@FXML
	private TextField txtItemName;
	@FXML
	private TextField txtPartNum;
	@FXML
	private TextField txtPrice;
	@FXML
	private TextField txtQuantity;

	public void AddInventory(ActionEvent event) {

		try {
			if (Model.isInventory(Integer.parseInt(txtInventoryId.getText()), txtName.getText(),
					Integer.parseInt(txtPartNum.getText()), Double.parseDouble(txtPrice.getText()),
					Integer.parseInt(txtQuantity.getText()))) {
				CustomerStat.setText("Created");
			} else {
				CustomerStat.setText("Error");
			}
		} catch (SQLException e) {
			CustomerStat.setText("External Error");
			e.printStackTrace();
		}

	}

	// Method to control button for Product
	public void ProductsWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/ProductsBox.fxml").openStream());
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	@FXML
	private Label ProductsStat;
	@FXML
	private TextField txtProductId;
	@FXML
	private TextField txtPartNumb;
	@FXML
	private TextField txtPartName;
	@FXML
	private TextField txtVendorId;
	
	public void AddProducts(ActionEvent event) {

		try {
			if (Model.isProduct(Integer.parseInt(txtProductId.getText()), 
					Double.parseDouble(txtPartNumb.getText()), txtPartName.getText(), 
					Integer.parseInt(txtVendorId.getText()))) {

				CustomerStat.setText("Created");
			} else {
				CustomerStat.setText("Error");
			}
		} catch (SQLException e) {
			CustomerStat.setText("External Error");
			e.printStackTrace();
		}

	}
	
	// Method to control button for SalesOrder
		public void SalesOrderWindow(ActionEvent event) {

			try {
				((Node) event.getSource()).getScene().getWindow().hide();
				Stage stage = new Stage();
				FXMLLoader loader = new FXMLLoader();
				Pane root = loader.load(getClass().getResource("/application/SalesOrderBox.fxml").openStream());
				Scene scene = new Scene(root, 900, 600);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				stage.setScene(scene);
				stage.show();
			} catch (Exception e) {

			}

		}

		@FXML
		private Label SalesStat;
		@FXML
		private TextField txtOrderId;
		@FXML
		private TextField txtCustId;
		@FXML
		private TextField txtOrderDate;
		@FXML
		private TextField txtSalesTotal;
		
		public void AddSalesOrder(ActionEvent event) {

			try {
				if (Model.isSales(Integer.parseInt(txtOrderId.getText()), 
						Integer.parseInt(txtCustomerId.getText()), 
						txtOrderDate.getText(), Double.parseDouble(txtSalesTotal.getText()))) {

					CustomerStat.setText("Created");
				} else {
					CustomerStat.setText("Error");
				}
			} catch (SQLException e) {
				CustomerStat.setText("External Error");
				e.printStackTrace();
			}

		}

}
