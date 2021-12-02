package com.haulmont.testtask;



import java.util.HashMap;
import java.util.Map;

public class Doctor {
    private String surname;
    private String name;
    private String middleName;
    private String specialized;

    public Doctor(String surname, String name, String middleName, String specialized) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.specialized = specialized;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", specialized='" + specialized + '\'' +
                '}';
    }


    public void takeRecipe ( Patient patient, String content, int validity, String priority){
        double numberRecipe = patient.getId() * 23.0;
        Recipe r1 = new Recipe((int)((System.currentTimeMillis()/23456789)*Math.random()),  content, patient.getId(),
                this.surname+ " "+ this.name + " " + this.middleName, System.currentTimeMillis(),
                15, priority);
                Database.recipeMap.putIfAbsent(r1.getNumber(),r1);
        // проработать присвоение номера рецепта, как это происходит?

        System.out.println("Рецепт № " + r1.getNumber() + " выписан пациенту:\n " + patient.toString());
    }


}
