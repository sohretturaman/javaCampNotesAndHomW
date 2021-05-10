package attributeAndField;

public class ProductMenager {
	
	public void add (Product products  ){
		
		// bu productMenager metodu çağırılırken önce class new lenir ve ardından  new lenirken verilen ad .method adı .ve ürün parametresi eklenir 
		//System.out.println("bu ürün eklendi " +product.features +"\n"+product.name);
		
		System.out.println( "bu ürün eklendi  " + products.name );
		System.out.println("bu ürünün özellikleri "+ products.features );
		System.out.println("bu ürünün stoc adedi  " +products.stock);
		System.out.println(" bu ürünün id si  " +products.id);
		System.out.println("ürünün fiyatı :  "+products.price);
		
		
	}
}
