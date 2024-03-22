package com.dev.userdep.controllers;

import com.dev.userdep.entities.Department;
import com.dev.userdep.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository repository;

    @GetMapping
    public List<Department> findAll(){
        return repository.findAll();
    }
    @GetMapping(value = "{id}")
    public Department findById(@PathVariable Long id){
        return repository.findById(id).get();
    }
}


