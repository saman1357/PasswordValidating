package org.example;

public class Main {

    String pw = "12345678";
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean validateLength(String password) {
        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }
}