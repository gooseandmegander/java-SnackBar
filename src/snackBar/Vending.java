package snackBar;

public class Vending {
    private static int maxID = 0;
    private final int ID;
    private String name;

    public Vending(String name) {
        maxID++;
        ID = maxID;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Vending{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
