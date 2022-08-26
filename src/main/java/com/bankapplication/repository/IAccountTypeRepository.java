package com.bankapplication.repository;

import com.bankapplication.model.AccountType;

import com.bankapplication.model.AccountTypeEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountTypeRepository extends JpaRepository<AccountType, Long> {
    AccountType findByType(AccountTypeEnum type);
 }
