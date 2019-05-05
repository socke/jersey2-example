/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fontys.prj2.group99.myprojectname.model;

/**
 *
 * @author Stefan Sobek - 872160 - TIPB_stefansobek {@code s.sobek@fontys.nl}
 */
public class Person {

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public void setName(String name) {
        this.name = name;
    }
    
    private String name;
    
    
}
