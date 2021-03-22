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
public class Transcript {
    
    List<CourseLoad> courseloadlist;
    

    public Transcript() {
        
        courseloadlist = new ArrayList<CourseLoad>();
    }

    @Override
    public String toString() {
        return "Transcript:\n" + "CourseLoadList = " + courseloadlist;
    }
    
    public List<CourseLoad> getCoursesTaken(){
        return courseloadlist;
    }
    
    public List<CourseLoad> createTranscript(CourseLoad cl1, CourseLoad cl2){
        
        courseloadlist.add(cl1);
        courseloadlist.add(cl2);
        return courseloadlist;
        
    }
    
    public double getAverageGPA(){
        List<CourseLoad> courseGPAList = getCoursesTaken();
        int courses = courseGPAList.size();
        double totalGPA = 0;
        for(CourseLoad c : courseGPAList){
            totalGPA+= c.getGpa();
        }
        
        return totalGPA/courses;
        
    }
    
    
    
    
}
