package com.eval.eval.services;

import com.eval.eval.dtos.UserProfileDto;
import com.eval.eval.entities.Users;
import org.springframework.stereotype.Service;

@Service
public interface UserProfileServiceImpl extends UserProfileService {

    private final UserProfileJpaRepository repository;

    public UserProfileServiceImpl(UserProfileJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserProfileDto get(Long id) {
        Users users = repository.findById(id).get();
        return convertFrom(users);
    }

    private UserProfileDto convertFrom(Users users) {
        UserProfileDto dto = new UserProfileDto();
        dto.setFirstName(users.getFirstName());
        dto.setLastName(users.getLastName());
        return dto;
    }
}
