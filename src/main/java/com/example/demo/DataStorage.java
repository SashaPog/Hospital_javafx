package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class DataStorage {
    private static DataStorage instance;
    private final List<User> users;


    private DataStorage() {
        users = new ArrayList<>();
        users.add(new User("a", "a", "a", "a", "a", User.Gender.FEMALE));


    }

    public static DataStorage getInstance() {
        if (instance == null) {
            instance = new DataStorage();
        }

        return instance;
    }

    public List<User> getUsers() {
        return users;
    }


}
