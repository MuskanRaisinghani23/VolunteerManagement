/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import Business.Person.PersonDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Volunteer.VolunteerDirectory;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.OrganizationDirectory;
import Business.OrganizationVolunteer.OrganizationVolunteer;
import Business.OrganizationVolunteer.OrganizationVolunteerDirectory;

/**
 *
 * @author raisi
 */
public class Business {
    private String businessname;
    private PersonDirectory persondirectory;
    private EmployeeDirectory employeedirectory;
    private VolunteerDirectory volunteerdirectory;
    private EnterpriseDirectory enterprisedirectory;
    private OrganizationDirectory organizationdirectory;
    private OrganizationVolunteerDirectory organizationvolunteerdirectory; 
    
    public Business(String n){
        this.businessname = n;
        persondirectory = new PersonDirectory(this);
        employeedirectory = new EmployeeDirectory(this);
        volunteerdirectory = new VolunteerDirectory(this);
        enterprisedirectory = new EnterpriseDirectory(this);
        organizationdirectory = new OrganizationDirectory(this); 
        organizationvolunteerdirectory = new OrganizationVolunteerDirectory(this);
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname;
    }

    public PersonDirectory getPersondirectory() {
        return persondirectory;
    }

    public void setPersondirectory(PersonDirectory persondirectory) {
        this.persondirectory = persondirectory;
    }

    public EmployeeDirectory getEmployeedirectory() {
        return employeedirectory;
    }

    public void setEmployeedirectory(EmployeeDirectory employeedirectory) {
        this.employeedirectory = employeedirectory;
    }

    public VolunteerDirectory getVolunteerdirectory() {
        return volunteerdirectory;
    }

    public void setVolunteerdirectory(VolunteerDirectory volunteerdirectory) {
        this.volunteerdirectory = volunteerdirectory;
    }

    public EnterpriseDirectory getEnterprisedirectory() {
        return enterprisedirectory;
    }

    public void setEnterprisedirectory(EnterpriseDirectory enterprisedirectory) {
        this.enterprisedirectory = enterprisedirectory;
    }

    public OrganizationDirectory getOrganizationdirectory() {
        return organizationdirectory;
    }

    public void setOrganizationdirectory(OrganizationDirectory organizationdirectory) {
        this.organizationdirectory = organizationdirectory;
    }

    public OrganizationVolunteerDirectory getOrganizationvolunteerdirectory() {
        return organizationvolunteerdirectory;
    }

    public void setOrganizationvolunteerdirectory(OrganizationVolunteerDirectory organizationvolunteerdirectory) {
        this.organizationvolunteerdirectory = organizationvolunteerdirectory;
    }
    
}
