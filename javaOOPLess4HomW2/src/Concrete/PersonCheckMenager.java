package Concrete;

import Abstracts.CheckCustomerService;
import Entities.Customer;

public class PersonCheckMenager implements CheckCustomerService{

	@Override
	public boolean CheckPerson(Customer customer) {
		
		return true ;
	}

}
