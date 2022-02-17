package by.unil2.itstep.taskSpring.controller;


import by.unil2.itstep.taskSpring.dao.entity.UserEntity;
import by.unil2.itstep.taskSpring.dao.repository.UserRepository;
import by.unil2.itstep.taskSpring.exception.UserAllreadyExistException;
import by.unil2.itstep.taskSpring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserService userService;


    @PostMapping("/add")
    public ResponseEntity addNewUser(@RequestBody UserEntity newUser){


            try {
                userService.addNewUser(newUser);
                return ResponseEntity.ok().body("user is added");
            } catch (UserAllreadyExistException e){
                return ResponseEntity.badRequest().body(e.getMessage());

            } catch (Exception e) {
                   return ResponseEntity.badRequest().body("Error registration");
                   }

    }//addNewUser



    /**
     * This method return all users
     * @return
     */
    @GetMapping("/all")
    public ResponseEntity getUsers(){


        try {

            return ResponseEntity.ok("Server OK");

            } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
            }


        }//getUsers



    }//UserController



