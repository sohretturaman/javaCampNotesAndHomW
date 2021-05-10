package javaOOPLess4;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("database loglandı "+ message);
		
	}

}
