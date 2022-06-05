package com.example.springmasterclass.customer;

import com.example.springmasterclass.exception.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public void addCustomer(Customer customer) {
        System.out.println(customer);
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
            .orElseThrow(() -> new NotFoundException("customer with id " + customerId + " not found"));
    }

}
