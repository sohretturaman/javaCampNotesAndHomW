package Concrete;

import Abstarcts.CampignService;
import Entities.Campaign;

public class CampaignMenager implements CampignService {

	@Override
	public void publish(Campaign campaign) {
		System.out.println(campaign.getName()+ "adlı ürün yayınlandı.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getId()+" id ye sahip ürünün bilgileri güncellenmiştir.");
		
	}
	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+ "adlı ürünün  aşağıdaki detay bilgileri silinmiştir "+"\n" +campaign.getDetails());
		
	}
}
