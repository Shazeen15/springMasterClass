package com.example.springmasterclass.customer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomers() {
        return customerRepo.getCustomers();
    }

    public void addCustomer() {
        System.out.println("customer added with post request");
    }

    public void deleteCustomer(Long customerId) {
        System.out.println("deleted customer with id " + customerId);
    }

    public void updateCustomer() {
        System.out.println("updated customer");
    }

    public Customer getCustomerById(Long customerId) {
        return getCustomers().stream()
            .filter(customer -> customer.getId()
                .equals(customerId))
            .findFirst()
            .orElseThrow(() -> new IllegalStateException("customer not found"));
    }

}
