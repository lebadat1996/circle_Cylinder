package demoCricle;

public class Circle {
    private double radius;
    private String color;

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = "blue";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area() {
        return this.radius * this.radius * Math.PI;
    }

    public double perimeter() {
        return this.radius * 2 * Math.PI;
    }

    public String toString() {
        return "area = " + area() + "perimeter = " + perimeter() + getColor();
    }
}
