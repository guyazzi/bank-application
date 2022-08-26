package com.bankapplication.dto;

import com.bankapplication.model.AccountTypeEnum;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@Builder
public class AccountTypeDto {
    private Long id;
    private AccountTypeEnum type;
    private double fees;
}
