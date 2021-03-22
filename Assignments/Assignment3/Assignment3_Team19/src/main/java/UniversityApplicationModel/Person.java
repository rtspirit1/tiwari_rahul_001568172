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
public class Person {
    
    private int personID;
    private String name;
    private String address;
    private int age;

    public Person(int personID, String name, String address, int age) {
        this.personID = personID;
        this.name = name;
        this.address = address;
        this.age = age;
    }
    
    public Person(Person p){
        this.personID = p.personID;
        this.name = p.name;
        this.address = p.address;
        this.age = p.age;
    }

    @Override
    public String toString() {
        return "PersonList:\n" + "PersonID = " + personID + ", Name = " + name + ", Address = " + 
                address + ", Age = " + age + "\n";
    }
    
    
    

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
}
