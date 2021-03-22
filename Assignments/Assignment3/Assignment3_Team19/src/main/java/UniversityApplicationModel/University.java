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
public class University {
    
    private String universityName;
    public double finalRating;
    Transcript t;
    EmployementHistory history;
    FacultyDirectory fd;
    StudentDirectory sd;
    
    

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    
    public University(String universityname){
        this.universityName = universityname;
        
        
    }

    @Override
    public String toString() {
        return "University:\n" + "University Name = " + universityName;
    }
    
    
    
    
    public String getUniversityRating(double a, double b, double c, int size){
        
        double rating =0;
        rating = (a+b+c)/3;
        rating= rating/10000;
        
        if(0<size && size<=100){
            rating+=1;
        }
        else if(100<size & size<=200){
            rating+=2;
        }
        else if(200<size & size<=500){
            rating+=3;
        }
        else if(500<size & size<=1000){
            rating+=4;
        }
        else
            rating+=5;
        
        if (rating>10){
            rating=10;
        }
        
        finalRating = rating;
        String s = String.format("%.2f", rating);
        return s;
    }

  
    
    
}
