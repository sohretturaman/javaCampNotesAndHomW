package less5eCommerceTrial.business.concretes;



import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import less5eCommerceTrial.business.abstracts.UserService;
import less5eCommerceTrial.entities.concretes.User;

public class UserManager implements UserService {
	

	@Override
	public boolean isEmailValid(User user ) {
		List<String> emails = new ArrayList<String>();
		emails.add(user.geteMail());
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		 
		for(String email : emails){
		    Matcher matcher = pattern.matcher(email);
		    if(matcher.matches())
		    	return true;
		    else return false;
		}
		return true;
		
		
	}

	@Override
	public boolean CheckNameSurname( User user) {
		
		return false;
	}

	@Override
	public boolean checkPassword(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add( User user ) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update( User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get( User user) {
		// TODO Auto-generated method stub
		
	}

}
