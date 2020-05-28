package com.eval.eval.services;

import com.eval.eval.dtos.UserProfileDto;

public interface UserProfileService {
    UserProfileDto showProfile(Long id);
}
