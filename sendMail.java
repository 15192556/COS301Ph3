import java.util.Properties;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class sendMail 
{

    public static void send(String to, String subject, String msg/*, final String user, final String pass*/) 
    {
        Properties props = new Properties();

        props.put("mail.smtp.host", "localhost");
        props.put("mail.smtp.port", "587");	
        //props.put("mail.smtp.auth", "true");
        //props.put("mail.smtp.starttls.enable", "true");
        
        /*Session session = Session.getDefaultInstance(props,new Authenticator() 
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() 
            {
                return new PasswordAuthentication(user, pass);
            }
        });*/

        try 
        {
            Message message = new MimeMessage(session);
            
            //message.setFrom(new InternetAddress(user));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(msg);

            Transport.send(message);
            // Log successful sent message
            
            JOptionPane.showMessageDialog(null,"Email sent");
            
        } catch (MessagingException e) 
        {
            JOptionPane.showMessageDialog(null,"Something went wrong");
            // Log failed sent message
            // Write error message to JSON file, to be returned with HTML status code to client
            
            throw new RuntimeException(e);
        }
        
    }
    
}
