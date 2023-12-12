
package Business;

import Business.Database.DatabaseConnection;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.OrganizationVolunteer.OrganizationVolunteerDirectory;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Volunteer.Volunteer;
import Business.Volunteer.VolunteerDirectory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author raisi
 */
public class ConfigureABusiness {
    Employee employee;
    Volunteer volunteer;
    Enterprise enterprise;
    Organization organization;
    
    public Business initialize() {
        Business business = new Business("WEVolunteer", employee, volunteer, enterprise, organization);
        
        readFromEmployeeTable(business);
        readFromEnterpriseTable(business);
        readFromOrganizationTable(business);
        readFromVolunteerTable(business);
        readFromEmployeeOrganizationTable(business);
        readFromOrganizationEnterpriseTable(business);
        readFromOrganizationVolunteerTable(business);

        return business;
    }

    private static void readFromEmployeeTable(Business business) {
        DatabaseConnection.disconnect();
        Connection conn = DatabaseConnection.connect(); 
        EmployeeDirectory empDir = business.getEmployeedirectory();
        PersonDirectory perDir = business.getPersondirectory();
        try{
            Statement statement = conn.createStatement();
            String query = "SELECT * FROM Employee";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int empId = resultSet.getInt("id");
                String empName = resultSet.getString("Name");
                char[] password = business.hashPassword(resultSet.getString("Password"));
                String contact = resultSet.getString("Contact");
                String empRole = resultSet.getString("Role");
                Employee e = empDir.newEmployee(empId, empName, password, "Employee", contact, empRole);
                Person p = perDir.newPerson(empId, empName, password, "Employee", contact);
            }
        }
        catch(Exception e){
            System.out.println("Exception raised: " + e);
        }
    }

    private static void readFromEnterpriseTable(Business business) {
        DatabaseConnection.disconnect();
        Connection conn = DatabaseConnection.connect(); 
        EnterpriseDirectory enterpriseDir = business.getEnterprisedirectory();
        try{
            Statement statement = conn.createStatement();
            String query = "SELECT * FROM Enterprise";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String enterType = resultSet.getString("Type");
                char [] password = business.hashPassword(resultSet.getString("password"));
                Enterprise ent = enterpriseDir.newEnterprise(enterType, password);
            }
        }
        catch(Exception e){
            System.out.println("Exception raised: " + e);
        }
    }

    private static void readFromOrganizationTable(Business business) {
        DatabaseConnection.disconnect();
        Connection conn = DatabaseConnection.connect(); 
        OrganizationDirectory orgDir = business.getOrganizationdirectory();
        try{
            Statement statement = conn.createStatement();
            String query = "SELECT * FROM Organization";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int orgId = resultSet.getInt("Id");
                String orgName = resultSet.getString("Name");
                String orgAdd = resultSet.getString("Address");
                String orgCity = resultSet.getString("City");
                String orgState = resultSet.getString("State");
                String orgCountry = resultSet.getString("Country");
                int needVolunteerCount = resultSet.getInt("NeedVolunteerCount");
                char [] password = business.hashPassword(resultSet.getString("password"));
                Organization org = orgDir.newOrganization(orgId, orgName, orgAdd, orgCity, orgState, orgCountry, needVolunteerCount, password);
            }
        }
        catch(Exception e){
            System.out.println("Exception raised: " + e);
        }
    }

    private static void readFromVolunteerTable(Business business) {
        DatabaseConnection.disconnect();
        Connection conn = DatabaseConnection.connect(); 
        VolunteerDirectory volDir = business.getVolunteerdirectory();
        PersonDirectory perDir = business.getPersondirectory();
        try{
            Statement statement = conn.createStatement();
            String query = "SELECT * FROM Volunteer";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int volId = resultSet.getInt("id");
                String volName = resultSet.getString("Name");
                char[] volPassword = business.hashPassword(resultSet.getString("Password"));
                String volContact = resultSet.getString("Contact");
                String volAdd = resultSet.getString("Address");
                String volCity = resultSet.getString("City");
                String volState = resultSet.getString("State");
                String volCountry = resultSet.getString("Country");
                int availForVolunteer = resultSet.getInt("AvailableForVolunteer");
                Boolean availableforvolunteer = (availForVolunteer==1) ? true : false;
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
                                
                Volunteer vol = volDir.newVolunteer(volId, volName, volPassword, "Volunteer", volContact, volAdd, volCity, volState, volCountry, availableforvolunteer, age, gender);
                Person p = perDir.newPerson(volId, volName, volPassword, "Volunteer", volContact);
            }
        }
        catch(Exception e){
            System.out.println("Exception raised: " + e);
        }
    }

    private static void readFromEmployeeOrganizationTable(Business business) {
        DatabaseConnection.disconnect();
        Connection conn = DatabaseConnection.connect(); 
        OrganizationDirectory orgDir = business.getOrganizationdirectory();
//        ArrayList<Organization> orglist = orgDir.getAllOrg();
        EmployeeDirectory empDir = business.getEmployeedirectory();
        
        try{
            Statement statement = conn.createStatement();
            String query = "SELECT * FROM Employee_Organization";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int orgId = resultSet.getInt("Organization_id");
                int empId = resultSet.getInt("Employee_id");
                Organization o = orgDir.findOrg(orgId);
                Employee e = empDir.findEmployee(empId);
                o.addEmployee(e);
            }
        }
        catch(Exception e){
            System.out.println("Exception raised: " + e);
        }
    }

    private static void readFromOrganizationEnterpriseTable(Business business) {
        DatabaseConnection.disconnect();
        Connection conn = DatabaseConnection.connect(); 
        EnterpriseDirectory enterpriseDir = business.getEnterprisedirectory();
        OrganizationDirectory orgDir = business.getOrganizationdirectory();
        
        try{
            Statement statement = conn.createStatement();
            String query = "SELECT * FROM Organization_Enterprise";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String enterpriseType = resultSet.getString("Enterprise_Type");
                int orgId = resultSet.getInt("Organization_id");

                Enterprise ent = enterpriseDir.findEnterprise(enterpriseType);
                Organization o = orgDir.findOrg(orgId);
                ent.addOrg(o);
            }
        }
        catch(Exception e){
            System.out.println("Exception raised: " + e);
        }
    }
    
    private static void readFromOrganizationVolunteerTable(Business business) {
        DatabaseConnection.disconnect();
        Connection conn = DatabaseConnection.connect(); 
        OrganizationVolunteerDirectory ovdirectory = business.getOrganizationvolunteerdirectory();
        OrganizationDirectory orgDir = business.getOrganizationdirectory();
        VolunteerDirectory volDir = business.getVolunteerdirectory();
        
        try{
            Statement statement = conn.createStatement();
            String query = "SELECT * FROM Organization_Volunteer";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int orgId = resultSet.getInt("Organization_id");
                int volId = resultSet.getInt("Volunteer_id");
                String status = resultSet.getString("Status");
                
                Organization o = orgDir.findOrg(orgId);
                Volunteer v = volDir.findVolunteer(volId);
                ovdirectory.addRequest(o, v, status);
                
            }
        }
        catch(Exception e){
            System.out.println("Exception raised: " + e);
        }
    }
    
}
