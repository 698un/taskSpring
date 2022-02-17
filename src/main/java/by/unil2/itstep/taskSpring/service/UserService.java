package by.unil2.itstep.taskSpring.service;


import by.unil2.itstep.taskSpring.dao.entity.UserEntity;
import by.unil2.itstep.taskSpring.dao.model.UserModel;
import by.unil2.itstep.taskSpring.dao.repository.UserRepository;
import by.unil2.itstep.taskSpring.exception.UserAllreadyExistException;
import by.unil2.itstep.taskSpring.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {



    @Autowired
    private UserRepository userRep;



    public UserModel addNewUser(UserEntity newUser)throws UserAllreadyExistException{

        //Verify this userLogin in table_user_entity
        if (userRep.findByLogin(newUser.getLogin())!=null)
            throw new UserAllreadyExistException("This user is exist in database");

        return UserModel.toModel(userRep.save(newUser));
        }//addNewUser


    public UserModel getOne(Long userId)throws UserNotFoundException{

        UserEntity user = userRep.findById(userId).get();
        if (user==null) throw new UserNotFoundException("User not found");
        return UserModel.toModel(user);
        }//getOneUser


    public Long deleteOne(Long userId)throws UserNotFoundException{
        UserEntity user = userRep.findById(userId).get();
        if (user==null) throw new UserNotFoundException("This user not found");

        userRep.deleteById(userId);
        return userId;
        }//getOneUser


    public List<UserModel> getUserList()throws UserNotFoundException {

        try {
            List<UserEntity> userEntityList = (List<UserEntity>)userRep.findAll();

            if (userEntityList==null) throw new UserNotFoundException("not users in dataBase");

            //converted to Model for WEB
            List<UserModel> userModelList = userEntityList.stream()
                                                          .map(UserModel::toModel)
                                                          .collect(Collectors.toList());
            return userModelList;
            } catch (UserNotFoundException e) {
                throw e;//new UserNotFoundException(e.getMessage());
            } catch (Exception e) {
                throw e;
                }



    }//getUserList









}
