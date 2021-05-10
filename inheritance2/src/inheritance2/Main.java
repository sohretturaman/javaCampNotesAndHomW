package inheritance2;

public class Main {

	public static void main(String[] args) {
		
		CustomerMenager customerMenager = new CustomerMenager();
		customerMenager.add( new  FileLogger());
		customerMenager.add( new DatabaseLogger());
		
	}

}
