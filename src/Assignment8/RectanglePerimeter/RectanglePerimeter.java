package src.Assignment8.RectanglePerimeter;

interface Shape {
    double getPerimeter();
}

abstract class RectanglePer implements Shape {
    protected String name;

    public RectanglePer(String name) {
        this.name = name;
    }

    public abstract double getPerimeter();
}

class Rectangle extends RectanglePer {
    protected double length;
    protected double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public void printPerimeter() {
        System.out.println("The " + name + " perimeter is: " + getPerimeter());
    }

    public double getPerimeter() {
        return ((length*2)+(width*2));
    }
}

public class RectanglePerimeter {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle", 2, 3);
        rectangle.printPerimeter();
    }
}