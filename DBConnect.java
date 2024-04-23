package application;
import java.sql.*;

public class DBConnect {

	
	// Uses Connection variable from java.sql import
	public static Connection Connector() {

		try {
			// SQLite connection string
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:GradeAAccounting.db");
			return conn;
			
		} catch (Exception e) {
			
			System.out.println(e);
			return null;
			
		}
		
	}

}
