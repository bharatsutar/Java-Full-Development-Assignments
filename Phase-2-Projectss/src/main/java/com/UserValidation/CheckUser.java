package com.UserValidation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/checkUser")
public class CheckUser extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		HttpSession session = request.getSession();

		PrintWriter out = response.getWriter();

//		Check whether the session already exists
		if (session.getAttribute("userName") != null) {

			out.println("<h3>Welcome " + session.getAttribute("userName"));

			out.println("<br> You are now logged in!!</h3>");

			out.println("<br><p><h4><a href='logout'>LOGOUT</a></h4>");
		}
		else {
			response.sendRedirect("index.html");
		}
	}

	

}
