/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniversityApplicationModel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rtspi
 */
public class EmployementHistory {
    
    List<Employement> employeelist;
    private double averageSalary;

    public EmployementHistory() {
        this.employeelist = new ArrayList<Employement>();
    }
    
    public void addEmployee(Employement emp){
        
        employeelist.add(emp);
    }

    @Override
    public String toString() {
        return "EmployementHistory:\n"  + employeelist;
    }
    
    
    public double getAverageSalary(){
        
        double totalSalary=0;
        
        for(Employement emp : employeelist){
            
            totalSalary+=(emp.getInitialsalary() + emp.getSalarynow())/2;
        }
        return totalSalary/employeelist.size();
    }
    
    
    
    
}
