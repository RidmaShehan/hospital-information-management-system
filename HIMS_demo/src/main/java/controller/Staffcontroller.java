/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import entities.Staff;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author ridmashehan
 */
@Named(value = "staffcontroller")
@SessionScoped
public class Staffcontroller implements Serializable {

    /**
     * Creates a new instance of Staffcontroller
     */
    private Staff current;
            
    public Staffcontroller() {
    }
    public void addStaff(){
        current = new Staff();
    }
    /**
     * @return the current
     */
    public Staff getCurrent() {
        return current;
    }

    /**
     * @param current the current to set
     */
    public void setCurrent(Staff current) {
        this.current = current;
    }
    
}
