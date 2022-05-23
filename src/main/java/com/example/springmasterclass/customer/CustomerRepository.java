package com.example.springmasterclass.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return List.of(new Customer(1L, "Jamile"));
    }
}
