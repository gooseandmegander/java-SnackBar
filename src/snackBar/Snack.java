package snackBar;

public class Snack {
    private static int maxID = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingID;

    public Snack(String name, double cost, int quantity, int vendingID) {
        maxID++;
        id = maxID;
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.vendingID = vendingID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
}
