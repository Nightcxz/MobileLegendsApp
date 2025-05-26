package com.example.mobilelegendsapp;

import java.io.Serializable;

public class Hero implements Serializable {
    private String name;
    private String role;
    private String description; // 👈 Add this
    private int imageResId;

    public Hero(String name, String role, String description, int imageResId) {
        this.name = name;
        this.role = role;
        this.description = description;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResId() {
        return imageResId;
    }
}


