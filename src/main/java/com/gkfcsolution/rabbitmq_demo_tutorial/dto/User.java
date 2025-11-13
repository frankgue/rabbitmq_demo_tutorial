package com.gkfcsolution.rabbitmq_demo_tutorial.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
