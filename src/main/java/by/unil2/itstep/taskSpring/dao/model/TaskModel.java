package by.unil2.itstep.taskSpring.dao.model;

import by.unil2.itstep.taskSpring.dao.entity.TaskEntity;

import java.util.List;
import java.util.stream.Collectors;

public class TaskModel {


    private Long id;
    private String title;
    private Boolean complette;
    private String description;
    private UserModel executor;


    public Long getId() {return id; }
    public void setId(Long id) {this.id = id;}

    public String getTitle() {return title; }
    public void   setTitle(String title) {this.title = title; }

    public Boolean getComplette() { return complette; }
    public void setComplette(Boolean complette) {this.complette = complette; }

    public void setDescription(String inpString) {this.description=inpString; }
    public String getDescription() {return this.description; }

    public void setExecutor(UserModel inpUserModel) {this.executor = inpUserModel;}

    //Convert taskEntity to TaskModel
    public static TaskModel toModel(TaskEntity taskEntity){
        TaskModel taskModel = new TaskModel();
        taskModel.setComplette(taskEntity.getComplette());
        taskModel.setTitle(taskEntity.getTitle());
        taskModel.setId(taskEntity.getId());
        taskModel.setDescription(taskEntity.getDescription());
        //taskModel.setExecutor(UserModel.toModel(taskEntity.getExecutor()));

        return taskModel;
        }//toModel

    //convert taskEntityList to taskModelList
    public static List<TaskModel> toModelList(List<TaskEntity> taskEntityList){

        List<TaskModel> taskModelList = taskEntityList.stream()
                                                      .map(TaskModel::toModel)
                                                      .collect(Collectors.toList());

        return taskModelList;

        }//toModelList





    public TaskModel() {

    }





}//TaskModel
