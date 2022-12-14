package com.bankapplication.service.customer;

import com.bankapplication.dto.AccountDto;
import com.bankapplication.dto.CustomerDto;

import java.util.List;

public interface ICustomerService {

    CustomerDto getCustomerById(final long customerId);

    List<CustomerDto> getAllCustomers();

    List<AccountDto> getCustomerAccounts(long customerId);

    CustomerDto addCustomer(CustomerDto customerDto);
}

