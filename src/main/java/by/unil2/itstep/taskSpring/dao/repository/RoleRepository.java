package by.unil2.itstep.taskSpring.dao.repository;


import by.unil2.itstep.taskSpring.dao.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity,Long> {

    //RoleEntity findByLogin(String userLogin);


}
