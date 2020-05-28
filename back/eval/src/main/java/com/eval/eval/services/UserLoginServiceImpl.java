package com.eval.eval.services;

import com.eval.eval.dtos.UserLoginDto;
import com.eval.eval.entities.Users;
import com.eval.eval.repositories.UserLoginJpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserLoginServiceImpl extends UserLoginService {

    private final UserLoginJpaRepository repository;

    public UserLoginServiceImpl(UserLoginJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void login(UserLoginDto dto) {
        Users users = new Users();
        users.setEmail(dto.getEmail());
        users.setPassword(dto.getPassword());
        usersRepo.save(users);
    }
}
