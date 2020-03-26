package demoCricle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double cylindricalVolume() {
        return this.getRadius() * this.getRadius() * Math.PI * this.height;
    }

    public String toString() {
        return "cylinder = " + cylindricalVolume() + "\ncolor = "+ super.getColor();
    }
}
