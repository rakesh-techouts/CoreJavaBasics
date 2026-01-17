package javabasics.assessment2.exception;

import java.util.Scanner;

class PasswordFormatException extends RuntimeException {
    public PasswordFormatException(String msg) {
        super(msg);
    }
}

public class _2CustomException {
    public static void passwordChecker(String password) {
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
        if (specialSymbol < 1)
            throw new PasswordFormatException("At least One Special Symbol required");
        else if (digit < 1)
            throw new PasswordFormatException("At least One Digit is required");
        else if (upperCase < 1)
            throw new PasswordFormatException("At least One uppercase is required");
        else
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
