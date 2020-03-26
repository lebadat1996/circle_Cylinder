package demoCricle;

public class main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2,4,"green");
        cylinder.cylindricalVolume();
        System.out.println(cylinder.toString());
        cylinder.setRadius(3);
        cylinder.setHeight(7);
        System.out.println(cylinder.toString());
    }
}
