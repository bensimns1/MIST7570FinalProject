package model;

public class Product {
	
	private String product_ID;
	private String productType;
	private String name;
	private double productPrice;
	private int productQty;
	/**
	 * 
	 */
	public Product() {
		this.product_ID = "Ball01";
		this.productType = "steel";
		this.name = "Ball of Steel";
		this.productPrice = 99.99;
		this.productQty = 22;
	}
	/**
	 * @param product_ID
	 * @param productType
	 * @param name
	 * @param productPrice
	 * @param productQty
	 */
	public Product(String product_ID, String productType, String name, double productPrice, int productQty) {
		this.product_ID = product_ID;
		this.productType = productType;
		this.name = name;
		this.productPrice = productPrice;
		this.productQty = productQty;
	}
	/**
	 * @return the product_ID
	 */
	public String getProduct_ID() {
		return product_ID;
	}
	/**
	 * @param product_ID the product_ID to set
	 */
	public void setProduct_ID(String product_ID) {
		this.product_ID = product_ID;
	}
	/**
	 * @return the productType
	 */
	public String getProductType() {
		return productType;
	}
	/**
	 * @param productType the productType to set
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the productPrice
	 */
	public double getProductPrice() {
		return productPrice;
	}
	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	/**
	 * @return the productQty
	 */
	public int getProductQty() {
		return productQty;
	}
	/**
	 * @param productQty the productQty to set
	 */
	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [product_ID=" + product_ID + ", productType=" + productType + ", name=" + name + ", productPrice=" + productPrice
				+ ", productQty=" + productQty + "]";
	}
	
	
	
	
	
}
