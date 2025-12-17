package com.example.center.controller;

import com.example.center.model.Class;
import com.example.center.service.ClassService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classes")
@CrossOrigin
public class ClassController {

    private final ClassService classService;

    public ClassController(ClassService classService) {
        this.classService = classService;
    }

    @GetMapping
    public List<Class> getAllClasses() {
        return classService.getAllClasses();
    }

    @PostMapping
    public Class createClass(@RequestBody Class clazz) {
        return classService.createClass(clazz);
    }
}
