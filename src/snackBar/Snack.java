package snackBar;

public class Snack {
    private static int maxID = 0;
    private final int ID;
    private String name;
    private int quantity = 0;
    private double cost;
    private int vendingID;

    public Snack(String name, double cost, int quantity, int vendingID) {
        maxID++;
        ID = maxID;
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.vendingID = vendingID;
    }

    public Snack(String name, int quantity, double cost) {
        maxID++;
        ID = maxID;
        this.name = name;
        this.cost = cost;
    }

    public int getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQty() {
        return quantity;
    }

    public void addQty(int qty) {
        this.quantity += qty;
    }

    public double getTotalCost(int qty) {
        return qty * cost;
    }

    // buy snack given quantity
    public double buySnack(int qty) {
        quantity -= qty;
        return getTotalCost(qty);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Snack{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                ", vendingID=" + vendingID +
                '}';
    }
}
