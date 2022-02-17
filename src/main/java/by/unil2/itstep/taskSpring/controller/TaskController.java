package by.unil2.itstep.taskSpring.controller;

import by.unil2.itstep.taskSpring.dao.entity.TaskEntity;
import by.unil2.itstep.taskSpring.dao.repository.TaskRepository;
import by.unil2.itstep.taskSpring.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



//{"title":"endWord","content":"full descripton","executor":{"id":1,"login":"log1"}}

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;


    @PostMapping
    public ResponseEntity addNewTask(@RequestBody TaskEntity newTask){


        try{
            return ResponseEntity.ok(taskService.addNewTask(newTask));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("not added task");
             }

    }//addNewTask


    @PutMapping
    public ResponseEntity updateTask(@RequestBody TaskEntity currentTask){

        try{
            return ResponseEntity.ok(taskService.addNewTask(currentTask));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("not added task");
        }

    }//addNewTask



}
