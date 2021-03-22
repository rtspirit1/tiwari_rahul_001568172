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
public class UniversityDirectory {
    
    List<University> universityList;
    List<UniversityRanking> universityRankingList;

    public UniversityDirectory() {
        this.universityList = new ArrayList<University>();
        this.universityRankingList = new ArrayList<UniversityRanking>();
        
    }
    
    public University addNewUniversity(University u){
        
        University university = new University(u.getUniversityName());
        universityList.add(university);
        return university;
        
    }
    
    public void addUniversityRating(UniversityRanking ur){
        
        universityRankingList.add(ur);
        
    }

    public List<University> getUniversityList() {
        return universityList;
    }

    public void setUniversityList(List<University> universityList) {
        this.universityList = universityList;
    }
    
    

    @Override
    public String toString() {
        return "UniversityList =\n" + getUniversityList() + "\n";
    }

    
    
    
    
    
}
