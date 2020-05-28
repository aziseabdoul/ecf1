package com.eval.eval.services;

import com.eval.eval.dtos.UserRegistrationDto;
import com.eval.eval.entities.Users;
import com.eval.eval.repositories.UserRegistrationJpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRegistrationServiceImpl extends UserRegistrationService {

    private final UserRegistrationJpaRepository repository;

    public UserRegistrationServiceImpl(UserRegistrationJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void register(UserRegistrationDto dto) {
        Users users = new Users();
        users.setFirstName(dto.getFirstName());
        users.setLastName(dto.getLastName());
        users.setBirthdate(dto.getBirthDate());
        users.setEmail(dto.getEmail());
        users.setPassword(dto.getPassword());
        usersRepo.save(users);
    }
}
