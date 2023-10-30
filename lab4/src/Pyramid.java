public class Pyramid extends Shape3D{
    public Pyramid(double side1, double side2, double side3) {
        this.shape2DS.add(new Triangle(side1, side2, side3));
        this.shape2DS.add(new Triangle(side1, side2, side3));
        this.shape2DS.add(new Triangle(side1, side2, side3));
        this.shape2DS.add(new Triangle(side1, side2, side3));

        this.shape2DS.add(new Square(side3));
    }
}
