package dbHelpers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Product;

public class ProductQuery {
	public Connection connection;
	private ResultSet results;
	
	public ProductQuery () {
		connection = MyDbConnection.getConnection();	
	}
	
	public void doRead() {
		String query = "SELECT * FROM product";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			this.results = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getHTMLTable(){
		String table ="";
		table += "<table border=1>";
		
		try {
			while(this.results.next()){
				Product product = new Product();
				product.setProduct_ID(this.results.getString("product_ID"));
				product.setName(this.results.getString("name"));
				product.setProductType(this.results.getString("productType"));
				product.setProductPrice(this.results.getDouble("productPrice"));
				product.setProductQty(this.results.getInt("productQty"));
				
				table +="</tr>";
				table +="<tr>";
				table +="<td>";
				table += "Product";
				table +="</td>";
				table +="<td>";
				table += "Price";
				table +="</td>";
				table +="<td>";
				table += "Onhand Qty";
				table +="</td>";				
				table +="</tr>";			
				table +="</tr>";
				table +="<tr>";
				table +="<td>";
				table += product.getName();
				table +="</td>";
				table +="<td>";
				table += "$" + product.getProductPrice();
				table +="</td>";
				table +="<td>";
				table += product.getProductQty();
				table +="</td>";				
				table +="</tr>";
				table +="<tr>";
				table +="</tr>";
				table +="<tr>";
				table +="</tr>";
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		table += "</table>";
		return table;
	}
}
