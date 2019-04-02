import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) {
        // Parse input file
        // Get client email address
        // Send email
        // Return HTTP status code and description
    
        if (args[0].equals("otp")) {
            String clientID = null;
            String otp = null;
            
            try {
                BufferedReader br = new BufferedReader (new FileReader ("input.txt"));
                
                clientID = br.readLine();
                otp = br.readLine();
                
                br.close();
                
                if (clientID != null && otp != null) {
                    String email = clientInfo.getEmail (clientID);
                    
                    sendMail.send (email, "FNB OTP","Your OTP is " + otp); 
                }
            }
            catch (FileNotFoundException ex) {
                
            }
            
            catch (IOException ex) {
            
            }
        }
        
        else if (args[0].equals("notify")) {
            String clientID = null;
            String subject = null;
            
            try {
                BufferedReader br = new BufferedReader (new FileReader ("input.txt"));
                
                clientID = br.readLine();
                subject = br.readLine();
                
                String message = null;
                
                String line = null;
                
                while ((line = br.readLine()) != null) {
                    message += ("\n" + line);
                }
                
                br.close();
                
                if (clientID != null && subject != null) {
                    String email = clientInfo.getEmail (clientID);
                    
                    sendMail.send (email, subject, message); 
                }
            }
            catch (FileNotFoundException ex) {
                
            }
            
            catch (IOException ex) {
            
            }
        }
        
        else {
            
        }
        
        
    }
}
