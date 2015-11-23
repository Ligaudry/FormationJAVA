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
 * Servlet implementation class UserDetail
 */
@WebServlet("/user/detail")
public class UserDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String format = request.getParameter("format");
		format = format.toLowerCase();
		
		if (id!=null && !id.isEmpty()){
			Utilisateur user = UtilisateurManager.getInstance().getById(Integer.parseInt(id));
			request.setAttribute("utilisateur", user);
			
			switch(format){
			case "xml":
				response.setContentType("application/xml");
				response.getWriter().println(user.toXML());
            break;
			case "json":
				response.setContentType("application/json");
				response.getWriter().println(user.toJSON());
			break;
			default :
				request.getRequestDispatcher("/TemplateDetailsUser.jsp").forward(request, response);
				//response.setContentType("text/html");
			break;
			}
			
							
			}
		}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
	
	
	
}
