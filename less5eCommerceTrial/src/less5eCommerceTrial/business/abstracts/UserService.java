package less5eCommerceTrial.business.abstracts;

import less5eCommerceTrial.entities.concretes.User;

public interface UserService {
	 boolean isEmailValid(User user);
     boolean CheckNameSurname ( User user);
     boolean checkPassword ( User user);
     void  add ( User user);
     void update ( User user);
     void get( User user);
     
}
