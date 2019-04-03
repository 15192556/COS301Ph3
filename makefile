<<<<<<< HEAD
make: sendMail.java  auditLogs.java Main.java clientInfo.java
	javac -cp ":lib/*" sendMail.java auditLogs.java Main.java clientInfo.java
=======
make: sendMail.java auditLogs.java Main.java clientInfo.java
	javac -cp ":lib/*" sendMail.java auditLogs.java Main.java
>>>>>>> maildelivery

run:
	java -cp ":lib/*" Main otp
