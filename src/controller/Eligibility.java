package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.EligibiltyCheck;

@WebServlet(urlPatterns= {"/eligiblemain"})
public class Eligibility extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		An object for the EligibilityCheck class in Eligibility.*
//		Call the checkQuizAnswers(String points) method with the object created.*
//	    Store the return value in a boolean variable spaceEligible.*
		String points=request.getParameter("points");
		System.out.println(points);
	
		EligibiltyCheck EC = new EligibiltyCheck();
		boolean spaceEligible = EC.checkQuizAnswer(points);
		System.out.println(spaceEligible);

	
	
	if(spaceEligible)
	{
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/success.html");
		rd.forward(request, response);	
	}
	else
	{
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/fail.jsp");
		rd.forward(request, response);
		
	}

}
}
