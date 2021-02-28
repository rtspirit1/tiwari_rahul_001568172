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
public class EncounterHistory extends Encounter {
    
    private ArrayList<VitalSigns> history;
    
    
    
    public EncounterHistory(){
        
        this.history = new ArrayList<VitalSigns>();
        
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    public VitalSigns addNewVitals(){
        
        
        VitalSigns newVitals = new VitalSigns();
        
        history.add(newVitals);
        return newVitals;
    }
}
