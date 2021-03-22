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
public class College {
    
    private String collegeName;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "College:\n" + "CollegeName = " + collegeName;
    }
    
    
    
}
