package edu.ecommerce;

public class Order {
    private String orderId;
    private String customerName;
    private double total;


    public Order(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }


    public class OrderItem {
        private String productName;
        private double price;
        private int quantity;

        public OrderItem(String productName, double price, int quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        public double getSubtotal() {
            return price * quantity;
        }


        public String getProductName() { return productName; }
        public double getPrice() { return price; }
        public int getQuantity() { return quantity; }
    }


    public double hitungTotal(OrderItem[] items) {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getSubtotal();
        }
        this.total = total;
        return total;
    }


    public void tampilkanRincian(OrderItem[] items) {
        System.out.println("Order ID       : " + orderId);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("===========================");

        for (OrderItem item : items) {
            System.out.printf(
                    "%s | harga: %.2f | qty: %d | subtotal: %.2f\n",
                    item.getProductName(),
                    item.getPrice(),
                    item.getQuantity(),
                    item.getSubtotal()
            );
        }

        System.out.println("===========================");
        System.out.printf("Total: Rp.%.2f\n", total);
    }
}