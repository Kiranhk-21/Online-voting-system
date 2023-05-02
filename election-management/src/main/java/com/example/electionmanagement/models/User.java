package com.example.electionmanagement.models;

import java.util.List;


public abstract class User {
    int userId;
    String name;

    public User(){}
    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", name=" + name + "]";
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract List<Election> get_electionList();
}
