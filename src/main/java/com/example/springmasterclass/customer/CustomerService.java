package com.example.springmasterclass.customer;

import com.example.springmasterclass.exception.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final static Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    List<Customer> getCustomers() {
        LOGGER.info("get customers was called");
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
        return customerRepository.findById(customerId)
            .orElseThrow(() -> {
                var notFoundException = new NotFoundException("customer with id " + customerId + " not found");
                LOGGER.error("error in getCustomerById {}",
                    customerId,
                    notFoundException);
                return notFoundException;
            });
    }

}
