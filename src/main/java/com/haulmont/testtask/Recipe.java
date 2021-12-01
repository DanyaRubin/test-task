package com.haulmont.testtask;

public class Recipe {
    private int number;// присвоение как происходит?
    private String content;
    private Double patientId;
    private String doctor;
    private long dateOfCreate;
    private int validity;
    private String priority;

    public Recipe(int number, String content, Double patientId, String doctor, long dateOfCreate, int validity, String priority) {
        this.number = number;
        this.content = content;
        this.patientId = patientId;
        this.doctor = doctor;
        this.dateOfCreate = dateOfCreate;
        this.validity = validity;
        this.priority = priority;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Double getPatientId() {
        return patientId;
    }

    public void setPatientId(Double patientId) {
        this.patientId = patientId;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public long getDateOfCreate() {
        return dateOfCreate;
    }

    public void setDateOfCreate(long dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
