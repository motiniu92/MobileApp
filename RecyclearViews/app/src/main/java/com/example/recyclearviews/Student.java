package com.example.recyclearviews;

public class Student {

    private String name;
    private int id;
    private String email;
    private String phoneNO;
    private int profileImage;

    public Student() {
    }

    public Student(String name, int id, String email, String phoneNO, int profileImage) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phoneNO = phoneNO;
        this.profileImage = profileImage;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNO() {
        return phoneNO;
    }

    public int getProfileImage() {
        return profileImage;
    }
}
