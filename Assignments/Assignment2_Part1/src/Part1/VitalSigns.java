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
public class VitalSigns extends Patient {

    private String time;
    private int respiratoryRate;
    private int heartRate;
    private int bloodPressure;
    private double weightInKg;
    private double weightInLbs;

    public VitalSigns() {

    }

    public VitalSigns(String time, int respiratoryRate, int heartRate, int bloodPressure, double weightInKg, double weightInLbs) {

        this.time = time;
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.weightInKg = weightInKg;
        this.weightInLbs = weightInLbs;
    }

    @Override
    public String toString() {
        return "Time:" + this.time
                + "\nRespiratory Rate:" + this.respiratoryRate + "\nHeart Rate:" + this.heartRate
                + "\nBlood Pressure:" + this.bloodPressure + "\nWeight in Kilograms:" + this.weightInKg
                + "\nWeight in Pounds:" + this.weightInLbs;
    }

//    public VitalSigns(int respiratoryRate, int heartRate, int bloodPressure, double weightInKg, double weightInLbs) {
//        this.respiratoryRate = respiratoryRate;
//        this.heartRate = heartRate;
//        this.bloodPressure = bloodPressure;
//        this.weightInKg = weightInKg;
//        this.weightInLbs = weightInLbs;
//    }
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

    public boolean isThisVitalSignNormal(String vsign) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Vital Sign");
        vsign = in.nextLine();
        Patient p = new Patient();

        if (p.getAge() <= 1) {

            if (vsign.equalsIgnoreCase("respiratory rate")) {
                if (getRespiratoryRate() >= 30 && getRespiratoryRate() <= 50) {
                    System.out.println("Respiratory Rate is Normal");
                } else {
                    System.out.println("Respiratory Rate is Abnormal");
                }
            } 
            else if (vsign.equalsIgnoreCase("heart rate")) {
                if (getHeartRate() >= 120 && getHeartRate() <= 160) {
                    System.out.println("Heart Rate is Normal");
                } 
                else {
                    System.out.println("Heart Rate is Abnormal");
                }

            } 
            else if (vsign.equalsIgnoreCase("blood pressure")) {
                if (getBloodPressure() >= 50 && getBloodPressure() <= 70) {
                    System.out.println("Blood Pressure is Normal");
                } 
                else {
                    System.out.println("Blood Pressure is Abnormal");
                }

            } 
            else if (vsign.equalsIgnoreCase("weight")) {
                if (getWeightInKg() >= 2 && getWeightInKg() <= 3 && getWeightInLbs() >= 4.5 && getWeightInLbs() <= 7) {
                    System.out.println("Weight is Normal");
                } 
                else {
                  
                    System.out.println("Weight is Abnormal");
                }

            }

        } 
        else if (p.getAge() > 1 && p.getAge() <= 12) {
            if (vsign.equalsIgnoreCase("respiratory rate")) {
                if (getRespiratoryRate() >= 20 && getRespiratoryRate() <= 30) {
                    System.out.println("Respiratory Rate is Normal");
                } 
                else {
                    System.out.println("Respiratory Rate is Abnormal");
                }
            } 
            else if (vsign.equalsIgnoreCase("heart rate")) {
                if (getHeartRate() >= 80 && getHeartRate() <= 140) {
                    System.out.println("Heart Rate is Normal");
                } 
                else {
                    System.out.println("Heart Rate is Abnormal");
                }

            } 
            else if (vsign.equalsIgnoreCase("blood pressure")) {
                if (getBloodPressure() >= 70 && getBloodPressure() <= 100) {
                    System.out.println("Blood Pressure is Normal");
                } 
                else {
                    System.out.println("Blood Pressure is Abnormal");
                }

            } 
            else if (vsign.equalsIgnoreCase("weight")) {
                if (getWeightInKg() >= 4 && getWeightInKg() <= 10 && getWeightInLbs() >= 9 && getWeightInLbs() <= 22) {
                    System.out.println("Weight is Normal");
                } 
                else {
                    System.out.println("Weight is Abnormal");
                }
            } 
        }
        else if (p.getAge() > 12 && p.getAge() <= 36) {
            if (vsign.equalsIgnoreCase("respiratory rate")) {
                if (getRespiratoryRate() >= 20 && getRespiratoryRate() <= 30) {
                        System.out.println("Respiratory Rate is Normal");
                    } 
                else {
                        System.out.println("Respiratory Rate is Abnormal");
                    }
                } 
            else if (vsign.equalsIgnoreCase("heart rate")) {
                if (getHeartRate() >= 80 && getHeartRate() <= 130) {
                        System.out.println("Heart Rate is Normal");
                    } 
                else {
                        System.out.println("Heart Rate is Abnormal");
                    }

                } 
            else if (vsign.equalsIgnoreCase("blood pressure")) {
                    if (getBloodPressure() >= 80 && getBloodPressure() <= 110) {
                        System.out.println("Blood Pressure is Normal");
                    } 
                    else {
                        System.out.println("Blood Pressure is Abnormal");
                    }

                } 
            else if (vsign.equalsIgnoreCase("weight")) {
                if (getWeightInKg() >= 10 && getWeightInKg() <= 14 && getWeightInLbs() >= 22 && getWeightInLbs() <= 31) {
                        System.out.println("Weight is Normal");
                    } 
                else {
                        System.out.println("Weight is Abnormal");
                    }
                } 
        }
        else if (p.getAge() > 36 && p.getAge() <= 60) {
            if (vsign.equalsIgnoreCase("respiratory rate")) {
                    if (getRespiratoryRate() >= 20 && getRespiratoryRate() <= 30) {
                            System.out.println("Respiratory Rate is Normal");
                        } 
                    else {
                            System.out.println("Respiratory Rate is Abnormal");
                        }
                    } 
            else if (vsign.equalsIgnoreCase("heart rate")) {
                        if (getHeartRate() >= 80 && getHeartRate() <= 120) {
                            System.out.println("Heart Rate is Normal");
                        } 
                        else {
                            System.out.println("Heart Rate is Abnormal");
                        }

                    } 
            else if (vsign.equalsIgnoreCase("blood pressure")) {
                        if (getBloodPressure() >= 80 && getBloodPressure() <= 110) {
                            System.out.println("Blood Pressure is Normal");
                        } 
                        else {
                            System.out.println("Blood Pressure is Abnormal");
                        }

                    } 
            else if (vsign.equalsIgnoreCase("weight")) {
                        if (getWeightInKg() >= 14 && getWeightInKg() <= 18 && getWeightInLbs() >= 31 && getWeightInLbs() <= 40) {
                            System.out.println("Weight is Normal");
                        } else {
                            System.out.println("Weight is Abnormal");
                        }
                    }
        }
        else if (p.getAge() > 60 && p.getAge() <= 144) {
            if (vsign.equalsIgnoreCase("respiratory rate")) {
                    if (getRespiratoryRate() >= 20 && getRespiratoryRate() <= 30) {
                                System.out.println("Respiratory Rate is Normal");
                            } 
                    else {
                                System.out.println("Respiratory Rate is Abnormal");
                            }
                        } 
            else if (vsign.equalsIgnoreCase("heart rate")) {
                            if (getHeartRate() >= 70 && getHeartRate() <= 110) {
                                System.out.println("Heart Rate is Normal");
                            } 
                            else {
                                System.out.println("Heart Rate is Abnormal");
                            }

                        } 
            else if (vsign.equalsIgnoreCase("blood pressure")) {
                            if (getBloodPressure() >= 80 && getBloodPressure() <= 120) {
                                System.out.println("Blood Pressure is Normal");
                            } 
                            else {
                                System.out.println("Blood Pressure is Abnormal");
                            }

                        } 
            else if (vsign.equalsIgnoreCase("weight")) {
                            if (getWeightInKg() >= 20 && getWeightInKg() <= 42 && getWeightInLbs() >= 41 && getWeightInLbs() <= 92) {
                                System.out.println("Weight is Normal");
                            } else {
                                System.out.println("Weight is Abnormal");
                            }
                        } 
        }
        else {
            if (vsign.equalsIgnoreCase("respiratory rate")) {
                if (getRespiratoryRate() >= 12 && getRespiratoryRate() <= 20) {
                                    System.out.println("Respiratory Rate is Normal");
                                } 
                else {
                                    System.out.println("Respiratory Rate is Abnormal");
                                }
                            } 
            else if (vsign.equalsIgnoreCase("heart rate")) {
                                if (getHeartRate() >= 55 && getHeartRate() <= 105) {
                                    System.out.println("Heart Rate is Normal");
                                } 
                                else {
                                    System.out.println("Heart Rate is Abnormal");
                                }

                            } 
            else if (vsign.equalsIgnoreCase("blood pressure")) {
                                if (getBloodPressure() >= 110 && getBloodPressure() <= 120) {
                                    System.out.println("Blood Pressure is Normal");
                                } 
                                else {
                                    System.out.println("Blood Pressure is Abnormal");
                                }

                            } 
            else if (vsign.equalsIgnoreCase("weight")) {
                                if (getWeightInKg() >= 50 && getWeightInLbs() >= 110) {
                                    System.out.println("Weight is Normal");
                                } else {
                                    System.out.println("Weight is Abnormal");
                                }
                            }
                            
                        }
        return false;
        }
}
        
