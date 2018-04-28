package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import dbHelpers.UserQuery;

/**
 * Servlet implementation class AddUser
 */
@WebServlet(description = "Controller for adding a new user to the database", urlPatterns = { "/AddUser" })
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		throw new RuntimeException();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the data
		String userID = request.getParameter("userID");
		String password = request.getParameter("password");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String emailAddress = request.getParameter("emailAddress");
		
		//setup a user object
		User user = new User();
		user.getUserID();
		user.getPassword();
		user.getFirstName();
		user.getLastName();
		user.getEmailAddress();
		
		//setup an dbHelper Object
		UserQuery uq = new UserQuery();     
		
		//pass the user to UserQuery to add to the database
		uq.doAddUser(user);
		
		//pass execution control to the jsp
		String url = "/registrationTest.jsp";
		
	    RequestDispatcher dispatcher = request.getRequestDispatcher(url);
	    dispatcher.forward(request, response);
	}

}
