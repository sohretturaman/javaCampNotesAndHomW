package interfacess;

public class Main {

	public static void main(String[] args) {
   
		CustomerMenager customerMenager = new CustomerMenager ( new MsqlCustomerDao());
         customerMenager.add();
		
		
		
		
		
		
		
		
		/*
		 * birinci çağırma yöntemi ikincisinde ise constructor kullanılır ve private yapılır interface ye .
		 * 
		 * CustomerMenager customerMenager = new CustomerMenager ();
		 * customerMenager.customerDao = new OracleCustomerDao ();
		 * customerMenager.add();
		 */
  }
	
}
