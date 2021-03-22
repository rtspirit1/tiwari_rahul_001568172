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
public class StudentDirectory {
    
    List<StudentProfile> studentList;

    public StudentDirectory() {
        studentList = new ArrayList<StudentProfile>();
    }

    public List<StudentProfile> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<StudentProfile> studentList) {
        this.studentList = studentList;
    }
    
    public StudentProfile addNewStudent(StudentProfile sp){
        
        studentList.add(sp);
        return sp;
                
    }

    @Override
    public String toString() {
        
        return "StudentDirectory:\n" + studentList + "\n";
    }
    
//    public double averageGPA(){
//        
//        double totalGPA =0;
//        
//        for(StudentProfile sp : studentList){
//            totalGPA+= sp.get
//        }
//    }
//    
    
    
    
    
}
