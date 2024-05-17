package com.example.AccountCreation.service;
import com.example.AccountCreation.entity.User;

import java.util.Optional;

public interface UserService {
    User createUser(User user);
    Optional<User> getUser(Long uid);
}
