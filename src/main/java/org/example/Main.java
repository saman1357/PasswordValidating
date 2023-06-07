package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello dear user!");
        System.out.println("Please enter your desired password ;)");

        System.out.println(userInputWithScanner());
    }

    public static String userInputWithScanner() {

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (!validateLength(password)) {
            return "Your password should be at least eight characters long, dummy!";
        }
        if (!validateWithNumber(password)) {
            return "Your password should contain a number man...";
        }
        if (!validateWithSmallAndBig(password)) {
            return "Your password should at least contain one small and one capital letter...";
        }
        if (!validateGoodPassword(password)) {
            return "What a stupid password man! We even guessed it beforehand!";
        }

        return "Your password is valid!";
    }

    public static boolean validateLength(String password) {
        if (password.length() >= 8) {
            System.out.println("You passed the required password length, nice!");
            return true;
        } else {
            return false;
        }
    }
    public static boolean validateWithNumber(String password){
        for (int i=0; i<password.length(); i++){
            if(Character.isDigit(password.charAt(i))){
                System.out.println("Your password contains a number, nice!");
                return true;
            }
        }
        return false;
    }
    public static boolean validateWithSmallAndBig(String password) {
        int smallCharCounter = 0;
        int bigCharCounter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                smallCharCounter++;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                bigCharCounter++;
            }
        }
        if (smallCharCounter > 0 && bigCharCounter > 0) {
            System.out.println("Your password contains a small and a capital letter, nice!");
            return true;
        }
        return false;
    }
    public static boolean validateGoodPassword(String password) {
        String[] badPasswords = {
                "123456789",
                "Password",
                "12345678",
                "Qwerty123",
                "1234567890",
                "DEFAULT",
                "Qwertyuiop",
                "Iloveyou",
                "passwort"
        };
        for (String badPassword : badPasswords) {
            if (password.equalsIgnoreCase(badPassword)) {
                return false;
            }
        }
        System.out.println("Your password is not blacklisted :)!");
        return true;
    }
}