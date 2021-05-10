package Concrete;

import Abstarcts.GameService;
import Entities.Game;

public class GameMenager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println( game.getName()+ " adlı ürün stoğa eklendi .");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(  game.getName()+ "adlı ürünün fiyatı güncellendi . yeni  fiyat :"+ game.getPrice());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getId() + " id ye sahip ürün silindi.");
		
	}

}
