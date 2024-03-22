package com.dev.userdep.controllers;

import com.dev.userdep.UserdepApplication;
import com.dev.userdep.entities.User;
import com.dev.userdep.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll(){
        List<User> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "{id}")
    public User findById(@PathVariable Long id){
        return repository.findById(id).get();
    }

    @PostMapping()
    public User findById(@RequestBody User user){
        return repository.save(user);
    }
}
