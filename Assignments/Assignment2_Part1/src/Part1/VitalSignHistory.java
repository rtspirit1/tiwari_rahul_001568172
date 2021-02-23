/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author rtspi
 */
public class VitalSignHistory extends VitalSigns{
    
    private ArrayList<VitalSigns> vitalSignList;
    
    public VitalSignHistory(){
        vitalSignList = new ArrayList<>();
    }
    
    public ArrayList<VitalSigns> getHistory(){
        return vitalSignList;
    }
    
    public void setHistory(ArrayList<VitalSigns> vitalSignList){
        this.vitalSignList = vitalSignList;
    }
    
    public VitalSigns addNewVitals(Patient P){
        SimpleDateFormat date  = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String s = String.valueOf(timestamp);
        System.out.println(date.format(timestamp));
        
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Respiratory Rate: ");
        int a = in.nextInt();
        in.nextLine();
        
        System.out.println("Enter Heart Rate: ");
        int b = in.nextInt();
        in.nextLine();
        
        System.out.println("Enter Blood Pressure: ");
        int c = in.nextInt();
        in.nextLine();
        
        System.out.println("Enter Weight in Kilograms: ");
        double d = in.nextDouble();
        in.nextLine();
        
        double e;
        e = (2.205)*(d);
        
        VitalSigns newVitals = new VitalSigns(s,a,b,c,d,e);
        
        vitalSignList.add(newVitals);
        System.out.println(vitalSignList);
        
        return newVitals;
    }
}
    
