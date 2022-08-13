package com.bankapplication.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountDto {

    private long id;
    private String type;
    private String currency;
    private double balance;

}
