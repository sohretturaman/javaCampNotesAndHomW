package ödev2;

public class metodlar {

	public static void main(String[] args) {
		
		System.out.println("metodlarla çalışmalar "
				+ " --------------------------------------------------.");
		
		sayıBulma();
		
		
	}
	
	
	public static void sayıBulma () {
		int[] numbers =new int [] { 1,2,3,4,5,6,7,8,9};
		 int aranan = 5;
		 boolean aranaN = false; 
		 for (int sayilar:numbers) {
			 if (aranan ==sayilar) {
				 
				 aranaN = true;
				 break;
				 
			 }
		 }if (aranaN) {
			 giveMessage ("aranan sayı bu dizide mevcuttur ");
		 }
		 
		 
		 
}
	
	public static void giveMessage( String xdjx) {
		//System.out.println(" bir değiken taımlandığı blogda geçerlidir . metodlar birer fonksiyordur çağırılmadan çalışmazlar ");
		 System.out.println("aranan sayı bu dizide mevcuttur ");
		 
		 
		 /*
		 aranan tanımlı ifadesini metodun içinde yani parametre olarak tanıtmalısın .
		 (aynı class da iken parametre de türünü ve adını yazmn çalışmasını sağlayacaktır .)
		 yoksa sisrem hata verir .java da genel olarak tanımladığın şeyin türünü vermen gerekir.
		 */
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
