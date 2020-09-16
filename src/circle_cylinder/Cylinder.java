package circle_cylinder;

public class Cylinder  extends Circle{
//    private double radius = 1.0;
    private double height = 5;
    public Cylinder(){

    }
    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

//    @Override
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }

    @Override
    public double getArea() {
       return super.getPerimeter() * height + super.getArea() * 2;
    }
    public double getVolume(){
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", color = "+getColor() +
                ", radius = "+ getRadius()+
                '}' + ", has area = "+ getArea()+
                ", has volume = "+ getVolume()
                ;
    }
}
