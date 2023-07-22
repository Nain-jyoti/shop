package com.example.shoppingverse.service;

import com.example.shoppingverse.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.shoppingverse.dto.RequestDto.CustomerRequestDto;
import com.example.shoppingverse.dto.ResponseDto.CustomerResponseDto;
import com.example.shoppingverse.model.Cart;
import com.example.shoppingverse.model.Customer;
import com.example.shoppingverse.repository.CustomerRepository;
import com.example.shoppingverse.transformer.CustomerTransformer;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public CustomerResponseDto addCustomer(CustomerRequestDto customerRequestDto){

        // dto -> entity
        Customer customer = CustomerTransformer.CustomerRequestDtoToCustomer(customerRequestDto);
        Cart cart = Cart.builder()
                .cartTotal(0)
                .customer(customer)
                .build();

        customer.setCart(cart);

        Customer savedCustomer = customerRepository.save(customer);  // saves both customer and cart
        // prepare response Dto
        return CustomerTransformer.CustomerToCustomerResponseDto(savedCustomer);

    }
}
