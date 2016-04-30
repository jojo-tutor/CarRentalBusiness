/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutor.carrental;

/**
 *
 * @author cl7admin
 */
public class Driver {

    private String name;
    private String licenseID;

    public Driver() {
        this.name = null;
        this.licenseID = null;
    }

    public Driver(String name, String licenseID) {
        this.name = name;
        this.licenseID = licenseID;
    }

    public String getName() {
        return name;
    }

    public String getLicenseID() {
        return licenseID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLicenseID(String licenseID) {
        this.licenseID = licenseID;
    }
    
    @Override
    public String toString(){
        return "Driver Info -> Name: "+this.name+" License ID: "+this.licenseID;
    }
}
