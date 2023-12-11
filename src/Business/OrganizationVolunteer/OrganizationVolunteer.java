/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.OrganizationVolunteer;

import Business.Organization.Organization;
import Business.Volunteer.Volunteer;

/**
 *
 * @author raisi
 */
public class OrganizationVolunteer {
    Organization org;
    Volunteer vol;
    public String requeststatus;

    public OrganizationVolunteer(Organization org, Volunteer vol, String requeststatus) {
        this.org = org;
        this.vol = vol;
        this.requeststatus = requeststatus;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

    public Volunteer getVol() {
        return vol;
    }

    public void setVol(Volunteer vol) {
        this.vol = vol;
    }

    public String getRequeststatus() {
        return requeststatus;
    }

    public void setRequeststatus(String requeststatus) {
        this.requeststatus = requeststatus;
    }
    
}
