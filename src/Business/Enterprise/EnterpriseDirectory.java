/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Business;
import java.util.ArrayList;

/**
 *
 * @author raisi
 */
public class EnterpriseDirectory {
    Business business;
    ArrayList<Enterprise> enterpriselist;

    public EnterpriseDirectory(Business b) {
        this.business = b;
        this.enterpriselist = new ArrayList<>();
    }
    
    public Enterprise newEnterprise(String type, char[] empPassword){
        Enterprise ent = new Enterprise(type, empPassword);
        enterpriselist.add(ent);
        return ent;
    }
    
    public Enterprise findEnterprise(String type){
        for (Enterprise ent : enterpriselist) {
            if (ent.getType().equalsIgnoreCase(type)) {
                return ent;
            }
        }
        return null; //not found after going through the whole list
    }
    
    public void loggedEnterpriseType(String type){
        Enterprise ent = findEnterprise(type);
        ent.setType(type);
    }
    
    public ArrayList<Enterprise> getAllEnter(){
        return enterpriselist;
    }
}
