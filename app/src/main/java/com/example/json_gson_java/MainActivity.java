package com.example.json_gson_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
//        Employee employee = new Employee("Ashutosh", "Kumar" , 21, "fgdgf5");
//        String json = gson.toJson(employee);

        String json = "{\"age\":21,\"first_name\":\"Ashutosh\",\"last_name\":\"Kumar\",\"password\":\"fgdgf5\"}";
        Employee employee = gson.fromJson(json, Employee.class);

    }
}