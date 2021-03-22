/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniversityApplicationModel;

/**
 *
 * @author rtspi
 */
public class Employement {
    
    private int initialsalary;
    private int salarynow;
    StudentProfile sp;

    public Employement(StudentProfile sp, int initialsalary, int salarynow) {
        this.sp = sp;
        this.initialsalary = initialsalary;
        this.salarynow = salarynow;
    }
    
    

    public int getInitialsalary() {
        return initialsalary;
    }

    public void setInitialsalary(int initialsalary) {
        this.initialsalary = initialsalary;
    }

    public int getSalarynow() {
        return salarynow;
    }

    public void setSalarynow(int salarynow) {
        this.salarynow = salarynow;
    }

    @Override
    public String toString() {
        return "Employement:\n " + "EmployeeName: " + sp + "Starting Salary = " + initialsalary + ", Current Salary = " + salarynow + "\n";
    }
    
    
    
    
}
