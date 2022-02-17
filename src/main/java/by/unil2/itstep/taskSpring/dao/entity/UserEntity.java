package by.unil2.itstep.taskSpring.dao.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//DB:dbtask
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;

    public void setId(Long id) {  this.id = id;  }
    public Long getId() {  return id; }

    public void setLogin(String login) { this.login = login; }
    public String getLogin() { return login; }

    public void setPassword(String password) { this.password = password; }
    public String getPassword() {   return password;  }

    //default constructor
    public UserEntity(){}//constructor


}//class UserEntity
