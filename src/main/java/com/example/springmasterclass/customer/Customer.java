package com.example.springmasterclass.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
    @Id
    @JsonProperty("customer_id")
    private Long id;

    @NotBlank(message = "provide name")
    private String name;

    @NotBlank(message = "provide password")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @NotBlank(message = "provide email")
    @Email(message = "provide proper email")
    private String email;

    @JsonIgnore
    public String getPassword() {
        return password;
    }
}
