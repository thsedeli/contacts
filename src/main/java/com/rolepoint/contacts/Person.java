package com.rolepoint.contacts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {
    private List<String> job_history;
    private String company;
    private String email;
    private String city;
    private String name;
    private String country;
}
