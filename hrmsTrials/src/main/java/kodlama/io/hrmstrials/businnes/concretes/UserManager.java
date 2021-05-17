package kodlama.io.hrmstrials.businnes.concretes;

import kodlama.io.hrmstrials.businnes.abstarcts.UserService;
import kodlama.io.hrmstrials.dataAccess.abstracts.UserDao;
import kodlama.io.hrmstrials.entities.concretes.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserManager implements UserService {
    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }



    @Override
    public List<Users> getAll() {
        return this.userDao.findAll();
    }
}
