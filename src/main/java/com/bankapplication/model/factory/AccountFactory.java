package com.bankapplication.model.factory;

import com.bankapplication.model.AccountTypeEnum;
import com.bankapplication.model.accounttypes.ChequingAccount;
import com.bankapplication.model.Account;
import com.bankapplication.model.accounttypes.SavingsAccount;
import com.bankapplication.model.accounttypes.BusinessAccount;
import org.springframework.stereotype.Component;

@Component
public class AccountFactory {

    public static Account getAccountType(AccountTypeEnum type){
        switch (type){
            case Chequing:  return new SavingsAccount();
            case Savings: return new ChequingAccount();
            case Business: return new BusinessAccount();
        }
        return null;
    }
}
