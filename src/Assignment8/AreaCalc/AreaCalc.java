package src.Assignment8.AreaCalc;

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();
}

class Square extends Shape {
    protected double length;

    public Square(String name, double length) {
        super(name);
        this.length = length;
    }

    public double calculateArea() {
        return length * length;
    }
}

class Rectangle extends Shape {
    protected double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;
    final double pi = 3.14;
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double calculateArea() {
        return pi * radius * radius;
    }
}


