
public class userDatabase {
    int userID;
    String prefContact;
    String email;
    String phoneNo;
    
    public userDatabase() {
        userID = 00001;
        prefContact = "email";
    }
    
    public String getPrefContact(int uID) {
        if (uID == userID) {
            if (prefContact == "email")
                return "email";
            else
                return "number";
        }
        else
            return "userID wrong";
    }
    
    public String getEmail(int uID) {
        if (uID == userID) {
            return email;
        }
    }
    
    public String getPhoneNo(int uID) {
        if (uID == userID) {
            return phoneNo;
        }
    }
}
