package getAndSet;

public class ProductMenager {
	
	public void add (Product product) {
		
		System.out.println("bu müşteri eklendi  "+ product.getCustomers() );
	}
	
	public void ShowUsers(Product[] products) {
		for (Product product : products) {
			System.out.println("bilgiler  ," + product.getId() + "\n" + product.getName() +  "\n" + product.getCustomers()
			+  "\n" + product.getGuides());
		}
	}
	
}
