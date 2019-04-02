import sendMail;
import clientInfo;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
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
            
            BufferedReader br = new BufferedReader ("input.txt");
            
            clientID = br.readLine();
            otp = br.readLine();
            
            if (clientID != null && otp != null) {
                
            }
        }
        
        else if (args[0].equals("notify")) {
            
        }
        
        else {
            
        }
        
        
    }
}
