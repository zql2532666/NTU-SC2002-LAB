public class Cubiod extends Shape3D{

    public Cubiod(double width, double length, double height) {
        this.shape2DS.add(new Rectangle(width, height));
        this.shape2DS.add(new Rectangle(width, height));

        this.shape2DS.add(new Rectangle(width, length));
        this.shape2DS.add(new Rectangle(width, length));

        this.shape2DS.add(new Rectangle(height, length));
        this.shape2DS.add(new Rectangle(height, length));
    }
}
