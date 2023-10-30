public class Square implements Shape2D {
    private double width;

    public Square() {}

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.width * this.width;
    }
}
