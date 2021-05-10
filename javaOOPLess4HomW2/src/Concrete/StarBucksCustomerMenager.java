package Concrete;

import Abstracts.BaseCustomerMenager;
import Abstracts.CheckCustomerService;
import Entities.Customer;

public class StarBucksCustomerMenager extends BaseCustomerMenager{
	CheckCustomerService checkCustomerService ;
	
	public StarBucksCustomerMenager(CheckCustomerService checkCustomerService) {
		this.checkCustomerService =checkCustomerService ;
	}
    @Override
    public void save(Customer customer) {
    	if ( checkCustomerService.CheckPerson(customer)) {
    		super.save(customer);
    	}else {
    		System.out.println("geçersiz kullanıcı .");
    	}
    	
    }
}
