import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import org.json.simple.parser.*;
import org.json.simple.JSONObject;

public class auditLogs {
    private static String LOG_FILE = "logs.txt";
    // Adds timestamp, clientID and description to the log file ("logs.txt")
    public static void addLog (String clientID, int code, String descr) throws IOException {
        
        try { 
  
            // Open given file in append mode. 
            File file = new File("logs.txt"); 
  
            BufferedReader br = new BufferedReader(new FileReader(file)); 
            
            int count = Integer.parseInt (br.readLine());
            
            
    
            String Log;
            // Generate timestamp
            long unixTime = System.currentTimeMillis();
            int Code = code;
            String description = descr;
            // Add timestamp, clientID and description to log file
            BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE, true));
            if (count == 0)
                Log = "{[{\"timestamp\":" + unixTime +",\"clientID\":\"" + clientID + "\",\"code\":" + Code + ",\"description\":\"" + description +"\"},\n";
            else if (count == 99)
                Log = "{\"timestamp\":" + unixTime + ",\"clientID\":\"" + clientID + "\",\"code\":" + Code + ",\"description\":\"" + description + "\"}]}\n";
            else
                Log = "{\"timestamp\":" + unixTime + ",\"clientID\":\"" + clientID +"\",\"code\":"  + Code+",\"description\":\"" + description +"\"},";
            writer.write(Log);
            writer.newLine();
            writer.close();
		}
		
		catch (IOException e) { 
            System.out.println("exception occoured" + e); 
        } 
	}
    // pushToReporting() pushes logs to Reporting subsystem every 25 logs that have been logged or every 1 hour
    public static void pushToReporting () {
        // push logs to Reporting subsytem
		File logtxt = new File(LOG_FILE);
		logtxt.delete();
    }
}
