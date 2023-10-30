public class Circle implements Shape2D {
    private double radius;

    public Circle() {};

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
