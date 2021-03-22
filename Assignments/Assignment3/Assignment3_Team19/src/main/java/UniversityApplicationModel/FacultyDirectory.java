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
public class FacultyDirectory {
    
    List<FacultyProfile> facultyList;

    public List<FacultyProfile> getFacultyList() {
        return facultyList;
    }

    public void setFacultyList(List<FacultyProfile> facultyList) {
        this.facultyList = facultyList;
    }
      
    public FacultyDirectory() {
        facultyList = new ArrayList<FacultyProfile>();
    }
    
    public FacultyProfile addFaculty(FacultyProfile fp){
        
        
        facultyList.add(fp);
        return fp;
        
    }
    
    public double getAverageRating(){
        double avgRating=0;
        for(FacultyProfile fp : facultyList){
            avgRating+= fp.getRating();
        }
        int totalFaculties = facultyList.size();
        return avgRating/totalFaculties;
    }

    @Override
    public String toString() {
        return "FacultyDirectory:\n" + facultyList + "\n";
    }
    
    
    
    
    
}
