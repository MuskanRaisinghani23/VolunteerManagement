/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

import Business.Person.Person;
import Business.Volunteer.Volunteer;
import java.util.ArrayList;

/**
 *
 * @author raisi
 */
public class Employee extends Person {
    
    private String role;
    ArrayList<Volunteer> VolToEmplist;
    
    public Employee(int personid, String name, char[] password, String type, String phone, String role) {
        super(personid, name, password, type, phone);
        this.role=role;
        this.VolToEmplist = new ArrayList<>();
    }    

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public ArrayList<Volunteer> addVolToEmplist(Volunteer v){
        VolToEmplist.add(v);
        return VolToEmplist;
    }

    public ArrayList<Volunteer> getVolToEmplist() {
        return VolToEmplist;
    }
}
