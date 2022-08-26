package com.bankapplication.dto.mapper;

import com.bankapplication.dto.AccountDto;
import com.bankapplication.model.Account;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    Account toEntity(AccountDto accountDto);

    AccountDto toDto(Account account);
}
