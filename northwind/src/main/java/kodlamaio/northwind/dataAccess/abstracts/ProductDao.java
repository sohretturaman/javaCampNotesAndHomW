package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entites.concretes.Product;

public interface ProductDao extends JpaRepository< Product,Integer>{//dataAccess tüm CRUD pperasyonları jpaRespository ile artık hazır .
  
	   
   
}