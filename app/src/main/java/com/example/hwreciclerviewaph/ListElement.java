package com.example.hwreciclerviewaph;

/**
 * clase que define lo que llevará la card
 */

public class ListElement {
    //variables
    public String color;
    public String name;
    public String city;
    public String status;
//constructor

    public ListElement(String color, String name, String city, String status) {
        this.color = color;
        this.name = name;
        this.city = city;
        this.status = status;
    }


    //getters &setter


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
