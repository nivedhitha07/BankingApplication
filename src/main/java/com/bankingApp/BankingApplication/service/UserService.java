package com.bankingApp.BankingApplication.service;

import com.bankingApp.BankingApplication.dto.Response;
import com.bankingApp.BankingApplication.dto.UserRequest;

public interface UserService {
    Response createAccount(UserRequest userRequest);
}
