package interfacess;

public class MsqlCustomerDao  implements CustomerDao, Respository {
     // bir class birden fazla interface yi implement edebilir.
	// bir class sadece bir class ı veye sadece bir abstrac ı extend edbilir hem abstract de hem de class ı
	//aynı anda extend edmez keza abstactlar da bir class türüdür .
	
	@Override
	public void add() {
		System.out.println(" data eklendi mySQL");
		
	}

}
