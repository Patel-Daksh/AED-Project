/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Organization;
import business.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author dax98
 */
public class PharmacyOrganization extends Organization{

    public PharmacyOrganization() {
        super(Organization.Type.Pharmacy.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        return roles;
    }

}
