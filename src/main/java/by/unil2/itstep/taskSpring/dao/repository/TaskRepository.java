package by.unil2.itstep.taskSpring.dao.repository;


import by.unil2.itstep.taskSpring.dao.entity.TaskEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.lang.annotation.Native;
import java.util.List;

public interface TaskRepository extends CrudRepository<TaskEntity,Long> {

    /**
     * request all tasks for current executor when this tasks is not complette
     * @param executorId
     * @return
     */
    @Query(
    value = "SELECT * FROM t_tasks WHERE t_tasks.executor_Id=:executor_id AND t_tasks.completed=false",
    nativeQuery = true)
    List<TaskEntity> getAllUncompletteTaskForExecutor(@Param("executor_id")Long executorId);





    }//TaskRepository



