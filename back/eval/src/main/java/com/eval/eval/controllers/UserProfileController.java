package com.eval.eval.controllers;

import com.eval.eval.dtos.UserProfileDto;
import com.eval.eval.services.UserProfileService;
import com.eval.eval.services.UserRegistrationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserProfileController {

    private final UserProfileService service;

    public UserProfileController(UserProfileService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public UserProfileDto get(@PathVariable("id") Long id) {
        return service.showProfile(id);
    }
}
