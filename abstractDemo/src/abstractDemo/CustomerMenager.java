package abstractDemo;

public class CustomerMenager {
	
	BaseDatabaseMenager  dataBaseService  ;

	public void getCustomers () {
		dataBaseService.getData();
	}
}
