package com.java_exceptions;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        Student student = new Student("chemical", 3, 5, "Fa11", "kostya");
        Student student2 = new Student("chemical", 7, 1, "Fa11", "Natasha");
        Student student3 = new Student("Biological", 7, 8, "TA22", "Anastasia");
        Student student4 = new Student("Biological", 5, 8, "TA22", "Lisa");
        Student student5 = new Student("chemical", 1, 5, "Fa21", "Valentina");
        Student student6 = new Student("Biological", 7, 8, "TA11", "Vladimir");
        Student student7 = new Student("chemical", 7, 8, "Fa21", "Maxim");
        Student student8 = new Student("Biological", 4, 10, "TA11", "Ekaterina");

        List<Group> fa11 = Arrays.asList(student, student2);
        List<Group> fa21 = Arrays.asList(student7, student5);
        List<List<Group>> chemicalFaculty = Arrays.asList(fa11, fa21);
        List<Group> ta22 = Arrays.asList(student3, student4);
        List<Group> ta11 = Arrays.asList(student6, student8);
        List<List<Group>> biologicalFaculty = Arrays.asList(ta11,ta22);

        System.out.println("Средний балл по Философии для всего университета" +
                University.getAverageScoreOnPhilosophyInUniversity(chemicalFaculty,biologicalFaculty));
        System.out.println("Cредний балл по Логике в группе Fa11 на химическом факультете" +
                University.getAverageScoreSubjectLogicalOnFacultyInGroup(chemicalFaculty));


    }

}
