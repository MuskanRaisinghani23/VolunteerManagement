/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Business;
import java.util.ArrayList;

/**
 *
 * @author raisi
 */
public class OrganizationDirectory {
    Business business;
    ArrayList<Organization> organizationlist;

    public OrganizationDirectory(Business b) {
        this.business = b;
        this.organizationlist = new ArrayList<>();
    }
    
    public Organization newOrganization(int id, String name, String address, String city, String state, String country, int needVolunteerCount, char[] organizationPass){
        Organization org = new Organization(id, name, address, city, state,  country, needVolunteerCount, organizationPass);
        organizationlist.add(org);
        return org;
    }
    
    public ArrayList<Organization> getAllOrg(){
        return organizationlist;
    }
    
    public Organization findOrg(int id){
        for (Organization o : organizationlist) {
            if (o.getId() == id) {
                return o;
            }
        }
        return null; //not found after going through the whole list
    }
    
}
