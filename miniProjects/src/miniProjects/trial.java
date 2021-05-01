package miniProjects;

public class trial {

	public static void main(String[] args) {
	/*	
		System.out.println("PROJECT 1 ");
		
		int number= -1;
		int remainder=number % 2 ;
		System.out.println(remainder);
		
		boolean primeNumber=true;
		
		for (int i=2; i<number; i++) {
			if(number % i == 0) {
				primeNumber= false;
			}
		}
		
		
		if  (number<2) {
			System.out.println("bu sayı geçersizdir");
			return;
		}
		
	if(primeNumber) {
		System.out.println("bu sayı asaldır.");
	}else   {
		System.out.println("bu   sayı asal değildir .");
		
		 
	}
		*/
		
		System.out.println("PROJECT 3 ");	 
	
	
	
	int sayi = 6;
	
	 int toplam = 0;
	 
	 for (int i = 1; i< sayi ; i++) {
		 if (sayi % i == 0) {
			 toplam =toplam+i;
		 }
	 }
	 
	if(toplam ==sayi) {
		System.out.println("bu sayı mükemmel sayıdır ");
	}else { 
		System.out.println("bu sayı mükemmel sayı değildir ");
	}
	 
	 
	 
	 System.out.println("mini project 4 / aranan sayı  ");
	 
	 
	 
	 int[] numbers =new int [] { 1,2,3,4,5,6,7,8,9};
	 int aranan = 5;
	 boolean aranaN = false; 
	 for (int sayilar:numbers) {
		 if (aranan ==sayilar) {
			 
			 aranaN = true;
			 break;
			 
		 }
	 }if (aranaN) {
		 System.out.println("aranan sayı bu dizide mevcuttur ");
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
	 
} 
	 
	 
	 
