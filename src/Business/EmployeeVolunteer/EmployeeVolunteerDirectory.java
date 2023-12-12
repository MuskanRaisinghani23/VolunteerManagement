/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EmployeeVolunteer;

import Business.Business;
import Business.Employee.Employee;
import Business.Volunteer.Volunteer;
import java.util.ArrayList;

/**
 *
 * @author Anusha
 */
public class EmployeeVolunteerDirectory {
    ArrayList<EmployeeVolunteer> emplist;

    public EmployeeVolunteerDirectory(Business b) {
        this.emplist = new ArrayList<>();
    }

    public ArrayList<EmployeeVolunteer> getEmpist() {
        return emplist;
    }
    
    public EmployeeVolunteer addRequest(Employee e, Volunteer v){
        EmployeeVolunteer ov = new EmployeeVolunteer(e, v);
        emplist.add(ov);
        return ov;
    }
}
