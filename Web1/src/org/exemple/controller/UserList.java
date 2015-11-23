package org.exemple.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.exemple.model.Utilisateur;
import org.exemple.model.UtilisateurManager;

/**
 * Servlet implementation class UserList
 */
@WebServlet(urlPatterns={"/user/list","/users"})
public class UserList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		displayView(request, response, UtilisateurManager.getInstance().getAll());


	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void displayView(HttpServletRequest request, HttpServletResponse response, List<Utilisateur> users) throws ServletException, IOException{
		request.getSession().setAttribute("list", users);
		request.getRequestDispatcher("/TemplateUserList.jsp").forward(request, response);
			}
	
	
}
