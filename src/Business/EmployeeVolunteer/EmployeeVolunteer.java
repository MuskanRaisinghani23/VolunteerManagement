/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EmployeeVolunteer;

import Business.Employee.Employee;
import Business.Volunteer.Volunteer;

/**
 *
 * @author Anusha
 */
public class EmployeeVolunteer {
    Employee emp;
    Volunteer vol;

    public EmployeeVolunteer(Employee emp, Volunteer vol) {
        this.emp = emp;
        this.vol = vol;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public Volunteer getVol() {
        return vol;
    }

    public void setVol(Volunteer vol) {
        this.vol = vol;
    }
}
