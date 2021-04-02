/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerList;
    private Customer customer;

    public CustomerDirectory() {
        customerList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    public Customer createCustomer(String name){
        customer = new Customer(name);
        customer.setName(name);
        customerList.add(customer);
        return customer;
    }
    
    public void deleteCustomer(String username){
        for(int i=0;i<customerList.size();i++){
            if(customerList.get(i).getCustomerName()==username){
                customerList.remove(i);
            }
        }
    }
    
    
    
}
