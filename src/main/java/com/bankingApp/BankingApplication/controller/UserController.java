package com.bankingApp.BankingApplication.controller;

import com.bankingApp.BankingApplication.dto.Response;
import com.bankingApp.BankingApplication.dto.UserRequest;
import com.bankingApp.BankingApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping
    public Response createAccount(@RequestBody UserRequest userRequest){
        return userService.createAccount(userRequest);
    }
}
