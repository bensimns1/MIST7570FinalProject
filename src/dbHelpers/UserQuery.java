package dbHelpers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;


public class UserQuery {
	
public Connection connection;
	
	public UserQuery() {
		connection = MyDbConnection.getConnection();-
	}
	
	
	public void doAddUser(User user){
		String query = "INSERT INTO customer (userID, emailAddress, password, firstName, LastName) value (?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);

			ps.setString(1, user.getUserID());
			ps.setString(2, user.getEmailAddress());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getFirstName());
			ps.setString(5, user.getLastName());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doCheckUser(User user) {
		String query = "SELECT F_Name, L_Name FROM customer WHERE CustUserID = ? AND password = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ResultSet results = ps.executeQuery();
			results.next();
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}

}
