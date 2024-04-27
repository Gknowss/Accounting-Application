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
			prepState.setString(2,  pass);
			
			resultSet = prepState.executeQuery();
			if (resultSet.next()) {
				return true;
			}
			else {
				return false;
			}
		} catch (Exception e) {
			return false;
		} finally {
			if (prepState != null && resultSet != null) {
				prepState.close();
				resultSet.close();
			}
		}
	}
	
	public boolean isInvoiceMake(int di, int id, String date, String items, float amount) throws SQLException {
		
		String query = "INSERT INTO Invoice(invoiceId, customerId, invoiceDate, items, totalAmount) VALUES(?,?,?,?,?)";
		
		try {
			PreparedStatement prepState = connection.prepareStatement(query);
			prepState.setLong(1, di);
			prepState.setLong(2, id);
			prepState.setString(3,  date);
			prepState.setString(4,  items);
			prepState.setDouble(5, amount);
			
			prepState.executeUpdate();
			return true;
			
		} catch (Exception e) {
			System.out.print(e);
			return false;
		} 
		
	}
	
	public boolean isInvoiceEdit(int di, int id, String date, String items, float amount) throws SQLException {
			
			String query = "UPDATE Invoice SET customerId = ?, invoiceDate = ?, items = ?, totalAmount = ? WHERE invoiceId = ?";
			
			try {
				PreparedStatement prepState = connection.prepareStatement(query);
				prepState.setLong(1, id);
				prepState.setString(2,  date);
				prepState.setString(3,  items);
				prepState.setDouble(4, amount);
				prepState.setLong(5, di);
				
				prepState.executeUpdate();
				return true;
				
			} catch (Exception e) {
				System.out.print(e);
				return false;
			} 
			
		}
	
	public boolean isInvoiceDelete(int di) throws SQLException {
			
			String query = "DELETE FROM Invoice WHERE invoiceId = ?";
			
			try {
				PreparedStatement prepState = connection.prepareStatement(query);
				prepState.setLong(1, di);
				
				prepState.executeUpdate();
				return true;
				
			} catch (Exception e) {
				System.out.print(e);
				return false;
			} 
			
		}
	
	
	public boolean isCustMake(int id, String name, String email, String phone) throws SQLException {
			
			String query = "INSERT INTO Customer(customerId, name, email, phone) VALUES(?,?,?,?)";
			
			try {
				PreparedStatement prepState = connection.prepareStatement(query);
				prepState.setLong(1, id);
				prepState.setString(2,  name);
				prepState.setString(3,  email);
				prepState.setString(4, phone);
				
				prepState.executeUpdate();
				return true;
				
			} catch (Exception e) {
				System.out.print(e);
				return false;
			} 
			
		}
	
	public boolean isCustEdit(int id, String name, String email, String phone) throws SQLException {
		
		String query = "UPDATE Customer SET name = ?, email = ?, phone = ? WHERE customerId = ?";
		
		try {
			PreparedStatement prepState = connection.prepareStatement(query);
			prepState.setString(1,  name);
			prepState.setString(2,  email);
			prepState.setString(3, phone);
			prepState.setLong(4, id);
			
			prepState.executeUpdate();
			return true;
			
		} catch (Exception e) {
			System.out.print(e);
			return false;
		} 
		
	}
	
	public boolean isCustDelete(int di) throws SQLException {
		
		String query = "DELETE FROM Customer WHERE customerId = ?";
		
		try {
			PreparedStatement prepState = connection.prepareStatement(query);
			prepState.setLong(1, di);
			
			prepState.executeUpdate();
			return true;
			
		} catch (Exception e) {
			System.out.print(e);
			return false;
		} 
		
	}
	
	public boolean isInventoryMake(int di, String itemName, String partNum, float unitPrice, int count) throws SQLException {
		
		String query = "INSERT INTO Inventory(InventoryID, itemName, PartNumber, UnitPrice, Quantity) VALUES(?,?,?,?,?)";
		
		try {
			PreparedStatement prepState = connection.prepareStatement(query);
			prepState.setLong(1, di);
			prepState.setString(2, itemName);
			prepState.setString(3,  partNum);
			prepState.setFloat(4,  unitPrice);
			prepState.setLong(5, count);
			
			prepState.executeUpdate();
			return true;
			
		} catch (Exception e) {
			System.out.print(e);
			return false;
		} 
		
	}
	
	public boolean isInventoryEdit(int di, String itemName, String partNum, float unitPrice, int count) throws SQLException {
			
			String query = "UPDATE Inventory SET itemName = ?, partNumber = ?, UnitPrice = ?, Quantity = ? WHERE IsnventoryID = ?";
			
			try {
				PreparedStatement prepState = connection.prepareStatement(query);
				prepState.setString(1, itemName);
				prepState.setString(2,  partNum);
				prepState.setFloat(3,  unitPrice);
				prepState.setLong(4, count);
				prepState.setLong(5, di);
				
				prepState.executeUpdate();
				return true;
				
			} catch (Exception e) {
				System.out.print(e);
				return false;
			} 
			
		}
	
	public boolean isInventoryDelete(int di) throws SQLException {
			
			String query = "DELETE FROM Inventory WHERE InventoryID = ?";
			
			try {
				PreparedStatement prepState = connection.prepareStatement(query);
				prepState.setLong(1, di);
				
				prepState.executeUpdate();
				return true;
				
			} catch (Exception e) {
				System.out.print(e);
				return false;
			} 
			
		}
	
	public boolean isProdMake(int di, String partNum, String partName) throws SQLException {
		
		String query = "INSERT INTO Products(productId, partNumber, partName) VALUES(?,?,?)";
		
		try {
			PreparedStatement prepState = connection.prepareStatement(query);
			prepState.setLong(1, di);
			prepState.setString(2, partNum);
			prepState.setString(3, partName);
			
			prepState.executeUpdate();
			return true;
			
		} catch (Exception e) {
			System.out.print(e);
			return false;
		} 
		
	}
	
	public boolean isProdEdit(int di, String partNum, String partName) throws SQLException {
			
			String query = "UPDATE Products SET partNumber = ?, partName = ? WHERE productId = ?";
			
			try {
				PreparedStatement prepState = connection.prepareStatement(query);
				prepState.setString(1, partNum);
				prepState.setString(2, partName);
				prepState.setLong(3, di);
				
				prepState.executeUpdate();
				return true;
				
			} catch (Exception e) {
				System.out.print(e);
				return false;
			} 
			
		}
	
	public boolean isProdDelete(int di) throws SQLException {
			
			String query = "DELETE FROM Products WHERE productId = ?";
			
			try {
				PreparedStatement prepState = connection.prepareStatement(query);
				prepState.setLong(1, di);
				
				prepState.executeUpdate();
				return true;
				
			} catch (Exception e) {
				System.out.print(e);
				return false;
			} 
			
		}
	
}
