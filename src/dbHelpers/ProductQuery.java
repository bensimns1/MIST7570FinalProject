package dbHelpers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Product;


public class ProductQuery {
	private Connection connection;

    public ProductQuery() {
		connection = MyDbConnection.getConnection();
    }
    
    public void doGetProduct() {
    	String query = "Query to get product info";
    }
    

}
