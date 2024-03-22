package com.mycompany.mavenproject1;


public class Telephone {    
private String model;
private String serialNumber;
private String color;
private Boolean isMobile;

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getColor() {
        return color;
    }

    public Boolean getIsMobile() {
        return isMobile;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsMobile(Boolean isMobile) {
        this.isMobile = isMobile;
    }

    public Telephone(String model, String serialNumber, String color, Boolean isMobile) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.color = color;
        this.isMobile = isMobile;
    }
    @Override
    public String toString() {
        return model + ", " + serialNumber + ", " + color + ", " + isMobile;
    }
}
