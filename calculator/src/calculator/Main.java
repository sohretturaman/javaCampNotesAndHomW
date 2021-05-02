package calculator;

public class Main {

	public static void main(String[] args) {
	 
		Calculator hesapMakinesi = new Calculator ();
		
		
		int sonuc1 = hesapMakinesi.toplama(18, 26);
		
		 int sonuc2 = hesapMakinesi.cıkarma(26, 18);
		
		System.out.println(sonuc1 +" --initial--" +sonuc2);
		
		int sonuc3 = hesapMakinesi.bolme(26, 18);
		System.out.println(sonuc3);
		
		int sonuc4 = hesapMakinesi.carpma(18, 26);
		System.out.println(sonuc4);
	}

}
