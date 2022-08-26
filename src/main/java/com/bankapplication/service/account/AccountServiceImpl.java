package com.bankapplication.service.account;

import com.bankapplication.dto.AccountDto;
import com.bankapplication.model.AccountType;
import com.bankapplication.model.AccountTypeEnum;
import com.bankapplication.repository.IAccountRepository;
import com.bankapplication.model.Account;
import com.bankapplication.dto.mapper.AccountMapper;
import com.bankapplication.repository.IAccountTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountService {


    private final IAccountRepository accountRepository;
    private final IAccountTypeRepository accountTypeRepository;
    private final AccountMapper accountMapper;


    @Override
    public AccountDto getAccountById(long accountId) {
        Optional<Account> accountOptional = accountRepository.findById(accountId);
        return accountOptional.map(accountMapper::toDto).orElse(null);
    }

    @Override
    public List<AccountDto> getAllAccounts() {
        List<Account> accounts = accountRepository.findAll();
        return accounts.stream()
                .map(accountMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public AccountDto addAccount(AccountDto accountDto) {
        var account = accountMapper.toEntity(accountDto);
        return accountMapper.toDto(accountRepository.save(account));
    }

    @Override
    public double getAccountFeesByType(AccountTypeEnum type) {
        AccountType accountType = accountTypeRepository.findByType(type);
        return accountType.getFees();
    }
}
