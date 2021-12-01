package com.haulmont.testtask;

public class Patient {
    private String name;
    private String surname;
    private String middleName;
    private String phoneNumber;
    public Double patientId;// = lastId + 1

    public Patient(String surname, String name, String middleName, String phoneNumber, Double patientId) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Double getId() {
        return patientId;
    }

    public void setId(Double id) {
        this.patientId = getPatientId();
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", id=" + patientId +
                '}';
    }

    public Double getPatientId() {
        return patientId;
    }

    public void setPatientId(Double patientId) {
        this.patientId = patientId;
    }
}
