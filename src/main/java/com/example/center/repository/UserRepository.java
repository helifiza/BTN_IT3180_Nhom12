package com.example.center.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.center.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // bạn có thể bổ sung phương thức custom sau
}
