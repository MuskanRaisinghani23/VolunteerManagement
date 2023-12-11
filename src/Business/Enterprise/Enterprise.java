/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author raisi
 */
public class Enterprise {
    String type;
    char[] enterprisePass;
    ArrayList<Organization> orglist;

    public Enterprise(String type, char[] enterprisePass) {
        this.type = type;
        this.enterprisePass = enterprisePass;
        this.orglist = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char[] getEnterprisePass() {
        return enterprisePass;
    }

    public void setEnterprisePass(char[] enterprisePass) {
        this.enterprisePass = enterprisePass;
    }
    
    public ArrayList<Organization> addOrg(Organization o){
        orglist.add(o);
        return orglist;
    }

    public ArrayList<Organization> getOrglist() {
        return orglist;
    }
    
    public Organization findOrg(int id){
        for (Organization o : orglist) {
            if (o.getId() == id) {
                return o;
            }
        }
        return null; //not found after going through the whole list
    }
        
}
