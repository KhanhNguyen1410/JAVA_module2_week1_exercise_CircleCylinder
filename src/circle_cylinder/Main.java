package circle_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0,"red");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(1,"red",2);
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder();
        cylinder1.setColor("yellow");
        cylinder1.setRadius(10);
        System.out.println(cylinder1);
    }
}
