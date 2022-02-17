package by.unil2.itstep.taskSpring.dao.entity;
import javax.persistence.*;


@Entity
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private Boolean complette;

    public Boolean getComplette() { return complette; }
    public void setComplette(Boolean complette) { this.complette = complette; }

    @ManyToOne
    @JoinColumn(name = "executor_id")//executor - Исполнитель
    private UserEntity executor;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) {this.title = title;}

    public String getContent() {return content;}
    public void setContent(String content) {this.content = content;}

    public UserEntity getExecutor() {return executor;}
    public void setExecutor(UserEntity executor) {this.executor = executor;}






}
