package com.java_class;

public class Patient {
    private int id;
    private String lastName;
    private String name;
    private String patronymic;
    private String address;
    private long phoneNumber;
    private int numberOfMedicalCard;
    private String diagnosis;

    public Patient() {
    }

    public Patient(int id, String lastName, String name, String patronymic, String address, long phoneNumber, int numberOfMedicalCard, String diagnosis) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.numberOfMedicalCard = numberOfMedicalCard;
        this.diagnosis = diagnosis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNumberOfMedicalCard() {
        return numberOfMedicalCard;
    }

    public void setNumberOfMedicalCard(int numberOfMedicalCard) {
        this.numberOfMedicalCard = numberOfMedicalCard;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + getId() +
                ", lastName='" + getLastName() + '\'' +
                ", name='" + getName() + '\'' +
                ", patronymic='" + getPatronymic() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber=" +getPhoneNumber() +
                ", numberOfMedicalCard=" + getNumberOfMedicalCard() +
                ", diagnosis='" + getDiagnosis() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return getNumberOfMedicalCard() == patient.getNumberOfMedicalCard() && getDiagnosis().equals(patient.getDiagnosis());
    }



}
