/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author rtspi
 */
public class SystemAdminOrganization extends Organization {

    public SystemAdminOrganization() {
        super(Organization.Type.SysAdmin.getValue());
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new SystemAdminRole());
        return roles;
    }
    
}
