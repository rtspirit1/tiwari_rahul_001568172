/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author rtspi
 */
public class DeliveryManDirectory {
    
       private ArrayList<DeliveryMan> deliveryManList;

    public DeliveryManDirectory() {
        deliveryManList = new ArrayList<DeliveryMan>();
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }
    
    public DeliveryMan createDeliveryMan(String name){
        DeliveryMan deliveryMan = new DeliveryMan(name);
        deliveryMan.setName(name);
        deliveryManList.add(deliveryMan);
        return deliveryMan;
    }
    
}
