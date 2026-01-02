package javabasics.cj5.packages.subpack1;


// No 'public' keyword => package-private (default access)
class Helper {
    static void debug(String msg) {
        System.out.println("[Helper] " + msg);
    }
}
