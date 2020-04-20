/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fontys.prj2.group99.myprojectname.services;

import nl.fontys.prj2.group99.myprojectname.dataservices.DAOlite;
import nl.fontys.prj2.group99.myprojectname.dataservices.PostgresDAOlite;
import nl.fontys.prj2.group99.myprojectname.model.SimplePresident;

import java.util.ArrayList;
import java.util.List;

/**
 * The type President service.
 */
public class PresidentService {

    private DAOlite<SimplePresident> db = new PostgresDAOlite("localhost");

    /**
     * Gets president by id.
     *
     * @param id the id of the president
     * @return the president by id
     */
    public SimplePresident getPresidentById(Integer id) {
        // get presidents from the real database! Note, no null check!
        SimplePresident president = db.get(id);
        return president;
    }

    /**
     * Gets all presidents. This is now "hardcoded" and without the database!
     * Think of how to change it for your purpose.
     *
     * @return the all presidents
     */
    public List<SimplePresident> getAllPresidents() {

        // usage without database
        SimplePresident p1 = new SimplePresident("Superman", 1900);
        SimplePresident p2 = new SimplePresident("Spiderman", 1988);

        List<SimplePresident> presidents = new ArrayList<>();
        presidents.add(p1);
        presidents.add(p2);

        return presidents;

    }

}
