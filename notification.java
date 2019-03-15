
public class notification {
    
    String contact;
    int userID;
    String from = "MockSender@Demo.com";
    String subject;
    String body;
    userDatabase database = new userDatabase();
    
    public notification(int user, String b, String sub) {
        userID = user;
        body = b;
        subject = sub;
    }
    
    public void setContact(){
        if (database.getPrefContact(userID) == "email")
            contact = database.getEmail(userID);
        else
            contact = database.getPhoneNo(userID);
    }
    
    public String getAuditLogs(int t1,int t2) {
        //if (logTime > t1 && logTime < t2)
            //return logs
            
    }
    
    public void sendNotification() {
        if (database.getPrefContact(userID) == "email") {
            try {
                //send email
                //send()
            }
            catch (Exception e) {
                //return appropriate error message
            }
        }
        else {
            try {
                //send SMS
            }
            catch (Exception e) {
                //return error
            }
        }
    }
}
