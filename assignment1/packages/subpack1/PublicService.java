package javabasics.assignment1.packages.subpack1;


public class PublicService {
    public String serviceName;

    public PublicService(String serviceName) {
        this.serviceName = serviceName;
    }

    public void doWork() {
        System.out.println("PublicService [" + serviceName + "] is doing work.");
    }

    public static void ping() {
        System.out.println("PublicService is reachable (ping).");
    }
}
