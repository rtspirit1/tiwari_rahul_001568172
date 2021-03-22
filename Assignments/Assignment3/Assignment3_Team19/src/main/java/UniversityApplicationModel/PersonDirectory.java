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
public class PersonDirectory {
    
    List<Person> personlist;

    public List<Person> getPersonlist() {
        return personlist;
    }

    public void setPersonlist(List<Person> personlist) {
        this.personlist = personlist;
    }

    public PersonDirectory() {
        
        this.personlist = new ArrayList<Person>();
        
    }
    
    
    
    public Person addNewPerson(Person p){
        
        personlist.add(p);
        return p;
        
    }

    
    
    
    
    @Override
    public String toString() {
        return "PersonDirectory:\n" + personlist + "\n";
    }
    
    
    
}
