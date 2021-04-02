/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    
    public String name;
    private String userName;
    public int id;
    public String address;
    private static int count = 1;
    private ArrayList<Menu> menu;
    private ArrayList<Orders> orderList;

    public Restaurant() {
        
        id = count;
        count++;
        menu = new ArrayList<Menu>();
        orderList=new ArrayList<Orders>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Menu> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Menu> menu) {
        this.menu = menu;
    }

    public ArrayList<Orders> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Orders> orderList) {
        this.orderList = orderList;
    }
    
    public void addFoodItem(Menu m){
        menu.add(m);
    }
    
    public void removeFoodItem(Menu m){
         menu.remove(m);
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
    
    

    @Override
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
}
