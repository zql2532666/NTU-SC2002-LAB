import java.util.ArrayList;
import java.util.Scanner;

public class Shape3DApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape3D> shape3DS = new ArrayList<>();
        double totalSurfaceArea = 0.0;

        // Prompt the user to enter the total number of shapes
        System.out.print("Enter the total number of shapes: ");
        int numShapes = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Loop to input shape details
        for (int i = 0; i < numShapes; i++) {
            System.out.print("Choose a shape (Sphere, Pyramid, Cubiod, Cone, Cylinder): ");
            String shapeType = scanner.nextLine().toLowerCase();

            Shape3D shape3D = null;
            switch (shapeType) {
                case "cubiod":
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    shape3D = new Cubiod(width, length, height);
                    break;

                case "sphere":
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    shape3D = new Sphere(radius);
                    break;

                case "pyramid":
                    System.out.print("Enter the length of side 1: ");
                    double side1 = scanner.nextDouble();
                    System.out.print("Enter the length of side 2: ");
                    double side2 = scanner.nextDouble();
                    System.out.print("Enter the length of side 3: ");
                    double side3 = scanner.nextDouble();
                    shape3D = new Pyramid(side1, side2, side3);
                    break;

                case "cone":
                    System.out.print("Enter the radius: ");
                    double r = scanner.nextDouble();
                    System.out.print("Enter the slant height: ");
                    double sh = scanner.nextDouble();
                    shape3D = new Cone(r, sh);
                    break;

                case "cylinder":
                    System.out.print("Enter the radius: ");
                    double rad = scanner.nextDouble();
                    System.out.print("Enter the height: ");
                    double h = scanner.nextDouble();
                    shape3D = new Cylinder(rad, h);
                    break;

                default:
                    System.out.println("Invalid shape type. Please choose from Sphere, Pyramid, Cubiod, Cone, Cylinder.");
                    i--; // Decrement the counter to re-enter the shape details
                    break;
            }
            scanner.nextLine(); // Consume the newline character

            if (shape3D != null) {
                shape3DS.add(shape3D);
            }
        }

        // Calculate the total surface area
        for (Shape3D shape3D : shape3DS) {
            totalSurfaceArea += shape3D.calculateSurfaceArea();
        }

        System.out.println("Total surface area of the selected shapes: " + totalSurfaceArea);
    }
}
