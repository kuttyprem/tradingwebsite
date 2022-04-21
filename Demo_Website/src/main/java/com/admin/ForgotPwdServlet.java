package com.admin;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FgotPwd")
public class ForgotPwdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ForgotPwdServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    String FEmail = request.getParameter("ForgotMail");
	    
		if (FEmail.equalsIgnoreCase("dselvaganesan@gmail.com")) {

			System.out.println("Email Is Valid");

			 // Recipient's email ID needs to be mentioned.
	        String to = "dropmail2jai@gmail.com";

	        // Sender's email ID needs to be mentioned
	        final  String from = "ennaipaaryogamvaarum@gmail.com";

	        // Assuming you are sending email from through gmails smtp
	        String host = "smtp.gmail.com";

	        // Get system properties
	        //Properties properties = System.getProperties();
	        Properties properties = new Properties();

	        // Setup mail server
	        properties.put("mail.smtp.host", host);
	        properties.put("mail.smtp.port", "465");
	        properties.put("mail.smtp.ssl.enable", "true");
	        properties.put("mail.smtp.auth", "true");

	        // Get the Session object.// and pass username and password
	        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

	            @Override
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(from, "Googleaccount");
	            }
	        });

	        // Used to debug SMTP issues
	        session.setDebug(true);

	        try {
	            // Create a default MimeMessage object.
	            MimeMessage message = new MimeMessage(session);

	            // Set From: header field of the header.
	            message.setFrom(new InternetAddress(from));

	            // Set To: header field of the header.
	            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	            // Set Subject: header field
	            message.setSubject("Current Username and Password For vishatech.in");

	            // Set Send date
	            message.setSentDate(new Date());

	            String content = "<!DOCTYPE html>";
	            content += "<html><head><meta http-equiv='Content-Type' content='text/html; charset=utf-8'/></head>";
	            content += "<body style='font-family:Geneva,Helvetica,Arial,sans-serif; font-size: 12px;'>";
	            content += "Hi Selvaganesan,<br/>";
	            content += "<br />Your Current Username And Password For <a href='vishatech.in'>vishatech.in</a> Are Given Below :-<br />";
	            content += "<p><span style='color:#000066'><strong><u>User Name : </u></strong></span><em><strong>";
	            content += "<span style='color:#cc0066'>Hello</span></strong></em></p>";
	            content += "<p><span style='color:#000066'><strong><u>Password : </u></strong></span><em><strong>";
	            content += "<span style='color:#cc0066'>Hello@123</span></strong></em></p>";
	            content += "<br />";
	            content += "<strong>Regards</strong><br />";
	            content += "<em>Jaya Surya T</em><br />";
	            content += "dropmail2jai@gmail.com<br />";
	            content += "</body></html>";

	            // Now set the actual message
	            message.setContent(content, "text/html");
	            //message.setText("This is actual message");

	            System.out.println("sending...");
	            // Send message
	            Transport.send(message);
	            System.out.println("Sent message successfully....");
	        } catch (MessagingException mex) {
	            mex.printStackTrace();
	        }
	        
	        RequestDispatcher dispatcher = request.getRequestDispatcher("Home");
	        dispatcher.forward(request, response);
	    
		}
        
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
