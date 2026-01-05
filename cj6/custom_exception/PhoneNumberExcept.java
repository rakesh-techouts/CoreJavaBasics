package javabasics.cj6.custom_exception;


import java.util.Scanner;

class PhoneNumberFormatException extends Exception {
    public PhoneNumberFormatException(String msg) {
        super(msg);
    }
}

public class PhoneNumberExcept {
    public static void phoneNumberChecker(String phoneNumber) throws PhoneNumberFormatException {
        if (phoneNumber.length() != 10) throw new PhoneNumberFormatException("Invalid Phone Number..");
        for (char ch : phoneNumber.toCharArray()) {
            if (!(Character.isDigit(ch))) throw new PhoneNumberFormatException("Invalid Phone Number..");
        }
        System.out.println("Successfully Registered. your Phone Number");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your PhoneNumber: ");
            String phoneNumber = sc.next();
            phoneNumberChecker(phoneNumber);
        } catch (PhoneNumberFormatException p) {
            System.err.println("Error! " + p.getMessage());
            System.err.println("Please enter a Valid Phone Number...");
        }
    }
}
