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
			//prepState.close();
			//resultSet.close();
		}
	}
	
	public boolean isInvoice(int di, int id, String date, String items, double amount) throws SQLException {
		
		String query = "INSERT INTO Invoice (invoiceId, customerId, invoiceDate, items, totalAmount) values(?,?,?,?,?)";
		
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
			return false;
		} 
		
	}
	
}
