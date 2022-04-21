package com.general;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class VTSendMail {

	public static void send() {
		
		System.out.println("Send mail Servlet Hitted");
		
		 // Recipient's email ID needs to be mentioned.
        //String to = "tj06072001@gmail.com";
        String to = "dropmail2jai@gmail.com";

        
        // Sender's email ID needs to be mentioned
        final  String from = "tj06072001@gmail.com";

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

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
            message.setSubject("This is the Subject Line!");

            // Set Send date
            message.setSentDate(new Date());

            String content = "<!DOCTYPE html>";
            content += "<html><head><meta http-equiv='Content-Type' content='text/html; charset=utf-8'/></head>";
            content += "<body style='font-family:Geneva,Helvetica,Arial,sans-serif; font-size: 12px;'>";
            content += "Dear Sir/Madam,<br/>";
            content += "<br />We thank you for registering the profile with us and happy to announce that<br />";
            content += "our matrimony management team has approved the profile which you are registered.<br />";
            content += "<span style='font-size:12px'>Please find your registered profile login details.</span>&nbsp;<br />";
            content += "<p><span style='color:#000066'><strong><u>User ID:</u></strong></span><em><strong>";
            content += "<span style='color:#cc0066'>MVEMB17021975</span></strong></em></p>";
            content += "<p><span style='color:#000066'><strong><u>Keycode:</u></strong></span><em><strong>";
            content += "<span style='color:#cc0066'>temp123</span></strong></em></p>";
            content += "<br />";
            content += "<strong>Regards</strong><br />";
            content += "<em>MM Team Helpdesk</em><br />";
            content += "Kanchipuram. Cell: 9751156122<br />";
            content += "mm.team.helpdesk@gmail.com<br />";
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
        
	}

}
