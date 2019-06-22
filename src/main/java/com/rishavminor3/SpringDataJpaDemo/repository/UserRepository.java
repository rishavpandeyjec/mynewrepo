package com.rishavminor3.SpringDataJpaDemo.repository;


import com.rishavminor3.SpringDataJpaDemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<User,Long> {
}
