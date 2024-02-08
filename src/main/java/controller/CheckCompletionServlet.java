package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ChecklistLogic;

/**
 * Servlet implementation class CheckCompletionServlet
 */
@WebServlet("/CheckCompletionServlet")
public class CheckCompletionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckCompletionServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String htmlStatus = request.getParameter("htmlStatus");
		String cssStatus = request.getParameter("cssStatus");
		
		ChecklistLogic processing = new ChecklistLogic(htmlStatus, cssStatus);
		
		String correspondingMessage = processing.correspondingMessageAssignment(processing.getHtmlStatus(), processing.getCssStatus());
		String redirectDestination = processing.redirectionManager(processing.getHtmlStatus(), processing.getCssStatus());
		
		request.setAttribute("correspondingMessage", correspondingMessage);
		getServletContext().getRequestDispatcher(redirectDestination).forward(request, response);
	}

}
