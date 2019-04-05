import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.*;

public class sendMail 
{

    public static void send(String clientID, String to, String subject, String msg/*, final String user, final String pass*/) 
    {
        Properties props = System.getProperties();

        props.put("mail.smtp.host", "localhost");
        //props.put("mail.smtp.port", "587");	
        //props.put("mail.smtp.auth", "true");
        //props.put("mail.smtp.starttls.enable", "true");
        
        Session session = Session.getDefaultInstance(props); 
        /*{
            @Override
            protected PasswordAuthentication getPasswordAuthentication() 
            {
                return new PasswordAuthentication(user, pass);
            }
        });*/

        try 
        {
            MimeMessage message = new MimeMessage(session);
            
            message.setFrom(new InternetAddress("donotreply@fnbsim.southafricanorth.cloudapp.azure.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);

            MimeMultipart multipart = new MimeMultipart ("related");
            
            BodyPart messageBodyPart = new MimeBodyPart();
            
            messageBodyPart.setContent("<br> <img src=\"cid:image\">" 
                                + "<p>" + msg + "</p>", "text/html");
            
            multipart.addBodyPart (messageBodyPart);
            
            messageBodyPart = new MimeBodyPart();
            DataSource fds = new FileDataSource("/home/notif/COS301Ph3/img/fnb-logo.jpg");
            
            messageBodyPart.setDataHandler (new DataHandler (fds));
            messageBodyPart.setHeader("Content-ID", "<image>");
            
            multipart.addBodyPart (messageBodyPart);
            
            message.setContent (multipart);
            
            Transport.send(message);
            // Log successful sent message
            
            try {
			auditLogs.addLog(clientID, 250, "Email sent successfully");
			}
			
			catch (IOException i) {
			
			}
            
            //JOptionPane.showMessageDialog(null,"Email sent");
            
        } catch (MessagingException e) 
        {   
            //JOptionPane.showMessageDialog(null,"Something went wrong");
            // Log failed sent message
            
            try {
			auditLogs.addLog(clientID, 510, "Email address does not exist");
			}
			catch (IOException i) {
			
			}
            
			
            // Write error message to JSON file, to be returned with HTML status code to client
            
            throw new RuntimeException(e);
        }
        
    }
    
}
