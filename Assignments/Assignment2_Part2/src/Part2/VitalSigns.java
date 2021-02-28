/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part2;

/**
 *
 * @author rtspi
 */
public class VitalSigns extends Patient {
    
    private String time;
    private int respiratoryRate;
    private int heartRate;
    private int bloodPressure;
    private double weightInKg;
    private double weightInLbs;
    
    EncounterHistory history;

    @Override
    public String toString() {
        return "\nTime:" + this.time + "\nName: " + this.fName + " " + this.lName + "\nAge: " + this.age + "\nPatient ID: " + this.patientid +
                "\nRespiratory Rate: " + this.respiratoryRate + "\nHeart Rate: " + this.heartRate +
                "\nBlood Pressure: " + this.bloodPressure + "\nWeight in Kilograms: " + this.weightInKg +
                "\nWeight in Pounds: " + this.weightInLbs + "\n"; //To change body of generated methods, choose Tools | Templates.
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
   

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public double getWeightInLbs() {
        return weightInLbs;
    }

    public void setWeightInLbs(double weightInLbs) {
        this.weightInLbs = weightInLbs;
    }
    
    
}
