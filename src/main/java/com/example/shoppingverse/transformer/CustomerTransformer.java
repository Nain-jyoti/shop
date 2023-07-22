package com.example.shoppingverse.transformer;

import com.example.shoppingverse.dto.RequestDto.CustomerRequestDto;
import com.example.shoppingverse.dto.ResponseDto.CustomerResponseDto;
import com.example.shoppingverse.model.Customer;

public class CustomerTransformer {

    public static Customer CustomerRequestDtoToCustomer(CustomerRequestDto customerRequestDto){

        return Customer.builder()
                .name(customerRequestDto.getName())
                .gender(customerRequestDto.getGender())
                .mobileNo(customerRequestDto.getMobileNo())
                .emailId(customerRequestDto.getEmailId())
                .build();
    }

    public static CustomerResponseDto CustomerToCustomerResponseDto(Customer customer){

        return CustomerResponseDto.builder()
                .name(customer.getName())
                .emailId(customer.getEmailId())
                .mobNo(customer.getMobileNo())
                .build();
    }
}
