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
			return connection.isClosed();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
}
