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
public class UniversityDashBoard {

    /**
     * @param args the command line arguments
     */
    public void runNortheastern() {
        
        University u = new University("NorthEastern University");
        UniversityDirectory ud = new UniversityDirectory();
        ud.addNewUniversity(u);
        
        
        College c = new College("College of Engineering");
        CollegeDirectory cd = new CollegeDirectory();
        cd.addNewCollege(c);
        
        System.out.println(ud.toString());
        
        Course course1 = new Course("info5100", "AED", 4);
        Course course2 = new Course("csye6200", "OOD", 4);
        
        CourseCatalog catalog = new CourseCatalog();
        catalog.addNewCourse(course1);
        catalog.addNewCourse(course2);
        
        System.out.println(catalog.toString());
        
        Person p1 = new Person(0001, "Rahul Tiwari", "13 Cornelia CT", 27);
        Person p2 = new Person(0002, "Anurag Shrivastava", "14 Cornelia CT", 27);
        
        PersonDirectory pd = new PersonDirectory();
        pd.addNewPerson(p1);
        pd.addNewPerson(p2);
        
        StudentProfile sp1 = new StudentProfile(p1);
        StudentProfile sp2 = new StudentProfile(p2);
        
        
        StudentDirectory sd = new StudentDirectory();
        sd.addNewStudent(sp1);
        sd.addNewStudent(sp2);
        
        System.out.println(sd.toString());
        
        CourseLoad cl1 = new CourseLoad(sp1, course1, 3.6);
        CourseLoad cl2 = new CourseLoad(sp1, course2, 3.5);
              
        
        CourseLoad cl3 = new CourseLoad(sp2, course1, 3.0);
        CourseLoad cl4 = new CourseLoad(sp2, course2, 3.7);
        
        Transcript t = new Transcript();
        t.createTranscript(cl1,cl2);
        
        t.createTranscript(cl3,cl4);
        
        System.out.println("Courses Taken Are: " +t.getCoursesTaken());
        
        System.out.println("GPA:" +t.getAverageGPA());
        
        
        
        System.out.println(t.toString());
        
        Employement emp1 = new Employement(sp1, 50000, 150000);
        Employement emp2 = new Employement(sp2, 70000, 125000);
        
        EmployementHistory history = new EmployementHistory();
        history.addEmployee(emp1);
        history.addEmployee(emp2);
        
        System.out.println("EmployeeList: " + history.toString());
        
        System.out.println("Average Salaries of all Students:" +history.getAverageSalary());
        
        
       
        Person p3 = new Person(0005, "Kal Burgrara", "SomePlace Ave,New Hampshire - 202020", 55);
        Person p4 = new Person(0045, "Daniel Peters", "Huntington Ave, Boston - 02120", 60);
        
        
        FacultyProfile fp1 = new FacultyProfile(p3, 3.6);
        
        FacultyDirectory fd = new FacultyDirectory();
        fd.addFaculty(fp1);
        
        
        FacultyProfile fp2 = new FacultyProfile(p4, 4.1);
        fd.addFaculty(fp2);
        
        fp1.addCourse(course1);
        fp2.addCourse(course2);
        
        System.out.println("Total Rating:" +fd.getAverageRating());
        
        System.out.println(fd.toString());
        
        String rating= u.getUniversityRating(t.getAverageGPA(), history.getAverageSalary(), fd.getAverageRating(),sd.studentList.size());
        System.out.println("University Rating: " +rating);
        
        double flag = Double.parseDouble(rating);
        
        UniversityRanking ur = new UniversityRanking(u, flag);
        ud.addUniversityRating(ur);
        
        System.out.println("University Ranking" + ur.toString());
        
        
        
        
    }
}
        
        
        

