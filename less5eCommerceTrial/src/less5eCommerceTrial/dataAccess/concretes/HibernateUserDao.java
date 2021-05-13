package less5eCommerceTrial.dataAccess.concretes;

import less5eCommerceTrial.dataAccess.abstracts.UserDao;
import less5eCommerceTrial.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	public void singIn( User user) {
		System.out.println(" hibernite ile giriş yapıldı : "+ user.getFirstName());
		
	}

	@Override
	public void singUp(User user) {
		
		System.out.println( user.geteMail()+" adlı gmail hesabı hibernate veri erişimi ile üye oldu");
	}

}
