package javaOOPLess;

public class UserMenager {
    public void loginTheSystem (User user) {
    	System.out.println( user.getFirstName()+" adlı kullanıcı sisteme giriş yapmıştır ");
    }
    
    public void logoutToSystem (User user) {
    	System.out.println(user.getUsername()+" adlı gmail hesabına sahip kullanıcı sistmeden çıkış  yapmıştır");
    }
    
    public void updatingTheSystem (User user) {
    	System.out.println(user.getPassWord() + "  şifresi güncellendi ");
    }
    
    public void showAllUsers (User[] users) {
    	 for ( User user : users) {
    		 System.out.println(" tüm kullanıcılar " + user.getFirstName());
    	 }
    }
}
