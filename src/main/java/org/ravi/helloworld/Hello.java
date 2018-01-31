package org.ravi.helloworld;

public class Hello {
	public String displayHelloMessage(String message){
	String msg;
	if (message != null && !message.isEmpty())
		msg= message;
	else
		{msg = "hello Sreenath welcome to SonarQube class";}
		return msg;

	
}
