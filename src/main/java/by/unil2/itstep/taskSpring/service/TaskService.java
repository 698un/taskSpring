package by.unil2.itstep.taskSpring.service;

import by.unil2.itstep.taskSpring.dao.entity.TaskEntity;
import by.unil2.itstep.taskSpring.dao.model.TaskModel;
import by.unil2.itstep.taskSpring.dao.repository.TaskRepository;
import by.unil2.itstep.taskSpring.dao.repository.UserRepository;
import by.unil2.itstep.taskSpring.exception.TaskNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRep;

    @Autowired
    private UserRepository userRep;

    public TaskModel addNewTask(TaskEntity newTask){

        //new task necesalary incomplette
        newTask.setComplette(false);

        return TaskModel.toModel(taskRep.save(newTask));
        }


    public TaskModel setCompletteTask(Long taskId)throws TaskNotFoundException{

        TaskEntity currentTask = taskRep.findById(taskId).get();//define taskEntity by ID

        //if not found in repository
        if (currentTask==null) throw new TaskNotFoundException("TaskNotFound");

        //if task is exist then mark this task as complette
        currentTask.setComplette(true);
        taskRep.save(currentTask);
        return TaskModel.toModel(currentTask);
        }



}
