package com.example.springmasterclass.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
    @JsonProperty("customerId")
    private final Long id;

    @NotBlank
    private final String name;

    @NotBlank
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private final String password;

    @NotBlank
    @Email
    private final String email;

    @JsonIgnore
    public String getPassword() {
        return password;
    }
}
