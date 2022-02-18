package by.unil2.itstep.taskSpring.dao.repository;


import by.unil2.itstep.taskSpring.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

    UserEntity findByLogin(String userLogin);


    }
