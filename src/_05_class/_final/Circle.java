package _05_class._final;

public class Circle {

    private static final double PI = Math.PI;
    private int radius;

    public Circle (int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double circleArea() {
        return PI * radius * radius;
    }
}
