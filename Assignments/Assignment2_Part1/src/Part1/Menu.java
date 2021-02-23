/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

import java.util.Scanner;

/**
 *
 * @author rtspi
 */
public class Menu {
    
    
    public boolean runMenu(){
        
        String str;
          
          Scanner in = new Scanner(System.in);
          VitalSigns vSigns = new VitalSigns();
          
          
          boolean quit = false;
          while (!quit) {
            System.out.println("Enter Your Choice:\n1. Add a new Patient.\n2. View Vital Sign History\n3. "
                  + "Exit ");
            String choice = in.nextLine();
            
            switch (choice) {
                    case "1":
                        Patient newPatient = new Patient();
                        Patient a= new Patient();
                        a = newPatient.addNewPatient();
                        
                        
                        while(!quit){
                            System.out.println("1.Add Vital Signs:\n2.View Vital Signs History:\n3.Exit: ");
                            String newChoice = in.nextLine();
                            switch (newChoice) {
                                case "1":
                                    VitalSignHistory v1 = new VitalSignHistory();

                                    vSigns = v1.addNewVitals(a);
                                    if (newPatient.isPatientNormal(a, vSigns) == true) {
                                        System.out.println("Vital Signs Added!!\n");
                                        System.out.println("Vital Sign History:  " +a.toString()+ " " + vSigns.toString());
                                        break;
                                        
                                    } else {
                                        System.out.println("Abnormal Vital Signs Alert!");
                                        System.out.println("Vital Sign History:  " +a.toString()+ " " + vSigns.toString());
                                        break;
                                    }
                                case "2":

                                    System.out.println("Vital Sign History:  " +a.getPatientList() + " " + vSigns.toString());
                                    quit = true;
                                    break;
                                    
                                case "3":
                                    quit = true;
                                    break;
                            }
                                
                            }
                    case "2":
                        VitalSignHistory vs = new VitalSignHistory();
                        Patient patient = new Patient();
                        Patient b = null;
                        if (patient.getPatientList().isEmpty()) {
                            System.out.println("No Patient Record Available. Please add a Patient.");
                            b = patient.addNewPatient();

                            if (patient.isPatientNormal(b, vs.addNewVitals(b)) == true) {
                                System.out.println("Vital Signs Added!!\n");
                                System.out.println("New Vital Signs Added: " + vSigns.toString());
                            } else {
                                System.out.println("Abnormal Vital Signs Alert!");
                            }

                        } else {

                            b = patient.addNewPatient();

                            if (patient.isPatientNormal(b, vs.addNewVitals(b)) == true) {
                                System.out.println("Vital Signs Added!!\n");
                                System.out.println("New Vital Signs Added: " + vSigns.toString());
                            } else {
                                System.out.println("Abnormal Vital Signs Alert!");
                            }
//                            patient.isPatientNormal(b, vs.addNewVitals());
//                            System.out.println("Vital Signs Added");
                        }
                        quit = false;
                        break;

                    case "3":
                        quit = true;
                        break;
                    default:
                        str = " Please enter a valid choice.";
                        System.out.println(str);

                        break;
                        }
                        
                            
                            
                        quit=false;
                        break;
                    

                }
          return quit;
             
            
            
            
            
        }
        
    }
              
          
          
   
    

