package javaOOPLess4HomW2;

import Abstracts.BaseCustomerMenager;
import Adapters.MernisServiceAdapter;
import Concrete.StarBucksCustomerMenager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer=new Customer();
		customer.setId(1);
		customer.setFirstName("Şöhret");
		customer.setLastName("Turaman");
		customer.setDateOfBirth( 2002);
		customer.setNationalityNumber(2345678976543L);
		
		BaseCustomerMenager customerMenager=new StarBucksCustomerMenager(new MernisServiceAdapter());
		customerMenager.save(customer);

	}

}
