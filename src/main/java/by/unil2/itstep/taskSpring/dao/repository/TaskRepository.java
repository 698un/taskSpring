package by.unil2.itstep.taskSpring.dao.repository;


import by.unil2.itstep.taskSpring.dao.entity.TaskEntity;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<TaskEntity,Long> {

    //TaskEntity findById(Long taskId);



}
