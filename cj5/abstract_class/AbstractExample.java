package javabasics.cj5.abstract_class;

abstract class Shape {
    String color;
    abstract double area();
    protected Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}
class Circle extends Shape {
    double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
class Triangle extends Shape {
    double length;
    double breadth;
    public Triangle(String color, double length,double breadth) {
        super(color);
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    double area(){
        return 0.5*length*breadth;
    }
}
public class AbstractExample{
    public static void main(String[] args) {
        Shape s = new Circle("Red", 2.5);
        System.out.println("Color: " + s.getColor() + ", Area: " + s.area());

        Triangle t = new Triangle("Green",10.0,15.0);
        System.out.println("Color: "+t.getColor()+" Area: "+t.area());
    }
}