package com.java_exceptions;

import java.util.*;

public class Main {

    public static void main(String[] args){

        Student student = new Student("Biological", "FA-23", "Kostya", 9, 6);
        Student student2 = new Student("Chemical", "FA-11", "Natasha");
        Student student3 = new Student("Biological", "HA-11", "Natasha", 8);
        Student student4 = new Student("Chemical", "FA-11", "Valentina", 6 ,4);
        Student student5 = new Student("Chemical", "TEA-11", "Vasya", 5);
        Student student6 = new Student("Chemical", "TEA-11", "Vasilisa", 5, 6);
        Student student7 = new Student("Biological", "FA-13", "Peter", 9, 2);
        Student student8 = new Student("Biological", "FA-13", "Galina", 8);

        List<Group> group1 = Arrays.asList(student4,student2);
        List<Group> group2 = Arrays.asList(student5,student6);
        List<Group> group3 = Arrays.asList(student, student3);
        List<Group> group4 = Arrays.asList(student7, student8);
        List<List<Group>> biological = Arrays.asList(group3, group4);
        List<List<Group>> chemical = Arrays.asList(group1,group2);


       System.out.println("Average score student - " + University.averageScoreStudent(student));












    }
}
