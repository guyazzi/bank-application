package com.bankapplication.dto;

import com.bankapplication.model.AccountType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountDto {

    private long id;
    private AccountType type;
    private String currency;
    private double balance;

}
