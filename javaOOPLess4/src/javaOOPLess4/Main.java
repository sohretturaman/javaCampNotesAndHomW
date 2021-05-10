package javaOOPLess4;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {  new FileLogger(), new DatabaseLogger(),new EmailLogger() };
		
		CustomerMenager customerMenager = new CustomerMenager(loggers);
		
		// CustomerMenager customerMenager =new CustomerMenager ( new FileLogger ());
		
		  Customer alya = new Customer (1," şöhret "," Turaman");
		  
		  customerMenager.add(alya);
		  
		  System.out.println("-------------------------");
		  
		 customerMenager.delete(alya);
		 

	}

}
// java da üst class static yapılamaz içine yeni bir class yazıldığı taktirde yazılabilir.