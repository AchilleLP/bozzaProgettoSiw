package it.uniroma3.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma3.model.Autore;
import it.uniroma3.model.Opera;
import it.uniroma3.service.AutoreService;
import it.uniroma3.service.OperaService;
import it.uniroma3.validator.ValidatorOpera;
@WebServlet("/controllerOpere")
public class controllerOpere extends HttpServlet {
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		OperaService os = new OperaService();
		if(request.getParameter("deleteAllOpere")!=null){
			os.cancellaOpere();
		}
		List<Opera> opere = os.getOpere();
		request.setAttribute("opere", opere);
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/opere.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		String nextPage;
		HttpSession session = request.getSession();
		if(session.getAttribute("autenticato")==null){
			nextPage="/login.jsp";
		}
		else{
			Opera nuovaOpera = new Opera();
			request.setAttribute("opera", nuovaOpera);
			ValidatorOpera v = new ValidatorOpera();
			if(v.validate(request)){
				OperaService os = new OperaService();
				os.inserisciOpera(nuovaOpera);
			}
			nextPage = "/homePage.jsp";
		}
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher(nextPage);
		rd.forward(request, response);
		
	}
}
