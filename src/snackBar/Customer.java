package snackBar;

public class Customer {
    private static int maxID = 0;
    private final int ID;
    private String name;
    private double cash = 0;

    public Customer(String name, double cash) {
        maxID++;
        ID = maxID;
        this.name = name;
        this.cash = cash;
    }

    public Customer(String name) {
        maxID++;
        ID = maxID;
        this.name = name;
    }

    public void addCash(double cash) {
        this.cash += cash;
    }

    public void buySnack(double total) {
        cash -= total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCashOnHand() {
        return cash;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Customer{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", cash=" + cash +
                '}';
    }
}
