import java.util.ArrayList;
import java.util.Scanner;

public class Shape2DApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape2D> shape2DS = new ArrayList<>();
        double totalSurfaceArea = 0.0;

        // Prompt the user to enter the total number of shapes
        System.out.print("Enter the total number of shapes: ");
        int numShapes = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Loop to input shape details
        for (int i = 0; i < numShapes; i++) {
            System.out.print("Choose a shape (Square, Rectangle, Circle, Triangle): ");
            String shapeType = scanner.nextLine().toLowerCase();

            Shape2D shape2D = null;
            switch (shapeType) {
                case "square":
                    System.out.print("Enter side length: ");
                    double sideLength = scanner.nextDouble();
                    shape2D = new Square(sideLength);
                    break;

                case "rectangle":
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    shape2D = new Rectangle(length, width);
                    break;

                case "circle":
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    shape2D = new Circle(radius);
                    break;

                case "triangle":
                    System.out.print("Enter the length of side 1: ");
                    double side1 = scanner.nextDouble();
                    System.out.print("Enter the length of side 2: ");
                    double side2 = scanner.nextDouble();
                    System.out.print("Enter the length of side 3: ");
                    double side3 = scanner.nextDouble();
                    shape2D = new Triangle(side1, side2, side3);
                    break;

                default:
                    System.out.println("Invalid shape type. Please choose from Square, Rectangle, Circle, or Triangle.");
                    i--; // Decrement the counter to re-enter the shape details
                    break;
            }
            scanner.nextLine(); // Consume the newline character

            if (shape2D != null) {
                shape2DS.add(shape2D);
            }
        }

        // Calculate the total surface area
        for (Shape2D shape2D : shape2DS) {
            totalSurfaceArea += shape2D.calculateArea();
        }

        System.out.println("Total surface area of the selected shapes: " + totalSurfaceArea);
    }
}
