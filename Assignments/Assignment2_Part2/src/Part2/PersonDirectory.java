/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part2;

import java.util.ArrayList;

/**
 *
 * @author rtspi
 */
public class PersonDirectory extends Community {
    
    private ArrayList<Person> persondir;
    
    public PersonDirectory(){
        this.persondir = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersondir() {
        return persondir;
    }

    public void setPersondir(ArrayList<Person> persondir) {
        this.persondir = persondir;
    }
    
    
}
