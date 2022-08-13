package com.bankapplication.util;

import com.bankapplication.dto.CustomerDto;
import com.bankapplication.repository.model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer toEntity(CustomerDto customerDto);

    CustomerDto toDto(Customer customer);
}
