package less4GameHomW3;

import Concrete.CampaignMenager;
import Concrete.CheckPlayerData;
import Concrete.GameMenager;
import Concrete.GameSaleMenager;
import Concrete.PlayerMenager;
import Entities.Campaign;
import Entities.Game;
import Entities.GameSale;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		
	 Player player = new Player ();
   
	   player.setId(1);
	   player.setFirstName(" Şöhret");
	   player.setLastName("TURAMAN");
	   player.setNationalityNumber("8765678987678");
	   player.setDateOfBirth("20.09.2002");
	   
	 PlayerMenager testPlayerManager = new PlayerMenager(new CheckPlayerData());
	 testPlayerManager.register(player);
	   
	 Campaign campaign = new Campaign ();
		campaign.setId(2);
		campaign.setName("  package of the fastest player");
		campaign.setDetails("  the strongest and the fastest ");
		
	CampaignMenager testCampaignManager = new CampaignMenager();
	testCampaignManager.publish(campaign);
		
		
	Game game =new Game ();
		game.setId(5);
		game.setName("  war of the wise ");
		game.setPrice(988.7987);
	
		
	GameSale gameSale =  new GameSale  ();
	
	 gameSale.setNumberOfSale(55);	
	 gameSale.setSaleType("sales with tax");
	 
		 PlayerMenager playerMenager = new PlayerMenager (new CheckPlayerData());
		
		playerMenager.delete(player);
		playerMenager.register(player);
		playerMenager.update(player);
		
		
		  GameMenager  gameMenager = new GameMenager ();
		  gameMenager.add(game);
		  gameMenager.update(game);
		  gameMenager.delete(game);
		
	
	     GameSaleMenager gameSaleMenager = new GameSaleMenager ();
	     gameSaleMenager.add(gameSale);
	     gameSaleMenager.delete(gameSale);
	     gameSaleMenager.update(gameSale);
	
	   
	     CampaignMenager campaignMenager = new CampaignMenager();
		 campaignMenager.publish(campaign);
	     campaignMenager.update(campaign);
	     campaignMenager.delete(campaign);
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
		
	}

}
