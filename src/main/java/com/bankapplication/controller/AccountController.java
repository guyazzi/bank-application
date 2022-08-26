package com.bankapplication.controller;

import com.bankapplication.dto.AccountDto;
import com.bankapplication.dto.CustomerDto;
import com.bankapplication.model.AccountTypeEnum;
import com.bankapplication.service.account.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final IAccountService accountService;

    @GetMapping("/")
    public ResponseEntity<List<AccountDto>> getAllAccounts() {
        return ResponseEntity.status(HttpStatus.OK).body(accountService.getAllAccounts());
    }

    @GetMapping("/account/")
    public ResponseEntity<AccountDto> getAccountById(@RequestParam("id") Long accountId) {
        return ResponseEntity.status(HttpStatus.OK).body(accountService.getAccountById(accountId));
    }

    @PostMapping("/add")
    public ResponseEntity<AccountDto> addAccount(@Valid @RequestBody AccountDto accountDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(accountService.addAccount(accountDto));
    }

    @GetMapping("/fees")
    public double getAccountFeesByType(@RequestParam("type")AccountTypeEnum type){
        return accountService.getAccountFeesByType(type);
    }

}
