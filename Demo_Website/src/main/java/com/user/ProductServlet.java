package com.user;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Product")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ProductServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String title = "", content = "";
			PrintWriter out = response.getWriter();
			File f1 = new File("C:\\Users\\Admin\\eclipse-workspace\\Demo_Website\\src\\main\\webapp\\txt_file\\product.txt");
			Scanner scan = new Scanner(f1);
			scan.useDelimiter("[|]");
			
			 out.println("<!DOCTYPE html>");
             out.println("<html>");
             out.println("<head>");
             
             out.println("<meta charset='ISO-8859-1'>");
             out.println("<title>Product Page</title>");
             out.println("<meta charset='utf-8'>");
             out.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
             out.println("<link rel='stylesheet' href='css/Index.css'>");
             out.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css'>");
             out.println("<script src='https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js'></script>");
             out.println("<script src='https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js'></script>");
             out.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js'></script>");
             out.println("<script src='js/general.js'></script>");
             
             /*Body Font*/
             out.println("<link rel='preconnect' href='https://fonts.googleapis.com'>");
	         out.println("<link rel='preconnect' href='https://fonts.gstatic.com' crossorigin>");
	         out.println("<link href='https://fonts.googleapis.com/css2?family=Dosis&display=swap' rel='stylesheet'>");
             
             out.println("</head>");
             out.println("<body>");
	         out.println("<nav class='navbar navbar-expand-lg navbar-light bg-light'><a class='navbar-brand' href='Home' style='text-decoration: none; margin: 0 auto;'><img src='img/vt_logo.png' width='75px; height : 35px;'></a><button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarTogglerDemo03' aria-controls='navbarTogglerDemo03' aria-expanded='false' aria-label='Toggle navigation'><span class='navbar-toggler-icon'></span></button><div class='collapse navbar-collapse' id='navbarTogglerDemo03'><ul class='navbar-nav mr-auto mt-2 mt-lg-0'></ul><form class='form-inline my-2 my-lg-0'><ul class='navbar-nav mr-auto mt-2 mt-lg-0'><li class='nav-item active'><a class='nav-link' href='Home'>Home<span class='sr-only'>(current)</span></a></li><li class='nav-item active'><a class='nav-link' href='Product'>Product</a></li><li class='nav-item active'><a class='nav-link' href='About_Us.html'>About Us</a></li><li class='nav-item active'><a class='nav-link' href='Contact_Us.html'>Contact Us</a></li><li class='nav-item active'><a class='nav-link' href='Login.jsp'>Login</a></li></ul></form></div></nav>");
             
             out.println("<div style='color: #474747; padding: 5% 8%;text-align : center;'>");
             
             out.println("<div class='row'> <div class='col-md-12' > <h1 class='heading' style='text-align:center;' >Our Products</h1> </div> </div>");
             
             out.println("<div class='New_Line' ></div>");
             
         	while (scan.hasNext()) {
				title = scan.next();
				content = scan.next();
				String heading = title.replace("*", "<br>");
				String about = content.replace("*", "<br>&#8227;&nbsp;");

				out.println("<div class='row'> <div class='col-md-12'> <h4 class='heading' style='text-align:left;color:#000;' >&rArr;&nbsp;"+heading+"</h4><p style='font-family: Verdana, sans-serif; letter-spacing : 1px; text-align:left; font-weight : 400;' >&#8227;&nbsp;"+about+"</p> </div></div><br>");
				
			}
             
             out.println("</div>");
             
             out.println("<div class='row' ><div class='col-md-12' > <hr> <p style='text-align : center' >All Rigths Reserved By VishaTech</p>  </div></div>");
             
             out.println("</body>");
             out.println("</html>");
             
             scan.close();
             out.close();

		} catch (FileNotFoundException exception) {
			System.out.println(exception.getMessage());
			exception.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
