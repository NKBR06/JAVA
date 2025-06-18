package schoolSystem;

public class ShoppingCartTotal {
    public static void main(String[] args) {
        // Array to store prices of 5 items
        double[] prices = {99.99, 149.50, 79.25, 39.00, 25.75};

        double total = 0;

        // Loop to calculate total
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }

        // Display the total bill
        System.out.println("Total bill: ₹" + total);
    }
}
