package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDbConnection {
	
	private static final String dbName = "roberts_simmons";
	private static final String dbUser = "root";
	private static final String dbPwd  = "school";
	
	private static Connection connection = null;
	private MyDbConnection () {}
	
	public static Connection getConnection() {
		if (connection != null) {
			return connection;
		}
		
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(url, dbUser, dbPwd); 
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		
		if (connection == null) {
			throw new RuntimeException("Error connecting to database.");
		}
		
		return connection;
	}	
}