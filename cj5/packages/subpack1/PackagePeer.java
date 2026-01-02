package javabasics.cj5.packages.subpack1;

//protected with in the package
public class PackagePeer {
    public static void main(String[] args) {
        Base b = new Base("Same package Class");
        b.name = "Peer";
        b.greet();
    }
}
