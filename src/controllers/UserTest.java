package controllers;

import dbHelpers.UserQuery;
import model.User;

public class UserTest {

	public static void main(String[] args) {
		
		String custUserID = "JR101";
		String f_Name = "";
		
		User user = new User();
		user.setCustUserID(custUserID);

		
		UserQuery uq = new UserQuery();
		uq.doAddUser(user);
		user.setF_Name(f_Name);
		
		System.out.println("First Name=" + user.getF_Name());

	}

}
