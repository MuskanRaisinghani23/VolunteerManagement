/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

import Business.Business;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author raisi
 */
public class EmployeeDirectory {
    Business business;
    ArrayList<Employee> employeelist;

    public EmployeeDirectory(Business b) {
        this.business = b;
        this.employeelist = new ArrayList<>();
    }
    
    public Employee newEmployee(int employeeid, String name, char[] password, String type, String phone, String role) {
        Employee e = new Employee(employeeid, name, password, type, phone, role);
        employeelist.add(e);
        return e;
    }
    
    public Employee findEmployee(int id){
        for (Employee e : employeelist) {
            if (e.getPersonid() == id) {
                return e;
            }
        }
        return null; //not found after going through the whole list
    }
    
    public ArrayList<Employee> getAllEmp(){
        return employeelist;
    }
    
    public Employee findEmployeeByName(String name){
        for (Employee e : employeelist) {
            if (e.getName() == name) {
                return e;
            }
        }
        return null;
    }
}

