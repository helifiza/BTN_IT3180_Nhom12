package com.example.center.service;

import com.example.center.model.Class;
import com.example.center.repository.ClassRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {

    private final ClassRepository classRepository;

    public ClassService(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    public List<Class> getAllClasses() {
        return classRepository.findAll();
    }

    public Class createClass(Class clazz) {
        return classRepository.save(clazz);
    }
}
