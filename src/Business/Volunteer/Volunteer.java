/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Volunteer;

import Business.Person.Person;

/**
 *
 * @author raisi
 */
public class Volunteer extends Person{
    private String address;
    private String city;
    private String state;
    private String country;
    private Boolean availableforvolunteer;
    private int age;
    private String gender;

    public Volunteer(int personid, String name, char[] password, String type, String phone, String address, String city, String state, String country, Boolean availableforvolunteer, int age, String gender) {
        super(personid, name, password, type, phone);
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.availableforvolunteer = availableforvolunteer;
        this.age = age;
        this.gender = gender;
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

    public Boolean getAvailableforvolunteer() {
        return availableforvolunteer;
    }

    public void setAvailableforvolunteer(Boolean availableforvolunteer) {
        this.availableforvolunteer = availableforvolunteer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
}
