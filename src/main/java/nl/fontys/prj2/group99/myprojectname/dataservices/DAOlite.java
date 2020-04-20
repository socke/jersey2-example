/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.fontys.prj2.group99.myprojectname.dataservices;

import java.util.List;

/**
 *
 * @author Geert Monsieur {@code g.monsieur@fontys.nl}
 */
public interface DAOlite<T> {
    T save(T e);
    T get(int id);
    List<T> getAll();
    T update(T e);
    void delete(int id);
}
