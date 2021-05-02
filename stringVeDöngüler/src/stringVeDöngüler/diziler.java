package stringVeDöngüler;

public class diziler {

	public static void main(String[] args) {
		 
		 System.out.println("switch komutu");
		 
		  char productGrade = 'D';
		  
		  switch(productGrade) {
		  case 'A':
			  System.out.println("en iyi ürün budur !");
			  break;
			  
		  case 'B': 
			  System.out.println(" bu iyi bir üründür. ");
			  break;
			  
		  case  'C':
			  System.out.println("bu  ortalama bir üründür .");
			  break;
			  
		  case 'D':
			  System.out.println("bu iyi bir ürün değildir .");
			  break ;
			  
			 default :
				 System.out.println("maalesef geçersiz karakter .lütfen düzeltiniz.");
			 }
		  int sayıDeğeri = 7869;
		  switch (sayıDeğeri) {
		  case 4354 :
			  System.out.println("aradığımız değer :"+sayıDeğeri);
			  break;
		  
		  case 7869:
			  System.out.println("aradığımız sayı:"+sayıDeğeri);
			  break;
			default :
				System.out.println("sadece sayı girilebilir ");
				
			  
		  }
		  
		  System.out.println("for döngüsü");  //sayaç türünü yazmayı unutma .
		  
		for(int i= 18; i<26; i=i+1 ) {
			System.out.println(i);
		}System.out.println("for döngüsü sona ermiştir .değişken türü ilk parantezde tanıtıldı! ");
		
		System.out.println( "while döngüsü");
		 
		int j = 26;
		while (j>18) {
			System.out.println("şu anki değer:"+j );
			j--;
		} System.out.println(" while döngüsü sona ermiştir.");
		
		System.out.println("do- while döngüsü");
		 int ş=18;
		 do { System.out.println(" just 5 years ");
		     ş++;}
		 while (ş<23);
		 System.out.println("do-while döngüsü bitmişitir .");
		 
		 
		System.out.println("EXAMPLES FOR STRİNGS AND STRİNG ARRAY [](String)");
		
		  String[] countries =new String[3];
		  countries[0]="Germany";
		  countries[1]="USA";
		  countries[2]="Norway";
		  System.out.println("the most popular country all of  the world is "+countries[2]);
		  for(int t=0; t<countries.length ; t++) {
			  System.out.println(countries[t]);
		  }
		   System.out.println("important !!-------------");
		 for (String theMostPopular:countries) {
			 System.out.println(theMostPopular);
		 }
		  System.out.println( "double ...");
		  
		 double[] numbers =new double [5];
		 
		 double total = 0;
		  
		   numbers[0]= 2.7;
		   numbers[1]=34.98789 ;
		   numbers[2]=58.9867 ;
		   numbers[3]=776.9889;
		   numbers[4]=987.87890;
		   
		   for (double boringNumbers:numbers ) {
			   total=total+boringNumbers;
			   System.out.println(boringNumbers);
		   }System.out.println("-----------"); 
		   
		   System.out.println(" total of all numbers= " +total);
		   
		   System.out.println("important if (if in for) ------------------------");
		   
		   
		   double[] sayılar = { 23.56,35.67,3.4,6.5};
		   double enBüyük =sayılar[0];
		   
		    for (double ondalıklıSayılar:sayılar) {
		    	
		    	System.out.println(ondalıklıSayılar);
		    	
		    	   	if (enBüyük < ondalıklıSayılar) {
		    		enBüyük=ondalıklıSayılar;
		    	       }
		    	
		 }
		    System.out.println("en büyük sayı : "+ enBüyük);
		   
		 System.out.println(" --------ÇOK BOYUTLU  DİZİLER ");
		 
		 String[] [] uyruklar = new String [3][3];
		 uyruklar[0] [0]="Alman";
		 uyruklar[0] [1]="fransız";
		 uyruklar[0] [2]="italyan";
		 
		 uyruklar[1] [0]="hintli";
		 uyruklar[1] [1]="çinli";
		 uyruklar[1] [2]="moğol";
		 
		 uyruklar[2] [0]="amerikan";
		 uyruklar[2] [1]="koreli";
		 uyruklar[2] [2]="İspanyol";
		 
		 for (int i=0; i<=2; i++) {
			for( int z=0; z<=2 ;  z++) {
				 System.out.println(uyruklar[i][z]);
			}
		 }
		 
		 System.out.println("STRİNG USAGE ");
		 
		  String message ="    This is last hurrah . ı am exactly sure anymore.   ";
		  
		  System.out.println(message);
		  
		  System.out.println( "length of the message "+ message.length());
		  
		  System.out.println( "the sentence starts with this character : "+ message.startsWith("this"));
		  
		  System.out.println("the sentence ends with this character "+ message.endsWith("."));
		  
		  System.out.println(message.concat( " let's go on " ));
		  
		   System.out.println("this is important code not unnecesarry => "+ message.charAt(5));
		 
		
		   System.out.println("----------------------"); // get some characters with getChars code . just give parameter .don't write anything in parameter .
		   char[] characters = new char[30];
		   
		   message.getChars(7,20,characters,0); 
			 
		    System.out.println(characters);
		    System.out.println(message.indexOf("i"));
		    System.out.println(message.lastIndexOf("i"));
		    
		    String newMessage =  message.replace(' ', '-');
		    System.out.println(newMessage);
		    
		    System.out.println(message.substring(20));
		    
		    System.out.println("--------------------------------!!!!!!!");
		    for(String apartMessage: message.split(" ")) {
		    	System.out.println(apartMessage);
		    }
		     System.out.println("////");
		      for (String separateMessge:message.split( "e")) {
		    	  System.out.println(separateMessge);
		      }
		    
		      System.out.println(message.toLowerCase());
		      System.out.println(message.toUpperCase());
		    
		  System.out.println(message.trim());
		 
		   
		   
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 
			  
		  
	}

}
