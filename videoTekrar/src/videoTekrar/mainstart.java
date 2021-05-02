package videoTekrar;

public class mainstart {

	public static void main(String[] args) {
		System.out.println("hello world "); //değişkenler .don't repeat yourself int değişken atama =reusebility
		
		
		int çalışanlar =10;
		String text="mağzadaki çalışanların sayısı :" ;
		
		System.out.println( text +çalışanlar );
		System.out.println("mağzadaki çalışan sayısı :"+çalışanlar );

		System.out.println("mağzadaki çalışan sayısı :"+çalışanlar );
		
		/* primitive types /data types
		char = it takes only one character .
		byte = for integer that's borders are between -128 /127
		short= for integer 	
		int =for integer , usually this is used .
		long = it is rarely used . for so long numbers .
		float (point number )
		double (point number ) usually this is used 

		*/
		double  ondalıklıSayı =12.6988;
		int  sayıDeğeri = 9866768;
		byte küçükTamSayı = 127;
		char tekKarakter='Ş';
		boolean trueOrFalse = true;
		System.out.println("ondsalıklı sayı değeri:"+ondalıklıSayı+"\n"+tekKarakter);
		System.out.println("tam sayılar  için en çok kullanılan ver tipi :"+sayıDeğeri);
		System.out.println("küçük çapta sayı değerleri için :"+küçükTamSayı);
		System.out.println("doğru mu ,yanlış mı  ?  "+trueOrFalse);
		
		System.out.println("if komutları ");
		int tamSayı = 18;
		
		if ( tamSayı<15) {
			System.out.println("bu sayı 20 den küçüktür .");
			 }else if (tamSayı ==18) {
			   System.out.println("bu sayı 18 e eşittir .");
			   } else {System.out.println("bu sayı 18 den büyüktür!");}
			   
	System.out.println("reCap");	
	
		int number1 = 12;
		int number2 = 15;
		int number3 = 28;
		int enKüçük =number3;
		
		if(enKüçük>number1 ) {
			 enKüçük = number1;}
		
		if (enKüçük>number2) { enKüçük = number2;}
		
		System.out.println("en küçük sayı = "+enKüçük);
		
	}

}
