package com.bankapplication.dto.mapper;

import com.bankapplication.dto.AccountTypeDto;
import com.bankapplication.model.AccountType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountTypeMapper {
    AccountType toEntity(AccountTypeDto accountTypeDto);

    AccountTypeDto toDto(AccountType accountTye);
}
