/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Volunteer;

import Business.Business;
import java.util.ArrayList;

/**
 *
 * @author raisi
 */
public class VolunteerDirectory {
    Business business;
    ArrayList<Volunteer> volunteerlist;

    public VolunteerDirectory(Business b) {
        this.business = b;
        this.volunteerlist = new ArrayList<>();
    }
    
    public Volunteer newVolunteer(int personid, String name, char[] password, String type, String phone, String address, String city, String state, String country, Boolean availableforvolunteer, int age, String gender) {
        Volunteer v = new Volunteer(personid, name, password, type, phone, address, city, state, country, availableforvolunteer, age, gender);
        volunteerlist.add(v);
        return v;
    }
    
    public Volunteer findVolunteer(int id){
        for (Volunteer v : volunteerlist) {
            if (v.getPersonid() == id) {
                return v;
            }
        }
        return null; //not found after going through the whole list
    }

    public ArrayList<Volunteer> getAllVol(){
        return volunteerlist;
    }
    
}
