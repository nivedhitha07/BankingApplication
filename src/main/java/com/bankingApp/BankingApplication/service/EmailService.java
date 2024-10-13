package com.bankingApp.BankingApplication.service;

import com.bankingApp.BankingApplication.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
