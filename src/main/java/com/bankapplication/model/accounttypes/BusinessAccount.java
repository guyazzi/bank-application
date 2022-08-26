package com.bankapplication.model.accounttypes;

import com.bankapplication.model.Account;
import com.bankapplication.model.AccountTypeEnum;
import com.bankapplication.service.account.IAccountService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessAccount extends Account implements IAccountType {

    @Autowired
    IAccountService accountService;

    @Override
    public double getAccountFees() {
        return accountService.getAccountFeesByType(AccountTypeEnum.Business);
    }
}
