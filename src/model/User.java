package model;

public class User {
	
	private String custUserID;
	private String email;
	private String password;
	private String f_Name;
	private String l_Name;

	/**
	 * 
	 */
	public User() {
		this.custUserID = "User01";
		this.email="No email";
		this.password="password";
		this.f_Name="Steve";
		this.l_Name="Brule";
	}

	/**
	 * @param custUserID
	 * @param email
	 * @param password
	 * @param f_Name
	 * @param l_Name
	 */
	public User(String custUserID, String email, String password, String f_Name, String l_Name) {
		this.custUserID = custUserID;
		this.email = email;
		this.password = password;
		this.f_Name = f_Name;
		this.l_Name = l_Name;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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

	/**
	 * @return the f_Name
	 */
	public String getF_Name() {
		return f_Name;
	}

	/**
	 * @param f_Name the f_Name to set
	 */
	public void setF_Name(String f_Name) {
		this.f_Name = f_Name;
	}

	/**
	 * @return the l_Name
	 */
	public String getL_Name() {
		return l_Name;
	}

	/**
	 * @param l_Name the l_Name to set
	 */
	public void setL_Name(String l_Name) {
		this.l_Name = l_Name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [custUserID=" + custUserID + ", email=" + email + ", password=" + password + ", f_Name=" + f_Name
				+ ", l_Name=" + l_Name + "]";
	}

	

}
