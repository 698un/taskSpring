package by.unil2.itstep.taskSpring.dao.entity;



import javax.persistence.*;
import java.util.List;

//DB:dbtask
@Entity
@Table(name = "t_users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleEntity role;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "executor")// CascadeType.All - by delete User deleting all it Tasks
    private List<TaskEntity> taskList;

    public void setId(Long id) {  this.id = id;  }
    public Long getId() {  return id; }

    public void setLogin(String login) { this.login = login; }
    public String getLogin() { return login; }

    public void setPassword(String password) { this.password = password; }
    public String getPassword() {   return password;  }

    public void setRole(RoleEntity inpRole) { this.role = inpRole; }
    public RoleEntity getRole() { return this.role; }


    public List<TaskEntity> getTaskList(){  return this.taskList; }
    public void setTaskList(List<TaskEntity> inpTaskList){  this.taskList = inpTaskList; }

    //default constructor
    public UserEntity(){}//constructor

    public String passwordHash(){



        return null;

        }//passwordHash


}//class UserEntity
