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
public class CourseCatalog {
    
    List<Course> courselist;

    public CourseCatalog() {
        
        this.courselist = new ArrayList<Course>();
    }
    
    public Course addNewCourse(Course c){
        
        courselist.add(c);
        return c;
    }

    @Override
    public String toString() {
        return "CourseCatalog:\n" + "Courselist = " + courselist +  "\n";
    }
    
    
    
    
    
}
