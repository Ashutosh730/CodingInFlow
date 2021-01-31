package com.example.json_gson_java;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class Employee {
    @Expose
    private String first_name;

    @Expose(serialize = false)
    private String last_name;

    @Expose(deserialize = false)
    private int age;

    private String password;

    public Employee(String first_name, String last_name, int age , String password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.password=password;
    }
}
