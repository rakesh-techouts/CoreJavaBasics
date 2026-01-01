package javabasics.cj4.constructor;

public class ConstructorOverloading {
    String language;
    public ConstructorOverloading() {
        this.language = "Java";
    }
    public ConstructorOverloading(String language) {
        this.language = language;
    }
    public void getName() {
        System.out.println("Programming Language: " + this.language);
    }
    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading("Python");
        obj1.getName();
        obj2.getName();
    }
}
