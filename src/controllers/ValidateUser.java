package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbHelpers.UserQuery;
import model.User;

/**
 * Servlet implementation class ValidateUser
 */
@WebServlet("/ValidateUser")
public class ValidateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String custUserID = request.getParameter("custUserID");
		String password = request.getParameter("password");
		String email = null;
		String f_Name = null;
		String l_Name = null;

		UserQuery uq = new UserQuery(custUserID);
		uq.doCheckUser();
		
		User user = new User();
		user.setCustUserID(custUserID);
		user.setPassword(password);
		

		
		HttpSession session = request.getSession();
		session.setAttribute("custUserID", custUserID);
		session.setAttribute("email", email);
		session.setAttribute("f_Name", f_Name);
		session.setAttribute("l_Name", l_Name);
		
		String url = "/loggedIn.jsp";
		
	    RequestDispatcher dispatcher = request.getRequestDispatcher(url);
	    dispatcher.forward(request, response);		
	}

}
