package com.example.springmasterclass.customer;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "fake")
public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return List.of(new Customer(1L, "Shazeen"));
    }
}
