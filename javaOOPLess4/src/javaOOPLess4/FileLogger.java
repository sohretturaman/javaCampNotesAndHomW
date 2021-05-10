package javaOOPLess4;

public class FileLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("dosyaya loglandı  "+ message);
		
	}

}
