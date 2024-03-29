/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rtspi
 */
public class RestaurantOrganization extends Organization {

    public RestaurantOrganization() {
        super(Organization.Type.RestaurantAdmin.getValue());
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new AdminRole());
        return roles;
    }
    
}
