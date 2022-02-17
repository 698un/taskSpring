package by.unil2.itstep.taskSpring.dao.model;

import by.unil2.itstep.taskSpring.dao.entity.TaskEntity;

public class TaskModel {


    private Long id;
    private String title;
    private Boolean complette;


    public Long getId() {return id; }
    public void setId(Long id) {this.id = id;}

    public String getTitle() {return title; }
    public void   setTitle(String title) {this.title = title; }

    public Boolean getComplette() { return complette; }
    public void setComplette(Boolean complette) {this.complette = complette; }



    public static TaskModel toModel(TaskEntity taskEntity){

        TaskModel taskModel = new TaskModel();
        taskModel.setComplette(taskEntity.getComplette());
        taskModel.setTitle(taskEntity.getTitle());
        taskModel.setId(taskEntity.getId());

        return taskModel;
        }//toModel



    public TaskModel() {

    }





}//TaskModel
