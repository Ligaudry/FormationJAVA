	package org.exemple.filters;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet Filter implementation class HTML5CorsFilter
 */
@WebFilter(filterName="HTML5CorsFilter",urlPatterns={"/*"})//url cibles du filtre
public class HTML5CorsFilter implements Filter {
	private static final Logger logger = Logger.getLogger( HTML5CorsFilter.class.getName() );
	 

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		logger.log( Level.INFO, "HTML5CorsFilter"+ request.getRemoteAddr() );
        HttpServletResponse res = (HttpServletResponse) response;
        res.addHeader("Access-Control-Allow-Origin", "*");//* toutes les adresses ip sont autoris�es
        res.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");//ici toutes les m�thodes sont autoris�es
        res.addHeader("Access-Control-Allow-Headers", "Content-Type");//en disant content-type je dis  que tout format est autoris�
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	}

	@Override
	public void destroy() {
	}

}
