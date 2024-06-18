/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author ridmashehan
 */
public class Bill {
    private String bilNo;
    private Double value;
    private Patient pationt;
    private Staff doctoer;

    /**
     * @return the bilNo
     */
    public String getBilNo() {
        return bilNo;
    }

    /**
     * @param bilNo the bilNo to set
     */
    public void setBilNo(String bilNo) {
        this.bilNo = bilNo;
    }

    /**
     * @return the value
     */
    public Double getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * @return the pationt
     */
    public Patient getPationt() {
        return pationt;
    }

    /**
     * @param pationt the pationt to set
     */
    public void setPationt(Patient pationt) {
        this.pationt = pationt;
    }

    /**
     * @return the doctoer
     */
    public Staff getDoctoer() {
        return doctoer;
    }

    /**
     * @param doctoer the doctoer to set
     */
    public void setDoctoer(Staff doctoer) {
        this.doctoer = doctoer;
    }
    
    
}
