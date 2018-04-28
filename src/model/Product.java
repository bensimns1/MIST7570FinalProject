package model;

public class Product {
	
	private String prodID;
	private String type;
	private String prodName;
	private double prodPrice;
	private int prodQty;
	/**
	 * 
	 */
	public Product() {
		this.prodID = "Ball01";
		this.type = "steel";
		this.prodName = "Ball of Steel";
		this.prodPrice = 99.99;
		this.prodQty = 22;
	}
	/**
	 * @param prodID
	 * @param type
	 * @param prodName
	 * @param prodPrice
	 * @param prodQty
	 */
	public Product(String prodID, String type, String prodName, double prodPrice, int prodQty) {
		this.prodID = prodID;
		this.type = type;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodQty = prodQty;
	}
	/**
	 * @return the prodID
	 */
	public String getProdID() {
		return prodID;
	}
	/**
	 * @param prodID the prodID to set
	 */
	public void setProdID(String prodID) {
		this.prodID = prodID;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the prodName
	 */
	public String getProdName() {
		return prodName;
	}
	/**
	 * @param prodName the prodName to set
	 */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	/**
	 * @return the prodPrice
	 */
	public double getProdPrice() {
		return prodPrice;
	}
	/**
	 * @param prodPrice the prodPrice to set
	 */
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	/**
	 * @return the prodQty
	 */
	public int getProdQty() {
		return prodQty;
	}
	/**
	 * @param prodQty the prodQty to set
	 */
	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [prodID=" + prodID + ", type=" + type + ", prodName=" + prodName + ", prodPrice=" + prodPrice
				+ ", prodQty=" + prodQty + "]";
	}
	
	
	
	
	
}
