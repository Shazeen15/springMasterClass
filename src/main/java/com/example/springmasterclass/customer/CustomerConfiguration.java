package com.example.springmasterclass.customer;

import com.example.springmasterclass.infoapp.InfoApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class CustomerConfiguration {
    @Value("${app.useFakeRepo:false}")
    private Boolean useFakeRepo;

    @Value("${info.company.name}")
    private String companyName;

    @Autowired
    private Environment environment;

    @Bean
    CommandLineRunner commandLineRunner(InfoApp infoApp) {
        return arg -> {
            System.out.println("Command Line Runner ------ ");
            System.out.println(companyName);
            System.out.println(environment.getProperty("info.app.description"));
            System.out.println(infoApp);
        };
    }

    @Bean
    CustomerRepo customerRepo() {
        System.out.println("useFakeRepo = " + useFakeRepo);
        return new CustomerFakeRepository();
    }
}
