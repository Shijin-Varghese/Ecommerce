package com.example.ecommerce;

public class Order {
    public static boolean placeOrder(Customer customer, Product product) {
        try {
            String placeOrder = "INSERT INTO orderss(customer_id, product_id, status) VALUES(" + customer.getId() + "," + product.getId() + ", 'Ordered')";
            DataBaseConnection dbConn = new DataBaseConnection();
            return dbConn.insertUpdate(placeOrder);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean placeOrder(Customer customer, Product product) {
        try {
            String placeOrder = "INSERT INTO orderss(customer_id, product_id, status) VALUES(" + customer.getId() + "," + product.getId() + ", 'Ordered')";
            DataBaseConnection dbConn = new DataBaseConnection();
            return dbConn.insertUpdate(placeOrder);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
