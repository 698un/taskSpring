package by.unil2.itstep.taskSpring.controller;


import by.unil2.itstep.taskSpring.dao.entity.UserEntity;
import by.unil2.itstep.taskSpring.dao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRep;

    @PostMapping("/add")
    public ResponseEntity addNewUser(@RequestBody UserEntity newUser){

        System.out.println(newUser.getLogin());

//        try{
            userRep.save(newUser);
            return ResponseEntity.ok("User is added");

  //           } catch (Exception e) {
      //             return ResponseEntity.badRequest().body("Error registration");
    //                }




    }



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



