/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fontys.prj2.group99.myprojectname.model;

/**
 * The type Simple president.
 *
 * @author Geert Monsieur {@code g.monsieur@fontys.nl}
 */
public class SimplePresident {

    private int id;
    private String name;
    private int birth_year;

    public SimplePresident() {}

    /**
     * Instantiates a new Simple president.
     *
     * @param name       the name
     * @param birth_year the birth year
     */
    public SimplePresident(String name, int birth_year) {
        this.name=name;
        this.birth_year=birth_year;
    }

    /**
     * Instantiates a new Simple president.
     *
     * @param id         the id
     * @param name       the name
     * @param birth_year the birth year
     */
    public SimplePresident(int id, String name, int birth_year) {
        this.id=id;
        this.name=name;
        this.birth_year=birth_year;
    }



    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets birth year.
     *
     * @return the birth year
     */
    public int getBirth_year() {
        return birth_year;
    }

    /**
     * Sets birth year.
     *
     * @param birth_year the birth year
     */
    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    @Override
    public String toString() {
        return "SimplePresident{" + "id=" + id + ", name=" + name + ", birth_year=" + birth_year + '}';
    }

}
