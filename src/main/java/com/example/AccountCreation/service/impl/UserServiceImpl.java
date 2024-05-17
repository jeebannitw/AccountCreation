package com.example.AccountCreation.service.impl;
import com.example.AccountCreation.service.UserService;
import com.example.AccountCreation.entity.User;
import com.example.AccountCreation.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Override
    public User createUser(User user){

        return userRepository.save(user);
    }
    @Override
    public Optional<User> getUser(Long uid){
        Optional<User> user = userRepository.findById(uid);
        return user;
        }
}



