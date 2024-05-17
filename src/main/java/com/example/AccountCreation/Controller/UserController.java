package com.example.AccountCreation.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.AccountCreation.entity.User;
import java.util.Optional;
import com.example.AccountCreation.service.UserService;
@RestController
@RequestMapping("/api/v1/usermanagement")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/createUser")
    public User createUser(@RequestBody User user )
    {
        return userService.createUser(user);
    }

    @GetMapping("/getuser/{id}")
    public Optional<User> getUser(@PathVariable("id") Long uid){

        return userService.getUser(uid);
    }
}



