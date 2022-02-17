package by.unil2.itstep.taskSpring.dao.model;

import by.unil2.itstep.taskSpring.dao.entity.UserEntity;

/**
 * This class is representation to WEbClient
 */
public class UserModel {

    private Long id;
    private String login;

    public Long getId() {  return this.id; }
    public void setId(Long id) {  this.id = id;}

    public String getLogin() {  return login;}
    public void setLogin(String login) {  this.login = login;}

    public UserModel(){

    }//constructor

    /**
    * This is convertor from UserEntity to UserModel
     */
    public static UserModel toModel(UserEntity userEntity){
        UserModel userModel  = new UserModel();

        userModel.setId(userEntity.getId());
        userModel.setLogin(userEntity.getLogin());

        return userModel;
        }


}//class UserModel
