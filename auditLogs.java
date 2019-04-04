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
    private int count = 0;
    // Adds timestamp, clientID and description to the log file ("logs.txt")
    public static void addLog (String clientID, String descr) {
		String Log;
        // Generate timestamp
		long unixTime = new Date.getTime()/1000L;
		int Code = descr.substring(0,3);
		int description = descr.substring(6);
        // Add timestamp, clientID and description to log file
		BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE));
		if (count == 0)
			Log = '{"system=NS", "data" = [{"Date":'+unixTime+',"ClientID":'+clientID+',"Code":'+Code+',"Description":'+description+'},';
		else if (count == 99)
			Log = '{"Date":'+unixTime+',"ClientID":'+clientID+',"Code":'+Code+',"Description":'+description+'}]}';
		else
			Log = '{"Date":'+unixTime+',"ClientID":'+clientID+',"Code":'+Code+',"Description":'+description+'},';
		writer.write(Log);
		writer.newLine();
		writer.close();
	}
    // pushToReporting() pushes logs to Reporting subsystem every 25 logs that have been logged or every 1 hour
    public static void pushToReporting () {
        // push logs to Reporting subsytem
		File logtxt = new File(LOG_FILE);
		logtxt.delete();
    }
}
