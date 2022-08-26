package com.bankapplication.model.accounttypes;

import com.bankapplication.model.Account;
import com.bankapplication.model.AccountTypeEnum;
import com.bankapplication.service.account.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChequingAccount extends Account implements IAccountType  {

    @Autowired
    IAccountService accountService;

    @Override
    public double getAccountFees() {
        return accountService.getAccountFeesByType(AccountTypeEnum.Chequing);
    }
}
