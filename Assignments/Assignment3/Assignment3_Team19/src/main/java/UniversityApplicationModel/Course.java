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
public class Course {
    
    private String number;
    private String name;
    private int credits;
    private int price = 1500;

    public Course(String number, String name, int credits) {
        this.number = number;
        this.name = name;
        this.credits = credits;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public int getCoursePrice(){
        return price*credits;
    }

    @Override
    public String toString() {
        return "Course:\n" + "Course Number = " + number + ", Course Name = " + name + ", Credits = " + credits + ", Total Price = " + getCoursePrice() + "\n";
    }
    
    
   
    
   
}
