package BackEnd.controller;

import BackEnd.DTO.UserDTO;
import BackEnd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/getUsers")
    public List<UserDTO> getUser(){

        return userService.getAllUsers();
    }

    //Create function
    @PostMapping("/postUser")
    //ReqBdy mean: convert json data into spring wise reading
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

}
