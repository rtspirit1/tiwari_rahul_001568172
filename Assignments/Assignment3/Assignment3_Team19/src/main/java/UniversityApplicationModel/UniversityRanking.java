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
public class UniversityRanking implements Comparable<UniversityRanking> {
    
    University uni;
    Double rating;

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
    
    
    

    public UniversityRanking(University u, Double rating) {
        
        this.uni = u;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return uni + ", University Rating = " + rating + "\n";
    }

    @Override
    public int compareTo(UniversityRanking o) {
        if(o.getRating() > this.getRating()){
            return 1;
        }
        else if (o.getRating() < this.getRating()){
            return -1;
        }
        return 0;
    }
    
    

    
   
    
    
    
    
    
    
}
