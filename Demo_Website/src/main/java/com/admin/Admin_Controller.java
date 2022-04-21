package com.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/FileUploadServlet")
@MultipartConfig(
        fileSizeThreshold   = 1024 * 1024 * 1,  // 1 MB
        maxFileSize         = 1024 * 1024 * 10, // 10 MB
        maxRequestSize      = 1024 * 1024 * 15 // 15 MB
        //location            = "D:/Uploads"
)
public class Admin_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Admin_Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Servlet Hitted Successfully...");
		
		try {
			Part filePart = request.getPart("TxtFileName");
			String fName = filePart.getSubmittedFileName();
		    for (Part part : request.getParts()) {
		      part.write("C:\\Users\\Admin\\eclipse-workspace\\Demo_Website\\src\\main\\webapp\\txt_file\\" + fName);
		    }
		    
		    RequestDispatcher dispatcher = request.getRequestDispatcher("Home");
	        dispatcher.forward(request, response);

		} catch (Exception ex) {
			ex.getMessage();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}
