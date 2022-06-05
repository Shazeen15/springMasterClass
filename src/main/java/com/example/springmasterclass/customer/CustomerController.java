package com.example.springmasterclass.customer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "all")
    List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @PostMapping
    void addCustomer(
        @RequestBody
            Customer customer) {
        customerService.addCustomer(customer);
    }

    @PutMapping
    void updateCustomer(
        @RequestBody
            Customer customer) {
        customerService.updateCustomer();
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(
        @PathVariable("customerId")
            Long customerId) {
        customerService.deleteCustomer(customerId);
    }
}
