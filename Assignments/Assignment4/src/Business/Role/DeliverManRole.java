/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DeliveryManRole.DeliveryManWorkAreaJPanel;

/**
 *
 * @author harold
 */
public class DeliverManRole extends Role {

    public DeliverManRole() {
        
         this.type = RoleType.DeliveryMan;
    }
    
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem system) {
        this.type = RoleType.DeliveryMan;
        return new DeliveryManWorkAreaJPanel(userProcessContainer,account,system);//To change body of generated methods, choose Tools | Templates.
    }
    
}
