/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import static java.awt.SystemColor.menu;
import java.util.ArrayList;

/**
 *
 * @author rtspi
 */
public class RestaurantDirectory {
    
    private ArrayList<Restaurant> restaurantList;
    private Restaurant restaurant;
    private Menu menu;

    public RestaurantDirectory() {
        
        restaurantList = new ArrayList<Restaurant>();
    }
    
    public ArrayList<Restaurant> getRestaurantList() {
        
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    
    
    
    
    public Restaurant createRestaurant(String name){
        restaurant = new Restaurant();
        restaurant.setName(name);
        restaurantList.add(restaurant);
        return restaurant;
    }
    
    public void updateRestaurantInfo(Restaurant restro, String name,int number,String address ){
         restro.setName(name);
         restro.setAddress(address);
         restro.setId(number);
     }
    
    public void deleteRestaurant(String username){
        for(int i=0;i<restaurantList.size();i++){
            if(restaurantList.get(i).getUserName()==username){
                restaurantList.remove(i);
            }
        }
    
    }
    
    public Menu AddMenuDishes(Restaurant rest,String name,String desc,int amount){
        menu=new Menu(name, desc, amount);
        rest.addFoodItem(menu);
        return menu;
    }
    
    public void DeleteDishes(Restaurant restro,Menu menu){
        restro.removeFoodItem(menu);
        
    }
    
    
    
}
