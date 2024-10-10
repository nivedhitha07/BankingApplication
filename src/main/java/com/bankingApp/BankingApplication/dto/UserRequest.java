package com.bankingApp.BankingApplication.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String address;
    private String date;
    private String email;
    private String phoneNumber;
    //private String status;
}
