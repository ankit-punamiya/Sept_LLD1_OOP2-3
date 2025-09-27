package com.example.sept.oops.scaler.inheritance;

public class Client {
    public static void main(String[] args) {
        Instructor instructor = new Instructor(10.0, "Yash", "Pwd");
        instructor.logIn();
        instructor.logOut();
    }
}