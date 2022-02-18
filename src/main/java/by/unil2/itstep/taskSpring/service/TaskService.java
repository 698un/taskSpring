package by.unil2.itstep.taskSpring.service;

import by.unil2.itstep.taskSpring.dao.entity.TaskEntity;
import by.unil2.itstep.taskSpring.dao.model.TaskModel;
import by.unil2.itstep.taskSpring.dao.repository.TaskRepository;
import by.unil2.itstep.taskSpring.dao.repository.UserRepository;
import by.unil2.itstep.taskSpring.exception.TaskNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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


    public List<TaskModel> getAllTask(){
        List<TaskEntity> taskList = (List<TaskEntity>)taskRep.findAll();

        List<TaskModel> taskModelList = TaskModel.toModelList(taskList);

        return taskModelList;
        }//getAllTask

    /**
     * This method serch all task for executor that is uncomplette
     * @param executorId
     * @return
     */
    public List<TaskModel> getAllUncompletteTaskForExecutor(Long executorId){

        List<TaskEntity> taskEntityList = taskRep.getAllUncompletteTaskForExecutor(executorId);
        return TaskModel.toModelList(taskEntityList);
        }//getAllUncompletteTaskForExecutor(Long executorId){


}
