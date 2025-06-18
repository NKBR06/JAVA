package transportation; // package name

public class OrderProcessingSystem {   // class name

    // Base class Order
    public static class Order {
        public void processOrder() {
            System.out.println("Processing general order...");
        }
    }

    // OnlineOrder subclass
    public static class OnlineOrder extends Order {
        @Override
        public void processOrder() {
            System.out.println("Processing online order with digital invoice...");
        }
    }

    // InStoreOrder subclass
    public static class InStoreOrder extends Order {
        @Override
        public void processOrder() {
            System.out.println("Processing in-store order with printed receipt...");
        }
    }

    public static void main(String[] args) {
        // Create Order references
        Order o1 = new OnlineOrder();
        Order o2 = new InStoreOrder();

        // Invoke overridden methods
        o1.processOrder();   // “Processing online order with digital invoice...”
        o2.processOrder();   // “Processing in-store order with printed receipt...”
    }
}

