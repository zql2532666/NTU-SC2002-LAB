public class Cylinder extends Shape3D{
    public Cylinder(double radius, double height) {
        this.shape2DS.add(new Circle(radius));
        this.shape2DS.add(new Circle(radius));
        this.shape2DS.add(new Rectangle(radius * Math.PI * 2, height));
    }
}
