package javabasics.cj6.custom_exception;

import java.util.Scanner;

class PasswordFormatException extends Exception {
    public PasswordFormatException(String msg) {
        super(msg);
    }
}

public class PasswordExcept {
    public static void passwordChecker(String password) throws PasswordFormatException {
        if (password.length() < 8) throw new PasswordFormatException("Password must contains 8 or more Characters");
        int specialSymbol = 0;
        int upperCase = 0;
        int digit = 0;
        for (char ch : password.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) upperCase++;
            } else if (Character.isDigit(ch)) digit++;
            else specialSymbol++;
        }
        if (!(specialSymbol >= 1 && digit >= 1 && upperCase >= 1))
            throw new PasswordFormatException("Invalid Password Type..");
        System.out.println("Successfully Registered");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Password must have 8 or more Characters%nPassword must contain at least one Special Character%n");
            System.out.println("Password must contains Digits%nPassword must contains Uppercase Letters%n");
            System.out.println("Enter your Password: ");
            String phoneNumber = sc.next();
            passwordChecker(phoneNumber);
        } catch (PasswordFormatException p) {
            System.err.println("Error! " + p.getMessage());
            System.err.println("Please enter a Valid Password...");
        }
    }
}
