package javabasics.cj5.packages.subpack3;


// Import the public class from subpack1
import javabasics.cj5.packages.subpack1.PublicService;

public class ConsumerB {
    public static void main(String[] args) {
        PublicService service = new PublicService("B-Service");
        service.doWork();

        // Accessing public field again (just for demo)
        service.serviceName = "B-Service-Renamed";
        System.out.println("Renamed service: " + service.serviceName);
    }
}
