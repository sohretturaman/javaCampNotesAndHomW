package kodlamaio.northwind.entites.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity                    // hangi katmana ait olduğunu belirt veri tabanı için 
@Table ( name="products") // tablonun ismini söyleyin 

public class Product {
	
	@Id                            // işlmeler id ye göre yapılır bu yüzden burda bu şekilde tanımlanır 
	@GeneratedValue                 // veri tabanındaki veriler bir bir artırılacak 
	@Column ( name ="product_id")    // tabloda hangi kolona denk geldiğini belirtmek için column kullanılır 
  private int id ;
	
	@Column ( name =" category_id")
  private int categoryId ;
	
	@Column ( name =" product_name")
  private String productName ;
	
	@Column ( name =" unit_price")
  private double unitPrice ;
	
	@Column ( name =" units_in_stock")
  private short unitsInStock ;
	
	@Column ( name =" quantity_per_unit")
  private String quantityPerUnit ; 
	
  public Product () {
	  
  }
	
	  public Product ( int id,int categoryId,String productName, double unitPrice ,
	  short unitsInStock, String quantitiyPerUnit) {
		  this.id=id ; 
		  this.categoryId=categoryId;
		  this.productName = productName; 
		  this.unitPrice =unitPrice ;
	      this.unitsInStock = unitsInStock ; 
	      this.quantityPerUnit = quantitiyPerUnit;
	  
	  }
	
	


	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 




















 
