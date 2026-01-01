package javabasics.cj4.constructor;

class GFG {
    // Private constructor
    String name;
    private GFG(String name) {
        this.name=name;
        System.out.println("Private constructor called");
    }
    public static GFG of(String name) {
        return new GFG(name);
    }
    // Static method
    public static void displayMessage() {
        System.out.println("Hello from GFG class!");
    }
    public void msg(){
        System.out.println("my name is: "+name);
    }
}
public class PrivateConstructor {
    public static void main(String[] args){
        //GFG u= new GFG("Rakesh"); // Error: constructor is private we cannot create an object for class
        GFG u = GFG.of("Rakesh");

        GFG w = GFG.of("Vikas");
        u.msg();
        w.msg();
        // private
        GFG.displayMessage();

    }
}
