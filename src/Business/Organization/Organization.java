/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Employee.Employee;
import Business.Volunteer.Volunteer;
import java.util.ArrayList;

/**
 *
 * @author raisi
 */
public class Organization {
    public int id;
    public String name;
    public String address;
    public String city;
    public String state;
    public String country;
    public int needVolunteerCount;
    public ArrayList<Employee> empDirectory;
    char[] organizationPass;
//    public ArrayList<Volunteer> requestedVolunteerList;
    
    public Organization(int id, String name, String address, String city, String state, String country, int needVolunteerCount, char[] organizationPass) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.needVolunteerCount = needVolunteerCount;
        this.empDirectory = new ArrayList<>();
        this.organizationPass = organizationPass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNeedVolunteerCount() {
        return needVolunteerCount;
    }

    public void setNeedVolunteerCount(int needVolunteerCount) {
        this.needVolunteerCount = needVolunteerCount;
    }

    public ArrayList<Employee> getEmpDirectory() {
        return empDirectory;
    }
        
    public ArrayList<Employee> addEmployee(Employee e){
        empDirectory.add(e);
        return empDirectory;
    }

    public char[] getOrganizationPass() {
        return organizationPass;
    }

    public void setOrganizationPass(char[] organizationPass) {
        this.organizationPass = organizationPass;
    }

}
