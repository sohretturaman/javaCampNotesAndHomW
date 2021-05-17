package kodlama.io.hrmstrials.api;

import kodlama.io.hrmstrials.businnes.abstarcts.UserService;
import kodlama.io.hrmstrials.entities.concretes.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")

public class UsersController {

    private UserService userService ;
     @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping( "/getall"  )
    List<Users> getAll(){
        return   this.userService.getAll();

    }


}
