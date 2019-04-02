
// javac -cp ":lib/*" sendMail.java MailTest.java
// java -cp ":lib/*" MailTest

public class MailTest {
    public static void main (String[] args) {
        sendMail.send ("u16050607@tuks.co.za", "Please work", "Does this send?");
    }
}
