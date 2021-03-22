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
public class FacultyProfile extends Person {
    
    private double rating;
    
    List<Course> courseTaught;

    public FacultyProfile(Person p, double rating) {
        super(p);
        this.rating=rating;
        this.courseTaught = new ArrayList<Course>();
        
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    
    public void addCourse(Course c){
        
        courseTaught.add(c);
        
    }

    @Override
    public String toString() {
        return "FacultyProfile:\n" + "Faculty Name: " + getName() + "Faculty ID: "  + getPersonID() + 
                "Courses Taught: " + courseTaught + "Rating = " + rating + "\n";
    }

    
    
    
    
}
