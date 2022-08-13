package com.bankapplication.controller;

import com.bankapplication.dto.AccountDto;
import com.bankapplication.dto.CustomerDto;
import com.bankapplication.service.customer.CustomerServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerServiceImpl customerService;

    @GetMapping("/")
    public ResponseEntity<List<CustomerDto>> getAllCustomer() {
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getAllCustomers());
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<CustomerDto> getCustomerById(@RequestParam("Customer Id") Long customerId) {
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getCustomerById(customerId));
    }

    @GetMapping("/customer/accounts/{id}")
    public ResponseEntity<List<AccountDto>> getCustomerAccounts(@RequestParam("Customer Id") Long customerId) {
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getCustomerAccounts(customerId));
    }
}
