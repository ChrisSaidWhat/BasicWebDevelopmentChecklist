package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ChecklistLogic;

/**
 * Servlet implementation class RedirectionAdministratorServlet
 */
@WebServlet("/RedirectionAdministratorServlet")
public class RedirectionAdministratorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RedirectionAdministratorServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String seeResources = request.getParameter("seeResources");
		
		ChecklistLogic processing = new ChecklistLogic(seeResources);
		
		String redirectDestination = processing.redirectionManager(processing.getSeeResources());
		
		getServletContext().getRequestDispatcher(redirectDestination).forward(request, response);
	}

}
