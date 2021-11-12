package com.naveen.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/multiply")
public class MultiplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); // application/pdf (MIME Types), text/xml, msexcel 
		PrintWriter out = response.getWriter();
		try {
			int value = Integer.parseInt(request.getParameter("val"));
			
			out.println("<html><body><table>");
			// 10 x 1 = 10 
			for(int i=1; i<=10; i++) {
				out.println("<tr><td>" + value +" x " + i +" = " + (i*value) +"</td></tr>"); 
			}
			out.println("</table></body></html>");
		}catch(NumberFormatException nfe) {
			out.print("Sorry dont enter chars" + nfe.getMessage()); 
			nfe.printStackTrace();
		}
	}

}
