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
public class CourseLoad {
    
    Course course;
    private double gpa;
    StudentProfile student;

    public CourseLoad(StudentProfile student, Course course, double gpa) {
        this.course = course;
        this.gpa = gpa;
        this.student = student;
    }

    @Override
    public String toString() {
        return "CourseLoad:\n" + "StudentID: " + student.getPersonID() + "Student Name: " + student.getName() 
                + "Course: " + course + ", Student GPA: " + gpa;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    
//    public double getAverageGPA(){
//        
//        double totalGPA=0;
//        
//    }
    
    

    
    
    
    
}
