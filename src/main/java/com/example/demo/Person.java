package com.example.demo;

public class Person {
    private String pip;
    private String Profetion;
    private String Hours;

    public Person() {
    }

    public Person(String pip, String profetion, String hours) {
        this.pip = pip;
        Profetion = profetion;
        Hours = hours;
    }

    public String getPip() {
        return pip;
    }

    public void setPip(String pip) {
        this.pip = pip;
    }

    public String getProfetion() {
        return Profetion;
    }

    public void setProfetion(String profetion) {
        Profetion = profetion;
    }

    public String getHours() {
        return Hours;
    }

    public void setHours(String hours) {
        Hours = hours;
    }
}
