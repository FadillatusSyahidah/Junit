package com.example.test;

public class EmailValidator {
    public static boolean isTrue(String email) { //declaring static method isTrue to validate the email

       String formatEmail = "^[A-Za-z0-9+_.-]+@(.+)$";//email Format.

        return email.matches(formatEmail);//to check if the email fits the format then it's will return "true", if not it will return "false".
    }
}
