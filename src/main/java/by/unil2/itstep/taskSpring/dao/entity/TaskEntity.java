package by.unil2.itstep.taskSpring.dao.entity;
import javax.persistence.*;


@Entity
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;

    @ManyToOne
    @JoinColumn(name = "executor_id")
    private UserEntity executor;






}
