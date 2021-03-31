/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Organization.Organization;

import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

    public SystemAdminRole() {
        
        this.type = RoleType.SysAdmin;
    }
    
    

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, 
            EcoSystem system) {
        this.type = RoleType.SysAdmin;
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
    
}
