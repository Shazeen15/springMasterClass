package com.example.springmasterclass.jsonplaceholder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JSONPlaceholderConfiguration {
    @Bean("jsonplaceholder")
    CommandLineRunner runner(JSONPlaceHolderClient jsonPlaceHolderClient) {
        return args -> {
            System.out.println("https://jsonplaceholder.typicode.com/posts");
            int numberOfPosts = jsonPlaceHolderClient.getPosts()
                .size();
            System.out.println("numberOfPosts = " + numberOfPosts);

            System.out.println("https://jsonplaceholder.typicode.com/posts/1");
            var post = jsonPlaceHolderClient.getPost(1);
            System.out.println("post = " + post);
        };
    }
}
