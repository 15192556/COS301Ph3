
public class clientInfo {

    private static string CLIENT_HASH_TABLE = "clients.txt";
    
    // Get email from Client Information System API. Parameters to be submitted are ClientID
    public static String getEmail (string clientID) {
        /* Psedocode 
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
    
        return "u16050607@tuks.co.za";
    }
    
    // Adds client to the hash table. The hash table will be stored in a text file and has a maximum of 10 entries, and records the clientID, email address and timestamp of insertion. If there is a collision, override the previous entry. The hash table is meant to act as a caching mechanism.
    public void addClient (String clientID, string email) {
        
    }
    
    // Calculates the hash value derived from the clientID. Since the hash table has a maximum of 10 entries, the hash function will return integers 0 to 9
    public int hashFunction (String clientID) {
        return 0;
    }
}
