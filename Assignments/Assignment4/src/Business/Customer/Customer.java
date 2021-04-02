/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Restaurant.Menu;
import Business.Restaurant.Orders;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer {
    
    public String name;
    public String address;
    public String customerName;
    public int id;
    private static int count = 1;
    private ArrayList<Orders> orderList;

    public Customer(String name) {
        id = count;
        count++;
        this.orderList = new ArrayList<Orders>();
        this.customerName = name;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<Orders> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Orders> orderList) {
        this.orderList = orderList;
    }
    
    
    
    

    @Override
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addOrder(String restaurentName, String customerName, String deliverMan, ArrayList<Menu> Order, int price, String deliveryAddress) {
        Orders order=new Orders();
        order.setOrderId(String.valueOf(id));
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurentName);
        order.setDeliveryMan(deliverMan);
        order.setOrder(Order);
        order.setPrice(price);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        id++;
    }
    
    
    
    
    
    
    
}
