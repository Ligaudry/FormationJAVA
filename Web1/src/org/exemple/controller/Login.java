package org.exemple.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.exemple.model.Utilisateur;
import org.exemple.model.UtilisateurManager;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String identity ;
		identity = request.getParameter("identity");
		//System.out.print(request.getParameter("identity"));
		if (identity != null){
		int id = Integer.parseInt(identity);
		displayView(request, response, UtilisateurManager.getInstance().getById(id));
		}
		else {
			request.getRequestDispatcher("/TemplateFormulaire.jsp").forward(request, response);
			
			}
		}
		

	private void displayView(HttpServletRequest request, HttpServletResponse response, Utilisateur userById) throws ServletException, IOException {
		if (userById == null){
			request.getRequestDispatcher("/TemplateFormulaire.jsp").forward(request, response);
			//response.sendRedirect("user/list");
			
		}
		else{
			request.getSession().setAttribute("user", userById);
			//request.setAttribute("name", identity);
			response.sendRedirect("user/list");
			
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
