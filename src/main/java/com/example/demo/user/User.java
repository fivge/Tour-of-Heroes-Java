package com.example.demo.user;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class User {

    private Long id;

    @NotNull
    @Size(min = 3, max = 6)
    private String name;

    @NotNull
    @Min(16)
    @Max(78)
    private Integer age;

    @NotNull
    @Email
    private String email;

}