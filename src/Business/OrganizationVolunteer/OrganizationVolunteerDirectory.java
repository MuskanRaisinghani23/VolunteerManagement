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
    
    public ArrayList<OrganizationVolunteer> removeRequest(Organization o, Volunteer v){
//        for(OrganizationVolunteer ov : ovlist){
//            System.out.println("org: "+ov.getOrg().getName()+ " Vol: "+ ov.getVol().getName());
//        }
        OrganizationVolunteer ovToRemove = null;
        for(OrganizationVolunteer ov : ovlist){
            if(ov.getOrg().equals(o) && ov.getVol().equals(v)){
                ovToRemove = ov;
                break;
            }
        }
        ovlist.remove(ovToRemove);    
        return ovlist;
    }
    
    public ArrayList<OrganizationVolunteer> getAllRequests(){
        return ovlist;
    }
    
    public OrganizationVolunteer findRequestIfPresent(Organization o, Volunteer v){
        for (OrganizationVolunteer ov : ovlist) {
            if (ov.getOrg().equals(o) && ov.getVol().equals(v)) {
                return ov;
            }
        }
        return null; //not found after going through the whole list
    }
    
    public Boolean requestUpdate(int org_id, int vol_id, String status){
        Boolean update_status = false;
        for (OrganizationVolunteer ov : ovlist) {
            if (ov.getOrg().getId()==org_id && ov.getVol().getPersonid()==vol_id) {
                ov.setRequeststatus(status);
                update_status = true;
            }
        }
        return update_status;
    }
}
