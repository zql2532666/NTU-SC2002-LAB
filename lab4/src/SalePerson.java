public class SalePerson implements Comparable{
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson() {}
    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }

    @Override
    public String toString() {
        return this.lastName + " , " + this.firstName + " : " + this.totalSales;
    }

    public boolean equals(Object o) {
        if (! (o instanceof SalePerson))
            throw new IllegalArgumentException("Argument must be of type SalePerson");

        SalePerson other = (SalePerson) o;
        return firstName.equals(other.getFirstName()) && lastName.equals(other.getLastName());
    }

    @Override
    public int compareTo(Object o) {
        if (! (o instanceof SalePerson))
            throw new IllegalArgumentException("Argument must be of type SalePerson");

        SalePerson other = (SalePerson) o;
        if (totalSales < other.getTotalSales())
            return -1;
        else if (totalSales > other.getTotalSales())
            return 1;
        else
            return lastName.compareTo(other.getLastName());
    }
}
