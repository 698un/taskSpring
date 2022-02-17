package by.unil2.itstep.taskSpring.dao.entity;



import javax.persistence.*;
import java.util.List;

//DB:dbtask
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "executor")// CascadeType.All - by delete User deleting all it Tasks
    private List<TaskEntity> tasks;



    public void setId(Long id) {  this.id = id;  }
    public Long getId() {  return id; }

    public void setLogin(String login) { this.login = login; }
    public String getLogin() { return login; }

    public void setPassword(String password) { this.password = password; }
    public String getPassword() {   return password;  }

    //default constructor
    public UserEntity(){}//constructor


}//class UserEntity
