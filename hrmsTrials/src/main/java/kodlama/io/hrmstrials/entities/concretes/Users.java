package kodlama.io.hrmstrials.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table ( name="users")

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private  int id ;

    @Column(name="user_gmail")
    private String userGmail;

    @Column(name="password")
    private String password;

    @Column(name="repeat_password")
    private String repeatPassword;



}
