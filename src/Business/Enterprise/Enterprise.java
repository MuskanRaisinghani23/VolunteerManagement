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
    char[] empPass;
    ArrayList<Organization> orglist;

    public Enterprise(String type, char[] empPass) {
        this.type = type;
        this.empPass = empPass;
        this.orglist = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char[] getEmpPass() {
        return empPass;
    }

    public void setEmpPass(char[] empPass) {
        this.empPass = empPass;
    }
    
    public ArrayList<Organization> addOrg(Organization o){
        orglist.add(o);
        return orglist;
    }
    
}
