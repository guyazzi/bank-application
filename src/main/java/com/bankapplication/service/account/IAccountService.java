package com.bankapplication.service.account;

import com.bankapplication.dto.AccountDto;

import java.util.List;

public interface IAccountService {

    AccountDto getAccountById (final long accountId);

    List<AccountDto> getAllAccounts();

}
