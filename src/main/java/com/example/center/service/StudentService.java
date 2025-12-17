package com.example.center.service;

import com.example.center.model.Student;
import com.example.center.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student createStudent(Student student) {
        return repository.save(student);
    }

    public Student getStudentById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Student updateStudent(Long id, Student student) {
        Student existing = getStudentById(id);

        existing.setFullName(student.getFullName());
        existing.setPhone(student.getPhone());
        existing.setEmail(student.getEmail());
        existing.setDateOfBirth(student.getDateOfBirth());
        existing.setAddress(student.getAddress());

        return repository.save(existing);
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}
