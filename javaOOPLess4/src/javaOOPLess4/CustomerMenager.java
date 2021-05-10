package javaOOPLess4;

public class CustomerMenager {
	
	private Logger[] loggers ;
	
	public CustomerMenager(Logger[] loggers) {
		  
		this.loggers = loggers;
	}
	
	public void  add( Customer customer) {
		System.out.println( " müşteri eklendi "+ customer.getFirstName());
		for ( Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}
	}
	
	public void delete ( Customer customer ) {
		System.out.println( customer.getId() +"  id ye sahip müşteri silindi ");
		
		//Utils util = new Utils (); => static eklendiği için new etmek gerekmez
		
		Utils.runLoggers(loggers, customer.getFirstName());
	
		
		 
		/*
		 * for (Logger logger : loggers) { logger.log(customer.getLastName()); }
		 */
	}
	
	
	
	// loosy - tighty coupled 
	
	/*
	 * public void add (Customer customer) {
	 * System.out.println("müşteri eklendi "+customer.getFirstName());
	 * this.logger.log(customer.getFirstName()); }
	 * 
	 * public void delete ( Customer customer) {
	 * System.out.println("müşteri silindi "+customer.getFirstName() );
	 * this.logger.log(customer.getLastName()); }
	 */

	public Logger[] getLogger() {
		return loggers;
	}






	public void setLogger(Logger[] loggers) {
		this.loggers = loggers;
	}
	




}
