package getAndSet;

public class Product {
	
	
	public Product () {
		System.out.println("parametresiz constructor çalıştı ");
	}
	
	
	     private String  id ;
		 private String name;
		 private String customers ;
		 private String guides ;
		 
		

	public String getId() {
			return id;
		}



		public void setId(String id) {
			this.id = id;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getCustomers() {
			return customers;
		}



		public void setCustomers(String customers) {
			this.customers = customers;
		}



		public String getGuides() {
			return guides;
		}



		public void setGuides(String guides) {
			this.guides = guides;
		}



	public Product (String id, String name, String customers, String guides) {
		this();
		this.id = id;
		this.name = name;
		this.customers = customers;
		this.guides = guides;
	}
	
	





}
/*
   encapsülation yani kapsülleme özel erişim oluştur .get ve set ile çalıştırabilirsin tabi constractor oluşturarak da kullanabilirsin 
   fakat ikisini  de kullanmak için  constractor parametrelerini tanıttığın için aynı class ile aynı isimde bir method daha tanımlamalısın 
	  
*/


