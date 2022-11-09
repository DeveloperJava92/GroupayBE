package it.EverestInnovation.WalletProjectDemo.controller;

import it.EverestInnovation.WalletProjectDemo.model.User;
import it.EverestInnovation.WalletProjectDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("")
    public List<User> userList(){
        return userService.listAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }

    /*@GetMapping("/wallet/{id}")
    public List<User> getUserByWalletId(@PathVariable Integer id){
        return userService.getUserByWalletId(id);
    }*/

    @PostMapping("")
    public void addUser(@RequestBody User user){
        userService.saveUser(user);
    }

    @PutMapping("")
    public User update(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }
}
