public class PlaneSeat {
    private int seatId;
    private boolean assigned;
    private int customerId;

    public PlaneSeat(int seatId) {
        this.seatId = seatId;
        this.assigned = false;
        this.customerId = -1;
    }

    public int getSeatId() {
        return this.seatId;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public boolean isOccupied() {
        return this.assigned;
    }

    public void assign(int customerId) {
        this.customerId = customerId;
        this.assigned = true;
    }

    public void unAssign() {
        this.assigned = false;
        this.customerId = -1;
    }
}
