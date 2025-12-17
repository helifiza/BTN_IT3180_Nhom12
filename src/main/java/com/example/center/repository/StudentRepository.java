package com.example.center.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.center.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
