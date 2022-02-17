package by.unil2.itstep.taskSpring.dao.model;

import by.unil2.itstep.taskSpring.dao.entity.UserEntity;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This class is representation to WEbClient
 */
public class UserModel {

    private Long id;
    private String login;
    private List<TaskModel> taskList;

    public Long getId() {  return this.id; }
    public void setId(Long id) {  this.id = id;}

    public String getLogin() {  return login;}
    public void setLogin(String login) {  this.login = login;}

    public void setTaskList(List<TaskModel> taskModelList) {this.taskList = taskModelList;}


    public UserModel(){

    }//constructor

    /**
    * This is convertor from UserEntity to UserModel
     */
    public static UserModel toModel(UserEntity userEntity){
        UserModel userModel  = new UserModel();

        userModel.setId(userEntity.getId());
        userModel.setLogin(userEntity.getLogin());

        //If task list not empty then convert this taskList in taskModelList
        if (userEntity.getTaskList()!=null) {
            userModel.setTaskList(userEntity.getTaskList()
                                            .stream()
                                            .map(TaskModel::toModel)
                                            .collect(Collectors.toList()));

            }//set taskList if not empty



        return userModel;
        }


}//class UserModel
