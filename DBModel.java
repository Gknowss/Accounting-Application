package application;

import java.sql.*;

public class DBModel {

	Connection connection;

	public DBModel() {

		connection = DBConnect.Connector();
		if (connection == null) {
			System.exit(1);
		}

	}

	public boolean isConnected() {

		try {
			return !connection.isClosed();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean isLogin(String user, String pass) throws SQLException {
		PreparedStatement prepState = null;
		ResultSet resultSet = null;
		String query = "select * from Employee where username = ? and password = ?";
		try {
			prepState = connection.prepareStatement(query);
			prepState.setString(1, user);
			prepState.setString(2, pass);

			resultSet = prepState.executeQuery();
			if (resultSet.next()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		} finally {
			// prepState.close();
			// resultSet.close();
		}
	}

	public boolean isInvoice(int di, int id, String date, String items, double amount) throws SQLException {

		String query = "INSERT INTO Invoice (invoiceId, customerId, invoiceDate, items, totalAmount) values(?,?,?,?,?)";

		try {
			PreparedStatement prepState = connection.prepareStatement(query);
			prepState.setLong(1, di);
			prepState.setLong(2, id);
			prepState.setString(3, date);
			prepState.setString(4, items);
			prepState.setDouble(5, amount);

			prepState.executeUpdate();
			return true;

		} catch (Exception e) {
			return false;
		}

	}

	public boolean isCustomer(int customerId, String name, String email, double phone) throws SQLException {

		String query = "Insert INTO Customer (customerId, name, email, phone) values(?,?,?,?)";

		try {
			PreparedStatement prepState = connection.prepareStatement(query);
			prepState.setLong(1, customerId);
			prepState.setString(2, name);
			prepState.setString(3, email);
			prepState.setDouble(4, phone);

			prepState.executeUpdate();
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean isInventory(int inventoryId, String itemName, int partNum, double price, int quantity) throws SQLException {

		String query = "Insert INTO Inventory (inventoryId, itemName, partNum, price, quantity) values(?,?,?,?,?)";

		try {
			PreparedStatement prepState = connection.prepareStatement(query);
			prepState.setLong(1, inventoryId);
			prepState.setString(2, itemName);
			prepState.setLong(3, partNum);
			prepState.setDouble(4, price);
			prepState.setLong(5, quantity);

			prepState.executeUpdate();
			return true;
		} catch (Exception e) {
			return false;
		}

	}
	
	public boolean isProduct(int productId, double partNumb, String partName, int vendorId) throws SQLException {

		String query = "Insert INTO products (productId, partNumb, partName, vendorId) values(?,?,?,?)";

		try {
			PreparedStatement prepState = connection.prepareStatement(query);
			prepState.setLong(1, productId);
			prepState.setDouble(2, partNumb);
			prepState.setString(3, partName);
			prepState.setLong(4, vendorId);

			prepState.executeUpdate();
			return true;
		} catch (Exception e) {
			return false;
		}

	}
	
	public boolean isSales(int orderId, int customerId, String orderDate, double salesTotal) throws SQLException {

		String query = "Insert INTO SalesOrder (orderId, customerId, orderDate, salesTotal) values(?,?,?,?)";

		try {
			PreparedStatement prepState = connection.prepareStatement(query);
			prepState.setLong(1, orderId);
			prepState.setLong(2, customerId);
			prepState.setString(3, orderDate);
			prepState.setDouble(4, salesTotal);

			prepState.executeUpdate();
			return true;
		} catch (Exception e) {
			return false;
		}

	}
	
	

}
