package interfacess;

public class CustomerMenager {
	
   private CustomerDao customerDao ;
  
	public CustomerMenager ( CustomerDao  customerDao) {
		this.customerDao =customerDao ;
	}
	
	public void add () {
	
	customerDao.add();
	
	}
}

//iş kodları yazılır  . interface yi tanıt ve constructor da parametre olarak ver ve ardından onu kullan .