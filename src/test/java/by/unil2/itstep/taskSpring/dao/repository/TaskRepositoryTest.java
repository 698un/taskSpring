package by.unil2.itstep.taskSpring.dao.repository;

import by.unil2.itstep.taskSpring.dao.entity.TaskEntity;
import by.unil2.itstep.taskSpring.dao.entity.UserEntity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import java.util.List;


@DataJpaTest
class TaskRepositoryTest {

    //Create temporary repositories for test in memory (H2)
    @Autowired
    private TaskRepository tskRepTest;
    @Autowired
    private UserRepository usrRepTest;


    @AfterEach
    void tearDown(){
        tskRepTest.deleteAll();
        usrRepTest.deleteAll();
        }

    /**
     * This test create one user and secod user , give for first user who new tasks
     * and one task for SECOND user
     * and verify quentity of task in First user (two or not (two))
     */
    @Test
    void itShould_getAllUncompletteTaskForExecutor() {

       // tskRepTest.deleteAll();
        //usrRepTest.deleteAll();

        //give
        //Create first user
        UserEntity user1 = new UserEntity();
                   //user1.setId(1L);
                   user1.setLogin("testLogin1");
                   user1.setPassword("testPassword1");
                   Long executorId = usrRepTest.save(user1).getId();

        //create second user
        UserEntity user2 = new UserEntity();
                   user2.setLogin("testLogin2");
                   user2.setPassword("testPassword2");
                   usrRepTest.save(user2);

        //create first task for first user
        TaskEntity task1 = new TaskEntity();
                   task1.setTitle("testTask1");
                   task1.setComplette(false);
                   task1.setExecutor(user1);
                   tskRepTest.save(task1);

        //create second task for FIRST user
        TaskEntity task2 = new TaskEntity();
                   task2.setTitle("testTask2");
                   task2.setComplette(false);
                   //task2.setId(2L);
                   task2.setExecutor(user1);
                   tskRepTest.save(task2);

        //create third task for SECOND user
        TaskEntity task3 = new TaskEntity();
                   task3.setTitle("testTask3");
                   task3.setComplette(false);
                   task3.setExecutor(user2);
                   tskRepTest.save(task3);


        //when
        List<TaskEntity> taskListExpected = tskRepTest.getAllUncompletteTaskForExecutor(executorId);

        //then
        assertThat(taskListExpected.size()).isEqualTo(2);

       // tskRepTest.deleteAll();
       // usrRepTest.deleteAll();

        }//itShould_getAllUncompletteTaskForExecutor

//======================TEST OF CREATE TASKS
    /**
     * This test create one user, give it who new tasks
     * and verify quentity of task in TaskRepository  (Two or not(two))
     */


    @Test
    void itShould_findAllTask() {


       // tskRepTest.deleteAll();
       // usrRepTest.deleteAll();

        //give
        //create one user
        UserEntity user1 = new UserEntity();
                   user1.setLogin("testLogin2");
                   user1.setPassword("testPassword2");
        usrRepTest.save(user1);
        //create
        TaskEntity task1 = new TaskEntity();
                   task1.setTitle("testTask1");
                   task1.setComplette(false);
                   task1.setExecutor(user1);
        tskRepTest.save(task1);

        TaskEntity task2 = new TaskEntity();
                   task2.setTitle("testTask2");
                   task2.setComplette(false);
                   task2.setExecutor(user1);
        tskRepTest.save(task2);


        //when
        List<TaskEntity> taskListExpected = tskRepTest.findAll();

        //then
        assertThat(taskListExpected.size()).isEqualTo(2);

        //tskRepTest.deleteAll();
       // usrRepTest.deleteAll();

    }//itShould_findAllTask















}