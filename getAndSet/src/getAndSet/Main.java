package getAndSet;

public class Main {

	public static void main(String[] args) {
		
	
		Product product2 = new Product ();
		Product product1 = new Product( "978J","laptop "," zülal"," pınar ");
		Product[] productss = {product1};
		
		product2.setCustomers("şöhret");
		product2.setGuides("alya");
		product2.setId("26f18ş");
		product2.setName("lenovo V15");
		 
		// System.out.println(set edilen kodları get ile yazdırmak için);
		  System.out.println(product2.getCustomers());
		  System.out.println(product2.getGuides());
		  System.out.println(product2.getId()); System.out.println(product2.getName());
		 
		  System.out.println("-------------------------");
		  
		 Product[] productx = { product1,product2} ;
		for (Product product :productx) {
			System.out.println( "bu for döngüsüyle  " +"\n"+product.getGuides() +"\n"+ product.getName()+"\n"+product.getId()+"\n"+ "yazdırılan ürünler ");
		}
		
		System.out.println("---------------------------");
		  ProductMenager productmenager = new ProductMenager ();
		  productmenager.add(product2);
		   productmenager.ShowUsers(productss);
		 
	
		   System.out.println(" for döngüsünü productMenager de oluştur ve sonra çağır ."
					+ "contructor değerini yazdıktan sonra hepsini this le ."
					+ "ardından mainde parametreleri doldur ve  bir diziye ata"
					+ "product menager de ise for döngüsü oluştur . dizi şeklinde ."
					+ "sonra mainde çağırdığında gelecektir . ");
		
		 }
	
}
