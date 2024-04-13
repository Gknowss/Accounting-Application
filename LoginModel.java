package application;

import java.sql.*;

public class LoginModel {

	Connection connection;
	
	public LoginModel() {
		
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
			prepState.close();
			resultSet.close();
		}
	}
	
}
