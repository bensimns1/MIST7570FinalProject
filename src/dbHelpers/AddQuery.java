package dbHelpers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.User;


public class AddQuery {
	
public Connection connection;

	public AddQuery() {
		connection = MyDbConnection.getConnection();
	}
	
	
	public void doAddUser(User user){
		String query = "INSERT INTO customer (CustUserID, email, password, F_Name, L_Name) values (?, ?, ?, ?, ?)";
		
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
	
}
