package abstractClasses;

public class KdsGameCalculator  extends GameCalculator {

	@Override
	public void hesapla() {
		System.out.println("puanınız :  100 ");
	}
		
		 public void gameOver (String message ) {
	    	 System.out.println(" oyun bitmiştir  . " + message );
	     }
		
		
	}

	// abstract bir classın abstact imzası taşıması zorunludur 
	// abstract sınıfta bir abstract sınıf olmak zornda değil 
	// abstract sınıflar asla new lenemez eğer new edrsen bile veride etmek zorundasın yine de bu kullanım yanlıştır .
	


