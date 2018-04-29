package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import dbHelpers.UserQuery;

/**
 * Servlet implementation class AddUser
 */
@WebServlet(description = "Controller for adding a new user to the database", 
			urlPatterns = { "/addUser" })
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
		String custUserID = request.getParameter("custUserID");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String f_Name = request.getParameter("f_Name");
		String l_Name = request.getParameter("l_Name");

		
		//setup a user object
		User user = new User();
		user.setCustUserID(custUserID);
		user.setEmail(email);;
		user.setPassword(password);
		user.setF_Name(f_Name);
		user.setL_Name(l_Name);

		//setup an dbHelper Object
		UserQuery uq = new UserQuery();     
		
		//pass the user to UserQuery to add to the database
		uq.doAddUser(user);
		
		//pass execution control to the jsp
		HttpSession session = request.getSession();
		session.setAttribute("custUserID", custUserID);
		session.setAttribute("f_Name", f_Name);
		session.setAttribute("l_Name", l_Name);
		
		String url = "/registrationTest.jsp";
		
	    RequestDispatcher dispatcher = request.getRequestDispatcher(url);
	    dispatcher.forward(request, response);
	}

}
