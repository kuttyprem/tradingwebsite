package com.user;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HomeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String scrip = "", qty = "", buyamt = "", sellamt = "", pl = "";
			PrintWriter out = response.getWriter();
			File f1 = new File("C:\\Users\\Admin\\eclipse-workspace\\Demo_Website\\src\\main\\webapp\\txt_file\\scriptable.txt");
			Scanner scan = new Scanner(f1);
			scan.useDelimiter("[|]");
		
			 out.println("<!DOCTYPE html>");
	         out.println("<html>");
	         out.println("<head>");
	         
	         out.println("<meta charset='ISO-8859-1'>");
	         out.println("<title>Home Page</title>");
	         out.println("<meta charset='utf-8'>");
	         out.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
	         out.println("<link rel='stylesheet' href='css/Index.css'>");
	         out.println("<link rel='stylesheet' href='css/bootstrap.min.css'>");
	         out.println("<script src='https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js'></script>");
	         out.println("<script src='https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js'></script>");
	         out.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js'></script>");
			 out.println("<script src='js/general.js'></script>");
	         out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'>");
	         
	         /*Animation Lib*/
	         out.println("<link href='https://unpkg.com/aos@2.3.1/dist/aos.css' rel='stylesheet'>");
	         out.println("<script src='https://unpkg.com/aos@2.3.1/dist/aos.js'></script>");
	         
	         /*Google Fonts*/
	         /*Title Font*/
	         out.println("<link rel='preconnect' href='https://fonts.googleapis.com'>");
	         out.println("<link rel='preconnect' href='https://fonts.gstatic.com' crossorigin>");
	         out.println("<link href='https://fonts.googleapis.com/css2?family=Bodoni+Moda&display=swap' rel='stylesheet'>");
	         
	         /*Sub-Title Fonts*/
	         out.println("<link rel='preconnect' href='https://fonts.googleapis.com'>");
	         out.println("<link rel='preconnect' href='https://fonts.gstatic.com' crossorigin>");
	         out.println("<link href='https://fonts.googleapis.com/css2?family=Hubballi&display=swap' rel='stylesheet'>");
	         
	         /*Body Font*/
	         out.println("<link rel='preconnect' href='https://fonts.googleapis.com'>");
	         out.println("<link rel='preconnect' href='https://fonts.gstatic.com' crossorigin>");
	         out.println("<link href='https://fonts.googleapis.com/css2?family=Dosis&display=swap' rel='stylesheet'>");
	         
	         out.println("</head>");
	         out.println("<body>");
	         out.println("<nav class='navbar navbar-expand-lg navbar-light bg-light'><a class='navbar-brand' href='Home' style='text-decoration: none; margin: 0 auto;'><img src='img/vt_logo.png' width='75px; height : 35px;'></a><button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarTogglerDemo03' aria-controls='navbarTogglerDemo03' aria-expanded='false' aria-label='Toggle navigation'><span class='navbar-toggler-icon'></span></button><div class='collapse navbar-collapse' id='navbarTogglerDemo03'><ul class='navbar-nav mr-auto mt-2 mt-lg-0'></ul><form class='form-inline my-2 my-lg-0'><ul class='navbar-nav mr-auto mt-2 mt-lg-0'><li class='nav-item active'><a class='nav-link' href='Home'>Home<span class='sr-only'>(current)</span></a></li><li class='nav-item active'><a class='nav-link' href='Product'>Product</a></li><li class='nav-item active'><a class='nav-link' href='About_Us.html'>About Us</a></li><li class='nav-item active'><a class='nav-link' href='Contact_Us.html'>Contact Us</a></li><li class='nav-item active'><a class='nav-link' href='Login.jsp'>Login</a></li></ul></form></div></nav>");
	         
	         out.println("<div class='container'>");
	         
	         out.println("<div class='New_Line'></div>");
	         
	         out.print("<div class='row'><div class='col-md-12'> <h2 style='text-align : center; font-family: Bodoni Moda, serif;' ><div data-aos='zoom-in'>Welcome To VishaTech</div></h2></div></div>");
	         out.print("<div class='row'><div class='col-md-12'> <h3 style='text-align : center; font-family: Hubballi, cursive;letter-spacing : 2px;' ><div data-aos='zoom-in'>Ultimate Destination For All Your Trading Solutions</div></h3></div></div>");
	         
	         out.println("<div class='New_Line'></div>");
	         
	         //out.println("<div data-aos='fade-up-left'><img src='img/Background.png' alt='Home Img' style='width : 100%;height : auto;' /></div>");
	         out.println("<div class='container' style='width : 80%; margin : 0 auto;' ><div class='row' ><div class='col-md-12' ><img src='img/Background.png' alt='Home Img' style='width : 100%;height : auto;' /></div></div></div>");
	         
	         out.println("<div class='New_Line'></div>");
	         out.println("<div class='New_Line'></div>");
	         
	         out.println("<h2 class='heading' style='text-align: center;'>Our Services</h2>");
	         
	         out.println("<div class='row' ><div class='col-md-12' ><p style='font-family: Verdana, sans-serif; letter-spacing : 1px;text-align:left; font-weight : 400;' >&rArr;&nbsp;Our Company is a Leading Financial Services Company in India. We Help You To Manage The Uncertainties In Business In The Financial Services Industry, And We Offer Multiple Investment Opportunities For Long Term Investors,Pro Traders / Part-Time Traders Can Choose Across Various Asset Classes and Create a Customised Portfolio. All From One Platform :-</p></div></div>");
	         
	         out.println("<div class='row' > <div class='col-md-6' ><p style='font-family: Verdana, sans-serif; letter-spacing : 1px;text-align:left; font-weight : 400;' >&#8227;&nbsp;Stocks & IPOs<br><br>&#8227;&nbsp;Direct Mutual Funds<br><br>&#8227;&nbsp;Futures and Options<br><br>&#8227;&nbsp;Commodity Derivatives<br><br>&#8227;&nbsp;Bonds and Govt. Securities<br><br>&#8227;&nbsp;Currency Derivatives<br><br>&#8227;&nbsp;Crypto Currency<br></p></div> <div class='col-md-6' ><div data-aos='flip-left'><img src='img/Invest.png' alt='Investor Img' style='width : 100%;' /></div></div></div>");
	         
	         out.println("<div class='New_Line'></div>");
	         
	         out.println("<h2 class='heading' style='text-align: center;'>Scrip Table</h2>");
	         
	         out.println("<div class='New_Line'></div>");
	         
	         out.println("<div class='table-responsive' ><div data-aos='zoom-in'><table class='table table-bordered table-striped'>");
	         out.println("<thead class='thead-dark'>");
	         out.println("<tr>");
	         out.println("<th>#</th>");
	         out.println("<th>SCRIP</th>");
	         out.println("<th style='text-align : right;' >QTY</th>");
	         out.println("<th style='text-align : right;' >BUY AMOUNT</th>");
	         out.println("<th style='text-align : right;' >SELL AMOUNT</th>");
	         out.println("<th style='text-align : right;' >P&L</th>");
	         out.println("</tr>");
	         out.println("</thead>");
	         out.println("<tbody>");
	         
	         int sno = 1;
	         
	     	while (scan.hasNext()) {
	     		
	     		scrip = scan.next();
	     		qty = scan.next();
	     		buyamt = scan.next();
	     		sellamt = scan.next();
	     		pl = scan.next();
	     		
	     		 out.println("<tr>");
	 	         out.println("<td>"+sno+"</td>");
	 	         out.println("<td>"+scrip+"</td>");
	 	         out.println("<td style='text-align : right;' >"+qty+"</td>");
	 	         out.println("<td style='text-align : right;' >"+buyamt+"</td>");
	 	         out.println("<td style='text-align : right;' >"+sellamt+"</td>");
	 	         out.println("<td style='text-align : right;' >"+pl+"</td>");
	 	         out.println("</tr>");
	 	         
	 	         sno++;
	     		 
			}
	         
	         out.println("</tbody>");
	         out.println("</table></div></div>");
	         
	         out.println("<div class='row' > <div class='col-md-12' > <p style='font-family: Verdana, sans-serif; letter-spacing : 1px;text-align:left; font-weight : 400;'  >&rArr;&nbsp;The Above Given Scrip Are Our Favourite,Due To It's Stability & Volatility and We Have Years Of Experience In It. We Also Have Our Focus On Others Scrips too...</p> </div> </div>");
	         
	         out.println("<div class='New_Line'></div>");
	         out.println("<div class='New_Line'></div>");
	         
				/*
				 * out.
				 * println("<h2 class='heading' style='text-align: center;'>Live Market Status</h2>"
				 * ); out.println("<div class='New_Line'></div>"); out.
				 * println("<div class='row' style='margin : 0 auto;' ><div class='col-md-4' ></div><div class='col-md-4' style='margin : 0 auto;' > <div data-aos='fade-left' style='margin : 0 auto; width : 220px;' > <iframe id='moneywiz_widget' name='moneywiz_widget' src='//money.rediff.com/widget/moneywizwidget' scrolling='no' frameborder='0' marginHeight='0' marginWidth='0' style='width:220px; height:290px'></iframe> </div> </div> <div class='col-md-4' ></div> </div>"
				 * );
				 * out.
				 * println("<h2 class='heading' style='text-align: center;'>Our Inspiration</h2>"
				 * ); out.println("<div class='New_Line'></div>"); out.
				 * println("<div class='row'><div class='col-md-3' ></div><div class='col-md-6' ><div data-aos='flip-up'><img src='img/wb_quotes.png' alt='Warren Buffett Quote' style='width : 100%; height : auto;' /></div></div> <div class='col-md-3' ></div> </div>"
				 * );;
				 */
	         
	         out.println("<h2 class='heading' style='text-align: center;'>Live Market Data</h2>");
	         out.println("<div class='New_Line'></div>");
	         
	         out.println("<div class='row'><div class='col-md-3'><img src='img/wb1_vector.png' alt='Warren Buffett Quote' style='width : 100%; border-right : 2px solid #000;'></div><div class='col-md-6'><div style='padding : 7%;'><i class='fa fa-quote-left' aria-hidden='true' style='font-size:34px; color : #000;' ></i><br><br><h3 class='testimonial-peragraph' style='text-align : justify;'>IF YOU DON'T FIND A WAY TO MAKE MONEY WHILE YOU SLEEP, YOU WILL WORK UNTIL YOU DIE.<br><br>- WARREN BUFFETT</h3></div></div> <div class='col-md-3' > <div data-aos='fade-left' style='margin : 0 auto; width : 220px; padding : 7%; ' > <iframe id='moneywiz_widget' name='moneywiz_widget' src='//money.rediff.com/widget/moneywizwidget' scrolling='no' frameborder='0' marginHeight='0' marginWidth='0' style='width:220px; height:290px'></iframe> </div> </div> </div>");        
	         out.println("<hr>");
	         out.println("<div class='row' ><div class='col-md-12' > <p style='text-align : center' >All Rigths Reserved By VishaTech</p>  </div></div>");
	         
	         out.println("</div>");
	         
	         out.println("<script>AOS.init();</script>");
	         
	         out.println("</body>");
	         out.println("</html>");
	         
	         scan.close();
             out.close();
			
		}catch (Exception Ex) {
			System.out.println(Ex.getMessage());
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
