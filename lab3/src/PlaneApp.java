import java.util.Scanner;
public class PlaneApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plane plane = new Plane();
        while (true) {
            System.out.println("(1) Show number of empty seats");
            System.out.println("(2) Show the list of empty seats");
            System.out.println("(3) Show the list of seat assignments by seat ID");
            System.out.println("(4) Show the list of seat assignments by customer ID");
            System.out.println("(5) Assign a customer to a seat");
            System.out.println("(6) Remove a seat assignment");
            System.out.println("(7) Exit\n");

            System.out.print("Enter the number of your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    plane.showNumEmptySeats();
                    break;

                case 2:
                    plane.showEmptySeats();
                    break;

                case 3:
                    plane.showAssignedSeat(true);
                    break;

                case 4:
                    plane.showAssignedSeat(false);
                    break;

                case 5:
                    System.out.println("Assigning Seat...");
                    System.out.print("Please enter SeatID: ");
                    int seatId = sc.nextInt();
                    System.out.print("Please enter Customer ID: ");
                    int customerId = sc.nextInt();
                    plane.assignSeat(seatId, customerId);
                    break;

                case 6:
                    System.out.print("Enter SeatID to unassign customer from: ");
                    int seatToCancel = sc.nextInt();
                    plane.unAssignSeat(seatToCancel);
                    System.out.println("Seat Unassigned!\n");
                    break;

                case 7:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice !");
                    break;
            }
        }
    }
}
