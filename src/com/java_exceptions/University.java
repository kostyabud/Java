package com.java_exceptions;


import java.util.Arrays;
import java.util.List;

public class University {
    public static int averageScoreStudent(Student student){
        return (student.getBasedOnLogical() + student.getBasedOnPhilosophy()) / 2;

    }

//    public  static int averageScoreOnSubject(List<List<Group>> faculty){
//        List<List<Group>> faculties = Arrays.asList();
//        Student student;
//        faculties.stream().filter(groups -> faculties.equals(List<Group>))
//        return 0;
//    }

}
