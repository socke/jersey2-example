/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;
import nl.fontys.prj2.group99.myprojectname.model.Person;

/**
 *  */
public class DriverService {

    public List<Person> getAllDrivers() {
        Person p1 = new Person();
        p1.setName("test");

        Person p2 = new Person();
        p2.setName("person 2");
        
        List<Person> drivers = new ArrayList<Person>();
        drivers.add(p1);
        drivers.add(p2);
        
        return drivers;
    }

}
