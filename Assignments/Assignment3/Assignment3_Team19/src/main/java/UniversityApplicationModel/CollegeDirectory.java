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
public class CollegeDirectory {
    
    List<College> collegeList;

    public CollegeDirectory() {
        
        this.collegeList = new ArrayList<College>();
        
    }
    
    public College addNewCollege(College c){
        
        College college = new College(c.getCollegeName());
        collegeList.add(college);
        return college;
        
        
    }
    
    
    
}
