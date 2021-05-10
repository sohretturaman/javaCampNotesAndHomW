package abstractClasses;

public abstract class GameCalculator {
	// methodu abstract ettiysen inherit / extend ettiğin classlar bunu kullanmak zorundadır artık ve ayrıca içini doldulmak zorundadır istiyorsan içini boş bırakırsın ve her new lendiğinde 
	// o zaman bu  abstract method unu kullanmak zorunda olursun .yani overrride etmek zorunda kalırsın 
   // alttaki tanımlanmış fonkisyonu diğer classların override etmesini engellemek için public ardından final dersen eğer o zman o fonkisyon override edilemez ve bu base de olduğundan dolayı her referans tutuğu class onu kullanmak/ barındırmak zorunda kalır .
	
	public abstract void hesapla () ;
    	 
     
     public void gameOver (String message) {
    	 System.out.println(" oyun bitti . " +message);
     }
}
