import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
//import org.json.simple.parser.*;
//import org.json.simple.JSONObject;

public class clientInfo {

    private static String CLIENT_HASH_TABLE = "clients.txt";

    // Get email from Client Information System API. Parameters to be submitted are ClientID
    public static String getEmail (String clientID) {
        /* Pseudocode
            if (clientID is in the client hash table ("clients.txt"))
                if (timestamp from this entry in the hash table is not older than 10 minutes)
                    return client email as it exists in the table
                else
                    submit GET request of client email to Client Information System API
                    update hash table entry timestamp and email address
                    return address

            else
                submit GET request of client email to Client Information System API
                add new entry to hash table and override the previous entry if there is a collision
                return address
        */
        /*int clientIDHash = clientInfo.hashFunction(clientID);
        String hashClientID = /*clients.txt(clientIDHash);
        LocalDateTime currTime = LocalDateTime.now();
        if (hashClientID == clientID)
        {
            if (currTime.minusMinutes(10) < clients.txt(clientIDHash).time)
            {
                //return clients.txt(clientIDHash).email;
            }
        }*/

        try
        {
            URL apiMethod = new URL("https://cos301-ocean-cis-api.herokuapp.com/email");
            HttpURLConnection apiCall = (HttpURLConnection) apiMethod.openConnection();
            apiCall.setRequestMethod("POST");
            apiCall.setDoOutput (true);
            apiCall.setDoInput (true);
            String JSONBody = "{\"system\":\"NS\",\"client_id\":\"" + clientID + "\"}";
            byte[] out = JSONBody.getBytes(StandardCharsets.UTF_8);
            int bodyLength = out.length;

            apiCall.setFixedLengthStreamingMode(bodyLength);
            apiCall.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            
            apiCall.getOutputStream().write(out);
            apiCall.connect();
            
            Reader in = new BufferedReader (new InputStreamReader(apiCall.getInputStream(), "UTF-8"));
            
            StringBuilder sb = new StringBuilder();
            
            for (int c; (c = in.read()) >= 0; )
                sb.append((char)c);
            
            String response = sb.toString();
            
            
            try {
                JSONParser parser = new JSONParser();
            
                JSONObject json = (JSONObject) parser.parse(response);
                return (String) json.get("email");
            }
            
            catch (ParseException p) {
                return "";
            }
            /*
            not sure on the format of the response ect. so not sure how to split it up into "clientID" and "email"
            add new entry to hash table and override the previous entry if there is a collision
            return address
            * */

        }
        catch(MalformedURLException e)
        {/*if we are here, the apiMethod variable has been initialised wrong*/}
        catch(IOException e)
        {/*
            thrown by:
            apiMethod.openConnection()
            apiCall.setRequestMethod() [presumably, PotocolExeption inherits from IOException
            apiCall.connect()
            apiCall.getOutPutStream()
            apiCall.getInputStream()

        */}

        return "u16050607@tuks.co.za";
    }

    // Adds client to the hash table. The hash table will be stored in a text file and has a maximum of 10 entries, and records the clientID, email address and timestamp of insertion. If there is a collision, override the previous entry. The hash table is meant to act as a caching mechanism.
    public static void addClient (String clientID, String email) {

    }

    // Calculates the hash value derived from the clientID. Since the hash table has a maximum of 10 entries, the hash function will return integers 0 to 9
    public static int hashFunction (String clientID) {
        return 0;
    }
}
