package javabasics.assignment1.packages.subpack2;

import javabasics.assignment1.packages.subpack1.PublicService;//import javabasics.cj5.packages.subpack1.Helper; gives error

public class ConsumerA {
    public static void main(String[] args) {
        // Access public static method
        PublicService.ping();

        // Create object via public constructor
        PublicService service = new PublicService("A-Service");

        // Access public field
        System.out.println("Accessing public field: " + service.serviceName);

        // Call public method
        service.doWork();

        // subpack1.Helper.debug not access
    }
}
