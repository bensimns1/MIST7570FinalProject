package dbHelpers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;


public class UserQuery {
	
private Connection connection;
private ResultSet results;

	public UserQuery() {
		connection = MyDbConnection.getConnection();
	}
	
	
	public User doRead(String custUserID) {
		String query = "SELECT * FROM customer WHERE custUserID = (?)";
		
		User user = null;
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			ps.setString(1, custUserID);
			ResultSet results = ps.executeQuery();
			
			results.next();
			
			user = new User (
					results.getString("custUserID"),
					results.getString("email"),
					results.getString("password"),
					results.getString("f_Name"),
					results.getString("l_name")
							);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}
	
	
	public void doAddUser(User user){
		String query = "INSERT INTO customer (CustUserID, email, password, F_Name, L_Namedo) value (?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);

			ps.setString(1, user.getCustUserID());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getF_Name());
			ps.setString(5, user.getL_Name());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doCheckUser(User user) {
		String query = "SELECT F_Name, L_Name FROM customer WHERE CustUserID = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			this.results = ps.executeQuery();
			results.next();
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}

}
