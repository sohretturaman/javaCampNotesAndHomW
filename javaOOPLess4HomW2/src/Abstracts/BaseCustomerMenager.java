package Abstracts;

import Entities.Customer;

public abstract class BaseCustomerMenager implements CustomerService{
    @Override
    public void save(Customer customer) {
    	System.out.println(" veri tabanına kaydedildi :"+customer.getFirstName()+customer.getLastName());
    	
    }
}
