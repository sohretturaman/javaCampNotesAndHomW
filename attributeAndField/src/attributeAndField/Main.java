package attributeAndField;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product("8789","laptop","16 gb ram","10.00",78);
		 
		ProductMenager produced =new ProductMenager ();
		produced.add(product);
		
		
		System.out.println("no private" );
		
		product.stock = 19;
	   System.out.println(product.stock);
		
		
		product.name = "laptop";
		
		System.out.println(product.name);
		
		product.id=   "6787";
		//System.out.println(product.id);
		
		product.features ="64 gb ram" ;
		System.out.println(product.id +"\n"+product.features);
		
	
		
		
		
		System.out.println("---important !!-----------");
		
		//ProductMenager itIsAdded =new ProductMenager();
		//itIsAdded.add(product );
      

		
	}
	
		
	}

	
	
	
	
	
	
	

