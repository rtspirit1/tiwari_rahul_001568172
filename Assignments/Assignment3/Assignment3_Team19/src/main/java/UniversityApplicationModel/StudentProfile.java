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
public class StudentProfile extends Person {
    
    public StudentProfile(Person p) {
        super(p);
          
    } 
        
    @Override
    public String toString() {
        return "StudentProfile:\n " + "StudentID=" + getPersonID() + "StudentName: " +
                getName() + "\n";
    }
    
    
    
    
}