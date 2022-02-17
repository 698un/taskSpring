package by.unil2.itstep.taskSpring.dao.entity;



import javax.persistence.*;
import java.util.List;

//DB:dbtask
@Entity
@Table(name = "t_roles")
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;


    public void setId(Long id) {  this.id = id;  }
    public Long getId() {  return id; }

    public void setTitle(String inpString) { this.title = inpString; }
    public String getTitle() { return this.title; }


    //default constructor
    public RoleEntity(){}//constructor



}//class UserEntity
