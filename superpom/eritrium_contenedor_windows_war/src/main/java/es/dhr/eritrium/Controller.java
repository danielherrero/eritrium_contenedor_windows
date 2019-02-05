package es.dhr.eritrium;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<html><body>");
		response.getWriter().append("***** sesion:" + request.getSession().getId() + "*****<br/>");
		
		response.getWriter().append("Served at: ").append(request.getContextPath() + "<br/>");
		response.getWriter().append("*** HEADERS ***<br/>");
		Enumeration<String> en = request.getHeaderNames();
		while (en.hasMoreElements()) {
			String key = en.nextElement();
			String value = request.getHeader(key);
			response.getWriter().append(key + ":" + value + "<br/>");
		}
		response.getWriter().append("*** COOKIES ***<br/>");
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				response.getWriter().append(cookie.getName() + ":" + cookie.getValue() + "<br/>");
			}
		}
		response.getWriter().append("<a href='" + request.getRequestURL() + "'>Reload</a> <br/>");
		response.getWriter().append("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
