/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part2;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author rtspi
 */
public class Patient extends Person {
    
    int patientid;
    
    
    

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }
    
    
    
    
    
    
    public void addNewPatient(){
        
        SimpleDateFormat date  = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String time = String.valueOf(timestamp);
        System.out.println(date.format(timestamp));
        
        
        Scanner in = new Scanner(System.in);
        String str ="";
        EncounterHistory history = new EncounterHistory();
        do{
        System.out.println("Choose Patient's Age Group:\n");
        System.out.println("1.NewBorn\n2.Infant\n3.Others\n");
        String s = in.nextLine();
        
        
            
            
            if("1".equals(s)){
                
                System.out.println("Enter Patient's First Name: ");
                String s1 = in.nextLine();

                System.out.println("Enter Patient's Last Name: ");
                String s2 = in.nextLine();

                System.out.println("Enter Patient's Age in Days: ");
                double a1 = in.nextDouble();
                in.nextLine();

                System.out.println("Enter Patient's ID:");
                int s3 = in.nextInt();
                in.nextLine();

                double b = (a1 / 365)*12;

                System.out.println("Enter Patient's Respiratory Rate:");
                int a2 = in.nextInt();
                in.nextLine();

                System.out.println("Enter Patient's Heart Rate:");
                int a3 = in.nextInt();
                in.nextLine();

                System.out.println("Enter Patient's Blood Pressure:");
                int a4 = in.nextInt();
                in.nextLine();

                System.out.println("Enter Patient's Weight in KiloGrams:");
                double a5 = in.nextDouble();
                in.nextLine();
                double a6 = (double) a5 * (2.206);

                
                VitalSigns vs = history.addNewVitals();
                vs.setTime(time);
                vs.setfName(s1);
                vs.setlName(s2);
                vs.setAge(b);
                vs.setPatientid(s3);
                vs.setRespiratoryRate(a2);
                vs.setHeartRate(a3);
                vs.setBloodPressure(a4);
                vs.setWeightInKg(a5);
                vs.setWeightInLbs(a6);
                
                
                do{

                System.out.println("Do you wish to check individual Vital Signs? Type Yes or No.");
                
                str = in.nextLine();
                
                if (str.equalsIgnoreCase("yes")) {
                    System.out.println("Enter Vital Sign to check.");
                    String str1 = in.nextLine();
                    isThisVitalSignNormal(str1, vs);
                   
                    }
                
                }while(str.equalsIgnoreCase("yes"));
                
                do{
                    System.out.println("Do you wish to add new Vital Signs? Type Yes or No.");
                    
                    str = in.nextLine();
                    
                    if(str.equalsIgnoreCase("yes")){
                        System.out.println("Enter Patient's Respiratory Rate:");
                        a2 = in.nextInt();
                        in.nextLine();

                        System.out.println("Enter Patient's Heart Rate:");
                        a3 = in.nextInt();
                        in.nextLine();

                        System.out.println("Enter Patient's Blood Pressure:");
                        a4 = in.nextInt();
                        in.nextLine();

                        System.out.println("Enter Patient's Weight in KiloGrams:");
                        a5 = in.nextDouble();
                        in.nextLine();
                        a6 = (double) a5 * (2.206);
                        
                        vs = history.addNewVitals();
                        
                        vs.setTime(time);
                        vs.setfName(s1);
                        vs.setlName(s2);
                        vs.setAge(b);
                        vs.setPatientid(s3);
                        vs.setRespiratoryRate(a2);
                        vs.setHeartRate(a3);
                        vs.setBloodPressure(a4);
                        vs.setWeightInKg(a5);
                        vs.setWeightInLbs(a6);
                        
                        System.out.println("New Vital Signs added: \n" + history.getHistory());
                    }
                }while(str.equalsIgnoreCase("yes"));
                
                System.out.println("Do you wish to add Another Patient? Type Yes or No.");                   
                    str = in.nextLine();
                    if(str.equalsIgnoreCase("yes")){
                        
                    }
                    else
                        System.out.println("PATIENT LIST IS AS FOLLOWS!!!:\n" + history.getHistory());
            }


            
            else if ("2".equals(s)) {

                System.out.println("Enter Patient's First Name: ");
                String s1 = in.nextLine();

                System.out.println("Enter Patient's Last Name: ");
                String s2 = in.nextLine();

                System.out.println("Enter Patient's Age in Months: ");
                double a1 = in.nextDouble();
                in.nextLine();

                System.out.println("Enter Patient's ID:");
                int s3 = in.nextInt();
                in.nextLine();

                

                System.out.println("Enter Patient's Respiratory Rate:");
                int a2 = in.nextInt();
                in.nextLine();

                System.out.println("Enter Patient's Heart Rate:");
                int a3 = in.nextInt();
                in.nextLine();

                System.out.println("Enter Patient's Blood Pressure:");
                int a4 = in.nextInt();
                in.nextLine();

                System.out.println("Enter Patient's Weight in KiloGrams:");
                double a5 = in.nextDouble();
                in.nextLine();

                double a6 = (double) a5 * (2.206);
                

                VitalSigns vs = history.addNewVitals();
                vs.setTime(time);
                vs.setfName(s1);
                vs.setlName(s2);            
                vs.setAge(a1);
                vs.setPatientid(s3);
                vs.setRespiratoryRate(a2);
                vs.setHeartRate(a3);
                vs.setBloodPressure(a4);
                vs.setWeightInKg(a5);
                vs.setWeightInLbs(a6);

                
                
                do{

                System.out.println("Do you wish to check individual Vital Signs? Type Yes or No.");
                
                str = in.nextLine();
                
                if (str.equalsIgnoreCase("yes")) {
                    System.out.println("Enter Vital Sign to check.");
                    String str1 = in.nextLine();
                    boolean a = isThisVitalSignNormal(str1, vs);
                   
                    }
                }while(str.equalsIgnoreCase("yes"));
                
                do{
                    System.out.println("Do you wish to add new Vital Signs? Type Yes or No.");
                    
                    str = in.nextLine();
                    
                    if(str.equalsIgnoreCase("yes")){
                        System.out.println("Enter Patient's Respiratory Rate:");
                        a2 = in.nextInt();
                        in.nextLine();

                        System.out.println("Enter Patient's Heart Rate:");
                        a3 = in.nextInt();
                        in.nextLine();

                        System.out.println("Enter Patient's Blood Pressure:");
                        a4 = in.nextInt();
                        in.nextLine();

                        System.out.println("Enter Patient's Weight in KiloGrams:");
                        a5 = in.nextDouble();
                        in.nextLine();
                        a6 = (double) a5 * (2.206);
                        
                        vs = history.addNewVitals();
                        
                        vs.setTime(time);
                        vs.setfName(s1);
                        vs.setlName(s2);
                        vs.setAge(a1);
                        vs.setPatientid(s3);
                        vs.setRespiratoryRate(a2);
                        vs.setHeartRate(a3);
                        vs.setBloodPressure(a4);
                        vs.setWeightInKg(a5);
                        vs.setWeightInLbs(a6);
                        
                        System.out.println("New added Vital Signs are: " + history.getHistory());
                    }
                }while(str.equalsIgnoreCase("yes"));
                System.out.println("Do you wish to add Another Patient? Type Yes or No.");                   
                    str = in.nextLine();
                    if(str.equalsIgnoreCase("yes")){
                        
                    }
                    else
                        System.out.println("PATIENT LIST IS AS FOLLOWS!!!:\n" + history.getHistory());
            } 
            else if ("3".equals(s)) {
                System.out.println("Enter Patient's First Name: ");
                String s1 = in.nextLine();

                System.out.println("Enter Patient's Last Name: ");
                String s2 = in.nextLine();

                System.out.println("Enter Patient's Age in Years: ");
                double a1 = in.nextDouble();
                in.nextLine();
                
                double b = a1*12;

                System.out.println("Enter Patient's ID:");
                int s3 = in.nextInt();
                in.nextLine();

                

                System.out.println("Enter Patient's Respiratory Rate:");
                int a2 = in.nextInt();
                in.nextLine();

                System.out.println("Enter Patient's Heart Rate:");
                int a3 = in.nextInt();
                in.nextLine();

                System.out.println("Enter Patient's Blood Pressure:");
                int a4 = in.nextInt();
                in.nextLine();

                System.out.println("Enter Patient's Weight in KiloGrams:");
                double a5 = in.nextDouble();
                in.nextLine();

                double a6 = (double) a5 * (2.206);

                

                VitalSigns vs = history.addNewVitals();
                
                vs.setTime(time);
                vs.setfName(s1);
                vs.setlName(s2);
                vs.setAge(b);
                vs.setPatientid(s3);
                vs.setRespiratoryRate(a2);
                vs.setHeartRate(a3);
                vs.setBloodPressure(a4);
                vs.setWeightInKg(a5);
                vs.setWeightInLbs(a6);

                do{

                System.out.println("Do you wish to check individual Vital Signs? Type Yes or No.");
                
                str = in.nextLine();
                
                if (str.equalsIgnoreCase("yes")) {
                    System.out.println("Enter Vital Sign to check.");
                    String str1 = in.nextLine();
                    isThisVitalSignNormal(str1, vs);
                   
                    }
                }while(str.equalsIgnoreCase("yes"));
                
                do{
                    System.out.println("Do you wish to add new Vital Signs? Type Yes or No.");
                    
                    str = in.nextLine();
                    
                    if(str.equalsIgnoreCase("yes")){
                        System.out.println("Enter Patient's Respiratory Rate:");
                        a2 = in.nextInt();
                        in.nextLine();

                        System.out.println("Enter Patient's Heart Rate:");
                        a3 = in.nextInt();
                        in.nextLine();

                        System.out.println("Enter Patient's Blood Pressure:");
                        a4 = in.nextInt();
                        in.nextLine();

                        System.out.println("Enter Patient's Weight in KiloGrams:");
                        a5 = in.nextDouble();
                        in.nextLine();
                        a6 = (double) a5 * (2.206);
                        
                        vs = history.addNewVitals();
                        
                        vs.setTime(time);
                        vs.setfName(s1);
                        vs.setlName(s2);
                        vs.setAge(b);
                        vs.setPatientid(s3);
                        vs.setRespiratoryRate(a2);
                        vs.setHeartRate(a3);
                        vs.setBloodPressure(a4);
                        vs.setWeightInKg(a5);
                        vs.setWeightInLbs(a6);
                        
                        System.out.println("New added Vital Signs are: " + history.getHistory());
                    }
                }while(str.equalsIgnoreCase("yes"));
                
                    System.out.println("Do you wish to add Another Patient? Type Yes or No.");                   
                    str = in.nextLine();
                    if(str.equalsIgnoreCase("yes")){
                        
                    }
                    else
                        System.out.println("PATIENT LIST IS AS FOLLOWS!!!:\n" + history.getHistory());
                        
                
            } 
            else {
                System.out.println("Please enter a correct choice:");
            }
            
        
    
        
            
            

        }while(str.equalsIgnoreCase("yes"));
        
    }
        
    
    public boolean isThisVitalSignNormal(String vsign, VitalSigns vs) {
        
        
        

        if (getAge() <= 1) {

            if (vsign.equalsIgnoreCase("respiratory rate")) {
                if (vs.getRespiratoryRate() >= 30 && vs.getRespiratoryRate() <= 50) {
                    System.out.println("Respiratory Rate is Normal");
                } else {
                    System.out.println("Respiratory Rate is Abnormal");
                }
            } 
            else if (vsign.equalsIgnoreCase("heart rate")) {
                if (vs.getHeartRate() >= 120 && vs.getHeartRate() <= 160) {
                    System.out.println("Heart Rate is Normal");
                } 
                else {
                    System.out.println("Heart Rate is Abnormal");
                }

            } 
            else if (vsign.equalsIgnoreCase("blood pressure")) {
                if (vs.getBloodPressure() >= 50 && vs.getBloodPressure() <= 70) {
                    System.out.println("Blood Pressure is Normal");
                } 
                else {
                    System.out.println("Blood Pressure is Abnormal");
                }

            } 
            else if (vsign.equalsIgnoreCase("weight")) {
                if (vs.getWeightInKg() >= 2 && vs.getWeightInKg() <= 3 && vs.getWeightInLbs() >= 4.5 && vs.getWeightInLbs() <= 7) {
                    System.out.println("Weight is Normal");
                } 
                else {
                  
                    System.out.println("Weight is Abnormal");
                }

            }

        } 
        else if (getAge() > 1 && getAge() <= 12) {
            if (vsign.equalsIgnoreCase("respiratory rate")) {
                if (vs.getRespiratoryRate() >= 20 && vs.getRespiratoryRate() <= 30) {
                    System.out.println("Respiratory Rate is Normal");
                } 
                else {
                    System.out.println("Respiratory Rate is Abnormal");
                }
            } 
            else if (vsign.equalsIgnoreCase("heart rate")) {
                if (vs.getHeartRate() >= 80 && vs.getHeartRate() <= 140) {
                    System.out.println("Heart Rate is Normal");
                } 
                else {
                    System.out.println("Heart Rate is Abnormal");
                }

            } 
            else if (vsign.equalsIgnoreCase("blood pressure")) {
                if (vs.getBloodPressure() >= 70 && vs.getBloodPressure() <= 100) {
                    System.out.println("Blood Pressure is Normal");
                } 
                else {
                    System.out.println("Blood Pressure is Abnormal");
                }

            } 
            else if (vsign.equalsIgnoreCase("weight")) {
                if (vs.getWeightInKg() >= 4 && vs.getWeightInKg() <= 10 && vs.getWeightInLbs() >= 9 && vs.getWeightInLbs() <= 22) {
                    System.out.println("Weight is Normal");
                } 
                else {
                    System.out.println("Weight is Abnormal");
                }
            } 
        }
        else if (getAge() > 12 && getAge() <= 36) {
            if (vsign.equalsIgnoreCase("respiratory rate")) {
                if (vs.getRespiratoryRate() >= 20 && vs.getRespiratoryRate() <= 30) {
                        System.out.println("Respiratory Rate is Normal");
                    } 
                else {
                        System.out.println("Respiratory Rate is Abnormal");
                    }
                } 
            else if (vsign.equalsIgnoreCase("heart rate")) {
                if (vs.getHeartRate() >= 80 && vs.getHeartRate() <= 130) {
                        System.out.println("Heart Rate is Normal");
                    } 
                else {
                        System.out.println("Heart Rate is Abnormal");
                    }

                } 
            else if (vsign.equalsIgnoreCase("blood pressure")) {
                    if (vs.getBloodPressure() >= 80 && vs.getBloodPressure() <= 110) {
                        System.out.println("Blood Pressure is Normal");
                    } 
                    else {
                        System.out.println("Blood Pressure is Abnormal");
                    }

                } 
            else if (vsign.equalsIgnoreCase("weight")) {
                if (vs.getWeightInKg() >= 10 && vs.getWeightInKg() <= 14 && vs.getWeightInLbs() >= 22 && vs.getWeightInLbs() <= 31) {
                        System.out.println("Weight is Normal");
                    } 
                else {
                        System.out.println("Weight is Abnormal");
                    }
                } 
        }
        else if (getAge() > 36 && getAge() <= 60) {
            if (vsign.equalsIgnoreCase("respiratory rate")) {
                    if (vs.getRespiratoryRate() >= 20 && vs.getRespiratoryRate() <= 30) {
                            System.out.println("Respiratory Rate is Normal");
                        } 
                    else {
                            System.out.println("Respiratory Rate is Abnormal");
                        }
                    } 
            else if (vsign.equalsIgnoreCase("heart rate")) {
                        if (vs.getHeartRate() >= 80 && vs.getHeartRate() <= 120) {
                            System.out.println("Heart Rate is Normal");
                        } 
                        else {
                            System.out.println("Heart Rate is Abnormal");
                        }

                    } 
            else if (vsign.equalsIgnoreCase("blood pressure")) {
                        if (vs.getBloodPressure() >= 80 && vs.getBloodPressure() <= 110) {
                            System.out.println("Blood Pressure is Normal");
                        } 
                        else {
                            System.out.println("Blood Pressure is Abnormal");
                        }

                    } 
            else if (vsign.equalsIgnoreCase("weight")) {
                        if (vs.getWeightInKg() >= 14 && vs.getWeightInKg() <= 18 && vs.getWeightInLbs() >= 31 && vs.getWeightInLbs() <= 40) {
                            System.out.println("Weight is Normal");
                        } else {
                            System.out.println("Weight is Abnormal");
                        }
                    }
        }
        else if (getAge() > 60 && getAge() <= 144) {
            if (vsign.equalsIgnoreCase("respiratory rate")) {
                    if (vs.getRespiratoryRate() >= 20 && vs.getRespiratoryRate() <= 30) {
                                System.out.println("Respiratory Rate is Normal");
                            } 
                    else {
                                System.out.println("Respiratory Rate is Abnormal");
                            }
                        } 
            else if (vsign.equalsIgnoreCase("heart rate")) {
                            if (vs.getHeartRate() >= 70 && vs.getHeartRate() <= 110) {
                                System.out.println("Heart Rate is Normal");
                            } 
                            else {
                                System.out.println("Heart Rate is Abnormal");
                            }

                        } 
            else if (vsign.equalsIgnoreCase("blood pressure")) {
                            if (vs.getBloodPressure() >= 80 && vs.getBloodPressure() <= 120) {
                                System.out.println("Blood Pressure is Normal");
                            } 
                            else {
                                System.out.println("Blood Pressure is Abnormal");
                            }

                        } 
            else if (vsign.equalsIgnoreCase("weight")) {
                            if (vs.getWeightInKg() >= 20 && vs.getWeightInKg() <= 42 && vs.getWeightInLbs() >= 41 && vs.getWeightInLbs() <= 92) {
                                System.out.println("Weight is Normal");
                            } else {
                                System.out.println("Weight is Abnormal");
                            }
                        } 
        }
        else {
            if (vsign.equalsIgnoreCase("respiratory rate")) {
                if (vs.getRespiratoryRate() >= 12 && vs.getRespiratoryRate() <= 20) {
                                    System.out.println("Respiratory Rate is Normal");
                                } 
                else {
                                    System.out.println("Respiratory Rate is Abnormal");
                                }
                            } 
            else if (vsign.equalsIgnoreCase("heart rate")) {
                                if (vs.getHeartRate() >= 55 && vs.getHeartRate() <= 105) {
                                    System.out.println("Heart Rate is Normal");
                                } 
                                else {
                                    System.out.println("Heart Rate is Abnormal");
                                }

                            } 
            else if (vsign.equalsIgnoreCase("blood pressure")) {
                                if (vs.getBloodPressure() >= 110 && vs.getBloodPressure() <= 120) {
                                    System.out.println("Blood Pressure is Normal");
                                } 
                                else {
                                    System.out.println("Blood Pressure is Abnormal");
                                }

                            } 
            else if (vsign.equalsIgnoreCase("weight")) {
                                if (vs.getWeightInKg() >= 50 && vs.getWeightInLbs() >= 110) {
                                    System.out.println("Weight is Normal");
                                } else {
                                    System.out.println("Weight is Abnormal");
                                }
                            }
                            
                        }
        return false;
        }

    
}
