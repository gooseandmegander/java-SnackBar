package snackBar;

public class Main {
    private static void workWithData() {
        // Instantiate Customers
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        // Instantiate Vending Machines
        Vending v1 = new Vending("Food");
        Vending v2 = new Vending("Drink");
        Vending v3 = new Vending("Office");

        // Instantiate Snacks
        // Vending Machine "Food"
        Snack s1 = new Snack("Chips", 1.75, 36, v1.getID());
        Snack s2 = new Snack("Chocolate Bar", 1.00, 36, v1.getID());
        Snack s3 = new Snack("Pretzel", 2.00, 30, v1.getID());
        // Vending Machine "Drink"
        Snack s4 = new Snack("Soda", 2.50, 24, v2.getID());
        Snack s5 = new Snack("Water", 2.75, 20, v2.getID());


        // Customer Transactions
        c1.buySnack(s4.buySnack(3));
        System.out.println("\n*** Customer 1 buys 3 of snack 4 ***\n" +
                c1.getName() + " has $" + c1.getCashOnHand() + " cash on hand." + "\n" +
                "The " + v2.getName() + " machine has " + s4.getQty() + " " + s4.getName() + " left.");

        c1.buySnack(s3.buySnack(1));
        System.out.println("\n*** Customer 1 buys 1 of snack 3 ***\n" +
                c1.getName() + " has $" + c1.getCashOnHand() + " cash on hand." + "\n" +
                "The " + v1.getName() + " machine has " + s3.getQty() + " " + s3.getName() + " left.");

        c2.buySnack(s4.buySnack(2));
        System.out.println("\n*** Customer 2 buys 2 of snack 4 ***\n" +
                c2.getName() + " has $" + c2.getCashOnHand() + " cash on hand." + "\n" +
                "The " + v2.getName() + " machine has " + s4.getQty() + " " + s4.getName() + " left.");

        c1.addCash(10);
        System.out.println("\n*** Customer 1 finds $10! ***\n" +
                c1.getName() + " has $" + c1.getCashOnHand() + " cash on hand.");

        c1.buySnack(s2.buySnack(1));
        System.out.println("\n*** Customer 1 buys 1 of snack 2 ***\n" +
                c1.getName() + " has $" + c1.getCashOnHand() + " cash on hand." + "\n" +
                "The " + v1.getName() + " machine has " + s2.getQty() + " " + s2.getName() + " left.");

        s3.addQty(12);
        System.out.println("\n*** Snack 3 gets 12 more. Come and get it. ***\n" +
                "The " + v1.getName() + " machine has " + s3.getQty() + " " + s3.getName() + " left.");

        c2.buySnack(s3.buySnack(2));
        System.out.println("\n*** Customer 2 buys 2 of snack 2 ***\n" +
                c2.getName() + " has $" + c2.getCashOnHand() + " cash on hand." + "\n" +
                "The " + v1.getName() + " machine has " + s2.getQty() + " " + s2.getName() + " left.");
    }

    public static void main(String[] args) {
        workWithData();
    }
}
