package edu.ecommerce;

public class MainApp {
    public static void main(String[] args) {

        Order order = new Order("SS-1234", "farhan");

        Order.OrderItem item1 = order.new OrderItem("Batagor", 15000, 1);
        Order.OrderItem item2 = order.new OrderItem("Es teh", 5000, 2);
        Order.OrderItem item3 = order.new OrderItem("Mie goreng", 20000, 1);

        Order.OrderItem[] items = {item1, item2, item3};


        order.hitungTotal(items);


        order.tampilkanRincian(items);
    }
}