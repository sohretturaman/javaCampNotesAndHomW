package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager  implements ProductService{

   private  ProductDao productDao ;
   private LoggerService loggerService ;
	
  public ProductManager ( ProductDao productDao ,LoggerService loggerService) {
	  
	   this.productDao = productDao ;
	   this.loggerService = loggerService ;
   }
	@Override
	public void add(Product product) {// iş kodları yazılır
		
		if  ( product.getCategoryId()== 2 ) { 
			System.out.println(" bu kategoride ürün kabul edilmiyor ");
			return ;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem(" sisteme yabancı kod paketi enjekte edildi" );
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

 // dış paket edklemek için onu private yapıyoruz .