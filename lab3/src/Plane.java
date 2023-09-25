import java.util.Arrays;
import java.util.Comparator;

public class Plane {
    private PlaneSeat[] seats;
    int numEmptySeat;

    public Plane() {
        this.seats = new PlaneSeat[12];
        for (int i = 0; i < 12; i++) {
            seats[i] = new PlaneSeat(i + 1);
        }
        this.numEmptySeat = 12;
    }

    private PlaneSeat[] sortSeats() {
        PlaneSeat[] seatsCopy = new PlaneSeat[12];
        System.arraycopy(this.seats, 0, seatsCopy, 0, seats.length);
        Arrays.sort(seatsCopy, Comparator.comparing(PlaneSeat::getCustomerId));
        return seatsCopy;
    }

    public void showNumEmptySeats() {
        System.out.println("There are " + numEmptySeat + " empty seats\n");
    }

    public void showEmptySeats() {
        System.out.println("The following seats are empty:");
        for (int i = 0; i < 12; i++) {
            if (!seats[i].isOccupied()) {
                System.out.println("SeatID " + seats[i].getSeatId());
            }
        }
        System.out.println();
    }

    public void showAssignedSeat(boolean bySeatID) {
        System.out.println("The seat assignments are as follow:");
        PlaneSeat[] sortedSeats;
        if (!bySeatID) {
            sortedSeats = this.sortSeats();
        }
        else {
            sortedSeats = this.seats;
        }

        for(int i = 0; i < 12; i++) {
            if (sortedSeats[i].getCustomerId() != -1)
                System.out.println("SeatID " + sortedSeats[i].getSeatId() + " assigned to CustomerID " + sortedSeats[i].getCustomerId());
        }

        System.out.println();
    }

    public void assignSeat(int seatId, int customerId) {
        if (!isValidSeat(seatId)) {
            System.out.println("Invalid seat ID!");
            return;
        }

        for (int i = 0; i < 12; i++) {
            if (seats[i].getCustomerId() == customerId) {
                System.out.println("Error! This customer has been assigned to another seat.\n");
                break;
            }

            if ((i + 1) == seatId) {
                if (!seats[i].isOccupied()) {
                    seats[i].assign(customerId);
                    this.numEmptySeat--;
                    System.out.println("Seat already assigned to a customer.");
                }
                else {
                    System.out.println("Error! This seat is assigned to another customer.");
                }
            }
        }
        System.out.println();
    }

    public void unAssignSeat(int seatId) {
        if (!isValidSeat(seatId)) {
            System.out.println("Invalid seat ID!");
            return;
        }
        for (int i = 0; i < 12; i++) {
            if (seats[i].getSeatId() == seatId) {
                seats[i].unAssign();
                this.numEmptySeat++;
                break;
            }
        }
    }

    private boolean isValidSeat(int seatId) {
        if (seatId < 1 || seatId > 12)
            return false;
        else
            return true;
    }
}
