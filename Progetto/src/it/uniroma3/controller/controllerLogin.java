package it.uniroma3.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class controllerLogin extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		String nextPage="/login.jsp";
		if(request.getParameter("user").equals("achille") && request.getParameter("password").equals("koalina")){
			nextPage = "/homePage.jsp";
			HttpSession session = request.getSession();
			session.setAttribute("autenticato", true);
		}
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher(nextPage);
		rd.forward(request, response);
	
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		String nextPage = "/homePage.jsp";
		HttpSession session = request.getSession();
		session.setAttribute("autenticato", null);
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher(nextPage);
		rd.forward(request, response);
	}
}
