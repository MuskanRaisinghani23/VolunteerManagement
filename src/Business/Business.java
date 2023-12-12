/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import Business.Employee.Employee;
import Business.Person.PersonDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Volunteer.VolunteerDirectory;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.OrganizationVolunteer.OrganizationVolunteer;
import Business.OrganizationVolunteer.OrganizationVolunteerDirectory;
import Business.Volunteer.Volunteer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
    private Employee employee;
    private Volunteer volunteer;
    private Enterprise enterprise;
    private Organization organization;
    
    
    public Business(String n, Employee employee, Volunteer volunteer, Enterprise enterprise, Organization organization){
        this.businessname = n;
        this.employee = employee;
        this.volunteer = volunteer;
        this.enterprise = enterprise;
        this.organization = organization;
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
    
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
    
    public char[] hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));

            // Convert the byte array to a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString().toCharArray();
        } catch (NoSuchAlgorithmException e) {
            // Handle the exception (e.g., log an error message)
            e.printStackTrace();
            return null;
        }
    }
    
    public char[] hashPassword(char[] charpassword) {
        try {
            String password = String.valueOf(charpassword);
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));

            // Convert the byte array to a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString().toCharArray();
        } catch (NoSuchAlgorithmException e) {
            // Handle the exception (e.g., log an error message)
            e.printStackTrace();
            return null;
        }
    }

}
