package com.eval.eval.controllers;

import com.eval.eval.dtos.UserLoginDto;
import com.eval.eval.dtos.UserRegistrationDto;
import com.eval.eval.services.UserLoginService;
import com.eval.eval.services.UserRegistrationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserRegistrationController {

    private final UserRegistrationService service;

    public UserRegistrationController(UserRegistrationService service) {
        this.service = service;
    }

    @PostMapping
    public void login(@Valid @RequestBody UserRegistrationDto dto) {
        service.register(dto);
    }
}
