package by.unil2.itstep.taskSpring.dao.entity;
import javax.persistence.*;


@Entity
@Table(name = "t_tasks")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Boolean completed;
    private String description;


    @ManyToOne
    @JoinColumn(name = "executor_id")//executor - Исполнитель
    private UserEntity executor;

    public Boolean getComplette() { return completed; }
    public void setComplette(Boolean inpBoolean) { this.completed = inpBoolean; }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) {this.title = title;}

    public String getDescription() {return description;}
    public void setDescription(String inpString) {this.description = inpString;}

    public UserEntity getExecutor() {return executor;}
    public void setExecutor(UserEntity executor) {this.executor = executor;}



}
