package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello user!");
        System.out.println("Please enter your desired password ;)");
        userInputWithScanner();
    }

    public static void userInputWithScanner() {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        System.out.println(password);
    }

    public static boolean validateLength(String password) {
        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean validateWithNumber(String password){
        for (int i=0; i<password.length(); i++){
            if(Character.isDigit(password.charAt(i))){
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
        return true;
    }
}