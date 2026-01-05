package javabasics.cj6;

public class ThrowDemo {

    public static void main(String[] args) {
        try {
            raiseException();
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }
    }

    public static void raiseException() throws Exception {

        Exception t = new Exception("This is new Exception...");
        t.initCause(new Exception("ABCD"));
        throw t;
    }
}

