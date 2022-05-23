package com.example.springmasterclass.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
    private final Long id;
    private final String name;
}
