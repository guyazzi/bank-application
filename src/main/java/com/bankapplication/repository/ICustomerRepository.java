package com.bankapplication.repository;

import com.bankapplication.repository.model.Customer;
import com.bankapplication.service.customer.CustomerAccounts;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ICustomerRepository extends JpaRepository<Customer, Long> {
    CustomerAccounts getById(final long customerId);
}
