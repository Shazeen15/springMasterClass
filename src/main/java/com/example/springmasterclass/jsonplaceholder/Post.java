package com.example.springmasterclass.jsonplaceholder;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Post {
    /**
     * "userId"
     * "id"
     * "title"
     * "body"
     */
    private Integer userId;

    private Integer id;

    private String title;

    private String body;
}
