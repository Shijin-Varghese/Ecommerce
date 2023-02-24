package com.example.ecommerce;

public class Order {
    public static boolean myorder(Customer customer, Product product) {
        try {
//            String MyOrder="INSERT INTO yourorders(pid, name, price) VALUES(" + product.getId() + "," + product.getName() + ","+product.getPrice()+")";
            String MyOrder="INSERT INTO yourorders(cid,pid, name, price) VALUES(" +customer.getId()+","+ product.getId() + ", '" + product.getName() + "'," + product.getPrice() +")";
            DataBaseConnection dbConn = new DataBaseConnection();
            return dbConn.insertUpdate(MyOrder);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean removeorder(Customer customer, Product product) {
        try {
//            String MyOrder="INSERT INTO yourorders(pid, name, price) VALUES(" + product.getId() + "," + product.getName() + ","+product.getPrice()+")";
            String MyOrder="Delete from yourorders where pid=" + product.getId() + " and cid=" +customer.getId();
            System.out.println(product.getId()+" "+ customer.getId());
            DataBaseConnection dbConn = new DataBaseConnection();
            return dbConn.insertUpdate(MyOrder);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean placeOrder(Customer customer, Product product) {
        try {
            String placeOrder = "INSERT INTO orderss(customer_id, product_id, status) VALUES(" + customer.getId() + "," + product.getId() + ", 'Ordered')";
            DataBaseConnection dbConn = new DataBaseConnection();
            System.out.println( product.getId() + " "+product.getName()+" "+product.getPrice());
//            String MyOrder="INSERT INTO yourorders(pid, name, price) VALUES(" + product.getId() + "," + product.getName() + ","+product.getPrice()+")";
//            dbConn.insertUpdate(MyOrder);
            return dbConn.insertUpdate(placeOrder);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
