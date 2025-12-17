package com.example.center.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.center.model.Class;

public interface ClassRepository extends JpaRepository<Class, Long> {
}
