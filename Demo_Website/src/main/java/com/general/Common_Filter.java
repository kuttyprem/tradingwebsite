package com.general;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/*")
public class Common_Filter extends HttpServlet implements Filter {

	public Common_Filter() {
		super();
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		try {

			HttpServletRequest req = (HttpServletRequest) request;
			HttpServletResponse res = (HttpServletResponse) response;
			String requestPath = req.getRequestURI();

			if (requestPath.endsWith("Admin.jsp")) {
				res.sendRedirect(req.getContextPath() + "/Login.jsp");
			} else {
				chain.doFilter(request, response);
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
