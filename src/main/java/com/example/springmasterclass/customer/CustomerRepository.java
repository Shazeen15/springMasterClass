package com.example.springmasterclass.customer;

import java.util.List;

public class CustomerRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return List.of(new Customer(1L,
            "Connect to real db"));
    }
}
