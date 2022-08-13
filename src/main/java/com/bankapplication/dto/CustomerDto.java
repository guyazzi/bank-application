package com.bankapplication.dto;

import com.bankapplication.repository.model.Account;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CustomerDto {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<Account> accounts;
}
