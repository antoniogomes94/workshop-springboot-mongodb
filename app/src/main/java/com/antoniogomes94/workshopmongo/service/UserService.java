package com.antoniogomes94.workshopmongo.service;

import com.antoniogomes94.workshopmongo.domain.User;
import com.antoniogomes94.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
