package by.unil2.itstep.taskSpring.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

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



