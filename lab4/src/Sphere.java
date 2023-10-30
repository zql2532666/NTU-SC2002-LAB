public class Sphere extends Shape3D{

    public Sphere() {};

    public Sphere(double radius) {
        this.shape2DS.add(new Circle(radius));
        this.shape2DS.add(new Circle(radius));
        this.shape2DS.add(new Circle(radius));
        this.shape2DS.add(new Circle(radius));
    }
}
