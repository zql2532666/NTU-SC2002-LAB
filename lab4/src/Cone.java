public class Cone extends Shape3D{
    public Cone(double radius, double slantHeight) {
        this.shape2DS.add(new Circle(radius));
        this.shape2DS.add(new Rectangle(slantHeight, Math.PI * radius));
    }
}
