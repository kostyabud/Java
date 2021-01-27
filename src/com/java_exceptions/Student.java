package com.java_exceptions;

public class Student extends Group {
    private String nameOfStudent;

    public Student(String nameFaculty, String nameGroup, String nameOfStudent) {
        super(nameFaculty, nameGroup);
        this.nameOfStudent = nameOfStudent;
    }

    public Student(String nameFaculty, int basedOnPhilosophy, int basedOnLogical, String nameGroup, String nameOfStudent) {
        super(nameFaculty, basedOnPhilosophy, basedOnLogical, nameGroup);
        this.nameOfStudent = nameOfStudent;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameFaculty='" + nameFaculty + '\'' +
                ", nameGroup='" + nameGroup + '\'' +
                ", nameOfStudent='" + nameOfStudent + '\'' +
                ", basedOnLogical - " + getBasedOnLogical() + '\'' +
                ", basedOnPhilosophy  - " + getBasedOnPhilosophy() + '\'' +
                '}' + "\n";
    }
}