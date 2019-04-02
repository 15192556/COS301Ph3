make: sendMail.java auditLogs.java Main.java clientInfo.java
	javac -cp ":lib/*" sendMail.java auditLogs.java Main.java

run:
	java -cp ":lib/*" Main otp
