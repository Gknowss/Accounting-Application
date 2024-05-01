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
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/User.fxml").openStream());
			// Set background color of the root pane
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
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
			// Set background color of the root pane
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
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
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/InvoiceBox.fxml").openStream());
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	public void InvoiceAddWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/AddInvoice.fxml").openStream());
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	public void InvoiceEditWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/EditInvoice.fxml").openStream());
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	public void InvoiceDeleteWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/DeleteInvoice.fxml").openStream());
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	// Method to control button for Inventory
	public void InventoryWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/InventoryBox.fxml").openStream());
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	public void InventoryAddWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/AddInventory.fxml").openStream());
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	public void InventoryEditWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/EditInventory.fxml").openStream());
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	public void InventoryDeleteWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/DeleteInventory.fxml").openStream());
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	// Method to control button for Products
	public void ProductWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/ProductsBox.fxml").openStream());
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	public void ProductAddWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/AddProduct.fxml").openStream());
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	public void ProductEditWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/EditProduct.fxml").openStream());
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	public void ProductDeleteWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/DeleteProduct.fxml").openStream());
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	// Method to control button for Invoices
	public void CustomerWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/CustomerBox.fxml").openStream());
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	public void CustomerAddWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/AddCustomer.fxml").openStream());
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	public void CustomerEditWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/EditCustomer.fxml").openStream());
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	public void CustomerDeleteWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/DeleteCustomer.fxml").openStream());
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	// Method to control button for Invoices
	public void SalesOrderWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/SalesOrderBox.fxml").openStream());
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	public void SalesOrderAddWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/AddSalesOrder.fxml").openStream());
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	public void SalesOrderEditWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/EditSalesOrder.fxml").openStream());
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

		}

	}

	public void SalesOrderDeleteWindow(ActionEvent event) {

		try {
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/application/DeleteSalesOrder.fxml").openStream());
			root.setStyle("-fx-background-color: rgb(0, 128, 128);");
			Scene scene = new Scene(root, 900, 600);
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

	public void makeInvoice(ActionEvent event) {

		try {
			if (Model.isInvoiceMake(Integer.parseInt(txtDi.getText()), Integer.parseInt(txtId.getText()),
					txtDate.getText(), txtItems.getText(), Float.parseFloat(txtAmt.getText()))) {
				InvoiceStat.setText("Created");
			} else {
				InvoiceStat.setText("Error");
			}
		} catch (SQLException e) {
			InvoiceStat.setText("External Error");
			e.printStackTrace();
		}

	}

	public void editInvoice(ActionEvent event) {

		try {
			if (Model.isInvoiceEdit(Integer.parseInt(txtDi.getText()), Integer.parseInt(txtId.getText()),
					txtDate.getText(), txtItems.getText(), Float.parseFloat(txtAmt.getText()))) {
				InvoiceStat.setText("Created");
			} else {
				InvoiceStat.setText("Error");
			}
		} catch (SQLException e) {
			InvoiceStat.setText("External Error");
			e.printStackTrace();
		}

	}

	public void deleteInvoice(ActionEvent event) {

		try {
			if (Model.isInvoiceDelete(Integer.parseInt(txtDi.getText()))) {
				InvoiceStat.setText("Created");
			} else {
				InvoiceStat.setText("Error");
			}
		} catch (SQLException e) {
			InvoiceStat.setText("External Error");
			e.printStackTrace();
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

	public void makeInventory(ActionEvent event) {

		try {
			if (Model.isInventoryMake(Integer.parseInt(txtInventoryId.getText()), txtItemName.getText(),
					txtPartNum.getText(), Float.parseFloat(txtPrice.getText()),
					Integer.parseInt(txtQuantity.getText()))) {
				InventoryStat.setText("Created");
			} else {
				InventoryStat.setText("Error");
			}
		} catch (SQLException e) {
			InventoryStat.setText("External Error");
			e.printStackTrace();
		}

	}

	public void editInventory(ActionEvent event) {

		try {
			if (Model.isInventoryEdit(Integer.parseInt(txtInventoryId.getText()), txtItemName.getText(),
					txtPartNum.getText(), Float.parseFloat(txtPrice.getText()),
					Integer.parseInt(txtQuantity.getText()))) {
				InventoryStat.setText("Created");
			} else {
				InventoryStat.setText("Error");
			}
		} catch (SQLException e) {
			InventoryStat.setText("External Error");
			e.printStackTrace();
		}

	}

	public void deleteInventory(ActionEvent event) {

		try {
			if (Model.isInventoryDelete(Integer.parseInt(txtInventoryId.getText()))) {
				InventoryStat.setText("Created");
			} else {
				InventoryStat.setText("Error");
			}
		} catch (SQLException e) {
			InventoryStat.setText("External Error");
			e.printStackTrace();
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

	public void makeCustomer(ActionEvent event) {

		try {
			if (Model.isCustMake(Integer.parseInt(txtCustomerId.getText()), txtName.getText(), txtEmail.getText(),
					txtPhone.getText())) {
				CustomerStat.setText("Created");
			} else {
				CustomerStat.setText("Error");
			}
		} catch (SQLException e) {
			CustomerStat.setText("External Error");
			e.printStackTrace();
		}

	}

	public void editCustomer(ActionEvent event) {

		try {
			if (Model.isCustEdit(Integer.parseInt(txtCustomerId.getText()), txtName.getText(), txtEmail.getText(),
					txtPhone.getText())) {
				CustomerStat.setText("Created");
			} else {
				CustomerStat.setText("Error");
			}
		} catch (SQLException e) {
			CustomerStat.setText("External Error");
			e.printStackTrace();
		}

	}

	public void deleteCustomer(ActionEvent event) {

		try {
			if (Model.isCustDelete(Integer.parseInt(txtCustomerId.getText()))) {
				CustomerStat.setText("Created");
			} else {
				CustomerStat.setText("Error");
			}
		} catch (SQLException e) {
			CustomerStat.setText("External Error");
			e.printStackTrace();
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

	public void addProduct(ActionEvent event) {

		try {
			if (Model.isProdMake(Integer.parseInt(txtProductId.getText()), txtPartNumb.getText(),
					txtPartName.getText())) {

				ProductsStat.setText("Created");
			} else {
				ProductsStat.setText("Error");
			}
		} catch (SQLException e) {
			ProductsStat.setText("External Error");
			e.printStackTrace();
		}

	}

	public void changeProduct(ActionEvent event) {

		try {
			if (Model.isProdEdit(Integer.parseInt(txtProductId.getText()), txtPartNumb.getText(),
					txtPartName.getText())) {

				ProductsStat.setText("Created");
			} else {
				ProductsStat.setText("Error");
			}
		} catch (SQLException e) {
			ProductsStat.setText("External Error");
			e.printStackTrace();
		}

	}

	public void removeProduct(ActionEvent event) {

		try {
			if (Model.isProdDelete(Integer.parseInt(txtProductId.getText()))) {

				ProductsStat.setText("Created");
			} else {
				ProductsStat.setText("Error");
			}
		} catch (SQLException e) {
			ProductsStat.setText("External Error");
			e.printStackTrace();
		}

	}

} // End of Class
