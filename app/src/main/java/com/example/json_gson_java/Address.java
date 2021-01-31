package com.example.json_gson_java;

import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("city")
    private String mcity;

    @SerializedName("country")
    private String mcountry;

    public Address(String city, String country) {
        mcity = city;
        mcountry = country;
    }
}
