package by.unil2.itstep.taskSpring.controller;

import by.unil2.itstep.taskSpring.dao.entity.TaskEntity;
import by.unil2.itstep.taskSpring.dao.model.TaskModel;
import by.unil2.itstep.taskSpring.service.TaskService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;




@RunWith(MockitoJUnitRunner.class)
class TaskControllerTest {

    //inject service
    @Mock
    private TaskService tskService;

    @InjectMocks
    TaskController tskCntrl;

    @Test
    public void getTaskListAll() throws Exception {

        //prepare
    //    when(tskService.getAllTask()).thenReturn(null);

        ResponseEntity tskListResp = tskCntrl.getTaskListAll();
        
   //     verify(tskService).findAll();


        }//end test (getTaskListAll)


}