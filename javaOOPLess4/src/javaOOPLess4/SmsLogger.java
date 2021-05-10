package javaOOPLess4;

public class SmsLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("sms gönderildi ."+ message);
		
	}

}
