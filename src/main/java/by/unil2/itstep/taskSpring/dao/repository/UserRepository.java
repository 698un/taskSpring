package by.unil2.itstep.taskSpring.dao.repository;


import by.unil2.itstep.taskSpring.dao.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity,Long> {

    UserEntity findByLogin(String userLogin);



    }
