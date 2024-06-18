/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import entities.Patient;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author ridmashehan
 */
@Named(value = "patientcontroller")
@SessionScoped


public class Patientcontroller implements Serializable {

    /**
     * Creates a new instance of Patientcontroller
     */

    private Patient current;   
    public Patientcontroller() {

    }
    public void AddNewPatient(){
        current = new Patient();
    }
    /**
     * @return the current
     */
    public Patient getCurrent() {
        return current;
    }

    /**
     * @param current the current to set
     */
    public void setCurrent(Patient current) {
        this.current = current;
    }
    
}
