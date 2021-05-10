  package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		
		womanGameCalculator.hesapla();  
		
		GameCalculator gameCalculator = new ManGameCalculator ();
		GameCalculator gameCalculator2 = new KdsGameCalculator();
		gameCalculator.hesapla();
        gameCalculator.gameOver( " oyundan çıkmak için butonu tıklayınız .");
        gameCalculator2.gameOver(" default puan ");

	}

}
