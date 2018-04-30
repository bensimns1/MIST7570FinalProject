package model;

public class Login {

	private String custUserID;
	private String password;
	
	public Login() {
		this.custUserID = "User01";
		this.password="password";
	}
	
	/**
	 * @param custUserID
	 * @param password
	 */
	public Login(String custUserID, String password) {
		this.custUserID = custUserID;
		this.password = password;
		}

	/**
	 * @return the custUserID
	 */
	public String getCustUserID() {
		return custUserID;
	}

	/**
	 * @param custUserID the custUserID to set
	 */
	public void setCustUserID(String custUserID) {
		this.custUserID = custUserID;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Login [custUserID=" + custUserID + ", password=" + password + "]";
	}
	
	
	
}
