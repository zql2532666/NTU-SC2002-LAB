import java.util.ArrayList;

public abstract class Shape3D {
    protected ArrayList<Shape2D> shape2DS;

    public Shape3D() {
        this.shape2DS = new ArrayList<Shape2D>();
    }

    public double calculateSurfaceArea() {
        double sa = 0;
        for (Shape2D s2d : shape2DS) {
            sa += s2d.calculateArea();
        }
        return sa;
    };
}
