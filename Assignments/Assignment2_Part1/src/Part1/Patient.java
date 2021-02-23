/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rtspi
 */
public class Patient {
    private String firstName;
    private String lastName;
    private int patientID;
    private double age;
    
    ArrayList<Patient> patientList;

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Patient(){
        patientList = new ArrayList<>();
    }

    public Patient(String firstName, String lastName, int patientID, double age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patientID = patientID;
        this.age = age;
    }
    
    @Override
    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName + "\nAge: " + this.age + "\nPatient ID: " + this.patientID;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
    
    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
    
    public boolean isPatientNormal(Patient P, VitalSigns vs){
        
        
        int ageInMonths = (int) ((P.getAge())*12);
        if(ageInMonths<=1){
            if(30>=vs.getRespiratoryRate() && vs.getRespiratoryRate()>=50){
                System.out.println("Abnormal Respiratory Rate: Signs of fever or stress");
                return false;
            }
            else if(120>=vs.getHeartRate() && vs.getHeartRate()>=160){
                System.out.println("Abnormal Heart Rate: Signs of fever or stress");
                return false;
            }
            else if(50>=vs.getBloodPressure() && vs.getBloodPressure()>=70){
                System.out.println("Abnormal Blood Pressure: Signs of fever or stress");
                return false;
            }
            else if(2>=vs.getWeightInKg() && vs.getWeightInKg()>=3){
                System.out.println("Abnormal Weight");
                return false;
            }                
            else if(4.5>=vs.getWeightInLbs() && vs.getWeightInLbs()>=7){
                System.out.println("Abnormal Weight");
                return false;
            }
            else{
                System.out.println("Patient is Normal");
                return true;
            }
        }
        else if(ageInMonths>1 && ageInMonths<=12){
            if(20>=vs.getRespiratoryRate() && vs.getRespiratoryRate()>=30){
                System.out.println("Abnormal Respiratory Rate: Signs of fever or stress");
                return false;
            }
            else if(80>=vs.getHeartRate() && vs.getHeartRate()>=140){
                System.out.println("Abnormal Heart Rate: Signs of fever or stress");
                return false;
            }
            else if(70>=vs.getBloodPressure() && vs.getBloodPressure()>=100){
                System.out.println("Abnormal Blood Pressure: Signs of fever or stress");
                return false;
            }
            else if(4>=vs.getWeightInKg() && vs.getWeightInKg()>=10){
                System.out.println("Abnormal Weight");
                return false;
            }                
            else if(9>=vs.getWeightInLbs() && vs.getWeightInLbs()>=22){
                System.out.println("Abnormal Weight");
                return false;
            }
            else{
                System.out.println("Patient is Normal");
                return true;
            }
        }
        else if(ageInMonths>12 && ageInMonths<=36){
            if(20>=vs.getRespiratoryRate() && vs.getRespiratoryRate()>=30){
                System.out.println("Abnormal Respiratory Rate: Signs of fever or stress");
                return false;
            }
            else if(80>=vs.getHeartRate() && vs.getHeartRate()>=130){
                System.out.println("Abnormal Heart Rate: Signs of fever or stress");
                return false;
            }
            else if(80>=vs.getBloodPressure() && vs.getBloodPressure()>=110){
                System.out.println("Abnormal Blood Pressure: Signs of fever or stress");
                return false;
            }
            else if(10>=vs.getWeightInKg() && vs.getWeightInKg()>=14){
                System.out.println("Abnormal Weight");
                return false;
            }                
            else if(22>=vs.getWeightInLbs() && vs.getWeightInLbs()>=31){
                System.out.println("Abnormal Weight");
                return false;
            }
            else{
                System.out.println("Patient is Normal");
                return true;
            }
        }
        else if(ageInMonths>36 && ageInMonths<=60){
            if(20>=vs.getRespiratoryRate() && vs.getRespiratoryRate()>=30){
                System.out.println("Abnormal Respiratory Rate: Signs of fever or stress");
                return false;
            }
            else if(80>=vs.getHeartRate() && vs.getHeartRate()>=120){
                System.out.println("Abnormal Heart Rate: Signs of fever or stress");
                return false;
            }
            else if(80>=vs.getBloodPressure() && vs.getBloodPressure()>=110){
                System.out.println("Abnormal Blood Pressure: Signs of fever or stress");
                return false;
            }
            else if(14>=vs.getWeightInKg() && vs.getWeightInKg()>=18){
                System.out.println("Abnormal Weight");
                return false;
            }                
            else if(31>=vs.getWeightInLbs() && vs.getWeightInLbs()>=40){
                System.out.println("Abnormal Weight");
                return false;
            }
            else{
                System.out.println("Patient is Normal");
                return true;
            }
        }
        else if(ageInMonths>60 && ageInMonths<=144){
            if(20>=vs.getRespiratoryRate() && vs.getRespiratoryRate()>=30){
                System.out.println("Abnormal Respiratory Rate: Signs of fever or stress");
                return false;
            }
            else if(70>=vs.getHeartRate() && vs.getHeartRate()>=110){
                System.out.println("Abnormal Heart Rate: Signs of fever or stress");
                return false;
            }
            else if(80>=vs.getBloodPressure() && vs.getBloodPressure()>=120){
                System.out.println("Abnormal Blood Pressure: Signs of fever or stress");
                return false;
            }
            else if(20>=vs.getWeightInKg() && vs.getWeightInKg()>=42){
                System.out.println("Abnormal Weight");
                return false;
            }                
            else if(41>=vs.getWeightInLbs() && vs.getWeightInLbs()>=92){
                System.out.println("Abnormal Weight");
                return false;
            }
            else{
                System.out.println("Patient is Normal");
                return true;
            }
        }
        else if(ageInMonths>=144){
            if(12>=vs.getRespiratoryRate() && vs.getRespiratoryRate()>=20){
                System.out.println("Abnormal Respiratory Rate: Signs of fever or stress");
                return false;
            }
            else if(55>=vs.getHeartRate() && vs.getHeartRate()>=105){
                System.out.println("Abnormal Heart Rate: Signs of fever or stress");
                return false;
            }
            else if(110>=vs.getBloodPressure() && vs.getBloodPressure()>=120){
                System.out.println("Abnormal Blood Pressure: Signs of fever or stress");
                return false;
            }
            else if(vs.getWeightInKg()<=50){
                System.out.println("Abnormal Weight");
                return false;
            }                
            else if(vs.getWeightInLbs()<=110){
                System.out.println("Abnormal Weight");
                return false;
            }
            else{
                System.out.println("PATIENT IS NORMAL");
                return true;
            }
        }
        else
            System.out.println("Please enter a valid age");
            isPatientNormal(P, vs);
            return false; 
    
            
         
    }
    
    public Patient addNewPatient(){
        
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Choose Patient's Age Group:\n ");
        System.out.println("1.NewBorn\n2.Infant\n3.Others\n");
        String s = in.nextLine();
        
        if("1".equals(s)){
            System.out.println("Enter Patient's First Name: ");
            String s1 = in.nextLine();

            System.out.println("Enter Patient's Last Name: ");
            String s2 = in.nextLine();

            System.out.println("Enter Patient's Age in Days: ");
            double a = in.nextDouble();
            in.nextLine();

            System.out.println("Enter Patient's ID:");
            int s3 = in.nextInt();
            in.nextLine();
            
            double b = a/365;

            Patient newPatient = new Patient(s1, s2, s3, b);
            patientList.add(newPatient);
            newPatient.setPatientList(patientList);
            System.out.println("New Added Patient is: " + newPatient.toString());
            
            return newPatient;

        }
        else if("2".equals(s)){
            
            System.out.println("Enter Patient's First Name: ");
            String s1 = in.nextLine();

            System.out.println("Enter Patient's Last Name: ");
            String s2 = in.nextLine();

            System.out.println("Enter Patient's Age in Months: ");
            double a = in.nextDouble();
            in.nextLine();

            System.out.println("Enter Patient's ID:");
            int s3 = in.nextInt();
            in.nextLine();
            
            double b = a/12;

            Patient newPatient = new Patient(s1, s2, s3, b);
            patientList.add(newPatient);
            newPatient.setPatientList(patientList);
            System.out.println("New Added Patient is: " + newPatient.toString());

            return newPatient;
            
        }
        
        else if("3".equals(s)){
            System.out.println("Enter Patient's First Name: ");
            String s1 = in.nextLine();

            System.out.println("Enter Patient's Last Name: ");
            String s2 = in.nextLine();

            System.out.println("Enter Patient's Age: ");
            double a = in.nextDouble();
            in.nextLine();

            System.out.println("Enter Patient's ID:");
            int s3 = in.nextInt();
            in.nextLine();

            Patient newPatient = new Patient(s1, s2, s3, a);
            patientList.add(newPatient);
            newPatient.setPatientList(patientList);
            System.out.println("New Added Patient is: " + newPatient.toString());

            return newPatient;
        }
        else
            System.out.println("Please enter a correct choice:");
            return addNewPatient();
        }
        
        
    }
    
    

