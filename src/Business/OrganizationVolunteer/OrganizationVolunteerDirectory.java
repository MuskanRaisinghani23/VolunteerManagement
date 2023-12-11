/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.OrganizationVolunteer;

import Business.Business;
import Business.Organization.Organization;
import Business.Volunteer.Volunteer;
import java.util.ArrayList;

/**
 *
 * @author raisi
 */
public class OrganizationVolunteerDirectory {
    ArrayList<OrganizationVolunteer> ovlist;

    public OrganizationVolunteerDirectory(Business b) {
        this.ovlist = new ArrayList<>();
    }

    public ArrayList<OrganizationVolunteer> getOvlist() {
        return ovlist;
    }
    
    public OrganizationVolunteer addRequest(Organization o, Volunteer v, String status){
        OrganizationVolunteer ov = new OrganizationVolunteer(o, v, status);
        ovlist.add(ov);
        return ov;
    }
    
    public ArrayList<OrganizationVolunteer> getAllRequests(){
        return ovlist;
    }
}
