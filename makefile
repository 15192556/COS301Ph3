make: sendMail.java  MailTest.java
	javac -cp ":lib/*" sendMail.java MailTest.java

run:
	java -cp ":lib/*" MailTest
