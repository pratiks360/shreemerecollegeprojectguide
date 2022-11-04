package io.shree.bms.api;


import io.shree.bms.DBtables.UserEntity;
import io.shree.bms.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller {


    @GetMapping(path = "/status")
    public String health(){

        return "Started";
    }


    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewUser(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email) {

        UserEntity user = new UserEntity();

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);


        userRepository.save(user);
        return "User Created";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable < UserEntity > getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping(path = "/byemail")
    public @ResponseBody UserEntity getAllUserbyEmail(@RequestParam String email) {
        return userRepository.findByEmail(email);
    }

}
