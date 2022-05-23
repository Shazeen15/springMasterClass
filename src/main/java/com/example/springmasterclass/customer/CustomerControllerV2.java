package com.example.springmasterclass.customer;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v2/customers")
public class CustomerControllerV2 {
    private final CustomerService customerService;

    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping(path = "{customerId}")
    Customer getCustomer(
        @PathVariable("customerId")
            Long customerId) {
        return customerService.getCustomerById(customerId);
    }


    @PostMapping
    void addCustomer(
        @Valid
        @RequestBody
            Customer customer) {
        System.out.println(customer);
        customerService.addCustomer();
    }

    @PutMapping
    void updateCustomer(
        @RequestBody
            Customer customer) {
        System.out.println(customer);
        customerService.updateCustomer();
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(
        @PathVariable("customerId")
            Long customerId) {
        customerService.deleteCustomer(customerId);
    }
}
