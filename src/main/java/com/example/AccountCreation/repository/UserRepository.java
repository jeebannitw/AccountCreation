package com.example.AccountCreation.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.AccountCreation.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{


}
