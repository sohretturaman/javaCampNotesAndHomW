package Concrete;

import Abstarcts.GameSaleService;
import Entities.GameSale;

public class GameSaleMenager  implements GameSaleService{

	@Override
	public void add(GameSale gameSale) {
		System.out.println(gameSale.getNumberOfSale() +" numaralı  satış bilgisi girilmiştir.");
		
	}

	@Override
	public void update(GameSale gameSale) {
		System.out.println(gameSale.getSaleType() +" türündeki satış güncellendi.");
		
	}

	@Override
	public void delete(GameSale gameSale) {
		System.out.println( gameSale.getNumberOfSale()+ " numaralı satış bilgileri silinmiştir");
		
	}

}
