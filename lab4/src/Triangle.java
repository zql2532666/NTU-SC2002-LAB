public class Triangle implements Shape2D {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {}

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * s * (s - side2) * s * (s - side3));
    }
}
