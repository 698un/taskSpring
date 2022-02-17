package by.unil2.itstep.taskSpring.service;


import by.unil2.itstep.taskSpring.dao.entity.UserEntity;
import by.unil2.itstep.taskSpring.dao.repository.UserRepository;
import by.unil2.itstep.taskSpring.exception.UserAllreadyExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {



    @Autowired
    private UserRepository userRep;



    public UserEntity addNewUser(UserEntity newUser)throws UserAllreadyExistException{

        //Verify this userLogin in table_user_entity
        if (userRep.findByLogin(newUser.getLogin())!=null)
            throw new UserAllreadyExistException("This user is exist in database");

        return userRep.save(newUser);

        }//addNewUser



}
