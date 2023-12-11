/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

import Business.Person.Person;

/**
 *
 * @author raisi
 */
public class Employee extends Person {
    
    private String role;    
    
    public Employee(int personid, String name, char[] password, String type, String phone, String role) {
        super(personid, name, password, type, phone);
        this.role=role;
    }    

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
}
