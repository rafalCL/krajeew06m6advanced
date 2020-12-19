package pl.coderslab.advanced.abstractclass.examples;

interface Drawable {
    String DEFAULT_COLOR = "red";
}

abstract class Shape {
    int x; // package private
    int y;

    public double distance(Shape other){
        double result = Double.NaN;
        // calculations and assignment to result
        return result;
    };

    abstract double area();
}

class Rectangle extends Shape implements Drawable, Cloneable {
    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        if (a<=0 || b<=0){
            throw new IllegalArgumentException("a and b must be GT 0, but are: "+a+", "+b);
        }
        this.a = a;
        this.b = b;
    }

    @Override
    public double area(){
        return a*b;
    }
}

class Square extends Rectangle {
    public Square(int a) {
        super(a, a);
    }
}

class Circle extends Shape {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }
}

class Person{
    int getAge(){
        return 42;
    }
    double getAge(int x){
        return 3.14;
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Person p = new Person();
        double i = p.getAge();

        Rectangle rectangle = new Rectangle(3,4);

        System.out.println(rectangle.area());
        Circle circle = new Circle(2);
        System.out.println(circle.area());

        Shape[] shapes = {circle, rectangle};

        for(Shape s : shapes){
            System.out.println(s.area());
        }
    }
}
