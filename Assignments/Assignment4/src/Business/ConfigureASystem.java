package Business;

import Business.Organization.SystemAdminOrganization;
import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        SystemAdminOrganization sysadminOrganization = new SystemAdminOrganization();
        system.getOrganizationDirectory().getOrganizationList().add(sysadminOrganization);
        
        Employee employee = new Employee();
        employee.setName("Rahul Tiwari");
        
        UserAccount ua = new UserAccount();
        ua.setUsername("rtspirit");
        ua.setPassword("super");
        ua.setRole(new SystemAdminRole());
        ua.setEmployee(employee);
        
        sysadminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        sysadminOrganization.getUserAccountDirectory().getUserAccountList().add(ua);
        
//        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
//        
//        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
//        
        return system;
    }
    
}
