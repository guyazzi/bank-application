package com.bankapplication.repository;

import com.bankapplication.model.Customer;
import com.bankapplication.service.customer.CustomerAccounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
    CustomerAccounts getById(final long customerId);
}
