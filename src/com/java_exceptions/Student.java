package com.java_exceptions;

public class Student extends Group {
    private String nameOfStudent;
    private int basedOnPhilosophy;
    private int basedOnLogical;


    public Student(String nameFaculty, String nameGroup, String nameOfStudent, int basedOnPhilosophy) {
        super(nameFaculty, nameGroup);
        this.nameOfStudent = nameOfStudent;
        this.basedOnPhilosophy = basedOnPhilosophy;
    }

    public Student(String nameFaculty, String nameGroup, String nameOfStudent, int basedOnPhilosophy, int basedOnLogical) {
        super(nameFaculty, nameGroup);
        this.nameOfStudent = nameOfStudent;
        this.basedOnPhilosophy = basedOnPhilosophy;
        this.basedOnLogical = basedOnLogical;
    }

    public Student(String nameFaculty, String nameGroup, String nameOfStudent) {
        super(nameFaculty, nameGroup);
        this.nameOfStudent = nameOfStudent;
    }

    public int getBasedOnPhilosophy() {
        return basedOnPhilosophy;
    }

    public int getBasedOnLogical() {
        return basedOnLogical;
    }

    @Override
    public String toString() {
        return  "Student{" +
                "nameOfStudent='" + nameOfStudent + '\'' +
                ", basedOnPhilosophy=" + basedOnPhilosophy +
                ", basedOnLogical=" + basedOnLogical +
                '}';
    }
}
