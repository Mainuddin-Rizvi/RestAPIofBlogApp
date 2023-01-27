package com.springboot.blog.payload;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDto {
    private String name;
    private String username;
    private String email;
    private String password;

}
