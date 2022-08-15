package com.bankapplication.controller;

import com.bankapplication.dto.AccountDto;
import com.bankapplication.dto.CustomerDto;
import com.bankapplication.service.customer.ICustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final ICustomerService customerService;

    @GetMapping("/")
    public ResponseEntity<List<CustomerDto>> getAllCustomers() {
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getAllCustomers());
    }

    @GetMapping("/customer/")
    public ResponseEntity<CustomerDto> getCustomerById(@RequestParam("id") Long customerId) {
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getCustomerById(customerId));
    }

    @GetMapping("/customer/accounts/")
    public ResponseEntity<List<AccountDto>> getCustomerAccounts(@RequestParam("id") Long customerId) {
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getCustomerAccounts(customerId));
    }
}
