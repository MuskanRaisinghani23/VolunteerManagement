/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import Business.Business;
import java.util.ArrayList;

/**
 *
 * @author raisi
 */
public class PersonDirectory {
    Business business;
    ArrayList<Person> personlist;
    
    public PersonDirectory(Business b) {
        this.business=b;
        this.personlist = new ArrayList<>();
    }
    
    public Person newPerson(int personid, String name, char[] password, String type, String phone) {
        Person p = new Person(personid, name, password, type, phone);
        personlist.add(p);
        return p;
    }
}
