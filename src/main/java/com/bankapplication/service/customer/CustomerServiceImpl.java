package com.bankapplication.service.customer;

import com.bankapplication.dto.AccountDto;
import com.bankapplication.dto.CustomerDto;
import com.bankapplication.repository.ICustomerRepository;
import com.bankapplication.model.Customer;
import com.bankapplication.dto.mapper.AccountMapper;
import com.bankapplication.dto.mapper.CustomerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements ICustomerService {

    private final ICustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    private final AccountMapper accountMapper;


    @Override
    public CustomerDto getCustomerById(long customerId) {
        Optional<Customer> customerOptional = customerRepository.findById(customerId);
        return customerOptional.map(customerMapper::toDto).orElse(null);
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        return customers.stream()
                .map(customerMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<AccountDto> getCustomerAccounts(long customerId) {
        CustomerAccounts customerAccounts = customerRepository.getById(customerId);
        return customerAccounts.getAccounts().stream()
                .map(accountMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDto addCustomer(CustomerDto customerDto) {
        var customer = customerMapper.toEntity(customerDto);
        return customerMapper.toDto(customerRepository.save(customer));
    }

}
