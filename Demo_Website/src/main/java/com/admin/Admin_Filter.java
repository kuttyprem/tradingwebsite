package com.admin;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/AdminLogin")
public class Admin_Filter extends HttpServlet implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		try {

			HttpServletRequest req = (HttpServletRequest) request;
			HttpServletResponse res = (HttpServletResponse) response;
			String requestPath = req.getRequestURI();

			String UName = request.getParameter("username");
			String UPassword = request.getParameter("keycode");

			if (UName.equalsIgnoreCase("Hello") && UPassword.equalsIgnoreCase("Hello@123")) {
				chain.doFilter(request, response);
			} else if (UName.equalsIgnoreCase("Hi") && UPassword.equalsIgnoreCase("Hi@456")) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("SuperAdmin.jsp");
				dispatcher.forward(request, response);
			} else {
				res.sendRedirect(req.getContextPath() + "/Login.jsp");
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
			dispatcher.forward(request, response);
		}

	}

	public void destroy() {
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
