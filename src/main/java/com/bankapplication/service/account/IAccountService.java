package com.bankapplication.service.account;

import com.bankapplication.dto.AccountDto;
import com.bankapplication.model.AccountTypeEnum;

import java.util.List;

public interface IAccountService {

    AccountDto getAccountById (final long accountId);

    List<AccountDto> getAllAccounts();

    AccountDto addAccount(AccountDto accountDto);

    double getAccountFeesByType(AccountTypeEnum type);
}
