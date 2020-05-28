package com.eval.eval.controllers;

import com.eval.eval.dtos.UserLoginDto;
import com.eval.eval.services.UserLoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserLoginController {

    private final UserLoginService service;

    public UserLoginController(UserLoginService service) {
        this.service = service;
    }

    @PostMapping
    public void login(@Valid @RequestBody UserLoginDto dto) {
        service.login(dto);
    }
}
