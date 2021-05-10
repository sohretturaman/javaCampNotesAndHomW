package ödev2Classes;

public class Main {

	public static void main(String[] args) {
		
       classTrials classTrial =new classTrials();
       classTrials classTrial2 =new classTrials();
       classTrial = classTrial2 ;
       
       
            classTrial.Ekleme ();
            classTrial.silindi();
            classTrial.guncelleme();
            classTrial.uyelik();
            System.out.println("stock ve heap class lar referans tiplerdir");
            	System.out.println(classTrial2);
            	System.out.println("----------------------------");
            	
            	
          referansTiplerValue();
            	
	}
	
	public static void referansTiplerValue () {
		int sayi1 = 76;
		int sayi2 = 26;
		sayi1=43;
		sayi2 = sayi1;
		//sayi1=43;// bu satır altta iken sonuç 76 üstte iken 43 , kodalr baştan sona okunur .
		System.out.println(sayi2);
		
		int[] sayilar1 = new int[] { 1,2,63,5};
		int [] sayilar2 = new int[] { 3,9,77,8};
		sayilar1 = sayilar2 ;
		sayilar1[2] = 35;
		for (int referansSayılar :sayilar1) {
			System.out.println(referansSayılar);
		}
		
	}

}











