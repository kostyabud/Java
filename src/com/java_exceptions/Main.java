package com.java_exceptions;

import java.util.*;

import static com.java_exceptions.University.getAverageScoreStudent;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException {

        Student student = new Student("chemical", 8, 5, "Fa11", "kostya");
        Student student2 = new Student("chemical", 7, 1, "Fa11", "Natasha");
        Student student3 = new Student("Biological", 7, 8, "TA22", "Anastasia");
        Student student4 = new Student("Biological", 5, 8, "TA22", "Lisa");
        Student student5 = new Student("chemical", 1, 5, "Fa21", "Valentina");
        Student student6 = new Student("Biological", 7, 8, "TA11", "Vladimir");
        Student student7 = new Student("chemical", 7, 8, "Fa21", "Maxim");
        Student student8 = new Student("Biological", 4, 10, "TA11", "Ekaterina");

        Student student0 = new Student("chemical", "Fa21", "Valera");

        List<Group> fa11 = Arrays.asList(student, student2);
        List<Group> fa21 = Arrays.asList(student7, student5);
        List<List<Group>> chemicalFaculty = Arrays.asList(fa11, fa21);
        List<Group> ta22 = Arrays.asList(student3, student4);
        List<Group> ta11 = Arrays.asList(student6, student8);
        List<List<Group>> biologicalFaculty = Arrays.asList(ta11, ta22);

        List<List<List<Group>>> university = Arrays.asList();
        List<List<Group>> technical = Arrays.asList();
        List<Group> fa33 = Arrays.asList();


        try {
            System.out.println("Средний бал студета по предметам - " +
                    getAverageScoreStudent(student2));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Средний балл по Философии для всего университета - " +
                University.getAverageScoreOnPhilosophyInUniversity(chemicalFaculty, biologicalFaculty, 8));
        System.out.println("Средний балл по Логике в группе Fa11 на химическом факультете - " +
                University.getAverageScoreSubjectLogicalOnFacultyInGroup(chemicalFaculty, 4));

        try {
            university.get(1).size();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Не найдено факультетов в универе: " + e);
        }

        try {
            technical.get(0).size();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Не найдено груп на факультете" + "(" + e + ") ");
        }

        try {
            fa33.get(0).getNameFaculty();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(" Не найдено студентов в группе" + "( " + e + ")");
        }

        try {
            int i = (int) University.getAverageScoreStudent(student0);
            int sum = 2 / i;
        } catch (ArithmeticException e) {
            System.err.println("Не найдено оценок у студента" + "(" + e + ")");
        } catch (Exception e) {
            e.printStackTrace();
        }

        student0.setBasedOnPhilosophy(10);
        student0.setBasedOnLogical(-1);
        try {
            System.out.println(University.getAverageScoreStudent(student0));
        } catch (Exception ex) {

            System.err.println(ex.getMessage());

        }

    }
}
