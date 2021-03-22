/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniversityApplicationModel;

import com.github.javafaker.Faker;
import com.github.javafaker.University;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author rtspi
 */
public class TestData {
    
    Faker fake = new Faker();
    PersonDirectory pd = new PersonDirectory(); 
    UniversityDirectory ud = new UniversityDirectory();
    FacultyDirectory fd = new FacultyDirectory();
    StudentDirectory sd = new StudentDirectory();
    EmployementHistory enh = new EmployementHistory();
    CourseCatalog cc = new CourseCatalog();
    Transcript t = new Transcript();
    
    public double getStudentData(){
                     
        for(int i=0; i<50; i++){
            
            int a = i+1;
            String b = fake.name().fullName();
            String c = fake.address().fullAddress();
            int d = fake.number().numberBetween(18, 60);
        
            Person p = new Person(a, b, c, d);
            StudentProfile s1 = new StudentProfile(p);
            
            pd.addNewPerson(p);
            sd.addNewStudent(s1);
            
            int credits = fake.number().numberBetween(1, 5);
            String subject = fake.educator().course();
            String number = fake.bothify("Info####");
            
            Course c1 = new Course(number, subject, credits);
            Course c2 = new Course(number, subject, credits);
            
            cc.addNewCourse(c1);
            
            double gpa = fake.number().randomDouble(1, 3, 4);
            
            CourseLoad cl1 = new CourseLoad(s1, c1, gpa);
            
            StudentProfile s2 = new StudentProfile(p);
            sd.addNewStudent(s2);
            CourseLoad cl2 = new CourseLoad(s2, c2, gpa);
            
            
            t.createTranscript(cl1, cl2);
            
            
            
            
            int initial = fake.number().numberBetween(10000, 50000);
            int finalsalary = fake.number().numberBetween(100000, 200000);
            Employement emp1 = new Employement(s1, initial, finalsalary);
            Employement emp2 = new Employement(s2, initial, finalsalary);
            
            enh.addEmployee(emp1);
            enh.addEmployee(emp2);
    
        }   
        
        
        System.out.println("Total University Average GPA of Students: " + t.getAverageGPA());
        
        System.out.println(sd.toString());
        System.out.println(cc.toString());
        System.out.println("Average Salary of all Students Till date: " +enh.getAverageSalary());
        
        double flag = t.getAverageGPA() + enh.getAverageSalary();
        
        return flag;
    }
    
    public double getFacultyData(){
        
        for(int i =0; i<10; i++){
            int a = i+1;
            String b = fake.name().fullName();
            String c = fake.address().fullAddress();
            int d = fake.number().numberBetween(18, 60);
            double rating = fake.number().randomDouble(2, 0, 5);
            Person p = new Person(a, b, c, d);
            pd.addNewPerson(p);
            
            FacultyProfile fp = new FacultyProfile(p, a);
            int credits = fake.number().numberBetween(1, 5);
            String subject = fake.educator().course();
            String number = fake.bothify("Info####");
            
            Course c1 = new Course(number, subject, credits);
            fp.addCourse(c1);
            fd.addFaculty(fp);
            
        }        
        
        System.out.println("Average Rating of all Faculties: " + fd.getAverageRating());
        System.out.println(fd.toString());
        
        return fd.getAverageRating();
    }
    
    
   
    
    public void getUniversityData(){
        
        double finalrating=0;
        for(int i = 0; i<5; i++){
            
            
            double studentrating = getStudentData();
            double facultydata = getFacultyData();
            
            
            
            
            String a = fake.university().name();
            
            
            
            UniversityApplicationModel.University u1 = new UniversityApplicationModel.University(a);
            
            
            ud.addNewUniversity(u1);
            
            int size = sd.studentList.size();
            finalrating = Double.parseDouble(u1.getUniversityRating(studentrating/2, studentrating/2, facultydata, size));
            
            
            String b = Double.toString(finalrating);
            UniversityRanking ur = new UniversityRanking(u1, finalrating);
            ud.addUniversityRating(ur);
            
        }
        
        System.out.println("New Universities" + ud.toString());
        
        List<UniversityRanking> random = ud.universityRankingList;
        Collections.sort(random);
        
        System.out.println("University Rankings:\n");
        for(UniversityRanking rank : ud.universityRankingList){
            
            System.out.println(rank.toString());
        }
        
        
        
    }
    
    
    
    
    
    
}
