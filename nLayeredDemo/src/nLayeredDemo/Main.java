package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;

public class Main {

	public static void main(String[] args) {
		
		ProductService productService = new ProductManager(new HibernateProductDao (),new JLoggerManagerAdapter()) ;
       Product product = new Product ( 1,1," elma",12.788,50);
       productService.add(product);
     
	}

}
