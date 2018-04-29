package dbHelpers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;

public class UserQuery{

private Connection connection;
private ResultSet results;

private User user = null;
private String custUserID;

    public UserQuery(String custUserID) {
		this.custUserID = custUserID;
    	connection = MyDbConnection.getConnection();


    }

    public void doCheckUser () {
    	
    	String query = "SELECT * FROM customer WHERE CustUserID = ?";
    	
    	user = null;
    	
    	try {
    	PreparedStatement ps = connection.prepareStatement(query);
		
		ps.setString(1, this.custUserID);
        
		this.results = ps.executeQuery();
		
		this.results.next();
		
		user = new User();
		user.setCustUserID(this.results.getString("custUserID"));
		user.setEmail(this.results.getString("email"));
		user.setF_Name(this.results.getString("f_Name"));
		user.setL_Name(this.results.getString("l_Name"));
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    	public User getUser() {
    		return this.user;
    	}
}
