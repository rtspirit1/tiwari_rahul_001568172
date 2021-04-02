/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Restaurant.Menu;
import Business.Restaurant.Orders;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    
    public int id;
    public String name;
    private static int count=1;
    private ArrayList<Orders> orderList;
    private String userName;
    private String address;

    public DeliveryMan(String userName) {
        
        id=count;
        count++;
        this.userName=userName;
        orderList = new ArrayList<Orders>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Orders> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Orders> orderList) {
        this.orderList = orderList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void addOrder(String restaurantName, String customerName, String deliverMan, ArrayList<Menu> Order, int price, String deliveryAddress) {
        Orders order=new Orders();
        
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurantName);
        order.setDeliveryMan(deliverMan);
        order.setOrder(Order);
        order.setPrice(price);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        
    }
    
    
    
    
    
}
