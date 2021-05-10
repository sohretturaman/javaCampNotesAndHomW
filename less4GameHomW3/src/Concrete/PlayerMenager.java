package Concrete;

import Abstarcts.CheckPlayerDataService;
import Abstarcts.PlayerService;
import Entities.Player;

public class PlayerMenager implements PlayerService {
	
      CheckPlayerDataService checkPlayerDataService ;
      
      
      public PlayerMenager ( CheckPlayerDataService checkPlayerDataService) {
    	  this.checkPlayerDataService = checkPlayerDataService  ;
      }
      
   // costructor kullanıldığı için boş constructor tanıt ve playerMenager çağır main de
      
     public PlayerMenager() {
    	  
    }
      
	@Override
	public void register(Player player) {
		 if ( checkPlayerDataService.check(player)==true) {
			 System.out.println("  geçerli kullanıcı bigileri girilmiştir . ");
		 } else {
			 System.out.println(" geçersiz kullanıı bilgileri girilmiştir . lütfen kontol ediniz .");
		 }
		
	}

	@Override
	public void update(Player player) {
		 System.out.println( player.getFirstName()+player.getLastName()+" ad , soyadına sahip kullanıcının bilgileri günlellenmiştir .");
		
	}

	@Override
	public void delete(Player player) {
		 
		 System.out.println(player.getNationalityNumber()+" TC kimlik nolu "+player.getDateOfBirth()+" doğum  tarihli "+"\n"+
		  player.getId()+"id ye sahip kullanıcının kaydı silinmiştir ");
	}

}
